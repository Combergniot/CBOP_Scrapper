package com.gus.data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSourceDao {

    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private String url = "jdbc:mysql://localhost:3306/pozycje?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String user = "root";
    private String password = "root";


    public void readDataBase() throws Exception {
        try {
            connect = DriverManager.getConnection(url, user, password);
            statement = connect.createStatement();
            resultSet = statement
                    .executeQuery("select * from offer");
        } catch (Exception e) {
            throw e;
        }
    }

    //TODO - opcjonalnie, potworzyć podzapytania dla innych kategorii
    public void writeResultSet() throws SQLException {
        int querryNumber =1;
        while (resultSet.next()) {
            String stanowisko = resultSet.getString("stanowisko");
            System.out.println("Stanowisko " +querryNumber+ ": " + stanowisko);
            querryNumber++;
        }
    }

    public void writeMetaData() throws SQLException {
        System.out.println("The columns in the table are: ");
        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
        }
    }

    public void createUrlAddress() throws SQLException {
            List<String> urlAdresses = new ArrayList<>();
            while (resultSet.next()) {
            String hash = resultSet.getString("hash");
            urlAdresses.add("http://oferty.praca.gov.pl/portal/oferta/pobierzSzczegolyOferty.cbop?ids="
                    + hash + "%26");
            }
    }

    public List<String> getUrlAddressList() throws SQLException {
        List<String> urlAdresses = new ArrayList<>();
        while (resultSet.next()) {
            String hash = resultSet.getString("hash");
            urlAdresses.add("http://oferty.praca.gov.pl/portal/oferta/pobierzSzczegolyOferty.cbop?ids="
                    + hash + "%26");
        }return urlAdresses;
    }

    public void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }

}







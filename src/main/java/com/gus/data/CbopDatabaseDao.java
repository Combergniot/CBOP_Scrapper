package com.gus.data;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class CbopDatabaseDao {

    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private String url = "jdbc:mysql://localhost:3306/cbop?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
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

    public void writeResultSet() throws SQLException {
        int querryNumber = 1;
        while (resultSet.next()) {
            String stanowisko = resultSet.getString("stanowisko");
            System.out.println("Stanowisko " + querryNumber + ": " + stanowisko);
            querryNumber++;
        }
    }

    //Todo - inny sposob mapowania json, albo zabawa ze splitem
    public void writeBlobSet() throws SQLException, IOException {
        int querryNumber = 1;
        while (resultSet.next()) {
            InputStream inputStream = resultSet.getBinaryStream("wyksztalcenia_wk");
            String result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
            System.out.println(querryNumber + ": " + result);
            querryNumber++;
        }
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

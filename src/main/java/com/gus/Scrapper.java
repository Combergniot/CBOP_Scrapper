package com.gus;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gus.data.DataSourceDao;
import com.gus.domain.SingleOffer;
import com.gus.service.SingleOfferService;
import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

@SpringBootApplication
public class Scrapper implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);


    public static void main(String[] args) {
        SpringApplication.run(Scrapper.class, args);

    }

    @Bean
    CommandLineRunner runner(SingleOfferService singleOfferService) {
        return args -> {

            DataSourceDao dao = new DataSourceDao();
            dao.readDataBase();
            List<String> surl = dao.getUrlAddressList();
            dao.close();

//            MissingHashDao dao = new MissingHashDao();
//            dao.readDataBase();
//            List<String> surl = dao.getUrlAddressList();
//            dao.close();

//            read JSON from URL
            ObjectMapper mapper = new ObjectMapper();


            for (int i = 0; i<surl.size(); i++) {
                URL url = new URL(surl.get(i));
                Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.51.55.34", 8080));
                URLConnection connect = url.openConnection(proxy);
                connect.setDoOutput(true);
                connect.setReadTimeout(100000);
                connect.setConnectTimeout(100000);
                connect.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36");
                Thread.sleep(3000);


                TypeReference<SingleOffer> typeReference = new TypeReference<SingleOffer>() {
                };
                try {
                    SingleOffer singleOffer =
                            mapper.readValue(connect.getInputStream(), typeReference);
                    singleOfferService.save(singleOffer);
                    System.out.println("Offers Saved!");
                } catch (IOException e){
                    System.out.println("Unable to save offers: " + e.getMessage());
                }
                i++;
            }
            System.out.println("The end of collecting data");
        };
    }

    @Override
    public void run(String... args) throws Exception {

    }
}





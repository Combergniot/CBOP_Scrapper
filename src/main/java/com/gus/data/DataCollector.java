package com.gus.data;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gus.domain.SingleOffer;
import com.gus.service.SingleOfferService;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class DataCollector {

    SingleOfferService singleOfferService;
    ObjectMapper mapper = new ObjectMapper();
    String surl = "http://oferty.praca.gov.pl/portal/oferta/pobierzSzczegolyOferty.cbop?ids=e12bfd85ad4609479e337cedb90aafed%26";

    public void collectJsonFromFile() throws IOException {
       // read list of JSON object from file
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
        TypeReference<List<SingleOffer>> typeReference = new TypeReference<List<SingleOffer>>() {
        };
        InputStream inputStream = TypeReference.class.getResourceAsStream("/json/test.json");
        try {
            List<SingleOffer> singleOfferList =
                    mapper.readValue(inputStream, typeReference);
            singleOfferService.save(singleOfferList);
            System.out.println("Offers Saved!");
        } catch (IOException e) {
            System.out.println("Unable to save offers: " + e.getMessage());
        }
        inputStream.close();

    }

    public void collectJsonFromUrl() throws IOException {
        //read single JSON object from URL
        URL url = new URL(surl);
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.51.55.34", 8080));
        URLConnection connect = url.openConnection(proxy);

        TypeReference<SingleOffer> typeReference = new TypeReference<SingleOffer>() {
        };
        try {
            SingleOffer singleOffer =
                    mapper.readValue(connect.getInputStream(), typeReference);
            singleOfferService.save(singleOffer);
            System.out.println("Offers Saved!");
        } catch (IOException e) {
            System.out.println("Unable to save offers: " + e.getMessage());
        }

    }

}

package com.gus.service;

import com.gus.domain.SingleOffer;
import com.gus.repository.SingleOfferRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingleOfferService {

    private SingleOfferRepository singleOfferRepository;

    public SingleOfferService (SingleOfferRepository singleOfferRepository) {
        this.singleOfferRepository = singleOfferRepository;
    }

    public Iterable<SingleOffer> list() {
        return singleOfferRepository.findAll();
    }

    public SingleOffer save(SingleOffer singleOffer) {
        return singleOfferRepository.save(singleOffer);
    }

    public void save(List<SingleOffer> singleOfferList) {
        singleOfferRepository.save(singleOfferList);
    }
}

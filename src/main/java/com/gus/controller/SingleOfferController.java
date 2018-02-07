package com.gus.controller;


import com.gus.domain.SingleOffer;
import com.gus.service.SingleOfferService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/singleOfferList")
public class SingleOfferController {

    private SingleOfferService singleOfferService;

    public SingleOfferController(SingleOfferService singleOfferService) {
        this.singleOfferService = singleOfferService;
    }

    @GetMapping("/list")
    public Iterable<SingleOffer> list() {
        return singleOfferService.list();
    }

}

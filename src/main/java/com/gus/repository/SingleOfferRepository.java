package com.gus.repository;


import com.gus.domain.SingleOffer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingleOfferRepository extends CrudRepository<SingleOffer, Long> {

}

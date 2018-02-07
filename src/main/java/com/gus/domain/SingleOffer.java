package com.gus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Table(name = "offer")
public class SingleOffer {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    @Embedded
    private WarunkiPracyIPlacy warunkiPracyIPlacy;
    @Embedded
    private Wymagania wymagania;
    @Embedded
    private DanePracodawcy danePracodawcy;
    @Embedded
    private PozostaleDane pozostaleDane;
    @Column(columnDefinition="TEXT")
    private String typOferty;
    @Column(columnDefinition="TEXT")
    private String typOfertyNaglowek;
    @Column(columnDefinition="TEXT")
    private String statusOferty;
    @Column(columnDefinition="TEXT")
    private String hash;
    private Boolean zagranicznaEures;
    private Boolean czyArchiwizowalna;
    private Boolean czyMoznaPrzywrocicZarch;
    private Boolean czyWazna;
    @Embedded
    private List<String> rodzajOferty;
    private Boolean staz;

    /**
     * No args constructor for use in serialization
     *
     */
    public SingleOffer(){

    }

}


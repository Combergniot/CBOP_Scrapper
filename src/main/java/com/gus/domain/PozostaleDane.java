package com.gus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Embeddable
public class PozostaleDane {

    @Column(columnDefinition="TEXT")
    private String identyfikatorOferty;
    @Column(columnDefinition="TEXT")
    private String ofertaZgloszonaPrzez;
    @Column(columnDefinition="TEXT")
    private String ofertaZgloszonaPrzezKodJednostki;
    private Integer lWolnychMiejsc;
    @Column(columnDefinition="TEXT")
    private String nazwaLiczMiejsc;
    private Integer lWolnychMiejscDlaNiepeln;
    private Boolean ofertaDlaOsobZarej;
    private Boolean finansZPfron;
    private Boolean wykorzystanieOferty;
    @Column (name = "zawod2")
    private String zawod;
    @Column (name = "typOferty2")
    private String typOferty;
    @Column(columnDefinition="TEXT")
    private String celeEdukacyjne;
    @Column(columnDefinition="TEXT")
    private String potwierdzenieWiedzy;
    @Column(columnDefinition="TEXT")
    private String dataAktualizacji;
    @Column(columnDefinition="TEXT")
    private String dataDodaniaOferty;
    @Column(columnDefinition="TEXT")
    private String ofertaWaznaDo;
    @Column(columnDefinition="TEXT")
    private String dataUdostepnieniaOferty;
    @Column(columnDefinition="TEXT")
    private String dataPrzyjZglosz;

    /**
     * No args constructor for use in serialization
     *
     */
    public PozostaleDane(){

    }

}



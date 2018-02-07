package com.gus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Embeddable
public class Wymagania {

    @Lob
    private WymaganiaKonieczne wymaganiaKonieczne;
    @Lob
    private WymaganiaPozadane wymaganiaPozadane;
    @Lob
    private WymaganiaDodatkowe wymaganiaDodatkowe;
    @Lob
    private String inneWymagania;
    private Boolean czyPodanoWymagania;
    private String stazWymagOgol;

    /**
     * No args constructor for use in serialization
     *
     */
    public Wymagania(){

    }

}

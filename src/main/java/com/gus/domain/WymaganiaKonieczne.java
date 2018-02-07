package com.gus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@Embeddable
public class WymaganiaKonieczne {


    @Column(name = "zawody_wk", length=1000)
    private String[] zawody;

    @Column(name = "staze_wk", length=1000)
    private String[] staze;

    @Column(name = "wyksztalcenia_wk", length=1000)
    private String[] wyksztalcenia;

    @Column(name = "jezyki_wk", length=1000)
    private String[] jezyki;

    @Column(name = "uprawnienia_wk", length=1000)
    private String[] uprawnienia;

    /**
     * No args constructor for use in serialization
     *
     */
    public WymaganiaKonieczne(){

    }

}

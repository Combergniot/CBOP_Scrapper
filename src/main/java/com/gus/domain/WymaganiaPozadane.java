package com.gus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@Embeddable
public class WymaganiaPozadane {


    @Column(name = "zawody_wp", length = 1000)
    private String[] zawody;

    @Column(name = "staze_wp", length = 1000)
    private String[] staze;

    @Column(name = "wyksztalcenia_wp", length=1000)
    private String[] wyksztalcenia;

    @Column(name = "jezyki_wp", length=500)
    private String[] jezyki;

    @Column(name = "uprawnienia_wp", length=1000)
    private String[] uprawnienia;

    /**
     * No args constructor for use in serialization
     *
     */
    public WymaganiaPozadane(){

    }

}

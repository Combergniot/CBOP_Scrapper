package com.gus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@Embeddable
public class WymaganiaDodatkowe {



    @Column (name = "zawody_wd", length = 1000)
     private String[] zawody;

    @Column (name = "staze_wd", length = 1000)
     private String[] staze;

    @Column (name = "wyksztalcenia_wd", length=1000)
    private String[] wyksztalcenia;

    @Column (name = "jezyki_wd", length=1000)
    private String[] jezyki;

    @Column (name = "uprawnienia_wd", length=1000)
    private String[] uprawnienia;

    /**
     * No args constructor for use in serialization
     *
     */
    public WymaganiaDodatkowe(){

    }

}


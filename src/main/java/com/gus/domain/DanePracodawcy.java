package com.gus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Embeddable
public class DanePracodawcy {


    public String pracodawca;
    public String branza;
    public String sposobAplikowania;
    public String nazwaUrzeduPracy;
    public String adres;
    public String osobaDoKontaktu;
    public String nrTelefonu;
    public String email;
    public String jezykAplikacji;
    @Lob
    public String wymaganeDokumenty;
    @Lob
    public String sposobPrzekazaniaDok;
    public String typPodmiotu;
    @Column (name = "wojewodztwo2")
    public String wojewodztwo;
    @Column (name = "powiat2")
    public String powiat;
    @Column (name = "gmina2")
    public String gmina;
    @Column (name = "kraj2")
    public String kraj;
    @Column (name = "miejscowosc2")
    public String miejscowosc;
    public String sposobAplShort;
    public String adresWww;
    @Column (name = "ulica2")
    public String ulica;
    @Column (name = "nrBudynku2")
    public String nrBudynku;
    @Lob
    public String profilDzialanosci;
    public String nrKraz;
    @Lob
    public String dodInfoAplikowanie;
    public Boolean publikowacDanePracodawcy;
    public String imieNazwiskoOsobyZglPracodawca;
    public String telefonOsobyZglPracodawca;
    public String emailOsobyZglPracodawca;
    public String adresAplPracodawca;
    public String wojewodztwoPracodawca;
    public String powiatPracodawca;
    public String gminaPracodawca;
    public String krajPracodawca;
    public String miejscowoscPracodawca;
    public String ulicaPracodawca;
    public String nrBudynkuPracodawca;
    public Boolean pokazacDaneKontaktowePracodawcy;

    /**
     * No args constructor for use in serialization
     *
     */
    public DanePracodawcy(){

    }


}

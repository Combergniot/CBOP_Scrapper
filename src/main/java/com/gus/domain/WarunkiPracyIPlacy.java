package com.gus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Embeddable
public class WarunkiPracyIPlacy {

    @Column(columnDefinition="TEXT")
    private String miejscePracy;
    @Column(columnDefinition="TEXT")
    private String rodzajObowiazkow;
    @Lob
    private String zakresObowiazkow;
    @Column(columnDefinition="TEXT")
    private String rodzajZatrudnienia;
    @Column(columnDefinition="TEXT")
    private Integer wymiarEtatu;
    @Column(columnDefinition="TEXT")
    private String zmianowosc;
    private Integer lGodzinWTygodniu;
    @Column(columnDefinition="TEXT")
    private String rodzajWynagrodzenia;
    @Column(columnDefinition="TEXT")
    private String wynagrodzenieBrutto;
    @Column(columnDefinition="TEXT")
    private String opisWynagrodzenia;
    @Column(columnDefinition="TEXT")
    private String systemWynagradzania;
    private Boolean pracaWWolneDni;
    private Boolean pracaTymczasowa;
    private Boolean zatrOdZaraz;
    private Boolean zakwaterowanie;
    private Boolean wyzywienie;
    private Boolean kosztPrzejDoPolski;
    @Column(columnDefinition="TEXT")
    private String stanowisko;
    @Column(columnDefinition="TEXT")
    private String miejscowosc;
    @Column(columnDefinition="TEXT")
    private String kodMiejscowosci;
    @Column(columnDefinition="TEXT")
    private String wojewodztwo;
    @Column(columnDefinition="TEXT")
    private String powiat;
    @Column(columnDefinition="TEXT")
    private String gmina;
    @Column(columnDefinition="TEXT")
    private String kraj;
    @Column(columnDefinition="TEXT")
    private String kodKraju;
    private Boolean pracaStala;
    @Column(columnDefinition="TEXT")
    private String zawod;
    @Column(columnDefinition="TEXT")
    private String opisOferty;
    @Column(columnDefinition="TEXT")
    private String miejscePracyCzlonPierwszy;
    @Column(columnDefinition="TEXT")
    private String miejscePracyCzlonDrugi;
    @Column(columnDefinition="TEXT")
    private String ulica;
    @Column(columnDefinition="TEXT")
    private String nrBudynku;
    @Column(columnDefinition="TEXT")
    private String skroconyRodzajZatrudnienia;
    @Column(columnDefinition="TEXT")
    private String wynagrodzenieBruttoZTypemStawki;
    @Column(columnDefinition="TEXT")
    private String liczbaMiesStazPzd;
    @Column(columnDefinition="TEXT")
    private String typPzd;
    @Column(columnDefinition="TEXT")
    private String lokalizacja;
    @Column(columnDefinition="TEXT")
    private String lokalizacjaInna;
    @Column(columnDefinition="TEXT")
    private String powodOddelegowania;
    @Column(columnDefinition="TEXT")
    private String pensjaNetto;
    @Column(columnDefinition="TEXT")
    private String premie;
    @Column(columnDefinition="TEXT")
    private String dodSwiadczenia;
    @Column(columnDefinition="TEXT")
    private String dodInfoCzasPracy;
    @Column(columnDefinition="TEXT")
    private String informacjeOLokalizacji;
    @Column(columnDefinition="TEXT")
    private String odplatny;
    @Column(columnDefinition="TEXT")
    private String dataRozpoczeciaPracy;
    @Column(columnDefinition="TEXT")
    private String dataZakonczeniaPracy;

    /**
     * No args constructor for use in serialization
     *
     */
    public WarunkiPracyIPlacy(){

    }

}


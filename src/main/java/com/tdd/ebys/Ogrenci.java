package com.tdd.ebys;

/**
 * Üniversite öğrencisini temsil eder.
 *
 * Created by darthvader on 06.12.2016.
 */
public class Ogrenci {


    public String ders;

    public void dersKayit(String ders) {
        this.ders = ders;
    }

    public boolean derseKayitliMi(String ders) {
        return true;
    }
}

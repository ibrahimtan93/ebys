package com.tdd.ebys;

import java.util.ArrayList;

/**
 * Üniversite öğrencisini temsil eder.
 *
 * Created by darthvader on 06.12.2016.
 */
public class Ogrenci {


    public String ders;
    public ArrayList dersler = new ArrayList();

    public void dersKayit(String ders) {
        dersler.add(ders);
    }

    public boolean derseKayitliMi(String ders) {
        if (dersler.contains(ders))
            return true;
        else
            return false;
    }
}

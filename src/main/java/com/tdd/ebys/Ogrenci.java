package com.tdd.ebys;

import java.util.ArrayList;

/**
 * Üniversite öğrencisini temsil eder.
 *
 * Created by darthvader on 06.12.2016.
 */
public class Ogrenci {

    private ArrayList<Ders> dersler = new ArrayList();

    public void dersKayit(Ders ders) {
        this.dersler.add(ders);
    }

    public boolean derseKayitliMi(String ders) {
        for (Ders d : dersler){
            if (d.getDersAdi() == ders)
                return true;
        }
        return false;
    }

    public void notGirisiVize(String ders, int not) {
        if(derseKayitliMi(ders)) {
            for (Ders d : dersler) {
                if (d.getDersAdi() == ders)
                    d.setVizeNotu(not);
            }
        }
    }

    public void notGirisiFinal(String ders, int not) {
        if (derseKayitliMi(ders)) {
            for (Ders d : dersler) {
                if (d.getDersAdi() == ders)
                    d.setFinalNotu(not);
            }
        }
    }

    public int notGoruntuleVize(String ders) {
        if(derseKayitliMi(ders)) {
            for (Ders d : dersler) {
                if (d.getDersAdi() == ders)
                    return d.getVizeNotu();
            }
        }
        return -1;
    }

    public int notGoruntuleFinal(String ders) {
        if(derseKayitliMi(ders)) {
            for (Ders d : dersler) {
                if (d.getDersAdi() == ders)
                    return d.getFinalNotu();
            }
        }
        return -1;
    }

    public float dersDonemSonuNotu(String ders) {
        if(derseKayitliMi(ders)) {
            for (Ders d : dersler) {
                if (d.getDersAdi() == ders){
                    return d.getDonemSonuNotu();
                }
            }
        }
        return -1;
    }

    public float donemIcıOrtalama(int donem) {
        int toplam = 0;
        int dersSayisi = 0;
        for(Ders d : dersler){
            if(d.getDonem() == donem){
                toplam += d.getDonemSonuNotu();
                dersSayisi += 1;
            }
        }
        return (float)toplam / dersSayisi;
    }

    public float yilIciOrtalama() {
        return (this.donemIcıOrtalama(1) + this.donemIcıOrtalama(2))/2;
    }
}

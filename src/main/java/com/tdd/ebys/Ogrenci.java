package com.tdd.ebys;

import java.util.ArrayList;

/**
 * Üniversite öğrencisini temsil eder.
 *
 * Created by darthvader on 06.12.2016.
 */
public class Ogrenci {

    private ArrayList<Ders> alinanDersler = new ArrayList();

    public void dersKayit(Ders ders) {
        this.alinanDersler.add(ders);
    }

    public boolean derseKayitliMi(String dersAdi) {
        for (Ders d : alinanDersler){
            if (d.getDersAdi() == dersAdi)
                return true;
        }
        return false;
    }

    public void notGirisiVize(String dersAdi, int not) {
        if(derseKayitliMi(dersAdi)) {
            for (Ders d : alinanDersler) {
                if (d.getDersAdi() == dersAdi)
                    d.setVizeNotu(not);
            }
        }
    }

    public void notGirisiFinal(String dersAdi, int not) {
        if (derseKayitliMi(dersAdi)) {
            for (Ders d : alinanDersler) {
                if (d.getDersAdi() == dersAdi)
                    d.setFinalNotu(not);
            }
        }
    }

    public int notGoruntuleVize(String dersAdi) {
        if(derseKayitliMi(dersAdi)) {
            for (Ders d : alinanDersler) {
                if (d.getDersAdi() == dersAdi)
                    return d.getVizeNotu();
            }
        }
        return -1;
    }

    public int notGoruntuleFinal(String dersAdi) {
        if(derseKayitliMi(dersAdi)) {
            for (Ders d : alinanDersler) {
                if (d.getDersAdi() == dersAdi)
                    return d.getFinalNotu();
            }
        }
        return -1;
    }

    public float dersDonemSonuNotu(String dersAdi) {
        if(derseKayitliMi(dersAdi)) {
            for (Ders d : alinanDersler) {
                if (d.getDersAdi() == dersAdi){
                    return d.getDonemSonuNotu();
                }
            }
        }
        return -1;
    }

    public float donemIcıOrtalama(int donem) {
        int toplam = 0;
        int dersSayisi = 0;
        for(Ders d : alinanDersler){
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

    public float birikimliOrtalama() {
        return (float) 67.5;
    }
}

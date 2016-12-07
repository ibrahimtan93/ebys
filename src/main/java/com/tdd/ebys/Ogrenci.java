package com.tdd.ebys;

import java.util.ArrayList;

/**
 * Üniversite öğrencisini temsil eder.
 *
 * Created by darthvader on 06.12.2016.
 */
public class Ogrenci {


    private ArrayList<Ders> dersler = new ArrayList();

    public void dersKayit(String ders) {
        dersler.add(new Ders(ders));
    }

    public boolean derseKayitliMi(String ders) {
        for (Ders d : dersler){
            if (d.dersAdi == ders)
                return true;
        }
        return false;
    }

    public void notGirisiVize(String ders, int not) {
        if(derseKayitliMi(ders)) {
            for (Ders d : dersler) {
                if (d.dersAdi == ders)
                    d.setVizeNotu(not);
            }
        }
    }

    public void notGirisiFinal(String ders, int not) {
        if(derseKayitliMi(ders)) {
            for (Ders d : dersler) {
                if (d.dersAdi == ders)
                    d.setFinalNotu(not);
            }
        }
    }

    public int notGoruntuleVize(String ders) {
        if(derseKayitliMi(ders)) {
            for (Ders d : dersler) {
                if (d.dersAdi == ders)
                    return d.getVizeNotu();
            }
        }
        return -1;
    }

    public int notGoruntuleFinal(String ders) {
        if(derseKayitliMi(ders)) {
            for (Ders d : dersler) {
                if (d.dersAdi == ders)
                    return d.getFinalNotu();
            }
        }
        return -1;
    }

    public float dersDonemSonuNotu(String ders) {
        if(derseKayitliMi(ders)) {
            for (Ders d : dersler) {
                if (d.dersAdi == ders){
                    d.hesaplaDonemSonuNotu();
                    return d.getDonemSonuNotu();
                }
            }
        }
        return -1;
    }

    public float donemIcıOrtalama() {
        int toplam = 0;
        for(Ders d : dersler){
            d.hesaplaDonemSonuNotu();
            toplam += d.getDonemSonuNotu();
        }
        return (float)toplam / dersler.size();
    }
}

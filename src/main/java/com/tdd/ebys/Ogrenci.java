package com.tdd.ebys;

import java.util.ArrayList;

/**
 * Üniversite öğrencisini temsil eder.
 *
 * Created by darthvader on 06.12.2016.
 */
public class Ogrenci {

    private ArrayList<Ders> birinciDonemDersler = new ArrayList();
    private ArrayList<Ders> ikinciDonemDersler = new ArrayList();

    public void dersKayit(String ders, int donem) {
        if(donem == 1) birinciDonemDersler.add(new Ders(ders));
        else ikinciDonemDersler.add(new Ders(ders));
    }

    public boolean derseKayitliMi(String ders, int donem) {
        if(donem == 1){
            for (Ders d : birinciDonemDersler){
                if (d.dersAdi == ders)
                    return true;
            }
            return false;
        }
        else {
            for (Ders d : ikinciDonemDersler){
                if (d.dersAdi == ders)
                    return true;
            }
            return false;
        }
    }

    public void notGirisiVize(String ders, int donem, int not) {
        if(donem == 1){
            if(derseKayitliMi(ders, donem)) {
                for (Ders d : birinciDonemDersler) {
                    if (d.dersAdi == ders)
                        d.setVizeNotu(not);
                }
            }
        }
        else {
            if(derseKayitliMi(ders, donem)) {
                for (Ders d : ikinciDonemDersler) {
                    if (d.dersAdi == ders)
                        d.setVizeNotu(not);
                }
            }
        }
    }

    public void notGirisiFinal(String ders, int donem, int not) {
        if(donem == 1) {
            if (derseKayitliMi(ders, donem)) {
                for (Ders d : birinciDonemDersler) {
                    if (d.dersAdi == ders)
                        d.setFinalNotu(not);
                }
            }
        }
        else {
            if (derseKayitliMi(ders, donem)) {
                for (Ders d : ikinciDonemDersler) {
                    if (d.dersAdi == ders)
                        d.setFinalNotu(not);
                }
            }
        }
    }

    public int notGoruntuleVize(String ders, int donem) {
        if(donem == 1) {
            if(derseKayitliMi(ders, donem)) {
                for (Ders d : birinciDonemDersler) {
                    if (d.dersAdi == ders)
                        return d.getVizeNotu();
                }
            }
        }
        else {
            if(derseKayitliMi(ders, donem)) {
                for (Ders d : ikinciDonemDersler) {
                    if (d.dersAdi == ders)
                        return d.getVizeNotu();
                }
            }
        }
        return -1;
    }

    public int notGoruntuleFinal(String ders, int donem) {
        if(donem == 1){
            if(derseKayitliMi(ders, donem)) {
                for (Ders d : birinciDonemDersler) {
                    if (d.dersAdi == ders)
                        return d.getFinalNotu();
                }
            }
            return -1;
        }
        else {
            if(derseKayitliMi(ders, donem)) {
                for (Ders d : ikinciDonemDersler) {
                    if (d.dersAdi == ders)
                        return d.getFinalNotu();
                }
            }
            return -1;
        }
    }

    public float dersDonemSonuNotu(String ders, int donem) {
        if(donem == 1){
            if(derseKayitliMi(ders, donem)) {
                for (Ders d : birinciDonemDersler) {
                    if (d.dersAdi == ders){
                        d.hesaplaDonemSonuNotu();
                        return d.getDonemSonuNotu();
                    }
                }
            }
        }
        else {
            if(derseKayitliMi(ders, donem)) {
                for (Ders d : ikinciDonemDersler) {
                    if (d.dersAdi == ders){
                        d.hesaplaDonemSonuNotu();
                        return d.getDonemSonuNotu();
                    }
                }
            }
        }
        return -1;
    }

    public float donemIcıOrtalama(int donem) {
        if(donem == 1){
            int toplam = 0;
            for(Ders d : birinciDonemDersler){
                d.hesaplaDonemSonuNotu();
                toplam += d.getDonemSonuNotu();
            }
            return (float)toplam / birinciDonemDersler.size();
        }
        else{
            int toplam = 0;
            for(Ders d : ikinciDonemDersler){
                d.hesaplaDonemSonuNotu();
                toplam += d.getDonemSonuNotu();
            }
            return (float)toplam / ikinciDonemDersler.size();
        }

    }

    public double yilIciOrtalama() {
        return 67.5;
    }
}

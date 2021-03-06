package com.tdd.ebys;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by prometheus on 12/7/16.
 */
public class OgrenciTest {
    @Test
    public void dersKayitTest() {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.dersKayit(new Ders("Matematik", 1));

        assertTrue("Matematik",ogrenci.derseKayitliMi("Matematik"));
        assertFalse("Fizik",ogrenci.derseKayitliMi("Fizik"));
    }

    @Test
    public void cokluDersKayitTest(){
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.dersKayit(new Ders("Matematik", 1));
        ogrenci.dersKayit(new Ders("Fizik", 1));

        assertTrue(ogrenci.derseKayitliMi("Matematik"));
        assertTrue(ogrenci.derseKayitliMi("Fizik"));
    }

    @Test
    public void ogrSinavNotuGoruntuleTest(){
        Ogrenci ogrenci = new Ogrenci();

        ogrenci.dersKayit(new Ders("Matematik", 1));
        ogrenci.notGirisiVize("Matematik",50);
        ogrenci.notGirisiFinal("Matematik",100);

        ogrenci.dersKayit(new Ders("Fizik", 1));
        ogrenci.notGirisiVize("Fizik", 30);
        ogrenci.notGirisiFinal("Fizik", 50);

        assertEquals(50,ogrenci.notGoruntuleVize("Matematik"));
        assertEquals(100,ogrenci.notGoruntuleFinal("Matematik"));

        assertEquals(30, ogrenci.notGoruntuleVize("Fizik"));
    }

    @Test
    public void ogrDersDonemSonuNotuGoruntuleTest(){
        Ogrenci ogrenci = new Ogrenci();

        ogrenci.dersKayit(new Ders("Matematik", 1));
        ogrenci.notGirisiVize("Matematik",50);
        ogrenci.notGirisiFinal("Matematik",100);

        ogrenci.dersKayit(new Ders("Fizik", 1));
        ogrenci.notGirisiVize("Fizik", 30);
        ogrenci.notGirisiFinal("Fizik", 50);

        assertEquals(80,ogrenci.dersDonemSonuNotu("Matematik"),.02);
        assertEquals(42,ogrenci.dersDonemSonuNotu("Fizik"),.02);
    }

    @Test
    public void ogrDonemIcıOrtalama(){
        Ogrenci ogrenci = new Ogrenci();

        ogrenci.dersKayit(new Ders("Matematik", 1));
        ogrenci.notGirisiVize("Matematik",50);
        ogrenci.notGirisiFinal("Matematik",100);

        ogrenci.dersKayit(new Ders("Fizik", 1));
        ogrenci.notGirisiVize("Fizik", 30);
        ogrenci.notGirisiFinal("Fizik", 65);

        ogrenci.dersKayit(new Ders("Algoritma", 1));
        ogrenci.notGirisiVize("Algoritma", 55);
        ogrenci.notGirisiFinal("Algoritma", 50);

        ogrenci.dersKayit(new Ders("TDD", 1));
        ogrenci.notGirisiVize("TDD", 40);
        ogrenci.notGirisiFinal("TDD", 70);

        assertEquals(60.25,ogrenci.donemIcıOrtalama(1), .02);
    }

    /**
     * Yıl içinde iki dönem var. Refactoring lazım.
     */
    @Test
    public void ogrYilIciOrtalama(){
        Ogrenci ogrenci = new Ogrenci();

        ogrenci.dersKayit(new Ders("Matematik", 1));
        ogrenci.notGirisiVize("Matematik", 50);
        ogrenci.notGirisiFinal("Matematik", 60);
        ogrenci.dersKayit(new Ders("Fizik", 1));
        ogrenci.notGirisiVize("Fizik", 40);
        ogrenci.notGirisiFinal("Fizik", 80);
        ogrenci.dersKayit(new Ders("Algoritma", 2));
        ogrenci.notGirisiVize("Algoritma", 35);
        ogrenci.notGirisiFinal("Algoritma", 70);
        ogrenci.dersKayit(new Ders("TDD", 2));
        ogrenci.notGirisiVize("TDD", 100);
        ogrenci.notGirisiFinal("TDD", 90);

        assertEquals(67.5, ogrenci.yilIciOrtalama(), 0.02);
    }

    @Test
    public void ogrBirikimliOrtlama(){
        Ogrenci ogrenci = new Ogrenci();

        ogrenci.dersKayit(new Ders("Matematik", 1));
        ogrenci.notGirisiVize("Matematik", 50);
        ogrenci.notGirisiFinal("Matematik", 60);
        ogrenci.dersKayit(new Ders("Fizik", 2));
        ogrenci.notGirisiVize("Fizik", 40);
        ogrenci.notGirisiFinal("Fizik", 80);
        ogrenci.dersKayit(new Ders("Algoritma", 3));
        ogrenci.notGirisiVize("Algoritma", 35);
        ogrenci.notGirisiFinal("Algoritma", 70);
        ogrenci.dersKayit(new Ders("TDD", 4));
        ogrenci.notGirisiVize("TDD", 100);
        ogrenci.notGirisiFinal("TDD", 90);

        assertEquals(67.5, ogrenci.birikimliOrtalama(), 0.02);
    }
}

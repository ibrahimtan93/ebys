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
        ogrenci.dersKayit("Matematik", 1);

        assertTrue("Matematik",ogrenci.derseKayitliMi("Matematik", 1));
        assertFalse("Fizik",ogrenci.derseKayitliMi("Fizik", 1));
    }

    @Test
    public void cokluDersKayitTest(){
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.dersKayit("Matematik", 1);
        ogrenci.dersKayit("Fizik", 1);

        assertTrue(ogrenci.derseKayitliMi("Matematik", 1));
        assertTrue(ogrenci.derseKayitliMi("Fizik", 1));
    }

    @Test
    public void ogrSinavNotuGoruntuleTest(){
        Ogrenci ogrenci = new Ogrenci();

        ogrenci.dersKayit("Matematik", 1);
        ogrenci.notGirisiVize("Matematik", 1,50);
        ogrenci.notGirisiFinal("Matematik", 1,100);

        ogrenci.dersKayit("Fizik", 1);
        ogrenci.notGirisiVize("Fizik", 1, 30);
        ogrenci.notGirisiFinal("Fizik", 1, 50);

        assertEquals(50,ogrenci.notGoruntuleVize("Matematik", 1));
        assertEquals(100,ogrenci.notGoruntuleFinal("Matematik", 1));

        assertEquals(30, ogrenci.notGoruntuleVize("Fizik", 1));
    }

    @Test
    public void ogrDersDonemSonuNotuGoruntuleTest(){
        Ogrenci ogrenci = new Ogrenci();

        ogrenci.dersKayit("Matematik", 1);
        ogrenci.notGirisiVize("Matematik", 1,50);
        ogrenci.notGirisiFinal("Matematik", 1,100);

        ogrenci.dersKayit("Fizik", 1);
        ogrenci.notGirisiVize("Fizik", 1, 30);
        ogrenci.notGirisiFinal("Fizik", 1, 50);

        assertEquals(80,ogrenci.dersDonemSonuNotu("Matematik", 1),.02);
        assertEquals(42,ogrenci.dersDonemSonuNotu("Fizik", 1),.02);
    }

    @Test
    public void ogrDonemIcıOrtalama(){
        Ogrenci ogrenci = new Ogrenci();

        ogrenci.dersKayit("Matematik", 1);
        ogrenci.notGirisiVize("Matematik", 1,50);
        ogrenci.notGirisiFinal("Matematik", 1,100);

        ogrenci.dersKayit("Fizik", 1);
        ogrenci.notGirisiVize("Fizik", 1, 30);
        ogrenci.notGirisiFinal("Fizik", 1, 65);

        ogrenci.dersKayit("Algoritma", 1);
        ogrenci.notGirisiVize("Algoritma", 1, 55);
        ogrenci.notGirisiFinal("Algoritma", 1, 50);

        ogrenci.dersKayit("TDD", 1);
        ogrenci.notGirisiVize("TDD", 1, 40);
        ogrenci.notGirisiFinal("TDD", 1, 70);

        assertEquals(60.25,ogrenci.donemIcıOrtalama(1), .02);
    }

    /**
     * Yıl içinde iki dönem var. Refactoring lazım.
     */
    @Test
    public void ogrYilIciOrtalama(){
        Ogrenci ogrenci = new Ogrenci();

        ogrenci.dersKayit("Matematik", 1);
        ogrenci.notGirisiVize("Matematik", 1, 50);
        ogrenci.notGirisiFinal("Matematik", 1, 60);
        ogrenci.dersKayit("Fizik", 1);
        ogrenci.notGirisiVize("Fizik", 1, 40);
        ogrenci.notGirisiFinal("Fizik", 1, 80);
        ogrenci.dersKayit("Algoritma", 2);
        ogrenci.notGirisiVize("Algoritma", 2, 35);
        ogrenci.notGirisiFinal("Algoritma", 2, 70);
        ogrenci.dersKayit("TDD", 2);
        ogrenci.notGirisiVize("TDD", 2, 100);
        ogrenci.notGirisiFinal("TDD", 2, 90);

        assertEquals(67.5, ogrenci.yilIciOrtalama(), 0.02);
    }
}

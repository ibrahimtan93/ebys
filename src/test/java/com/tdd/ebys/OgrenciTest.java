package com.tdd.ebys;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by prometheus on 12/7/16.
 */
public class OgrenciTest {
    @Test
    public void dersKayitTest() {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.dersKayit("Matematik");

        assertTrue("Matematik",ogrenci.derseKayitliMi("Matematik"));
        assertFalse("Fizik",ogrenci.derseKayitliMi("Fizik"));
    }

    @Test
    public void cokluDersKayitTest(){
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.dersKayit("Matematik");
        ogrenci.dersKayit("Fizik");

        assertTrue(ogrenci.derseKayitliMi("Matematik"));
        assertTrue(ogrenci.derseKayitliMi("Fizik"));
    }

    @Test
    public void ogrSinavNotuGoruntuleTest(){
        Ogrenci ogrenci = new Ogrenci();

        ogrenci.dersKayit("Matematik");
        ogrenci.notGirisiVize("Matematik",50);
        ogrenci.notGirisiFinal("Matematik",100);

        ogrenci.dersKayit("Fizik");
        ogrenci.notGirisiVize("Fizik", 30);
        ogrenci.notGirisiFinal("Fizik", 50);

        assertEquals(50,ogrenci.notGoruntuleVize("Matematik"));
        assertEquals(100,ogrenci.notGoruntuleFinal("Matematik"));

        assertEquals(30, ogrenci.notGoruntuleVize("Fizik"));
    }

    @Test
    public void ogrDersDonemSonuNotuGoruntuleTest(){
        Ogrenci ogrenci = new Ogrenci();

        ogrenci.dersKayit("Matematik");
        ogrenci.notGirisiVize("Matematik",50);
        ogrenci.notGirisiFinal("Matematik",100);

        ogrenci.dersKayit("Fizik");
        ogrenci.notGirisiVize("Fizik", 30);
        ogrenci.notGirisiFinal("Fizik", 50);

        assertEquals(80,ogrenci.dersDonemSonuNotu("Matematik"),.02);
        assertEquals(42,ogrenci.dersDonemSonuNotu("Fizik"),.02);
    }
}

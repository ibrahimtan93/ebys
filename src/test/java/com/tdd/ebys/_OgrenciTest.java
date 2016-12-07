package com.tdd.ebys;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 *  TODO ders kaydı
 *  TODO vize, final notu görüntüleme
 *  TODO yılsonu notu görüntüleme
 *  TODO kayıtlı dersleri görüntüleme
 *
 *
 * Created by prometheus on 12/7/16.
 */
public class _OgrenciTest {


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

        assertEquals(50,ogrenci.notGoruntuleVize("Matematik"));
        assertEquals(100,ogrenci.notGoruntuleFinal("Matematik"));

    }


}

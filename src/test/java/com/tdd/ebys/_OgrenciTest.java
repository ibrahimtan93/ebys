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

        assertEquals("Matematik",ogrenci.ders);


    }



}

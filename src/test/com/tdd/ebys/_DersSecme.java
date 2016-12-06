package com.tdd.ebys;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Ders seçme işlemi testi.
 *
 * TODO secilenDers private yap
 * TODO Öğrenci birden fazla ders seçebilir
 *
 * Created by darthvader on 06.12.2016.
 */
public class _DersSecme {
    @Test
    public void dersSecme(){
        Ders ders = new Ders();
        Ogrenci ogrenci = new Ogrenci();

        ogrenci.dersSec(ders);
        assertEquals(ders, ogrenci.secilenDers);
    }
}

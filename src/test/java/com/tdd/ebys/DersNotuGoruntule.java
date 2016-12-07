package com.tdd.ebys;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Bir öğrenci, bir dersten aldığı notları görüntüleyebilmelidir.
 *
 * TODO Dersin vize ve final notlarını görüntüle
 * TODO Dersin dönem sonu notunu görüntüle
 * TODO Ders notlarını private yap
 *
 * Created by darthvader on 06.12.2016.
 */
public class DersNotuGoruntule {
    @Test
    public void dersNotuGoruntule(){
        Ders ders = new Ders("Tdd");

        ders.setVizeNotu(70);
        ders.setFinalNotu(60);

        assertEquals(70, ders.getVizeNotu());
        assertEquals(60, ders.getFinalNotu());
    }

    @Test
    public void donemSonuNotuGoruntuleTest(){
        Ders ders = new Ders("Tdd");
        ders.setVizeNotu(100);
        ders.setFinalNotu(50);
        ders.hesaplaDonemSonuNotu();
        assertEquals(70,ders.getDonemSonuNotu(),.02);
    }
}
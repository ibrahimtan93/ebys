package com.tdd.ebys;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by darthvader on 06.12.2016.
 */
public class DersTest {
    @Test
    public void dersConstructorTest(){
        Ders ders = new Ders("Matematik", 1);

        assertEquals("Matematik", ders.getDersAdi());
        assertEquals(1, ders.getDonem());
    }

    @Test
    public void vizeNotuGoruntuleTest(){
        Ders ders = new Ders("Tdd", 1);

        ders.setVizeNotu(70);

        assertEquals(70, ders.getVizeNotu());
    }

    @Test
    public void finalNotuGoruntuleTest(){
        Ders ders = new Ders("Tdd", 1);

        ders.setFinalNotu(60);

        assertEquals(60, ders.getFinalNotu());
    }

    @Test
    public void donemSonuNotuGoruntuleTest(){
        Ders ders = new Ders("Tdd", 1);

        ders.setVizeNotu(100);
        ders.setFinalNotu(50);

        assertEquals(70,ders.getDonemSonuNotu(),.02);
    }
}

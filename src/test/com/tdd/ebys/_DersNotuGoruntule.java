package com.tdd.ebys;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Bir öğrenci, bir dersten aldığı notları görüntüleyebilmelidir.
 *
 *
 * Created by darthvader on 06.12.2016.
 */
public class _DersNotuGoruntule {
    @Test
    public void dersNotuGoruntule(){
        Ders ders = new Ders();

        ders.vizeNotu = 70;
        ders.finalNotu = 60;

        assertEquals(70, ders.vizeNotu);
        assertEquals(60, ders.finalNotu);
    }
}

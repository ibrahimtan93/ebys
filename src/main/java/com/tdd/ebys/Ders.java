package com.tdd.ebys;

/**
 * Üniversitede verilen dersi temsil eder.
 *
 * Created by darthvader on 06.12.2016.
 */
public class Ders {
    private int vizeNotu;
    private int finalNotu;
    public int donemSonuNotu;

    public int getVizeNotu() { return vizeNotu; }
    public void setVizeNotu(int vizeNotu) { this.vizeNotu = vizeNotu; }

    public int getFinalNotu() { return finalNotu; }
    public void setFinalNotu(int finalNotu) { this.finalNotu = finalNotu; }

    public void hesaplaDonemSonuNotu() {
    }
}

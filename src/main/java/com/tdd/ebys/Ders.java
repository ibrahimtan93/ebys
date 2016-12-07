package com.tdd.ebys;

/**
 * Üniversitede verilen dersi temsil eder.
 *
 * Created by darthvader on 06.12.2016.
 */
public class Ders {
    public String dersAdi;
    public int donem;

    private int vizeNotu;
    private int finalNotu;
    private float donemSonuNotu;

    public Ders(String dersAdi, int donem){
        this.dersAdi = dersAdi;
        this.donem = donem;
    }

    public int getVizeNotu() { return vizeNotu; }
    public void setVizeNotu(int vizeNotu) { this.vizeNotu = vizeNotu; }

    public int getFinalNotu() { return finalNotu; }
    public void setFinalNotu(int finalNotu) { this.finalNotu = finalNotu; }

    public float getDonemSonuNotu(){
        return donemSonuNotu;
    }
    public void hesaplaDonemSonuNotu() {
        donemSonuNotu= (float) (vizeNotu*0.4+finalNotu*0.6);
    }
}

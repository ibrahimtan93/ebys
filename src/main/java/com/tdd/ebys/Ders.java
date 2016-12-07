package com.tdd.ebys;

/**
 * Üniversitede verilen dersi temsil eder.
 *
 * Created by darthvader on 06.12.2016.
 */
public class Ders {
    private String dersAdi;
    private int donem;

    private int vizeNotu;
    private int finalNotu;

    public Ders(String dersAdi, int donem){
        this.dersAdi = dersAdi;
        this.donem = donem;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public int getDonem() {
        return donem;
    }

    public int getVizeNotu() { return vizeNotu; }
    public void setVizeNotu(int vizeNotu) { this.vizeNotu = vizeNotu; }

    public int getFinalNotu() { return finalNotu; }
    public void setFinalNotu(int finalNotu) { this.finalNotu = finalNotu; }

    public float getDonemSonuNotu(){
        return (float) (vizeNotu*0.4+finalNotu*0.6);
    }
}

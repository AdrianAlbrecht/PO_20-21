package pl.edu.uwm.po.RPG;

import java.util.ArrayList;

public abstract class Istota {
    public Istota(String name, Rasa_istoty rasa, int max_hp, int poziom, int pancerz, int pkt_ochrona_przed_magia, int zwinnosc, int sila) {
        this.name = name;
        this.rasa = rasa;
        this.max_hp = max_hp;
        this.aktualne_hp = this.max_hp;
        this.poziom = poziom;
        this.pancerz = pancerz;
        this.pkt_ochrona_przed_magia = pkt_ochrona_przed_magia;
        this.zwinnosc = zwinnosc;
        this.sila = sila;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRasa(Rasa_istoty rasa) {
        this.rasa = rasa;
    }

    public void setAktualne_hp(int aktualne_hp) {
        this.aktualne_hp = aktualne_hp;
    }

    public void setMax_hp(int max_hp) {
        this.max_hp = max_hp;
        this.setAktualne_hp(max_hp);
    }

    public void setPoziom(int poziom) {
        this.poziom = poziom;
    }

    public void setPancerz(int pancerz) {
        this.pancerz = pancerz;
        this.redukcjaFizycznych=(int)((double)this.pancerz/50*100);
    }

    public void setPkt_ochrona_przed_magia(int pkt_ochrona_przed_magia) {
        this.pkt_ochrona_przed_magia = pkt_ochrona_przed_magia;
        this.redukcjaMagicznych=(int)((double)this.pkt_ochrona_przed_magia/50*100);
    }

    public void setZwinnosc(int zwinnosc) {
        this.zwinnosc = zwinnosc;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public void setSzybkosc(int szybkosc) {
        this.szybkosc = szybkosc;
    }

    public String getName() {
        return name;
    }

    public Rasa_istoty getRasa() {
        return rasa;
    }

    public int getAktualne_hp() {
        return aktualne_hp;
    }

    public int getMax_hp() {
        return max_hp;
    }

    public int getPoziom() {
        return poziom;
    }

    public int getPancerz() {
        return pancerz;
    }

    public int getPkt_ochrona_przed_magia() {
        return pkt_ochrona_przed_magia;
    }

    public int getZwinnosc() {
        return zwinnosc;
    }

    public int getSila() {
        return sila;
    }

    public int getSzybkosc() {
        return szybkosc;
    }

    public int getRedukcjaFizycznych() {
        return redukcjaFizycznych;
    }

    public int getRedukcjaMagicznych() {
        return redukcjaMagicznych;
    }
    
    public abstract void statystyki();

    private String name;
    private Rasa_istoty rasa;
    private int aktualne_hp;
    private int max_hp;
    private int poziom;
    private int pancerz;
    private int redukcjaFizycznych;
    private int pkt_ochrona_przed_magia;
    private int redukcjaMagicznych;
    private int zwinnosc;
    private int sila;
    private int szybkosc;
}

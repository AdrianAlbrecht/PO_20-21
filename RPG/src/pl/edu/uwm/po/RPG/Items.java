package pl.edu.uwm.po.RPG;

public abstract class Items { //TODO: implements Clonenable
    public Items(String name, int hp, int poziom, int pancerz, int pkt_ochrona_przed_magia, int zwinnosc, int pkt_ataku, boolean czy_aktywny, boolean czy_uzytkowy, int waga) {
        this.name = name;
        this.hp = hp;
        this.poziom = poziom;
        this.pancerz = pancerz;
        this.pkt_ochrona_przed_magia = pkt_ochrona_przed_magia;
        this.zwinnosc = zwinnosc;
        this.pkt_ataku = pkt_ataku;
        this.czy_aktywny = czy_aktywny;
        this.czy_uzytkowy = czy_uzytkowy;
        this.waga = waga;
    }

    public int getWaga() {
        return waga;
    }

    public String getName() {
        return name;
    }

    public boolean isCzy_aktywny() {
        return czy_aktywny;
    }

    public boolean isCzy_uzytkowy() {
        return czy_uzytkowy;
    }

    public void setCzy_aktywny(boolean czy_aktywny) {
        this.czy_aktywny = czy_aktywny;
    }

    private String name;
    private int hp;
    private int poziom;
    private int pancerz;
    private int pkt_ochrona_przed_magia;
    private int zwinnosc;
    private int pkt_ataku;
    boolean czy_aktywny;
    private boolean czy_uzytkowy;
    private int waga;
}

package pl.edu.uwm.po.RPG;

public class Mikstury extends Items{
    public Mikstury(String name, int hp, int pkt_ochrona_przed_magia, int zwinnosc, int pkt_ataku, boolean czy_uzytkowy, boolean czy_healujace) {
        super(name, hp, 0, 0, pkt_ochrona_przed_magia, zwinnosc, pkt_ataku, false, czy_uzytkowy, 1);
        this.czy_healujace = czy_healujace;
    }
    
    //TODO: method Use()
    //TODO: getters

    private boolean czy_healujace;
    private boolean czy_staly;
}

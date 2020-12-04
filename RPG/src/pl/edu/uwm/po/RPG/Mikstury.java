package pl.edu.uwm.po.RPG;

public class Mikstury extends Items{
    public Mikstury(String name, int hp, int pkt_ochrona_przed_magia, int zwinnosc, int pkt_ataku) {
        super(name, hp, 0, 0, pkt_ochrona_przed_magia, zwinnosc, pkt_ataku, false, true, 1);
    }

    @Override
    protected Object clone(){
        return new Mikstury(this.getName(),this.getHp(),this.getPkt_ochrona_przed_magia(),this.getZwinnosc(),this.getPkt_ataku());
    }

    private boolean czy_staly;
}

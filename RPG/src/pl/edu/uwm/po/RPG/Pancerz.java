package pl.edu.uwm.po.RPG;

enum Klasa_pancerza{
    lekki,
    sredni,
    ciezki;
}
enum Rodzaj_pancerza{
    helm,
    zbroja,
    rekawy,
    buty;
}

public class Pancerz extends Items{
    public Pancerz(String name, int hp, int poziom, int pancerz, int pkt_ochrona_przed_magia, int zwinnosc, int waga, Klasa_pancerza klasa, Rodzaj_pancerza rodzaj) {
        super(name, hp, poziom, pancerz, pkt_ochrona_przed_magia, zwinnosc, 0, false, false, waga);
        this.klasa = klasa;
        this.rodzaj = rodzaj;
    }

    //TODO: getters

    private Klasa_pancerza klasa;
    private Rodzaj_pancerza rodzaj;
}

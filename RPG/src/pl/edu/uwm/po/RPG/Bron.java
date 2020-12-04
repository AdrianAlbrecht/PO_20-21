package pl.edu.uwm.po.RPG;

enum Rodzaj_broni{
    miecz_jednoreczny(false),
    miecz_dwureczny(true),
    sztylet(false),
    kostur(true),
    luk(true);
    
    boolean dwureczny;
    
    private Rodzaj_broni( boolean czy_dwureczny){
        dwureczny=czy_dwureczny;
    }
}

public class Bron extends Items{
    public Bron(String name, int poziom, int pkt_ataku, int waga, Rodzaj_broni rodzaj) {
        super(name, 0, poziom, 0, 0, 0, pkt_ataku, false, false, waga);
        this.rodzaj = rodzaj;
    }

    public boolean isJednoreczna(){
        return this.rodzaj.dwureczny;
    }

    @Override
    protected Object clone(){
        return new Bron(this.getName(),this.getPoziom(),this.getPkt_ataku(),this.getWaga(),this.getRodzaj());
    }

    public Rodzaj_broni getRodzaj() {
        return rodzaj;
    }

    private Rodzaj_broni rodzaj;
}

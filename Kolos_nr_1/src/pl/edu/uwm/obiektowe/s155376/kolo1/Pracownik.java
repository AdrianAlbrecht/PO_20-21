package pl.edu.uwm.obiektowe.s155376.kolo1;

import java.time.LocalDate;

public class Pracownik extends Osoba{
    public Pracownik(String i, String n, LocalDate dU, String stan, double p){
        super(i,n,dU);
        this.stanowisko=stan;
        this.pensja=(double)Math.round(p*100)/100;
    }
    public Pracownik(Osoba os, String stan, double p){
        super(os.getImie(),os.getNazwisko(),os.getDataUrodzenia());
        this.stanowisko=stan;
        this.pensja=(double)Math.round(p*100)/100;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = (double)Math.round(pensja*100)/100;
    }

    private String stanowisko;
    private double pensja;

    @Override
    public String toString() {
        return super.toString()+" jest pracownikiem na stanowisku "+this.stanowisko+" z pensja "+String.format("%.2f", this.pensja)+"zł";
    }
}

package pl.adrianjd.albrecht;

import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba>{
    public Osoba(String naz, LocalDate dU){
        this.dataUrodzenia=dU;
        this.nazwisko=naz;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return this.dataUrodzenia;
    }

    @Override
    public boolean equals(Object obj) {
        Osoba osb = (Osoba) obj;
        return (osb.nazwisko.equals(this.nazwisko) && osb.dataUrodzenia.equals(this.dataUrodzenia));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"["+this.nazwisko+", "+this.dataUrodzenia.toString()+"]";
    }

    @Override
    public int compareTo(Osoba o) {
        int compare_nazwisko= this.nazwisko.compareTo(o.nazwisko);
        if(compare_nazwisko==0){
            return this.dataUrodzenia.compareTo(o.dataUrodzenia);
        }
        return compare_nazwisko;
    }

    private String nazwisko;
    private LocalDate dataUrodzenia;
}

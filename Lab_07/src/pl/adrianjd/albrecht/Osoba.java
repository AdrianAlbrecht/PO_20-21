package pl.adrianjd.albrecht;

import java.security.PublicKey;

public class Osoba {
    public Osoba(String nazwisko, int rokUrodzenia){
        this.nazwisko=nazwisko;
        this.rokUrodzenia=rokUrodzenia;
    }

    public int getRokUrodzenia() {
        return this.rokUrodzenia;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    @Override
    public String toString() {
        return "Nazwisko: "+this.nazwisko+"\nRok urodzenia: "+this.rokUrodzenia;
    }

    private String nazwisko;
    private int rokUrodzenia;
}

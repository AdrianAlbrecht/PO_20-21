package pl.adrianjd.albrecht;

public class Nauczyciel extends Osoba{
    public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja){
        super(nazwisko,rokUrodzenia);
        this.pensja=pensja;
    }

    public int getPensja() {
        return this.pensja;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPensja: "+this.pensja;
    }

    private int pensja;
}

package pl.edu.uwm.obiektowe.s155376.kolo1;

import java.time.LocalDate;

public class Osoba {
    public Osoba(String i, String n, LocalDate dU){
        this.dataUrodzenia=dU;
        this.Future();
        this.nazwisko=n;
        this.imie=i;
        this.setWiek();
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
        this.Future();
        this.setWiek();
    }

    public int getWiek() {
        return wiek;
    }

    private void setWiek(){
        LocalDate dzis= LocalDate.now();
        this.wiek=dzis.getYear()-this.dataUrodzenia.getYear();
        if((dzis.getMonth().equals(this.dataUrodzenia.getMonth()))){
            if(dzis.getDayOfMonth()>this.dataUrodzenia.getDayOfMonth()){
                this.wiek--;
            }
        }
        else if ((dzis.getMonth().compareTo(this.dataUrodzenia.getMonth())<0)){
            this.wiek--;
        }
    }

    private void Future(){
        if(this.dataUrodzenia.compareTo(LocalDate.now())>0){
            System.out.println("Nie mozna ustalić daty z przyszłości. Domyślna data urodzenia: dziś :)");
            this.setDataUrodzenia(LocalDate.now());
        }
    }

    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private int wiek;

    @Override
    public String toString() {
        return "Osoba "+this.imie+" "+this.nazwisko+" urodzona "+this.dataUrodzenia+", wiek "+this.wiek;
    }
}

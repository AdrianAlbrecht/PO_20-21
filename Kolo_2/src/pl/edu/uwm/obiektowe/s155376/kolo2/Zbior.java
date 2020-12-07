package pl.edu.uwm.obiektowe.s155376.kolo2;

import java.util.ArrayList;

public class Zbior {
    public Zbior() {
        this.liczby= new ArrayList<>();
    }

    public void dodajLiczbe(Liczba<? extends Number> l){ //Notabene i tak można dodać liczbę identyczną jakos [obiekt klasy Zbior].getLiczby().add([instancja klasy Number]) :)
        boolean czy=false;
        for(Liczba<? extends Number> li: this.liczby){
            if (li.compareTo(l) == 0) {
                czy = true;
                break;
            }
        }
        if(!czy){
            this.liczby.add(l);
        }
    }

    public ArrayList<Liczba<? extends Number>> getLiczby() {
        return liczby;
    }

    private ArrayList<Liczba<? extends Number>> liczby;
}

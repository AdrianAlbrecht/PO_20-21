package pl.edu.uwm.obiektowe.s155376.kolo2;

import java.time.LocalDate;

public abstract class Pojazd {
    public Pojazd(String model, Producent producent) {
        this.model = model;
        this.producent = producent;
        this.dataProdukcji = LocalDate.now();
    }

    public abstract void uzyjKlaksonu();
    public void jedzDoPrzodu(){
        System.out.println("Jadę do przodu");
    }

    @Override
    public String toString() {
        return this.model+" "+this.producent+" "+this.dataProdukcji;
    }

    private String model;
    private Producent producent;
    LocalDate dataProdukcji;
}

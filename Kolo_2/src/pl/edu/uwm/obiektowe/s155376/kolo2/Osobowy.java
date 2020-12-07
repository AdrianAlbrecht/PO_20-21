package pl.edu.uwm.obiektowe.s155376.kolo2;

public class Osobowy extends Pojazd implements IMozeCofac{
    public Osobowy(String model, Producent producent) {
        super(model, producent);
    }

    @Override
    public void uzyjKlaksonu() {
        System.out.println("Bi-pip");
    }
}

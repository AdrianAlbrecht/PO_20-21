package pl.edu.uwm.po.ajp_z01;

import java.util.Arrays;
import java.util.Comparator;

public class Employee implements Measurable{

    public Employee(String nazwisko, String imie, double placa) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.placa = placa;
    }

    static double average(Measurable[] objects){
        return Arrays.stream(objects).mapToDouble(Measurable::getMeasure).average().orElse(Double.NaN);
    }
    static Measurable largest(Measurable[] objects){
        return Arrays.stream(objects).max(Comparator.comparing(Measurable::getMeasure)).orElse(new Measurable() {
            @Override
            public double getMeasure() {
                return 0;
            }
        });
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public double getPlaca() {
        return placa;
    }

    public void setPlaca(double placa) {
        this.placa = placa;
    }

    @Override
    public double getMeasure() {
        return this.placa;
    }

    private String nazwisko;
    private String imie;
    private double placa;
}

package pl.adrianjd.albrecht;

import java.time.LocalDate;

public class Student extends Osoba{
    public Student(String nazwisko, String[] imi, LocalDate DU, boolean gender, String kierunek, double SO)
    {
        super(nazwisko,imi,DU,gender);
        this.kierunek = kierunek;
        this.sredniaOcen=SO;
    }

    public String getOpis()
    {
        return "student na kierunku studiów: " + this.kierunek + " ze średnią: "+this.sredniaOcen;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    private String kierunek;
    private double sredniaOcen;
}

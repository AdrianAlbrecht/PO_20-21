package pl.adrianjd.albrecht;

import java.time.LocalDate;

public class Pracownik extends Osoba{
    public Pracownik(String nazwisko, String[] imi, LocalDate DU, boolean gender, double pobory, LocalDate DZ)
    {
        super(nazwisko,imi,DU,gender);
        this.pobory = pobory;
        this.DataZatrudnienia=DZ;
    }

    public double getPobory()
    {
        return pobory;
    }

    public LocalDate getDataZatrudnienia() {
        return DataZatrudnienia;
    }

    public String getOpis()
    {
        return String.format("pracownik zatrudniony %s z pensją %.2f zł", this.DataZatrudnienia.toString(),this.pobory);
    }

    private double pobory;
    private LocalDate DataZatrudnienia;
}

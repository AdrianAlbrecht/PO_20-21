package pl.adrianjd.albrecht;

import java.time.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski", new String[]{"Jan"}, LocalDate.of(1999,2,8), false, 50000, LocalDate.of(2010,1,1));
        ludzie[1] = new Student("Nowak", new String[]{"Małgorzata","Anna"},LocalDate.of(1990,8,12),true, "informatyka",4.5);

        for (Osoba p : ludzie) {
            for ( String i : p.getImiona()){
                System.out.print(i+" ");
            }
            System.out.print(p.getNazwisko() + ": " + p.getOpis()+ " uordzony: "+p.getDataUrodzenia()+", plec: ");
            if(p.isPlec()){
                System.out.println("Kobieta");
            }
            else {
                System.out.println("Mężczyzna");
            }
        }
    }
}


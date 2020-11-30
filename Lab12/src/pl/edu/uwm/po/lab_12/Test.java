package pl.edu.uwm.po.lab_12;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> pracoownicy= new LinkedList<>();
        pracoownicy.add("Andrzej");
        pracoownicy.add("Stefan");
        pracoownicy.add("Lukasz");
        pracoownicy.add("Patryk");
        pracoownicy.add("Jędrzej");
        pracoownicy.add("Stanisław");
        pracoownicy.add("Eustachy");
        pracoownicy.add("Fabian");
        System.out.println(pracoownicy);
        Lab12.redukuj(pracoownicy,2);
        System.out.println(pracoownicy);
        LinkedList<Integer> liczby = new LinkedList<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(3);
        liczby.add(4);
        liczby.add(5);
        liczby.add(6);
        liczby.add(7);
        liczby.add(8);
        liczby.add(9);
        System.out.println(liczby);
        Lab12.redukuj(liczby,2);
        System.out.println(liczby);
        Lab12.odwroc(pracoownicy);
        System.out.println(pracoownicy);
        Lab12.odwroc(liczby);
        System.out.println(liczby);
        System.out.println(Lab12.mistrz_yoda("Ala ma kota. Jej kot lubi myszy."));
        Lab12.cyfry(2015);
        Lab12.Erastotenes(100);
        HashSet<LocalDate> daty = new HashSet<>();
        daty.add(LocalDate.of(1999,1,2));
        daty.add(LocalDate.of(1999,6,25));
        daty.add(LocalDate.of(1999,2,17));
        daty.add(LocalDate.of(1999,1,30));
        daty.add(LocalDate.of(1999,12,1));
        daty.add(LocalDate.of(1999,11,12));
        daty.add(LocalDate.of(1999,9,23));
        Lab12.print(liczby);
        Lab12.print(pracoownicy);
        Lab12.print(daty);
    }
}

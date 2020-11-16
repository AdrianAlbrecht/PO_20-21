package pl.edu.uwm.obiektowe.s155376.kolo1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //To były testy na bieżąco ;p

        /*Osoba p1 = new Osoba("Marian","Marianski", LocalDate.of(2000,11,17));
        Osoba p2 = new Osoba("Marcin","Marianski", LocalDate.of(2000,11,16));
        Osoba p3 = new Osoba("Oliwia","Marianska", LocalDate.of(2000,11,15));
        System.out.println(p1.getWiek());
        System.out.println(p2.getWiek());
        System.out.println(p3.getWiek());
        p2.setDataUrodzenia(LocalDate.of(1999,2,8));
        System.out.println(p2.getWiek());
        p3.setDataUrodzenia(LocalDate.of(2999,2,8));
        System.out.println(p3.getDataUrodzenia());
        System.out.println(p2);*/

        ArrayList<Osoba> spisOsob= new ArrayList<>(6);
        spisOsob.add(new Osoba("Marian","Marianski", LocalDate.of(2000,11,17)));
        spisOsob.add(new Osoba("Marcin","Marianski", LocalDate.of(2000,11,16)));
        spisOsob.add(new Osoba("Oliwia","Marianska", LocalDate.of(2000,11,15)));
        spisOsob.add(new Osoba("Adrian","Albrecht", LocalDate.of(1999,2,8)));
        spisOsob.add(new Osoba("Katarzyna","Polek", LocalDate.of(2021,2,8)));
        spisOsob.add(new Osoba("Johny","Deep", LocalDate.of(1963,6,9)));
        System.out.println("\n6 osoba w liście:\n"+spisOsob.get(5));
        spisOsob.set(3,new Pracownik(spisOsob.get(3),"Przewodniczący RWSS",0.0));
        spisOsob.set(0,new Pracownik(spisOsob.get(0),"Specjalista ds. marketingu Cal Center kampanii grupy utrzymaniowej operatora sieci Play",2880));
        spisOsob.set(5,new Pracownik(spisOsob.get(5),"Najlepszy aktor ever",1000000.3474));
        System.out.println("6 osoba w liście po zamianie na pracownika:\n"+spisOsob.get(5));
        System.out.println("\nOsoby w liście:\n");
        for(Osoba os: spisOsob){
            System.out.println(os);
        }
        double suma_pensji=0;
        for(Osoba os: spisOsob){
            if(os instanceof Pracownik){
                suma_pensji+=((Pracownik) os).getPensja();
            }
        }
        System.out.println("\nSuma pensji wszystkich rpacowników wynosi:\n"+suma_pensji);
    }
}

package pl.edu.uwm.po.lab_01;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        //Zadanie 1
        RachunekBankowy saver1= new RachunekBankowy(2000.0);
        RachunekBankowy saver2= new RachunekBankowy(3000.0);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver1.getSaldo());
        System.out.println(saver2.getSaldo());

        //Zadanie 2
        IntegerSet zbiorA= new IntegerSet();
        IntegerSet zbiorB= new IntegerSet();
        zbiorA.insertElement(20);
        zbiorA.insertElement(30);
        zbiorA.insertElement(40);
        zbiorB.insertElement(44);
        zbiorB.insertElement(30);
        zbiorB.insertElement(21);
        System.out.println(zbiorA);
        System.out.println(zbiorB);
        System.out.println(IntegerSet.union(zbiorA,zbiorB));
        System.out.println(IntegerSet.intersection(zbiorA,zbiorB));
        zbiorA.deleteElement(30);
        System.out.println(zbiorA);
        System.out.println(zbiorA.equals(zbiorB));
        IntegerSet zbiorC= new IntegerSet();
        zbiorC.insertElement(20);
        zbiorC.insertElement(40);
        System.out.println(zbiorA.equals(zbiorC));

        //Zadanie 3
        Pracownik[] personel = new Pracownik[3];

                // wypełnij tablicę danymi pracowników
        personel[0] = new Pracownik("Karol Cracker", 75000, 2001, 12, 15);
        personel[1] = new Pracownik("Henryk Hacker", 50000, 2003, 10, 1);
        personel[2] = new Pracownik("Antoni Tester", 40000, 2005, 3, 15);

                // zwiększ pobory każdego pracownika o 20%
        for (Pracownik e : personel) {
            e.zwiekszPobory(20);
        }

                // wypisz informacje o każdym pracowniku
        for (Pracownik e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tpobory = " + e.pobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.dataZatrudnienia());
        }
        System.out.println();

    }

}

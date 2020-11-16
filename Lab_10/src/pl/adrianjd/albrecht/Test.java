package pl.adrianjd.albrecht;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //TEST OSOBA
        ArrayList<Osoba> listaOsob = new ArrayList<>(5);
        listaOsob.add(new Osoba("Giermyk", LocalDate.of(1969, 12, 2)));
        listaOsob.add(new Osoba("Giermyk", LocalDate.of(1969, 12, 2)));
        listaOsob.add(new Osoba("Pok", LocalDate.of(1999, 2, 8)));
        listaOsob.add(new Osoba("Albrecht", LocalDate.of(1999, 2, 8)));
        listaOsob.add(new Osoba("Giermyk", LocalDate.of(1999, 12, 1)));
        System.out.println(listaOsob.get(0));
        System.out.println(listaOsob.get(0).equals(listaOsob.get(1)));
        System.out.println(listaOsob.get(0).equals(listaOsob.get(4)));

        System.out.println(listaOsob);
        Collections.sort(listaOsob);
        System.out.println(listaOsob);

        //Z2

        ArrayList<Osoba> listaStudentow = new ArrayList<>(5);
        listaStudentow.add(new Student("Giermyk", LocalDate.of(1969, 12, 2), 3.09));
        listaStudentow.add(new Student("Giermyk", LocalDate.of(1969, 12, 2), 4.76));
        listaStudentow.add(new Student("Pok", LocalDate.of(1999, 2, 8), 4.0));
        listaStudentow.add(new Student("Albrecht", LocalDate.of(1999, 2, 8), 5.0));
        listaStudentow.add(new Student("Giermyk", LocalDate.of(1999, 12, 1), 3.89));

        System.out.println(listaStudentow);
        Collections.sort(listaStudentow);
        System.out.println(listaStudentow);

        //Z3
        if (args.length != 0) {
            ArrayList<String> zad3 = new ArrayList<>();
            try {
                File mojPlik = new File(args[0]);
                Scanner zczytywanie = new Scanner(mojPlik);
                while (zczytywanie.hasNextLine()) {
                    zad3.add(zczytywanie.nextLine());
                }
                zczytywanie.close();
            } catch (FileNotFoundException e) {
                System.out.println("Brak takiego pliku");
                e.printStackTrace();
            }

            System.out.println(zad3);
            Collections.sort(zad3);
            System.out.println(zad3);
        }
    }
}

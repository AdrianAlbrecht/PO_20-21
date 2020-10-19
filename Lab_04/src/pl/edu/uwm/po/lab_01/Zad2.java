package pl.edu.uwm.po.lab_01;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2 {
    public Zad2(String plik, char znak){
        int ilosc_znaku=0;
        try {
            File mojPlik= new File(plik);
            Scanner zczytywanie = new Scanner(mojPlik);
            while (zczytywanie.hasNextLine()) {
                String tekst = zczytywanie.nextLine();
                ilosc_znaku += (int)tekst.chars().filter(ch -> ch == znak).count();
            }
            zczytywanie.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Brak takiego pliku");
            e.printStackTrace();
        }
        System.out.println("Znaleziono " + ilosc_znaku + " znaków "+znak);
    }
}
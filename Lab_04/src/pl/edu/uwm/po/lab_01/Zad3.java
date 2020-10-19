package pl.edu.uwm.po.lab_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3 {
    public Zad3(String plik, String wyraz){
        int count=0;
        try {
            File mojPlik= new File(plik);
            Scanner zczytywanie = new Scanner(mojPlik);
            while (zczytywanie.hasNextLine()) {
                String tekst = zczytywanie.nextLine();
                int len_str=tekst.length();
                int len_subStr=wyraz.length();
                int index=0;
                String temp;
                while(len_str-index>=len_subStr){
                    temp=tekst.substring(index,index+(len_subStr));
                    if(temp.equals(wyraz)) count++;
                    index++;
                }
            }
            zczytywanie.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Brak takiego pliku");
            e.printStackTrace();
        }
        System.out.println("Znaleziono " + count + " wyrazu "+wyraz);
    }
}

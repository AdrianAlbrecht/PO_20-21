package pl.edu.uwm.po.lab_13;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        //PriorityList lista= new PriorityList();
        //lista.wypisz();
        //lista.pisz();
        //lista.wypisz();

        Egzamin po = new Egzamin();
        po.dodaj("Patrych", "db");
        po.dodaj("Albrecht","dbd");
        po.dodaj("Slaby","dst");
        po.dodaj("Fons","db+");
        po.wypisz();
        po.usun("Slaby");
        po.zmien("Fons","dst+");
        po.wypisz();

        Egzamin2 po2= new Egzamin2();
        po2.dodaj(new Student("Adrian","Albrecht",4),"bdb");
        po2.dodaj(new Student("Amadeusz","Albrecht",3),"db");
        po2.dodaj(new Student("Adrian","Albrecht",1),"dst");
        po2.dodaj(new Student("Adrian","Paterson",2),"ndst");
        po2.wypisz();
        po2.usun(3);
        po2.zmien(2,"dst+");
        po2.wypisz();

        FunMieszajaca fm= new FunMieszajaca("alice30.txt");
    }
}

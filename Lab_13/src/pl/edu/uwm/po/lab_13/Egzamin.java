package pl.edu.uwm.po.lab_13;

import java.util.*;

public class Egzamin {
    public Egzamin(){
        this.oceny=new TreeMap<>();
    }
    public void dodaj(String nazwisko, String ocena){
        this.oceny.put(nazwisko,ocena);
    }
    public void usun(String nazwisko){
        for(String naz: this.oceny.keySet()){
            if(naz.equals(nazwisko)){
                this.oceny.remove(nazwisko);
            }
        }
    }
    public void zmien(String nazwisko, String ocena){
        for(String naz: this.oceny.keySet()){
            if(naz.equals(nazwisko)){
                this.oceny.replace(nazwisko,ocena);
            }
        }
    }
    public void wypisz(){
        for (String ucze: this.oceny.keySet()){
            System.out.println(ucze+" : "+this.oceny.get(ucze));
        }
        System.out.println();
    }

    private TreeMap<String,String> oceny;
}

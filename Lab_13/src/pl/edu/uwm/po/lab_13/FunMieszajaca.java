package pl.edu.uwm.po.lab_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FunMieszajaca {
    public FunMieszajaca(String plik) throws FileNotFoundException {
        this.kody= new HashMap<>();
        File pliczek = new File(plik);
        Scanner skanik_pliku= new Scanner(pliczek);
        while (skanik_pliku.hasNext()){
            String slowo= skanik_pliku.next();
            boolean czy=false;
            for(int x: this.kody.keySet()){
                if (slowo.hashCode() == x) {
                    czy = true;
                    break;
                }
            }
            if(!czy){
                this.kody.put(slowo.hashCode(),new HashSet<>());
            }
            this.kody.get(slowo.hashCode()).add(slowo);
        }
        this.wypisz();
    }

    public void wypisz(){
        for(int x: this.kody.keySet()){
            if(this.kody.get(x).size()>1){
                System.out.print(x+":");
                for(String word: this.kody.get(x)){
                    System.out.print(" "+word);
                }
                System.out.println();
            }
        }
    }

    private HashMap<Integer, HashSet<String>> kody;
}

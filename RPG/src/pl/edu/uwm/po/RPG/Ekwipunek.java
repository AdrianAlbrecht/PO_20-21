package pl.edu.uwm.po.RPG;

import java.util.ArrayList;

public class Ekwipunek {
    public Ekwipunek(int pojemnosc) {
        this.bronie=new ArrayList<>();
        this.pancerze=new ArrayList<>();
        this.mikstury=new ArrayList<>();
        this.pojemnosc=pojemnosc;
        this.zajetosc=0;
    }

    public <T extends Items> void dodaj(T rzecz){
        if(this.czy_jest_miejsce(rzecz)){
            if(rzecz instanceof Bron){
                bronie.add((Bron)rzecz);
            }
            else if(rzecz instanceof Pancerz){
                pancerze.add((Pancerz)rzecz);
            }
            else {
                mikstury.add((Mikstury)rzecz);
            }
            zajetosc+=rzecz.getWaga();
        }
        else{
            System.out.println("Rzecz jest zbyt ciężka! Za mało miejsca w ekwipunku!");
        }
    }
    
    //TODO: method remove(T rzecz)

    private <T extends Items> boolean czy_jest_miejsce(T rzecz){
        return this.pojemnosc>=this.zajetosc+rzecz.getWaga();
    }

    public ArrayList<Bron> getBronie() {
        return bronie;
    }

    public ArrayList<Pancerz> getPancerze() {
        return pancerze;
    }

    public ArrayList<Mikstury> getMikstury() {
        return mikstury;
    }

    public ArrayList<String> zawartosc(){
        ArrayList<String> zawartosc = new ArrayList<>();
        for(Bron x: this.bronie){
            if(x.isCzy_aktywny())
                zawartosc.add("*"+x.getName());
            else
                zawartosc.add(x.getName());
        }
        for(Pancerz x: this.pancerze){
            if(x.isCzy_aktywny())
                zawartosc.add("*"+x.getName());
            else
                zawartosc.add(x.getName());
        }
        for(Mikstury x: this.mikstury){
            zawartosc.add(x.getName());
        }
        return zawartosc;
    }
    
    //TODO: methods aktywuj(T rzecz), dezaktywuj(T rzecz)

    private ArrayList<Bron> bronie;
    private ArrayList<Pancerz> pancerze;
    private ArrayList<Mikstury> mikstury;
    private int pojemnosc;
    private int zajetosc;
}

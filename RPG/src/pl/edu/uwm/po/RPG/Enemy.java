package pl.edu.uwm.po.RPG;


import java.util.ArrayList;
import java.util.Random;

public class Enemy extends Istota{
    public Enemy(String name, Rasa_istoty rasa, int max_hp, int poziom, int pancerz, int pkt_ochrona_przed_magia, int zwinnosc, int sila, int szybkosc, int exp, ArrayList<Items> rzeczy, ArrayList<Integer> szansa_na_drop) {
        super(name, rasa, max_hp, poziom, pancerz, pkt_ochrona_przed_magia, zwinnosc, sila);
        this.setSzybkosc(szybkosc);
        this.swora= null;
        this.drop= new Drop(rzeczy,szansa_na_drop);
        this.exp=exp;
        this.setPancerz(this.getPancerz());
        this.setPkt_ochrona_przed_magia(this.getPkt_ochrona_przed_magia());
    }

    @Override
    public void statystyki() {
        System.out.println("==================================Statystyki bestii====================================");
        System.out.println("Nazwa: "+this.getName());
        System.out.println("Rasa: "+this.getRasa());
        if(this.swora!=null){
            System.out.println(this.swora.getName());
            System.out.println("Swora: "+this.swora.wypiszSklad());
        }
        else System.out.println("Pojedynczy przeciwnik");
        System.out.println("Poziom: "+this.getPoziom());
        System.out.println("EXP: "+this.exp);
        System.out.println("Health: "+this.getAktualne_hp()+"/"+this.getMax_hp());
        System.out.println("Pancerz: "+this.getPancerz()+"\nRedukcja obrażeń fizycznych: "+this.getRedukcjaFizycznych()+"%");
        System.out.println("Ochrona magiczna: "+this.getPkt_ochrona_przed_magia()+"\nRedukcja obrażeń magicznych: "+this.getRedukcjaMagicznych()+"%");
        System.out.println("Sila: "+this.getSila());
        System.out.println("Zwinnośc: "+this.getZwinnosc());
        System.out.println("Szybkość: "+this.getSzybkosc());
        System.out.println("Ewpipunek: "+this.drop.show());
    }

    public Items rng_drop(){
        Random random= new Random();
        double wynik=random.nextDouble();
        int licznik=0;
        int ind=0;
        double max=0;
        for(int rng: this.drop.getSzansa_na_drop()){
            max+=rng;
        }
        for(int rng: this.drop.getSzansa_na_drop()){
            licznik+=rng;
            if((licznik/max)<=wynik){
                ind++;
            }
        }
        Items dropiszcze = this.drop.getRzeczy().get(ind);
        if(dropiszcze instanceof Bron)
            return (Bron)((Bron)dropiszcze).clone();
        else if(dropiszcze instanceof Pancerz)
            return (Pancerz)((Pancerz)dropiszcze).clone();
        return (Mikstury)((Mikstury)dropiszcze).clone();
    }

    public int getExp() {
        return exp;
    }

    private Team<Enemy> swora;
    private Drop drop;
    private int exp;
}

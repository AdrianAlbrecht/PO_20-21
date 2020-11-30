package pl.edu.uwm.po.RPG;


import java.util.ArrayList;

public class Enemy extends Istota{
    public Enemy(String name, Rasa_istoty rasa, int max_hp, int poziom, int pancerz, int pkt_ochrona_przed_magia, int zwinnosc, int sila, int szybkosc, int exp, ArrayList<Items> rzeczy, ArrayList<Integer> szansa_na_drop) {
        super(name, rasa, max_hp, poziom, pancerz, pkt_ochrona_przed_magia, zwinnosc, sila);
        this.setSzybkosc(szybkosc);
        this.swora= null;
        this.drop= new Drop(rzeczy,szansa_na_drop);
        this.exp=exp;
    }

    @Override
    public void statystyki() {
        System.out.println("============================================================================================");
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

    //TODO: method drop_rng()

    private Team<Enemy> swora;
    private Drop drop;
    private int exp;
}

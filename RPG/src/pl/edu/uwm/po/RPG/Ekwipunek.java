package pl.edu.uwm.po.RPG;

import java.util.ArrayList;
import java.util.Scanner;

public class Ekwipunek {
    public Ekwipunek(int pojemnosc) {
        this.bronie=new ArrayList<>();
        this.pancerze=new ArrayList<>();
        this.mikstury=new ArrayList<>();
        this.pojemnosc=pojemnosc;
        this.zajetosc=0;
        this.aktywne=new ArrayList<>();
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

    public ArrayList<String> zawartosc(Ally gracz){
        ArrayList<String> zawartosc = new ArrayList<>();
        for(Bron x: this.bronie){
            if(x.isCzy_aktywny())
                zawartosc.add("*"+x.getName());
            else if(x.getPoziom()>gracz.getPoziom()){
                zawartosc.add("!"+x.getName());
            }
            else
                zawartosc.add(x.getName());
        }
        for(Pancerz x: this.pancerze){
            if(x.isCzy_aktywny())
                zawartosc.add("*"+x.getName());
            else if(x.getPoziom()>gracz.getPoziom()){
                zawartosc.add("!"+x.getName());
            }
            else
                zawartosc.add(x.getName());
        }
        for(Mikstury x: this.mikstury){
            zawartosc.add(x.getName());
        }
        return zawartosc;
    }

    public <T extends Items> void remove(T rzecz){
        if (rzecz.isCzy_aktywny()){
            rzecz.setCzy_aktywny(false);
        }
        if (rzecz instanceof Bron){
            bronie.remove(rzecz);
        }
        else if (rzecz instanceof Pancerz){
            pancerze.remove(rzecz);
        }
        else if (rzecz instanceof Mikstury){
            mikstury.remove(rzecz);
        }
        this.zajetosc-=rzecz.getWaga();
    }

    public ArrayList<Items> getAktywne() {
        return aktywne;
    }

    public <T extends Items> void aktywuj(T rzecz, Ally gracz){
        if(!rzecz.czy_aktywny){
            rzecz.setCzy_aktywny(true);
            if(rzecz instanceof Bron){
                ArrayList<Bron> aktywis= new ArrayList<>();
                for(Items y: aktywne){
                    if(y instanceof Bron)
                        aktywis.add((Bron)y);
                }
                if (aktywis.size()==2){
                    if(((Bron) rzecz).getRodzaj().dwureczny){
                        for( Bron x: aktywis){
                            x.setCzy_aktywny(false);
                            this.aktywne.remove(x);
                        }
                    }
                    else {
                        Scanner klawiatura = new Scanner(System.in);
                        System.out.println("Którą jednoręczną brón dezaktywować?");
                        System.out.println("0: "+aktywis.get(0).getName());
                        System.out.println("1: "+aktywis.get(1).getName());
                        int z=klawiatura.nextInt();
                        aktywis.get(z).setCzy_aktywny(false);
                        this.aktywne.remove(aktywis.get(z));
                    }
                }
                else if((aktywis.size()==1)&&(aktywis.get(0).getRodzaj().dwureczny)){
                    aktywis.get(0).setCzy_aktywny(false);
                    this.aktywne.remove(aktywis.get(0));
                }
                else if((aktywis.size()==1)&&(((Bron)rzecz).getRodzaj().dwureczny)){
                    aktywis.get(0).setCzy_aktywny(false);
                    this.aktywne.remove(aktywis.get(0));
                }
                this.aktywne.add(rzecz);
            }
            else if(rzecz instanceof Pancerz){
                gracz.setMax_hp(gracz.getMax_hp()+rzecz.getHp());
                gracz.setPkt_ochrona_przed_magia(gracz.getPkt_ochrona_przed_magia()+rzecz.getPkt_ochrona_przed_magia());
                gracz.setPancerz(gracz.getPancerz()+rzecz.getPancerz());
                gracz.setZwinnosc(gracz.getZwinnosc()+rzecz.getZwinnosc());
                for(Items x: aktywne){
                    if(x instanceof Pancerz){
                        if(((Pancerz)x).getRodzaj()==((Pancerz)rzecz).getRodzaj()){
                            x.setCzy_aktywny(false);
                            this.aktywne.remove(x);
                            gracz.setMax_hp(gracz.getMax_hp()-x.getHp());
                            gracz.setPkt_ochrona_przed_magia(gracz.getPkt_ochrona_przed_magia()-x.getPkt_ochrona_przed_magia());
                            gracz.setPancerz(gracz.getPancerz()-x.getPancerz());
                            gracz.setZwinnosc(gracz.getZwinnosc()-x.getZwinnosc());
                        }
                    }
                }
                this.aktywne.add(rzecz);
            }
            else if(rzecz.isCzy_uzytkowy()){
                System.out.println(gracz.getName()+" uzywa "+rzecz.getName());
                gracz.healuj(rzecz.getHp());
                gracz.setPkt_ochrona_przed_magia(gracz.getPkt_ochrona_przed_magia()+rzecz.getPkt_ochrona_przed_magia());
                gracz.setSila(gracz.getSila()+rzecz.getPkt_ataku());
                gracz.setZwinnosc(gracz.getZwinnosc()+rzecz.getZwinnosc());
                this.mikstury.remove(rzecz);
            }
        }
    }
    public <T extends Items> void dezaktywuj(T rzecz, Ally gracz){
        if(rzecz instanceof Mikstury);
        else{
            this.aktywne.remove(rzecz);
            rzecz.setCzy_aktywny(false);
            if(rzecz instanceof Pancerz)
                gracz.setMax_hp(gracz.getMax_hp()-rzecz.getHp());
                gracz.setPkt_ochrona_przed_magia(gracz.getPkt_ochrona_przed_magia()-rzecz.getPkt_ochrona_przed_magia());
                gracz.setPancerz(gracz.getPancerz()-rzecz.getPancerz());
                gracz.setZwinnosc(gracz.getZwinnosc()-rzecz.getZwinnosc());
        }
    }

    private ArrayList<Bron> bronie;
    private ArrayList<Pancerz> pancerze;
    private ArrayList<Mikstury> mikstury;
    private ArrayList<Items> aktywne;
    private int pojemnosc;
    private int zajetosc;
}

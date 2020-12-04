package pl.edu.uwm.po.RPG;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    public static void main(String[] args) {
        Bron drewniany_miecz= new Bron("Drewniany Miecz",1,1,1,Rodzaj_broni.miecz_jednoreczny);
        Pancerz helm_z_pingwina = new Pancerz("Hełm z Pingwina Królewskiego",0,1,1,0,0,2,Klasa_pancerza.lekki,Rodzaj_pancerza.helm);
        Ally Arnold = new Ally("Arnold",Rasa_istoty.czlowiek);
        Arnold.dodaj_do_druzyny(new Team<Ally>("Druzyna Pierscienia"));
        Arnold.dodaj_do_ekwipunku((Bron)drewniany_miecz.clone());
        Arnold.statystyki();
        Ally Stefan = new Ally("Stefan",Rasa_istoty.ork);
        Stefan.dodaj_do_druzyny_kompana(Arnold);
        Stefan.statystyki();
        ArrayList<Items> drop_z_pingwina = new ArrayList<>();
        drop_z_pingwina.add(drewniany_miecz);
        drop_z_pingwina.add(helm_z_pingwina);
        ArrayList<Integer> szansa_drop_z_pingwina = new ArrayList<>(Arrays.asList(1,1));
        Enemy pingwin = new Enemy("Pingwin Królewski",Rasa_istoty.zwierze,2,1,0,0,1,1,1,5,drop_z_pingwina,szansa_drop_z_pingwina);
        pingwin.statystyki();

        Arnold.statystyki();
        Arnold.aktywuj_ekwipunek(Arnold.getEkwipunek().getBronie().get(0)); //Aktywuj kopie drewanianego miecza
        Arnold.dodaj_do_ekwipunku((Pancerz)helm_z_pingwina.clone());
        Arnold.aktywuj_ekwipunek(Arnold.getEkwipunek().getPancerze().get(0)); //dezaktywuj kopie helmu z pingwina
        Arnold.statystyki();
        Arnold.dezaktywuj_ekwipunek(Arnold.getEkwipunek().getPancerze().get(0));
        Arnold.statystyki();

        Bron EMZA = new Bron("Epicki Miecz z Ametystu",35,80,15,Rodzaj_broni.miecz_dwureczny);
        Bron MZA = new Bron("Miecz z Ametystu",25,50,15,Rodzaj_broni.miecz_dwureczny);
        Pancerz EPZA = new Pancerz("Epicki Pancerz z Ametystu",2000,35,25,25,10,25,Klasa_pancerza.ciezki,Rodzaj_pancerza.zbroja);
        Pancerz PZA = new Pancerz("Pancerz z Ametystu",200,25,25,25,5,25,Klasa_pancerza.ciezki,Rodzaj_pancerza.zbroja);
        Mikstury MDL = new Mikstury("Mikstura Duzego Leczenia",50,0,0,0);

        ArrayList<Items> drop_z_wampira= new ArrayList<>();
        drop_z_wampira.add(EMZA);
        drop_z_wampira.add(MZA);
        drop_z_wampira.add(EPZA);
        drop_z_wampira.add(PZA);
        drop_z_wampira.add(MDL);
        ArrayList<Integer> szansa_na_drop_z_wampira =  new ArrayList<>(Arrays.asList(1,5,1,5,10));

        Enemy wampir = new Enemy("Wampirzy Elf",Rasa_istoty.elf,300,35,20,30,30,80,5,5000,drop_z_wampira,szansa_na_drop_z_wampira);

        Arnold.dodaj_exp(37000); //GRAMY NA KODACH :)
        Arnold.dodaj_do_ekwipunku((Bron)MZA.clone());
        Arnold.dodaj_do_ekwipunku((Pancerz)PZA.clone());
        Arnold.aktywuj_ekwipunek(Arnold.getEkwipunek().getPancerze().get(1));
        Arnold.aktywuj_ekwipunek(Arnold.getEkwipunek().getBronie().get(1));
        Arnold.dodaj_do_ekwipunku((Mikstury)MDL.clone());

        Arnold.statystyki();
        wampir.statystyki();
        Fight.walka(Arnold,wampir);

        if(Arnold.getMax_hp()>0){//Czy Arnold żyje?
            Arnold.setAktualne_hp(220);
            Arnold.statystyki();
            Arnold.aktywuj_ekwipunek(Arnold.getEkwipunek().getMikstury().get(0));
            Arnold.statystyki();
        }
    }
}

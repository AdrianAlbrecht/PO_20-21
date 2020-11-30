package pl.edu.uwm.po.RPG;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    public static void main(String[] args) {
        Bron drewniany_miecz= new Bron("Drewniany Miecz",1,1,1,Rodzaj_broni.miecz_jednoreczny);
        Pancerz helm_z_pingwina = new Pancerz("Hełm z Pingwina Królewskiego",0,1,1,0,0,2,Klasa_pancerza.lekki,Rodzaj_pancerza.helm);
        Ally Arnold = new Ally("Arnold",Rasa_istoty.czlowiek);
        Arnold.dodaj_do_druzyny(new Team<Ally>("Druzyna Pierscienia"));
        drewniany_miecz.setCzy_aktywny(true);
        Arnold.dodaj_do_ekwipunku(drewniany_miecz);
        Arnold.dodaj_exp(3000);
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
        
        //TODO: class Fight
    }
}

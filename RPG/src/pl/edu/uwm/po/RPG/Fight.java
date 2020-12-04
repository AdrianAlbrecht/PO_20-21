package pl.edu.uwm.po.RPG;


import java.util.Random;

public class Fight {
    public static void walka(Ally gracz, Enemy przeciwnik){
        if((przeciwnik.getAktualne_hp()>0)&&(gracz.getAktualne_hp()>0)){
            Random genrator = new Random();
            System.out.println("==============================Walka===============================");
            int rund=1;
            while ((gracz.getAktualne_hp()>0)&&(przeciwnik.getAktualne_hp()>0)){ //TODO: szybkosc okresla kolejke-walka turowa??
                System.out.println("==================Runda "+rund+"=================");
                double atk_gracza=(((double)(100-przeciwnik.getRedukcjaFizycznych())/100)*Fight.atak_gracza(gracz));
                atk_gracza=(double)Math.round(atk_gracza*10)/10;
                double atk_bestii=(((double)(100-gracz.getRedukcjaFizycznych())/100)*(przeciwnik.getSila()*genrator.nextDouble()));
                atk_bestii=(double)Math.round(atk_bestii*10)/10;
                if(gracz.getSzybkosc()>przeciwnik.getSzybkosc()){
                    przeciwnik.setAktualne_hp((double)Math.round((przeciwnik.getAktualne_hp()-atk_gracza)*10)/10);
                    System.out.println(gracz.getName()+" zaatakowal "+przeciwnik.getName()+" za "+atk_gracza+"pkt obrazen");
                    System.out.println("Zycie bestii: "+przeciwnik.getAktualne_hp());
                    if(przeciwnik.getAktualne_hp()>0){
                        gracz.setAktualne_hp((double)Math.round((gracz.getAktualne_hp()-atk_bestii)*10)/10);
                        System.out.println(przeciwnik.getName()+" zaatakowal "+gracz.getName()+" za "+atk_bestii+"pkt obrazen");
                        System.out.println("Zycie gracza: "+gracz.getAktualne_hp());
                    }
                }
                else{
                    gracz.setAktualne_hp((double)Math.round((gracz.getAktualne_hp()-atk_bestii)*10)/10);
                    System.out.println(przeciwnik.getName()+" zaatakowal "+gracz.getName()+" za "+atk_bestii+"pkt obrazen");
                    System.out.println("Zycie gracza: "+gracz.getAktualne_hp());
                    if(gracz.getAktualne_hp()>0){
                        przeciwnik.setAktualne_hp((double)Math.round((przeciwnik.getAktualne_hp()-atk_gracza)*10)/10);
                        System.out.println(gracz.getName()+" zaatakowal "+przeciwnik.getName()+" za "+atk_gracza+"pkt obrazen");
                        System.out.println("Zycie bestii: "+przeciwnik.getAktualne_hp());
                    }
                }
                rund++;
            }
            if(przeciwnik.getAktualne_hp()<=0){
                przeciwnik.setAktualne_hp(0);
                Items dropik= przeciwnik.rng_drop();
                System.out.println(gracz.getName()+" pokonał w walce "+przeciwnik.getName());
                System.out.println(gracz.getName()+" dostaje w nagrode "+dropik.getName());
                gracz.dodaj_do_ekwipunku(dropik);
                System.out.println(gracz.getName()+" otrzymuje za pokonanie "+przeciwnik.getName()+" "+przeciwnik.getExp()+" pkt doświadczenia");
                gracz.dodaj_exp(przeciwnik.getExp());
            }
            else{
                System.out.println(gracz.getName()+" poległ w walce");
                gracz.getDruzyna().getSklad().remove(gracz);
                gracz.setName("Nieżywy"+gracz.getName());
                gracz.setMax_hp(0);
            }
        }
    }
    private static int atak_gracza(Ally gracz){
        Random genrator = new Random();
        int atak=(int)(gracz.getSila()* genrator.nextDouble());
        for(Items it:gracz.getEkwipunek().getAktywne()){
            if(it instanceof Bron){
                atak+=(int)(it.getPkt_ataku()* genrator.nextDouble());
            }
        }
        return atak;
    }
}

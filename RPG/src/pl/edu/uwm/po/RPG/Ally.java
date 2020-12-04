package pl.edu.uwm.po.RPG;


public class Ally extends Istota{
    public Ally(String name, Rasa_istoty rasa) {
        super(name, rasa, 0, 1, 0, 0, 0, 0);
        if(rasa.name().equals("czlowiek")){
            this.setMax_hp(5);
            this.setSila(3);
            this.setZwinnosc(2);
            this.setSzybkosc(2);
        }
        else if(this.getRasa().name().equals("elf")){
            this.setMax_hp(3);
            this.setSila(1);
            this.setZwinnosc(7);
            this.setSzybkosc(3);
        }
        else if(this.getRasa().name().equals("ork")){
            this.setMax_hp(5);
            this.setSila(5);
            this.setZwinnosc(1);
            this.setSzybkosc(1);
        }
        else if(this.getRasa().name().equals("krasnolud")){
            this.setMax_hp(7);
            this.setSila(2);
            this.setZwinnosc(1);
            this.setSzybkosc(1);
        }
        this.druzyna= null;
        this.ekwipunek=new Ekwipunek(50);
        this.exp=0;
    }

    public void dodaj_do_druzyny(Team<Ally> nowa_druzyna){
        this.druzyna= nowa_druzyna;
        nowa_druzyna.add(this);
    }

    public void dodaj_do_druzyny_kompana(Ally towarzysz){
        this.druzyna=towarzysz.getDruzyna();
        this.druzyna.add(this);
    }
    
    public void dodaj_exp(int wartosc){
        this.exp+=wartosc;
        while(this.exp>(this.getPoziom()+(this.getPoziom()*100)+Math.pow(this.getPoziom(),2))){
            this.exp-=this.getPoziom()+(this.getPoziom()*100)+Math.pow(this.getPoziom(),2);
            this.level_up();
        }
    }
    
    private void level_up(){
        this.setPoziom(this.getPoziom()+1);
        if(this.getRasa().name().equals("czlowiek")){
            this.setMax_hp(this.getMax_hp()+2);
            this.setAktualne_hp(this.getMax_hp());
            this.setSila(this.getSila()+2);
            this.setZwinnosc(this.getZwinnosc()+2);
        }
        else if(this.getRasa().name().equals("elf")){
            this.setMax_hp(this.getMax_hp()+3);
            this.setAktualne_hp(this.getMax_hp());
            this.setZwinnosc(this.getZwinnosc()+3);
        }
        else if(this.getRasa().name().equals("ork")){
            this.setMax_hp(this.getMax_hp()+2);
            this.setAktualne_hp(this.getMax_hp());
            this.setSila(this.getSila()+4);
        }
        else if(this.getRasa().name().equals("krasnolud")){
            this.setMax_hp(this.getMax_hp()+4);
            this.setAktualne_hp(this.getMax_hp());
            this.setSila(this.getSila()+2);
        }
    }

    public Team<Ally> getDruzyna() {
        return druzyna;
    }

    @Override
    public void statystyki(){
        System.out.println("====================================Statystyki gracza=====================================");
        System.out.println("Nazwa: "+this.getName());
        System.out.println("Rasa: "+this.getRasa());
        System.out.print("Druzyna: ");
        if(this.druzyna!=null){
            System.out.println(this.druzyna.getName());
            System.out.println("Sklad druzyny: "+this.druzyna.wypiszSklad());
        }
        else System.out.println("brak");
        System.out.println("Poziom: "+this.getPoziom());
        System.out.println("EXP: "+this.exp+"/"+(this.getPoziom()+(this.getPoziom()*100)+(int)Math.pow(this.getPoziom(),2)));
        System.out.println("Health: "+this.getAktualne_hp()+"/"+this.getMax_hp());
        System.out.println("Pancerz: "+this.getPancerz()+"\nRedukcja obrażeń fizycznych: "+this.getRedukcjaFizycznych()+"%");
        System.out.println("Ochrona magiczna: "+this.getPkt_ochrona_przed_magia()+"\nRedukcja obrażeń magicznych: "+this.getRedukcjaMagicznych()+"%");
        System.out.println("Sila: "+this.getSila());
        System.out.println("Zwinnośc: "+this.getZwinnosc());
        System.out.println("Szybkość: "+this.getSzybkosc());
        System.out.println("Ewpipunek: "+this.ekwipunek.zawartosc(this));
    }

    public <T extends Items> void dodaj_do_ekwipunku(T rzecz){
        this.ekwipunek.dodaj(rzecz);
    }
    public <T extends Items> void remove_from_eq(T rzecz){ this.ekwipunek.remove(rzecz);}

    public <T extends Items> void aktywuj_ekwipunek(T rzecz){
        if(this.getPoziom()>=rzecz.getPoziom()){
            this.ekwipunek.aktywuj(rzecz, this);
        }
        else
            System.out.println("Poziom wyposażenia za wysoki!");
    }

    public <T extends Items> void dezaktywuj_ekwipunek(T rzecz){
        if(rzecz.isCzy_aktywny()){
            this.ekwipunek.dezaktywuj(rzecz, this);
        }
    }

    public void healuj(int wartosc){
        this.setAktualne_hp(this.getAktualne_hp()+wartosc);
        if(this.getAktualne_hp()>this.getMax_hp())
            this.setAktualne_hp(this.getMax_hp());
    }

    public Ekwipunek getEkwipunek() {
        return ekwipunek;
    }

    private Team<Ally> druzyna;
    private Ekwipunek ekwipunek;
    private int exp;
}

package pl.edu.uwm.po.RPG;

import java.util.ArrayList;

public class Team <T extends Istota> {
    public Team(String name) {
        this.name = name;
        this.sklad=new ArrayList<>();
    }

    public void add(T istota){
        this.sklad.add(istota);
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getSklad() {
        return sklad;
    }

    public ArrayList<String> wypiszSklad(){
        ArrayList<String> w_sklad= new ArrayList<>();
        for(T x: this.sklad){
            w_sklad.add(x.getName());
        }
        return w_sklad;
    }

    private String name;
    private ArrayList<T> sklad;
}

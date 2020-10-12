package pl.edu.uwm.po.lab_01;

public class Zad2 {
    public static void generuj(int [] tab,int n,int minWartosc,int maxWartosc) {
        for(int h= 0; h < n; h++) {
            tab[h] = (int)(Math.random()*( maxWartosc - (minWartosc) + 1))+minWartosc; //wygodniej mi przez biblioteke Math niż instację klasy Random :)
        }
    }
    public static int ileNieparzystych (int [] tab){
        int nieparzyste=0;
        for(int i: tab){
            if(i%2!=0) nieparzyste++;
        }
        return nieparzyste;
    }
    public static int ileParzystych (int [] tab){
        int parzyste=0;
        for(int i: tab){
            if(i%2==0) parzyste++;
        }
        return parzyste;
    }
    public static int ileDodatnich (int [] tab){
        int ile=0;
        for(int i: tab){
            if(i>0) ile++;
        }
        return ile;
    }
    public static int ileUjemnych (int [] tab){
        int ile=0;
        for(int i: tab){
            if(i<0) ile++;
        }
        return ile;
    }
    public static int ileZerowych (int [] tab){
        int ile=0;
        for(int i: tab){
            if(i==0) ile++;
        }
        return ile;
    }
    public static int ileMaksymalnych (int [] tab){
        int ile=0;
        int najwieksza=-1000;
        for(int j: tab){
            if(j>najwieksza) najwieksza=j;
        }
        for(int i: tab){
            if(i==najwieksza) ile++;
        }
        return ile;
    }
    public static int sumaDodatnich (int [] tab){
        int suma=0;
        for(int i: tab){
            if(i>0) suma+=i;
        }
        return suma;
    }
    public static int sumaUjemnych (int [] tab){
        int suma=0;
        for(int i: tab){
            if(i<0) suma+=i;
        }
        return suma;
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich (int [] tab){
        boolean czy_dodatnia=false;
        int ile=0;
        int temp=0;
        for(int i: tab){
            if(i>0){
                if(!czy_dodatnia){
                    temp=1;
                    czy_dodatnia=true;
                }
                else{
                    temp++;
                }
            }
            else czy_dodatnia=false;
            if(temp>ile) ile=temp;
        }
        return ile;
    }
    public static void signum(int [] tab){
        for(int j=0; j<tab.length;j++){
            if(tab[j]>0) tab[j]=1;
            else if(tab[j]<0) tab[j]=-1;
        }
        System.out.print("Zmieniona tablica: ");
        for(int i: tab){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void odwrocFragment(int [] tab,int lewy,int prawy){
        int temp;
        for(int o=0;o<Math.round((double)(prawy-lewy)/2);o++){
            temp=tab[lewy+o];
            tab[lewy+o]=tab[prawy-o];
            tab[prawy-o]=temp;
        }
        System.out.print("Zmieniona tablica: ");
        for(int i: tab){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

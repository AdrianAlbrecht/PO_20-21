package pl.edu.uwm.po.lab_01;
import java.util.Scanner;

public class Lab03_TEST {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int n;
        while(true){
            n=klawiatura.nextInt();
            if((n>=1)&&(n<=100)) break;
            else System.out.println("Liczba musi znajdować się w przedziale [1;100]!!!!!");
        }
        //Zad1
        int [] liczby= new int[n];

        //a)
        int parzyste=0;
        int nieparzyste=0;
        //b)
        int dodatnie=0;
        int zerowe=0;
        int ujemne=0;
        //c)
        int najwiekszy=-1000;
        int najwiekszy_ile_razy=0;
        //d)
        int suma_ujemne=0;
        int suma_dodatnie=0;
        //e)
        boolean czy_poprzednia_dodatnia=false;
        int dlugosc_serii_dodatnich=0;
        int temp_dodatnie=0;
        //g)
        int lewy;
        int prawy;
        while(true){
            lewy=klawiatura.nextInt();
            if((lewy>=1)&&(lewy<n)) break;
            else System.out.println("Liczba musi znajdować się w przedziale [1;"+n+")!!!!!");
        }
        while(true){
            prawy=klawiatura.nextInt();
            if((prawy>=1)&&(prawy<n)) break;
            else System.out.println("Liczba musi znajdować się w przedziale [1;"+n+")!!!!!");
        }
        for(int i=0;i< liczby.length;i++){
            liczby[i]=(int)(Math.random()*( 999 - (-999) + 1))-999;
            System.out.print(liczby[i]+" ");
        }
        for (int value : liczby) {
            if (value % 2 == 0) parzyste++;
            else nieparzyste++;
            if (value > 0) {
                dodatnie++;
                suma_dodatnie += value;
                if (!czy_poprzednia_dodatnia) {
                    temp_dodatnie = 1;
                    czy_poprzednia_dodatnia = true;
                } else {
                    temp_dodatnie++;
                }
            } else if (value == 0) {
                zerowe++;
                czy_poprzednia_dodatnia = false;
            } else {
                ujemne++;
                suma_ujemne += value;
                czy_poprzednia_dodatnia = false;
            }
            if (value > najwiekszy) najwiekszy = value;
            if (temp_dodatnie > dlugosc_serii_dodatnich) dlugosc_serii_dodatnich = temp_dodatnie;
        }
        for (int j : liczby) {
            if (j == najwiekszy) najwiekszy_ile_razy++;
        }
        //g
        int temp;
        for(int o=0;o<Math.round((double)(prawy-lewy)/2);o++){
            temp=liczby[lewy+o];
            liczby[lewy+o]=liczby[prawy-o];
            liczby[prawy-o]=temp;
        }
        System.out.println("\nElementy tablicy odwróconej na przedziale ["+lewy+";"+prawy+"]: ");
        for (int p: liczby){
            System.out.print(""+p+" ");
        }
        if(temp_dodatnie>dlugosc_serii_dodatnich) dlugosc_serii_dodatnich=temp_dodatnie;
        System.out.println("\nLiczby parzyste: "+parzyste+"\nLiczby nieparzyste: "+nieparzyste+
                "\nLiczby ujemne: "+ujemne+"\nLiczby zerowe: "+zerowe+"\nLiczby dodatnie: "+dodatnie+
                "\nNajwiększa liczba: "+najwiekszy+"\nIlosć występowań największej liczby: "+najwiekszy_ile_razy+
                "\nSuma liczb dodatnich: "+suma_dodatnie+"\nSuma liczb ujemnych: "+suma_ujemne+
                "\nIle najwięcej dodatnich po kolei: "+dlugosc_serii_dodatnich);
        //f)
        for( int m=0;m< liczby.length;m++){
            if(liczby[m]>0) liczby[m]=1;
            else if(liczby[m]<0) liczby[m]=-1;
            System.out.print(liczby[m]+" ");
        }


        System.out.println("\n\n");

        //Zadanie 2:
        while(true){
            n=klawiatura.nextInt();
            if((n>=1)&&(n<=100)) break;
            else System.out.println("Liczba musi znajdować się w przedziale [1;100]!!!!!");
        }
        while(true){
            lewy=klawiatura.nextInt();
            if((lewy>=1)&&(lewy<n)) break;
            else System.out.println("Liczba musi znajdować się w przedziale [1;"+n+")!!!!!");
        }
        while(true){
            prawy=klawiatura.nextInt();
            if((prawy>=1)&&(prawy<n)) break;
            else System.out.println("Liczba musi znajdować się w przedziale [1;"+n+")!!!!!");
        }
        int [] liczby2= new int[n];
        Zad2.generuj(liczby2,n,-999,999);
        for (int i : liczby2) {
            System.out.print(i + " ");
        }
        System.out.println("\nLiczby parzyste: "+Zad2.ileParzystych(liczby2)+"\nLiczby nieparzyste: "+Zad2.ileNieparzystych(liczby2)+
                "\nLiczby ujemne: "+Zad2.ileUjemnych(liczby2)+"\nLiczby zerowe: "+Zad2.ileZerowych(liczby2)+"\nLiczby dodatnie: "+Zad2.ileDodatnich(liczby2)+
                "\nIlosć występowań największej liczby: "+Zad2.ileMaksymalnych(liczby2)+
                "\nSuma liczb dodatnich: "+Zad2.sumaDodatnich(liczby2)+"\nSuma liczb ujemnych: "+Zad2.sumaUjemnych(liczby2)+
                "\nIle najwięcej dodatnich po kolei: "+Zad2.dlugoscMaksymalnegoCiaguDodatnich(liczby2));
        Zad2.odwrocFragment(liczby2,lewy,prawy);
        Zad2.signum(liczby2);


        //Zadanie 3:
        int m;
        int k;
        while(true){
            m=klawiatura.nextInt();
            if((m>=1)&&(m<=10)) break;
            else System.out.println("Liczba musi znajdować się w przedziale [1;10]!!!!!");
        }
        while(true){
            n=klawiatura.nextInt();
            if((n>=1)&&(n<=10)) break;
            else System.out.println("Liczba musi znajdować się w przedziale [1;10]!!!!!");
        }
        while(true){
            k=klawiatura.nextInt();
            if((k>=1)&&(k<=10)) break;
            else System.out.println("Liczba musi znajdować się w przedziale [1;10]!!!!!");
        }
        Zad3 z3= new Zad3(m,n,k);
        z3.wypisz();
    }
}

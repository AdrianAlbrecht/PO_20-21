package pl.edu.uwm.po.lab_01;
import java.util.Scanner;

public class Zad2 {
    Scanner klawiatura = new Scanner(System.in);
    public Zad2(int n){
        double [] tab= new double[n];
        for(int i=0;i<tab.length;i++){
            tab[i]=Double.parseDouble(klawiatura.nextLine());
        }
        for(int i=1;i<tab.length;i++){
            System.out.print(tab[i]);
            System.out.print(", ");
        }
        System.out.println(tab[0]);
    }
}

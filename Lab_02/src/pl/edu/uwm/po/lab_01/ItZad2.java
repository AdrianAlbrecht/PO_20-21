package pl.edu.uwm.po.lab_01;
import java.util.Scanner;

public class ItZad2 {
    Scanner klawiatura = new Scanner(System.in);
    public ItZad2(int n){
        double temp;
        int suma=0;
        for(int i=0;i<n;i++){
            temp=Double.parseDouble(klawiatura.nextLine());
            if(temp>0.0){ //Przyjmując, że 0 jest niedodatnie i nieujemne
                suma+=temp;
            }
        }
        System.out.println(suma*2);
    }
}

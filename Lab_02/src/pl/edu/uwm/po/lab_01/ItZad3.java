package pl.edu.uwm.po.lab_01;
import java.util.Scanner;

public class ItZad3 {
    Scanner klawiatura = new Scanner(System.in);
    public ItZad3(int n){
        double temp;
        int dodatnie=0;
        int ujemne=0;
        int zera=0;
        for(int i=0;i<n;i++){
            temp=Double.parseDouble(klawiatura.nextLine());
            if(temp>0.0){
                dodatnie++;
            }
            else if(temp==0.0){
                zera++;
            }
            else {
                ujemne++;
            }
        }
        System.out.println("Dodatnie: "+dodatnie+"\nUjemne: "+ujemne+"\nZera: "+zera);
    }
}

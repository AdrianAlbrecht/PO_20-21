package pl.edu.uwm.po.lab_01;
import java.util.Scanner;

public class ItZad4 {
    Scanner klawiatura = new Scanner(System.in);
    public ItZad4(int n){
        double temp;
        double najwieksza=0;
        double najmniejsza=0;
        for(int i=0;i<n;i++){
            temp=Double.parseDouble(klawiatura.nextLine());
            if(i==0){
                najwieksza=temp;
                najmniejsza=temp;
            }
            else{
                if(temp<najmniejsza) najmniejsza=temp;
                if(temp>najwieksza) najwieksza=temp;
            }
        }
        System.out.println("Największa liczba: "+najwieksza+"\nNajmniejsza liczba: "+najmniejsza);
    }
}

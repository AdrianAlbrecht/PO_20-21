package pl.edu.uwm.po.lab_01;
import java.util.Scanner;

public class ItZad5 {
    Scanner klawiatura = new Scanner(System.in);
    public ItZad5(int n){
        double [] temp=new double[n];
        int wynik=0;
        for(int i=0;i<n;i++){
            temp[i]=Double.parseDouble(klawiatura.nextLine());
            if(i>0){
                if((temp[i-1]>0)&&(temp[i]>0)){
                    wynik++;
                }
            }
        }
        System.out.println("Ilość par: "+wynik);
    }
}

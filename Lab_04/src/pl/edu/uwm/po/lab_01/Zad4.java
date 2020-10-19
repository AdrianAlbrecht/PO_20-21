package pl.edu.uwm.po.lab_01;
import java.math.BigInteger;

public class Zad4 {
    public Zad4(int n){
        BigInteger wynik= new BigInteger("0");
        BigInteger mnoznik= new BigInteger("1");
        BigInteger wzrost= new BigInteger("2");
        BigInteger max= new BigInteger(String.valueOf(n));
        for(int i=0;i<n;i++){
            if(max.compareTo(mnoznik)==1){
                wynik=wynik.add(mnoznik);
                mnoznik=mnoznik.multiply(wzrost);
            }
            else{
                wynik=wynik.add(max);
            }
        }
        System.out.println("Ułożymy " + wynik.toString() + " ziaren na planszy");
    }
}

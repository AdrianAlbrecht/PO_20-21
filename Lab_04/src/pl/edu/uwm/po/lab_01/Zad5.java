package pl.edu.uwm.po.lab_01;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Zad5 {
    public Zad5(int k, int p, int n){
        BigDecimal k_BI= new BigDecimal(String.valueOf(k));
        BigDecimal p_BI= new BigDecimal(String.valueOf(p));
        BigDecimal n_BI= new BigDecimal(String.valueOf(n));
        BigDecimal wynik= new BigDecimal(String.valueOf(k));
        wynik=wynik.add(k_BI.multiply(n_BI.multiply(p_BI.divide(new BigDecimal("100")))));
        wynik=wynik.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Kapitał końcowy liczby " + k_BI.toString() + " to: "+wynik.toString());
    }
}

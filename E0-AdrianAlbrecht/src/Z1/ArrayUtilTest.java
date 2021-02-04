package Z1;

import java.math.BigInteger;
import java.time.LocalDate;

public class ArrayUtilTest {
    public static void main(String[] args) {
        BigInteger[] tab1= new BigInteger[5];
        tab1[0]= new BigInteger("5");
        tab1[1]= new BigInteger("3");
        tab1[2]= new BigInteger("7");
        tab1[3]= new BigInteger("2");
        tab1[4]= new BigInteger("1");
        BigInteger[] tab2= new BigInteger[5];
        tab2[0]= new BigInteger("1");
        tab2[1]= new BigInteger("2");
        tab2[2]= new BigInteger("3");
        tab2[3]= new BigInteger("4");
        tab2[4]= new BigInteger("5");
        System.out.println(ArrayUtil.isSorted(tab1));
        System.out.println(ArrayUtil.isSorted(tab2));
        String[] tab3 = new String[5];
        tab3[0]="a";
        tab3[1]="b";
        tab3[2]="c";
        tab3[3]="d";
        tab3[4]="e";
        String[] tab4 = new String[5];
        tab4[0]="a";
        tab4[1]="b";
        tab4[2]="g";
        tab4[3]="d";
        tab4[4]="e";
        System.out.println(ArrayUtil.isSorted(tab3));
        System.out.println(ArrayUtil.isSorted(tab4));
        LocalDate[] tab5 =  new LocalDate[5];
        tab5[0]=LocalDate.of(2000,1,1);
        tab5[1]=LocalDate.of(2000,2,1);
        tab5[2]=LocalDate.of(2000,3,1);
        tab5[3]=LocalDate.of(2000,4,1);
        tab5[4]=LocalDate.of(2000,5,1);
        LocalDate[] tab6 =  new LocalDate[5];
        tab6[0]=LocalDate.of(2000,5,1);
        tab6[1]=LocalDate.of(2000,4,1);
        tab6[2]=LocalDate.of(2000,3,1);
        tab6[3]=LocalDate.of(2000,2,1);
        tab6[4]=LocalDate.of(2000,1,1);
        System.out.println(ArrayUtil.isSorted(tab5));
        System.out.println(ArrayUtil.isSorted(tab6));
    }
}

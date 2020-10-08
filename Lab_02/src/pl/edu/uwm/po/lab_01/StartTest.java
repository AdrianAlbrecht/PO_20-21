package pl.edu.uwm.po.lab_01;
import java.util.Scanner;

public class StartTest {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Start z1 = new Start();
        z1.z01a(Integer.parseInt(myObj.nextLine()));
        z1.wypisz(false);
        z1.s=0;
        z1.z01b(Integer.parseInt(myObj.nextLine()));
        z1.wypisz(false);
        z1.s=0;
        z1.z01c(Integer.parseInt(myObj.nextLine()));
        z1.wypisz(false);
        z1.s=0;
        z1.z01d(Integer.parseInt(myObj.nextLine()));
        z1.wypisz(false);
        z1.s=0;
        z1.z01e(Integer.parseInt(myObj.nextLine()));
        z1.wypisz(false);
        z1.s=0;
        z1.z01f(Integer.parseInt(myObj.nextLine()));
        z1.wypisz(false);
        z1.s=0;
        z1.z01g(Integer.parseInt(myObj.nextLine()));
        z1.wypisz(true);
        z1.s=0;
        z1.s2=1;
        z1.z01h(Integer.parseInt(myObj.nextLine()));
        z1.wypisz(false);
        z1.s=0;
        z1.z01i(Integer.parseInt(myObj.nextLine()));
        z1.wypisz(false);
        z1.s=0;
    }
}

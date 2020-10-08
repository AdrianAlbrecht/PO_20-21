package pl.edu.uwm.po.lab_01;
import java.util.Scanner;

public class StartTest {
    public static void main(String[] args) {
        Start z1 = new Start();
        z1.z01a(pobierz());
        z1.wypisz(false);
        z1.z01b(pobierz());
        z1.wypisz(false);
        z1.z01c(pobierz());
        z1.wypisz(false);
        z1.z01d(pobierz());
        z1.wypisz(false);
        z1.z01e(pobierz());
        z1.wypisz(false);
        z1.z01f(pobierz());
        z1.wypisz(false);
        z1.z01g(pobierz());
        z1.wypisz(true);
        z1.z01h(pobierz());
        z1.wypisz(false);
        z1.z01i(pobierz());
        z1.wypisz(false);
        Zad2 z2 = new Zad2(pobierz());
    }
    public static int pobierz(){
        Scanner klawiatura = new Scanner(System.in);
        return Integer.parseInt(klawiatura.nextLine());
    }
}

package pl.edu.uwm.po.lab_01;
import java.util.Scanner;

public class StartTest {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        Start z1 = new Start();
        z1.z01a(Integer.parseInt(klawiatura.nextLine()));
        z1.wypisz(false);
        z1.z01b(Integer.parseInt(klawiatura.nextLine()));
        z1.wypisz(false);
        z1.z01c(Integer.parseInt(klawiatura.nextLine()));
        z1.wypisz(false);
        z1.z01d(Integer.parseInt(klawiatura.nextLine()));
        z1.wypisz(false);
        z1.z01e(Integer.parseInt(klawiatura.nextLine()));
        z1.wypisz(false);
        z1.z01f(Integer.parseInt(klawiatura.nextLine()));
        z1.wypisz(false);
        z1.z01g(Integer.parseInt(klawiatura.nextLine()));
        z1.wypisz(true);
        z1.z01h(Integer.parseInt(klawiatura.nextLine()));
        z1.wypisz(false);
        z1.z01i(Integer.parseInt(klawiatura.nextLine()));
        z1.wypisz(false);
        Zad2 z2 = new Zad2(Integer.parseInt(klawiatura.nextLine()));
    }
}

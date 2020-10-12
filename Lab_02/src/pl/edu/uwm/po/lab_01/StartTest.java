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
        ItZad1 it_z1= new ItZad1();
        it_z1.a(pobierz());
        it_z1.wypisz_wynik();
        it_z1.b(pobierz());
        it_z1.wypisz_wynik();
        it_z1.c(pobierz());
        it_z1.wypisz_wynik();
        it_z1.d(pobierz());
        it_z1.wypisz_wynik();
        it_z1.e(pobierz());
        it_z1.wypisz_wynik();
        it_z1.f(pobierz());
        it_z1.wypisz_wynik();
        it_z1.g(pobierz());
        it_z1.wypisz_wynik();
        it_z1.h(pobierz());
        it_z1.wypisz_wynik();

        ItZad2 it_z2= new ItZad2(pobierz());

        ItZad3 it_z3= new ItZad3(pobierz());

        ItZad4 it_z4= new ItZad4(pobierz());

        ItZad5 it_z5= new ItZad5(pobierz());
    }
    public static int pobierz(){
        Scanner klawiatura = new Scanner(System.in);
        return Integer.parseInt(klawiatura.nextLine());
    }
}

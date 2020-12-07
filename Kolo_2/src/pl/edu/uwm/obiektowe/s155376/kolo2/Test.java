package pl.edu.uwm.obiektowe.s155376.kolo2;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Osobowy AudiA6 = new Osobowy("A6",Producent.AUDI);
        AudiA6.uzyjKlaksonu();
        AudiA6.cofaj();
        AudiA6.jedzDoPrzodu();
        System.out.println(AudiA6);

        Stack<Liczba<? extends Number>> stos= new Stack<>();
        stos.push(new Liczba<>(1));
        stos.push(new Liczba<>((float)2.2));
        stos.push(new Liczba<>(2.3));
        stos.push(new Liczba<>((long)3));
        stos.push(new Liczba<>((short)3));
        stos.push(new Liczba<>((float)1));

        Zbior zbior = new Zbior();
        while (!stos.empty()){
            zbior.dodajLiczbe(stos.pop());
        }
        for(Liczba<? extends Number> licz: zbior.getLiczby()){
            System.out.println(licz.getValue());
        }
    }
}

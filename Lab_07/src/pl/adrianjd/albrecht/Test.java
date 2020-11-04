package pl.adrianjd.albrecht;

public class Test {
    public static void main(String[] args) {
        Adres ad1= new Adres("Narciarska","15","82-300","Elbląg");
        Adres ad2= new Adres("Narciarska","15", "3","82-301","Elbląg");
        Adres ad3= new Adres("Narciarska","15", "3","82-299","Elbląg");
        ad1.pokaz();
        ad2.pokaz();
        System.out.println(ad1.przed(ad2));
        System.out.println(ad1.przed(ad3));

        Osoba Andzej= new Osoba("Paździoch",1999);
        Student Marian = new Student("Olgierski",1990,"kosmetologia");
        Nauczyciel Adam = new Nauczyciel("Kur",1973,2300);
        System.out.println(Andzej);
        System.out.println(Marian);
        System.out.println(Adam);
        System.out.println(Marian.getKierunek());
        System.out.println(Marian.getNazwisko());
        System.out.println(Marian.getRokUrodzenia());
        System.out.println(Adam.getPensja());

        BetterRectangle prostokat= new BetterRectangle(1,1,4,3);
        System.out.println(prostokat.getArea());
        System.out.println(prostokat.getPerimeter());
    }
}

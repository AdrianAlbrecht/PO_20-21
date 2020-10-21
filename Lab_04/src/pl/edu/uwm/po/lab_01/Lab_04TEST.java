package pl.edu.uwm.po.lab_01;

public class Lab_04TEST {
    public static void main(String[] args) {
        //Zad1

        String napis="Elepaaahaanataa";
        char znak='a';
        String podnapis="aa";
        String mikolaj="Ho! ";
        System.out.println(napis+" "+znak+" number is: "+Lab_04.countChar(napis, znak));
        System.out.println("Number of "+podnapis+" in "+napis+" is: "+Lab_04.countSubStr(napis,podnapis));
        System.out.println("Middle char(s) of 'middle' is: "+Lab_04.middle("middle"));
        System.out.println("Middle char(s) of 'man' is: "+Lab_04.middle("man"));
        System.out.println("3x '"+mikolaj+"' is: "+Lab_04.repeat(mikolaj,3));
        System.out.print("Index of "+podnapis+" in "+napis+" is: ");
        for(int x: Lab_04.where(napis,podnapis)){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("The change of 'AaBbccCcDXd' is: "+Lab_04.change("AaBbccCcDXd"));
        System.out.println("Number '12123123123' with ' is: "+Lab_04.nice("12123123123"));
        System.out.println("Number '123123123123' with ' is: "+Lab_04.nice("123123123123"));
        System.out.println("Number '12123123123' with 4 sep ' is: "+Lab_04.nice("12123123123",'*',4));
        System.out.println("Number '123123123123' with 4 sep ' is: "+Lab_04.nice("123123123123",'*',4));

        //Zad2
        System.out.println("\nZadanie2:");
        Zad2 z2= new Zad2("Zad_2.txt",'f');

        //Zad3
        System.out.println("\nZadanie3:");
        Zad3 z3= new Zad3("Zad_2.txt","ds");

        //Zad4
        System.out.println("\nZadanie4:");
        Zad4 z4= new Zad4(20);

        //Zad5
        System.out.println("\nZadanie5:");
        Zad5 z5= new Zad5(5000,5,2);
    }
}

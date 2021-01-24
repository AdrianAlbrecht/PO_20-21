package pl.edu.uwm.po.ajp_z01;


import javax.imageio.stream.FileCacheImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AjpTest {
    public static void main(String[] args) throws IOException {
        Measurable[] tab = new Measurable[4];
        tab[0]= new Employee("Nowak","Jan",4000);
        tab[1]= new Employee("Barszczyk","Agata",2810);
        tab[2]= new Employee("Lojek","Felicjan",5000);
        tab[3]= new Employee("Wassermann","Tomasz",3210);
        //Z1:
        System.out.println(Employee.average(tab));
        //Z2:
        System.out.println(((Employee)Employee.largest(tab)).getNazwisko());
        //Z3:
        System.out.println("String".getClass().getSuperclass());
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.getClass().getSuperclass());
        ImageOutputStream imi = new FileCacheImageOutputStream(new ByteArrayOutputStream(), null);
        System.out.println(imi.getClass().getSuperclass());
        //Z4:
        /*int[] tak= IntSequence.of(1,2,3,4);
        System.out.println();*/
        //Z5:
        System.out.println(Stream.iterate(1,x->x).limit(10).collect(Collectors.toList())); //Tylko teraz to w klasie, ale czy ta klasa nie musi implementowac IntSequence jako interfejsu funkcyjnego?
        //Z6:
        //
        //Z7:
        ArrayList<String> stringi = new ArrayList<>();
        stringi.add("barka");
        stringi.add("moc");
        stringi.add("Andrzej");
        stringi.add("procentage");
        stringi.add("Hermenegilda");
        luckySort(stringi,Comparator.comparing(String::length).reversed());
        //Z8:
        Runnable[] tabik = new Runnable[2];
        tabik[0]= new Greeter("Andrzej",5);
        tabik[1]=  new Greeter("Mariola",8);
        Arrays.stream(tabik).parallel().forEach(Runnable::run);
        System.out.println();
        //Z9:
        runTogether(tabik[0],tabik[1]);
        System.out.println();
        runInOrder(tabik[0],tabik[1]);
        System.out.println();
    }

   /* public static IntSequence of(int... integers){
        return new IntSequence(){
            private int[] in;

            @Override
            int[] of(int... integers) {
                this.in= Arrays.stream(integers).toArray();
            }
        };
    }*/

    static void luckySort(ArrayList<String> strings, Comparator<String> comp){
        ArrayList<String> posortowane = new ArrayList<>(strings);
        posortowane.sort(comp);
        while (!posortowane.equals(strings)){
            Collections.shuffle(strings);
            //System.out.println(strings);
        }
    }
    public static void runTogether(Runnable... tasks){
        Arrays.stream(tasks).parallel().forEach(Runnable::run);
    }
    public static void runInOrder(Runnable... tasks){
        Arrays.stream(tasks).forEach(Runnable::run);
    }
}

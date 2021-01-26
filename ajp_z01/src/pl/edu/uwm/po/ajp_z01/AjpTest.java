package pl.edu.uwm.po.ajp_z01;


import javax.imageio.stream.FileCacheImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
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
        IntSequence tak= IntSequence.of(1,2,3,4);
        while(tak.hasNext()){
            System.out.println(tak.next());
        }
        //Z5:
        Stream<Integer> ciag = IntSequence.constant(1);
        for(int i: ciag.limit(10).collect(Collectors.toList())){ //limit 10 bo jest nieskonczony
            System.out.println(i);
        }
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
        //Z10:
        List<String> nazwy = podkatalogi("C:\\Users\\adria\\Desktop\\Bzdety");
        nazwy.forEach(System.out::println);
        //Z11:
        String[] nazwy_plikow = pliki_z_rozszerzeniem("C:\\Users\\adria\\Desktop\\Bzdety","mp3");
        for( String n: nazwy_plikow){
            System.out.println(n);
        }
    }

    public static void luckySort(ArrayList<String> strings, Comparator<String> comp){
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

    public static List<String> podkatalogi(String path){
        File kat_glowny= new File(path);
        //File[] katalogi = kat_glowny.listFiles(File::isDirectory); // zamiast File::isDirectory może być x->x.isDirectory() jako wyrażenie lamda, ale jak z klasą anonimową????
        File[] katalogi = kat_glowny.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
        assert katalogi != null;
        return Arrays.stream(katalogi).map(File::getName).collect(Collectors.toList());
    }

    public static String[] pliki_z_rozszerzeniem(String path,String koncowka){
        File kat_glowny= new File(path);
        return  kat_glowny.list((x,y)->y.endsWith(koncowka));
    }
}

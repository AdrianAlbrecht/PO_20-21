package pl.edu.uwm.po.lab_01;
import java.util.ArrayList;

public class Lab_05 {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> rozszerzonaLista= new ArrayList<Integer>();
        rozszerzonaLista.addAll(a);
        rozszerzonaLista.addAll(b);
        return rozszerzonaLista;
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        int dlugosc_a= a.toArray().length;
        int dlugosc_b= b.toArray().length;
        ArrayList<Integer> nowy= new ArrayList<Integer>();
        int i=0;
        int j=0;
        j = Math.min(dlugosc_a, dlugosc_b);
        for(int k=0;k<j;k++){
            nowy.add(a.get(i));
            nowy.add(b.get(i));
            i++;
        }
        if(dlugosc_a<dlugosc_b){
            for(int k=0;k<Math.abs(dlugosc_a-dlugosc_b);k++){
                nowy.add(b.get(i+k));
            }
        }
        else{
            for(int k=0;k<Math.abs(dlugosc_a-dlugosc_b);k++){
                nowy.add(a.get(i+k));
            }
        }
        return nowy;
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        int dlugosc_a= a.toArray().length;
        int dlugosc_b= b.toArray().length;
        ArrayList<Integer> nowy= new ArrayList<Integer>();
        int ind_a=0;
        int ind_b=0;
        for(int i=0;i<dlugosc_a+dlugosc_b;i++){
            if(ind_a<dlugosc_a&&ind_b<dlugosc_b){
                if(a.get(ind_a)<b.get(ind_b)){
                    nowy.add(a.get(ind_a));
                    ind_a++;
                }
                else{
                    nowy.add(b.get(ind_b));
                    ind_b++;
                }
            }
            else if(ind_a<dlugosc_a){
                nowy.add(a.get(ind_a));
                ind_a++;
            }
            else{
                nowy.add(b.get(ind_b));
                ind_b++;
            }
        }
        return nowy;
    }
    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> nowy= new ArrayList<Integer>();
        int dlugosc_a= a.toArray().length;
        for(int i=dlugosc_a-1;i>=0;i--) {
            nowy.add(a.get(i));
        }
        return nowy;
    }
    public static void reverse(ArrayList<Integer> a){
        ArrayList<Integer> temp= new ArrayList<Integer>(a);
        int dlugosc= temp.toArray().length;
        int j=0;
        for(int i=dlugosc-1;i>=0;i--) {
            a.set(j,temp.get(i));
            j++;
        }
    }
}
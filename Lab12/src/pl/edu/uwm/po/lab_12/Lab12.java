package pl.edu.uwm.po.lab_12;

import java.util.*;

public class Lab12 {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        for(int i=n-1; i<pracownicy.size();i+=n-1){
            pracownicy.remove(i);
        }
    }
    public static <T> void odwroc(LinkedList<T> lista){
        LinkedList<T> temp= new LinkedList<>(lista);
        for(int i=lista.size()-1,j=0;i>=0;i--,j++){
            lista.set(j,temp.get(i));
        }
    }
    public static String mistrz_yoda(String zdanie){
        String[] slowa= zdanie.split(" ");
        Stack<String> master_yoda= new Stack<>();
        StringBuilder odwrocone= new StringBuilder();
        for(String slowo: slowa){
            master_yoda.push(slowo);
            if(slowo.endsWith(".")){
                while(!master_yoda.empty()){
                    StringBuilder slowo_odwrocone = new StringBuilder();
                    slowo_odwrocone.append(master_yoda.pop());
                    if(master_yoda.empty()){
                        slowo_odwrocone.setCharAt(0,Character.toLowerCase(slowo_odwrocone.charAt(0)));
                        odwrocone.append(slowo_odwrocone);
                        odwrocone.append(". ");
                    }
                    else if(slowo_odwrocone.toString().equals(slowo)){
                        slowo_odwrocone.setCharAt(0,Character.toUpperCase(slowo_odwrocone.charAt(0)));
                        odwrocone.append(slowo_odwrocone, 0, slowo_odwrocone.length()-1);
                        odwrocone.append(" ");
                    }
                    else{
                        odwrocone.append(slowo_odwrocone);
                        odwrocone.append(" ");
                    }
                }
            }
        }
        return odwrocone.toString();
    }
    public static void cyfry(int liczba){
        Stack<Integer> cyferki = new Stack<>();
        while(liczba!=0){
            cyferki.push(liczba%10);
            liczba/=10;
        }
        while (!cyferki.empty()){
            System.out.print(cyferki.pop()+" ");
        }
        System.out.println();
    }
    public static void Erastotenes(int n){
        BitSet b = new BitSet(n + 1);
        for (int j = 2; j <= n; ++j) {
            b.set(j);
        }
        int j = 2;
        while (j * j <= n) {
            if (b.get(j)) {
                int k = 2 * j;
                while (k <= n) {
                    b.clear(k);
                    k += j;
                }
            }
            ++j;
        }
        int[] primes= b.stream().toArray();
        for(int x: primes){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static <T extends Iterable<?>> void print(T object ){
        Iterator<?> it= object.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
            if (it.hasNext()){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

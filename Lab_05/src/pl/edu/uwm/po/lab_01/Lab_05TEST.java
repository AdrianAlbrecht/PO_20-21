package pl.edu.uwm.po.lab_01;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab_05TEST {
    public static void main(String[] args) {
        ArrayList<Integer> listaA= new ArrayList<>(Arrays.asList(1, 2, 2, 3, 9));
        ArrayList<Integer> listaB= new ArrayList<>(Arrays.asList(2, 4, 6, 6, 7));
        System.out.println(listaA);
        System.out.println(listaB);
        System.out.println(Lab_05.append(listaA,listaB));
        System.out.println(Lab_05.merge(listaA,listaB));
        System.out.println(Lab_05.mergeSorted(listaA,listaB));
        System.out.println(Lab_05.reversed(listaA));
        Lab_05.reverse(listaB);
        System.out.println(listaB);
    }
}
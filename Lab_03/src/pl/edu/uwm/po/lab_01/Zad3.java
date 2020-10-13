package pl.edu.uwm.po.lab_01;
import java.util.Random;

public class Zad3 {
    int m;
    int n;
    int k;
    int [][] macierz_1;
    int [][] macierz_2;
    int [][] macierz_3;
    public Zad3(int m, int n, int k){
        this.n=n;
        this.m=m;
        this.k=k;
        this.macierz_1= new int[n][m];
        this.macierz_2= new int[k][n];
        this.macierz_3= new int[k][m];
        Random losowa= new Random();
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++) this.macierz_1[i][j] = (int)(Math.random()*( 10 - (1) + 1))+1;
        }
        for(int i=0;i<k;i++){
            for (int j=0;j<n;j++) this.macierz_2[i][j] = (int)(Math.random()*( 10 - (1) + 1))+1;
        }
        int temp;
        for(int i=0;i<m;i++){
            for (int j=0;j<k;j++){
                temp=0;
                for (int l=0;l<n;l++){
                    temp += (this.macierz_1[l][i]*this.macierz_2[j][l]);
                }
                this.macierz_3[j][i] = temp;
            }
        }
    }
    public void wypisz(){
        for(int i=0;i<this.m;i++){
            for (int j=0;j<this.n;j++) System.out.print(this.macierz_1[j][i]+" ");
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<this.n;i++){
            for (int j=0;j<this.k;j++) System.out.print(this.macierz_2[j][i]+" ");
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<this.m;i++){
            for (int j=0;j<this.k;j++) System.out.print(this.macierz_3[j][i]+" ");
            System.out.println();
        }
        System.out.println();
    }
}

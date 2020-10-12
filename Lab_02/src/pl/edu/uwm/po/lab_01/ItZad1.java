package pl.edu.uwm.po.lab_01;
import java.util.Scanner;

public class ItZad1 {
    Scanner klawiatura = new Scanner(System.in);
    int wynik;
    int temp;

    public void wypisz_wynik(){
        System.out.println(this.wynik);
    }

    public void a(int n){
        this.wynik=0;
        for(int i=0;i<n;i++){
            this.temp=Integer.parseInt(klawiatura.nextLine());
            if(this.temp%2==1){
                this.wynik++;
            }
        }
    }
    public void b(int n){
        this.wynik=0;
        for(int i=0;i<n;i++){
            this.temp=Integer.parseInt(klawiatura.nextLine());
            if((this.temp%3==0)&&(this.temp%5!=0)){
                this.wynik++;
            }
        }
    }
    public void c(int n){
        this.wynik=0;
        for(int i=0;i<n;i++){
            this.temp=Integer.parseInt(klawiatura.nextLine());
            if(Math.sqrt(this.temp)%2==0){
                this.wynik++;
            }
        }
    }
    public void d(int n){
        this.wynik=0;
        int [] liczby= new int[n];
        for(int i=0;i<n;i++){
            liczby[i]=Integer.parseInt(klawiatura.nextLine());
        }
        for(int i=1;i<n-1;i++){
            if(liczby[i]<(liczby[i-1]+liczby[i+1])/2){
                this.wynik++;
            }
        }
    }
    public void e(int n){
        this.wynik=0;
        int temp_silnia=1;
        for(int i=1;i<=n;i++){
            this.temp=Integer.parseInt(klawiatura.nextLine());
            temp_silnia*=i;
            if((this.temp>Math.pow(2,i))&&(this.temp<temp_silnia)){
                this.wynik++;
            }
        }
    }
    public void f(int n){
        this.wynik=0;
        for(int i=1;i<=n;i++){
            this.temp=Integer.parseInt(klawiatura.nextLine());
            if((i%2==1)&&(this.temp%2==0)){
                this.wynik++;
            }
        }
    }
    public void g(int n){
        this.wynik=0;
        for(int i=1;i<=n;i++){
            this.temp=Integer.parseInt(klawiatura.nextLine());
            if((i%2==1)&&(this.temp>0)){
                this.wynik++;
            }
        }
    }
    public void h(int n){
        this.wynik=0;
        for(int i=1;i<=n;i++){
            this.temp=Integer.parseInt(klawiatura.nextLine());
            if(Math.abs(this.temp)<Math.pow(i,2)){
                this.wynik++;
            }
        }
    }
}

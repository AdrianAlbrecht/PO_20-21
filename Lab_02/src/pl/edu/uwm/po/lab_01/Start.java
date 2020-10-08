package pl.edu.uwm.po.lab_01;
import java.util.Scanner;

public class Start {
    double wynik=0;
    double wynik2=1;
    Scanner klawiatura = new Scanner(System.in);
    public void wypisz(boolean a){
        System.out.println(this.wynik);
        if(a){
            System.out.println(this.wynik2);
        }
    }
    public void z01a(int n){
        this.wynik=0;
        for (int i=0; i<n;i++){
            this.wynik+=Double.parseDouble(klawiatura.nextLine());
        }
    }
    public void z01b(int n){
        this.wynik=1;
        for (int i=0; i<n;i++){
            this.wynik*=Double.parseDouble(klawiatura.nextLine());
        }
    }
    public void z01c(int n){
        this.wynik=0;
        for (int i=0; i<n;i++){
            this.wynik+=Math.abs(Double.parseDouble(klawiatura.nextLine()));
        }
    }
    public void z01d(int n){
        this.wynik=0;
        for (int i=0; i<n;i++){
            this.wynik+=Math.sqrt(Math.abs(Double.parseDouble(klawiatura.nextLine())));
        }
    }
    public void z01e(int n){
        this.wynik=1;
        for (int i=0; i<n;i++){
            this.wynik*=Math.abs(Double.parseDouble(klawiatura.nextLine()));
        }
    }
    public void z01f(int n){
        this.wynik=0;
        for (int i=0; i<n;i++){
            double a=Double.parseDouble(klawiatura.nextLine());
            this.wynik+=Math.pow(a,2);
        }
    }
    public void z01g(int n){
        this.wynik=0;
        this.wynik2=1;
        for (int i=0; i<n;i++){
            double a=Double.parseDouble(klawiatura.nextLine());
            this.wynik+=a;
            this.wynik2*=a;
        }
    }
    public void z01h(int n){
        this.wynik=0;
        for (int i=1; i<=n;i++){
            double a=Double.parseDouble(klawiatura.nextLine());
            this.wynik+=Math.pow(-1,i+1)*a;
        }
    }
    public void z01i(int n){
        this.wynik=0;
        int wyk=1;
        for (int i=0; i<n;i++){
            double a=Double.parseDouble(klawiatura.nextLine());
            wyk*=(i+1);
            this.wynik+=(Math.pow(-1,i)*a)/wyk;
        }
    }
}

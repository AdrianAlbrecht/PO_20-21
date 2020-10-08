package pl.edu.uwm.po.lab_01;
import java.util.Scanner;

public class Start {
    double s=0;
    double s2=1;
    Scanner myObj = new Scanner(System.in);
    public void wypisz(boolean a){
        System.out.println(this.s);
        if(a){
            System.out.println(this.s2);
        }
    }
    public void z01a(int n){
        for (int i=0; i<n;i++){
            this.s+=Double.parseDouble(myObj.nextLine());
        }
    }
    public void z01b(int n){
        this.s=1;
        for (int i=0; i<n;i++){
            this.s*=Double.parseDouble(myObj.nextLine());
        }
    }
    public void z01c(int n){
        for (int i=0; i<n;i++){
            this.s+=Math.abs(Double.parseDouble(myObj.nextLine()));
        }
    }
    public void z01d(int n){
        for (int i=0; i<n;i++){
            this.s+=Math.sqrt(Math.abs(Double.parseDouble(myObj.nextLine())));
        }
    }
    public void z01e(int n){
        this.s=1;
        for (int i=0; i<n;i++){
            this.s*=Math.abs(Double.parseDouble(myObj.nextLine()));
        }
    }
    public void z01f(int n){
        for (int i=0; i<n;i++){
            double a=Double.parseDouble(myObj.nextLine());
            this.s+=Math.pow(a,2);
        }
    }
    public void z01g(int n){
        for (int i=0; i<n;i++){
            double a=Double.parseDouble(myObj.nextLine());
            this.s+=a;
            this.s2*=a;
        }
    }
    public void z01h(int n){
        for (int i=1; i<=n;i++){
            double a=Double.parseDouble(myObj.nextLine());
            this.s+=Math.pow(-1,i+1)*a;
        }
    }
    public void z01i(int n){
        int wyk=1;
        for (int i=0; i<n;i++){
            double a=Double.parseDouble(myObj.nextLine());
            wyk*=(i+1);
            this.s+=(Math.pow(-1,i)*a)/wyk;
        }
    }
}

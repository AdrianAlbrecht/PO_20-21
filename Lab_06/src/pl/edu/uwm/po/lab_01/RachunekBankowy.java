package pl.edu.uwm.po.lab_01;

public class RachunekBankowy {
    private static double rocznaStopaProcentowa;
    private double saldo;
    public RachunekBankowy(double n_saldo){
        this.saldo=n_saldo;
    }
    public void obliczMiesieczneOdsetki(){
        this.saldo=this.saldo+(this.saldo* rocznaStopaProcentowa) / 12;
    }
    public static void setRocznaStopaProcentowa(double n_stopa){
        rocznaStopaProcentowa=n_stopa;
    }

    public double getSaldo() {
        return this.saldo;
    }
}

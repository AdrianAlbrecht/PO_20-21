package pl.adrianjd.albrecht;

import java.time.LocalDate;

public class Fortepian extends Instrument{
    public Fortepian(String prod, LocalDate rP){
        super(prod, rP);
    }
    public String dzwiek(){
        return "pam pam pam";
    }
}

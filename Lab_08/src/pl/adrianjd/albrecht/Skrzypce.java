package pl.adrianjd.albrecht;

import java.time.LocalDate;

public class Skrzypce extends Instrument{
    public Skrzypce(String prod, LocalDate rP){
        super(prod, rP);
    }
    public String dzwiek(){
        return "skrzypu skrzyp";
    }
}

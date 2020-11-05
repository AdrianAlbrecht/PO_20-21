package pl.adrianjd.albrecht;

import java.time.LocalDate;

public abstract class Instrument {
    public Instrument(String prod, LocalDate rP){
        this.producent=prod;
        this.rokProdukcji=rP;
    }

    public abstract String dzwiek();

    public String getProducent() {
        return this.producent;
    }

    public LocalDate getRokProdukcji() {
        return this.rokProdukcji;
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+", producent: "+this.producent+", data produkcji: "+this.rokProdukcji;
    }

    private String producent;
    private LocalDate rokProdukcji;
}

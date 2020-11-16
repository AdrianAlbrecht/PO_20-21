package pl.adrianjd.albrecht;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{
    public Student(String naz, LocalDate dU, double sO) {
        super(naz, dU);
        this.sredniaOcen=sO;
    }

    private double sredniaOcen;

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"["+this.getNazwisko()+", "+this.getDataUrodzenia().toString()+", "+this.sredniaOcen+"]";
    }

    @Override
    public int compareTo(Osoba o) {
        int last=super.compareTo((o));
        if((o instanceof Student)&&(last==0)){
            return -(int)Math.ceil(this.sredniaOcen-((Student) o).sredniaOcen);
        }
        return last;
    }
}

package pl.edu.uwm.po.lab_13;

public class Student implements Comparable<Student>{
    public Student(String imie, String nazwisko, int id) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getId() {
        return id;
    }

    private String imie;
    private String nazwisko;
    private int id;

    @Override
    public int compareTo(Student o) {
        if(this.nazwisko.compareTo(o.getNazwisko())<=0){
            if(this.imie.compareTo(o.getImie())<=0){
                if(this.id<o.getId()){
                    return -1;
                }
                else if(this.id==o.getId()){
                    return 0;
                }
                return 1;
            }
            return this.imie.compareTo(o.getImie());
        }
        return this.nazwisko.compareTo(o.getNazwisko());
    }
}

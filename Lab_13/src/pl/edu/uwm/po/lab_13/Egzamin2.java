package pl.edu.uwm.po.lab_13;

import java.util.TreeMap;

public class Egzamin2 {
    public Egzamin2(){
        this.oceny=new TreeMap<>();
        this.identyfikatory=new TreeMap<>();
    }
    public void dodaj(Student stud, String ocena){
        this.oceny.put(stud,ocena);
        this.identyfikatory.put(stud.getId(),stud);
    }
    public void usun(int id){
        for(int i: this.identyfikatory.keySet()) {
            if (i == id) {
                this.oceny.remove(this.identyfikatory.get(id));
            }
        }
        this.identyfikatory.remove(id);
    }
    public void zmien(int id, String ocena){
        for(Student stu: this.oceny.keySet()){
            if(stu.getId()==id){
                this.oceny.replace(this.identyfikatory.get(id),ocena);
            }
        }
    }
    public void wypisz(){
        for (Student stu: this.oceny.keySet()){
            System.out.println(stu.getNazwisko()+" "+stu.getImie()+" "+stu.getId()+" : "+this.oceny.get(stu));
        }
        System.out.println();
    }

    private TreeMap<Student,String> oceny;
    private TreeMap<Integer,Student> identyfikatory;
}

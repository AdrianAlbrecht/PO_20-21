package pl.edu.uwm.po.lab_13;

import java.util.*;

public class PriorityList {
    public PriorityList(){
        this.list= new PriorityQueue<>();
        this.pisz();
    }

    public void pisz(){
        Scanner klawiatura = new Scanner(System.in);
        String[] words;
        String line = klawiatura.nextLine();
        Iterator<String> it;
        while (!line.equals("zakoncz")){
            words = line.split(" ");
            it= Arrays.stream(words).iterator();
            if(it.hasNext()){
                it.next();
                if(words[0].equals("dodaj")){
                    System.out.println("Dodałem polecenie! :)");
                    int prio = 0;
                    StringBuffer opisowo= new StringBuffer();
                    if(it.hasNext()){
                        prio=Integer.parseInt(it.next());
                    }
                    while (it.hasNext()){
                        opisowo.append(it.next());
                        opisowo.append(" ");
                    }
                    list.add(new Task(prio,opisowo.toString()));
                }
                else if(words[0].equals("nastepne")){
                    list.remove();
                    System.out.println("Usunąłem polecenie! :)");
                }
                else {
                    System.out.println("Nie rozpoznano polecenia! :(");
                }
            }
            line = klawiatura.nextLine();

        }
    }

    public void wypisz(){
        PriorityQueue<Task> kopia = new PriorityQueue<>(this.list);
        while(!kopia.isEmpty()){
            Task e = kopia.remove();
            System.out.println("Priorytet: "+e.priority);
            System.out.println("Opis: "+e.opis);
        }
    }

    private PriorityQueue <Task> list;
}

class Task implements Comparable<Task>{
    public Task(int priority, String opis){
        this.opis=opis;
        this.priority=priority;
    }

    int priority;
    String opis;

    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.priority, o.priority);
    }
}

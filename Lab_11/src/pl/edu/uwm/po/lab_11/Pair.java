package pl.edu.uwm.po.lab_11;

public class Pair<T> {
    private T first;
    private T second;

    public Pair() {
        this.first = null;
        this.second = null;
    }

    public Pair(T var1, T var2) {
        this.first = var1;
        this.second = var2;
    }

    public void swap(){
        T temp = this.first;
        this.first=this.second;
        this.second=temp;
    }

    public T getFirst() {
        return this.first;
    }

    public T getSecond() {
        return this.second;
    }

    public void setFirst(T var1) {
        this.first = var1;
    }

    public void setSecond(T var1) {
        this.second = var1;
    }
}

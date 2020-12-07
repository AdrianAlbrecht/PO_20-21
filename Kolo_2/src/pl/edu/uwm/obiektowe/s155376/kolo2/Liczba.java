package pl.edu.uwm.obiektowe.s155376.kolo2;

import java.math.BigDecimal;

public class Liczba <T extends Number> implements Comparable<Liczba<T>> {
    public Liczba(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public int compareTo(Liczba o) {
        return (BigDecimal.valueOf(this.value.doubleValue())).compareTo(BigDecimal.valueOf(o.getValue().doubleValue())); //.doubleValue() zmienia float 2.2 na 2.200000cośtam więc nie jest równe 0 :(
    }

    private T value;
}

package pl.edu.uwm.po.ajp_z01;

import java.util.Arrays;
import java.util.stream.Stream;

public interface IntSequence {
    static IntSequence of(int... integers) {
        return new IntSequence() {
            @Override
            public boolean hasNext() {
                return this.wsk<ciag.length;
            }
            @Override
            public int next() {
                return this.ciag[wsk++];
            }
            private final int[] ciag= Arrays.stream(integers).toArray();
            private int wsk=0;
        };
    }
    static Stream<Integer> constant(int stala){
        return Stream.iterate(stala,x->x); //Może być sama lambda, ale trzeba zmienić typ zwracany :)
    }

    boolean hasNext();
    int next();
}

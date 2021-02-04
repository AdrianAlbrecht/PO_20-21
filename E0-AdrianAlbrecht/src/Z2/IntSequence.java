package Z2;

import java.util.Arrays;

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
    static IntSequence constant(int stala){
        return ()->stala;
    }

    default boolean hasNext(){
        return true;
    }
    int next();
}

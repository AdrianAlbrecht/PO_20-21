package pl.edu.uwm.po.ajp_z01;

import javax.sound.midi.Sequence;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public interface IntSequence {
    static int[] of(int... integers) {
        return Arrays.stream(integers).toArray();
    }
    static Stream<Integer> constant(int stala){
        return Stream.iterate(1,x->x); //Tylko teraz to w klasie, ale czy ta klasa nie musi implementowac IntSequence jako interfejsu funkcyjnego?
    }
}

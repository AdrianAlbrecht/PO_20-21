package pl.edu.uwm.po.ajp_z01;

import javax.sound.midi.Sequence;
import java.util.Arrays;
import java.util.List;


public interface IntSequence {
    static int[] of(int... integers) {
        return Arrays.stream(integers).toArray();
    }
}

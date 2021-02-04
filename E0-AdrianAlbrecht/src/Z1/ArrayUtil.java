package Z1;

import java.util.Arrays;

public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean isSorted(T[] tab){
        return Arrays.equals(Arrays.stream(tab).sorted().toArray(), tab);
    }
}

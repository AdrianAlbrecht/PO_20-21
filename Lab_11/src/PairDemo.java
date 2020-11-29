public class PairDemo {

    public static void main(String[] args)
    {
        String[] words = { "Ala", "ma", "psa", "i", "kota" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        Pair<String> prev_mm = PairUtil.swap(mm);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        System.out.println("previous min = " + prev_mm.getFirst());
        System.out.println("previous max = " + prev_mm.getSecond());
    }
}

class ArrayAlg {

    public static <T extends Comparable<? super T>> Pair<T> minmax (T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo (a[i]) > 0) min = a[i];
            if (max.compareTo (a[i]) < 0) max = a[i];
        }
        return new Pair<> (min, max);
    }

}

public class PairUtil<T>{
    public static <T> Pair<T> swap(Pair<T> parka){
        Pair<T> prev_pair = new Pair<>(parka.getFirst(), parka.getSecond());
        parka.swap();
        return prev_pair;
    }
}

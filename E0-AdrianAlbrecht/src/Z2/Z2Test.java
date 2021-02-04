package Z2;

public class Z2Test {
    public static void main(String[] args) {
        IntSequence ciag = IntSequence.of(3,1,4,1,5,9);
        while (ciag.hasNext()){
            System.out.println(ciag.next());
        }
        IntSequence ciag2= IntSequence.constant(5);
        for(int i=0;(i<10)&&(ciag2.hasNext());i++){
            System.out.println(ciag2.next());
        }
    }
}

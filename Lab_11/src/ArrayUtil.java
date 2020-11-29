import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> tab){
        ArrayList<T> temp= new ArrayList<>(tab);
        tab.sort(Collections.reverseOrder());
        if(tab.equals(temp)){
            return true;
        }
        return false;
    }
    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> tab, T a){
        for(int i=0;i<tab.size();i++){
            if(a.equals(tab.get(i))){
                return i;
            }
        }
        return -1;
    }
    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> tab){
        int najwieksze;
        T temp;
        for (int i=tab.size()-1; i>=0 ;i--)
        {
            najwieksze=0;
            for (int j=0; j<=i; j++)
            {
                if (tab.get(najwieksze).compareTo(tab.get(j))<0)
                {
                    najwieksze=j;
                }
            }

            if (najwieksze!=i)
            {
                temp=tab.get(i);
                tab.set(i,tab.get(najwieksze));
                tab.set(najwieksze,temp);
            }
        }
    }
    public static <T extends Comparable<? super T>>  void mergeSort(ArrayList<T> tab){
        if (tab.size() > 1) {
            ArrayList<T> left = new ArrayList<>();
            ArrayList<T> right = new ArrayList<>();
            boolean logicalSwitch = true;
            while (!tab.isEmpty()) {
                if (logicalSwitch) {
                    left.add(tab.remove(0));
                } else {
                    right.add(tab.remove(tab.size()/2));
                }
                logicalSwitch = !logicalSwitch;
            }
            mergeSort(left);
            mergeSort(right);
            while (!left.isEmpty() && !right.isEmpty()) {
                if(left.get(0).compareTo(right.get(0)) <= 0){
                    tab.add(left.remove(0));
                }
                else {
                    tab.add(right.remove(0));
                }
            }
            if(!left.isEmpty()){
                tab.addAll(left);
            }
            else if (!right.isEmpty()){
                tab.addAll(right);
            }
        }
    }
}

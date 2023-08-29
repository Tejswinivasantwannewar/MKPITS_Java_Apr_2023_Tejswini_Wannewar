import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class DifferenceSet {
    public static void main(String[] args) {
        Integer [] array1= {12,23,34,54,56,67};
        Integer [] array2={12,23,89,45,90,76};
        HashSet <Integer> hashSet1=new HashSet<Integer>(Arrays.asList(array1));
        HashSet <Integer> hashSet2=new HashSet<Integer>(Arrays.asList(array2));
        hashSet2.removeAll(hashSet1);
        System.out.println("The difference -----------"+hashSet2);

    }
}

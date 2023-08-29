import java.util.Arrays;
import java.util.HashSet;

public class NumberArray {
    public static void main(String[] args) {

        Integer[] numberArray={12,23,34,45};
        Integer[] numberArray1={23,34,25,45,14};
        HashSet hashSet1=new HashSet(  Arrays.asList(numberArray));
        HashSet hashSet2=new HashSet(  Arrays.asList(numberArray1));
        System.out.println(hashSet1);
        System.out.println(hashSet2);
        HashSet unionHashSet1AndHashSet1= new HashSet();//refering hashset class object .
        unionHashSet1AndHashSet1.addAll(hashSet1);//add element without duplication of element .
        unionHashSet1AndHashSet1.addAll(hashSet2);
        System.out.println("-------------Performing Union Of An Element ---------");
        System.out.println(unionHashSet1AndHashSet1);


        HashSet intersectionOfSet1AndSet2=new HashSet(hashSet1);
        intersectionOfSet1AndSet2.retainAll(hashSet2); //common element display that is coomn in arraylist.
        System.out.println(unionHashSet1AndHashSet1);
        System.out.println("Intersection of two arrays");
        System.out.println(intersectionOfSet1AndSet2);




    }
}

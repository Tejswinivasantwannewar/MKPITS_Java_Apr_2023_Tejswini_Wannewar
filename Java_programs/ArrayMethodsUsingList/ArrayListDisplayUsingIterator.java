import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDisplayUsingIterator {
    public static void main(String[] args) {

            List list=new java.util.ArrayList();
            list.add(45);
            list.add(96);
            list.add(48.67);
            list.add("Neha");
            list.add("Dadu");
        System.out.println("Array List Display Using Iterator :- ");
        Iterator iterator= list.iterator();
        System.out.println("Array list set new name or value in index position as we mentioned :- ");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            list.set(3,"pardhi");


        }
//        int [] arrayNumber={1,2,3,4,5};
//
//        List newList=(Arrays.asList(12,23,34));
//        newList.add(3,56);
//        System.out.println(newList);


        //------------------------------new ================

        List list1=new ArrayList();
        list1.add(34);
        list1.add(54);
        list1.add(84);
        list1.add(64);
        System.out.println("-----This addAll method adds the new elements in array which you menntioned------------");
        System.out.println(list.addAll(list1));
        System.out.println(list);
        System.out.println("-----This contains method show if the given value is available in first array then it returns true otherwise it returns false-------- ");

        System.out.println(list.contains("pardhi"));
        System.out.println(list.contains("Tejswini"));









    }

}

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
        while (iterator.hasNext()){
            System.out.println(iterator.next());
//            System.out.println("Array list set new name or value in index position as we mentioned :- ");
            list.set(3,"pardhi");

        }
    }

}

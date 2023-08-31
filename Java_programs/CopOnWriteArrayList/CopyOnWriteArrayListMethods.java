package CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListMethods  {
    public static void main(String[] args) {
        CopyOnWriteArrayList copyOnWriteArrayList= new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(45);
        copyOnWriteArrayList.add(89);
        copyOnWriteArrayList.add("tejswini");
        copyOnWriteArrayList.add("Pallavi");
        System.out.println(copyOnWriteArrayList);

       CopyOnWriteArrayList copyOnWriteArrayList1=new CopyOnWriteArrayList<>(new Integer[] {1,2,3,4,5,6});
        System.out.println("-------------The indexOf Method-------------");
        System.out.println(copyOnWriteArrayList1.indexOf(5,2));   //searching from forward Direction.
        System.out.println("------------The Last index -----------------");
        System.out.println(copyOnWriteArrayList1.lastIndexOf(5,5));    //Searching From Backward Direction
        System.out.println("---------------ListIterator-----------");
        ListIterator listIterator= copyOnWriteArrayList.listIterator();
        while (listIterator.hasNext()){
            System.out.println( listIterator.next()
            );
        }
        
    }
}

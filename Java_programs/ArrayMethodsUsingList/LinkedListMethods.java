import com.sun.security.jgss.GSSUtil;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
       LinkedList list=new LinkedList();
        list.add(15);
        list.add(45);
        list.add(25.256);
        list.add("Tejswini");
        System.out.println(list);
        System.out.println("--------------addLast Element in given array----------");
        list.addLast(105);
        System.out.println(list);
        System.out.println("----------addfirst Element in given array-------------- ");
        list.addFirst("mrunali");
        System.out.println(list);
        System.out.println("-----------lastIndexOf methods returns the index position of given element from last------");
        System.out.println(list.lastIndexOf(45));
        System.out.println("--------The getFirst method gets the first element in given array--------");
        System.out.println( list.getFirst());
        System.out.println("--------The getFirst method gets the Last element in given array--------");
        System.out.println(list.getLast());
        System.out.println("------offerFirst is same as addFirst method it will add element in  first position");
        list.offerFirst("shreyash");
        System.out.println(list);
        System.out.println("----------The pop method--------");
        System.out.println(  list.pop());
        System.out.println("------the poll method--------");
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println("---------------the pollFirst Method-------");
        System.out.println(list.pollFirst());


//    iterable

     System.out.println("----------The iterator -------------------");

           Iterator iterator=list.iterator();    //we have to make an object of iterator but not using new  for making object just pass the object of list
           while (iterator.hasNext()){
            System.out.println(iterator.next());
           }



    }
}



import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListMethodsTaskMail {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add(12);
        linkedList.add(69);
        linkedList.add(72.54);
        linkedList.add(1265362);
        linkedList.add("Tejswini");
        linkedList.add("Pallavi");
        System.out.println("-----The elements in linkedList-------");
        System.out.println(linkedList);
        System.out.println("---append the specified element to the end of a linked list.---");
        linkedList.add("neha");
        System.out.println(linkedList);
        System.out.println("-----iterate through all elements in a linked list.------");
        Iterator iterator1= linkedList.listIterator();
       while (iterator1.hasNext()){
           System.out.println(iterator1.next());
       }

        System.out.println("---iterate through all elements in a linked list starting at the specified position.------");
        Iterator iterator2= linkedList.listIterator(4);
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println(linkedList);
        System.out.println("-----------set element in index position ---------");
        linkedList.set(2,56);
        System.out.println(linkedList);
        System.out.println("---iterate a linked list in reverse order.-------");


        Iterator iterator= linkedList.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

            System.out.println("----insert the specified element at the specified position in the linked list----");
            linkedList.set(5,"vdshdvsdv");
            System.out.println(linkedList);





        }

    }
}

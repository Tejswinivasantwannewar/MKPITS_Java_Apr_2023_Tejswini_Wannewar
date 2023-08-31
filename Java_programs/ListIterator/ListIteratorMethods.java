
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods {

        public static void main(String[] args)
        {


           List linkedList=new LinkedList();
            linkedList.add(1);
            linkedList.add(52);
            linkedList.add(89);
            linkedList.add(78);
            linkedList.add("tejswini");
            linkedList.add("Pranay");
            linkedList.add("Abhishek");



            ListIterator listIterator1= linkedList.listIterator();

            System.out.println("------------Directional list Iterator-----------------------");
           while ((listIterator1.hasNext())){
               System.out.println(listIterator1.next());
           }


            System.out.println("-----------------Bidirectional listIterator ---------------------");


            while (listIterator1.hasPrevious()){
                System.out.println( listIterator1.previous());
            }

        }
    }



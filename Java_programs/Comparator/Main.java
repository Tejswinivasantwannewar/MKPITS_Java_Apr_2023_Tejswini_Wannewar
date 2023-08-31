import java.util.Collections;
import java.util.*;
import java.io.*;


public class Main {

        public static void main(String args[]){

            ArrayList al=new ArrayList();
            al.add(new Student("Vijay",23));
            al.add(new Student("Ajay",27));
            al.add(new Student("Jai",21));

            System.out.println("Sorting by Name");

            Collections.sort(al,new NameComparator());
            Iterator iterator=al.iterator();
            while(iterator.hasNext()){
                Student st=(Student)iterator.next();
                System.out.println(st.name+" "+st.marks);
            }

            System.out.println("Sorting by age");

            Collections.sort(al,new MarksComparator());
            Iterator iterator1=al.iterator();
            while(iterator1.hasNext()){
                Student st=(Student)iterator1.next();
                System.out.println(st.name+" "+st.marks);
            }


        }
    }

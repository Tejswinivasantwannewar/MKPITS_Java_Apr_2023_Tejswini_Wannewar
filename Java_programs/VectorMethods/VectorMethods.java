import java.util.Iterator;
import java.util.Vector;

public class VectorMethods {
    public static void main(String[] args) {
        Vector vector=new Vector();
        vector.add(56);
        vector.add(98);
        vector.add(20);
        vector.add("Tejswini");
//        System.out.println(vector.add(vector));  returns boolean value .
        System.out.println("----Add element on specific position-----------");
        vector.add(2,258);
        System.out.println(vector);
        System.out.println("setsize-----------------");
        vector.setSize(8);
        System.out.println(vector);


        System.out.println("---------To check capacity------- ");
        System.out.println(vector.capacity());
        System.out.println("----------To check size of vector--------");
        System.out.println(vector.size());
        System.out.println("-------vector list display using for loop-------- ");
        for (Object number:vector
             ) {
            System.out.println(number);
        }

        System.out.println("-------vector list display using for each loop-------- ");
        for(int index=0;index<vector.size();index++){
//            System.out.println(vector.get(index));
            System.out.println(vector.elementAt(index));
        }
        System.out.println("Add all method--------");
        System.out.println( vector.addAll(vector));

        System.out.println("Add all method index position-------------");
        System.out.println(vector.addAll(8,vector));
        System.out.println("Contains method---------------");
        System.out.println(vector.contains(56));

        System.out.println("elements AT--------");
        System.out.println(    vector.elementAt(2));

//        Object[] array = vector.toArray();
//        System.out.println(array);

        System.out.println("iterator-----------------");
        System.out.println(vector);
        Iterator iterator=vector.listIterator(2);

while (iterator.hasNext()){
    System.out.println(iterator.next());
}




    }
}
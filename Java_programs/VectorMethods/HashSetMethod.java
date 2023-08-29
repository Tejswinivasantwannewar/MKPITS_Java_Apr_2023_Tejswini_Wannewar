import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethod {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add(56);
        hashSet.add(17);
        hashSet.add(97);
        hashSet.add(87);
        hashSet.add(87);//duplicates are not allowed in hashset methos that means we cannot add same element in it .
        System.out.println("The hashset list :- "+hashSet);
        System.out.println("Clone method-----(This method copies hashlist which we create) ----------");
        hashSet.clone();
        System.out.println(hashSet);
        System.out.println("Contains method---------------");
        System.out.println( hashSet.contains(97));
//        System.out.println("clear method--------------");
//        hashSet.clear();
        System.out.println("Is Empty method---------------------");
        boolean empty= hashSet.isEmpty();
        System.out.println(empty);

        System.out.println(hashSet);
        System.out.println("Remove method----------------");
        hashSet.remove(17);
        System.out.println(hashSet);
        System.out.println("Iterator method--------------------");
        Iterator iterator= hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

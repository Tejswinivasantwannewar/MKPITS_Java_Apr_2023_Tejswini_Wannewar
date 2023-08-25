import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
      List list=new java.util.ArrayList();
      list.add(45);
      list.add(96);
      list.add(48.67);
      list.add("Neha");
      list.add("Dadu");
        System.out.println(" Array  list is :- "+list);
        System.out.println("-------------List Display Using For Loop ------------");
        for(int counter=0;counter< list.size();counter++){
            System.out.println(list.get(counter));
        }
        System.out.println("-------------The Array list Display using for each loop-----------");



    }
}

import java.util.List;

public class ArrayListDisplayUsingForEachLoop {
    public static void main(String[] args) {
        List <Integer>list=new java.util.ArrayList();
        list.add(45);
        list.add(96);
        list.add(55);
        list.add(86);

        System.out.println("---------------Array List Display Using For-Each Loop------------------");

        for (Integer arrayNumber:
                list) {
            System.out.println(arrayNumber);

        }

    }
}

package ClassTaskStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumberAndDoubleItAndThenPerformSumOfThatNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
       List list1= list.stream().filter(number->number%2==0).collect(Collectors.toList());

        System.out.println("-----------even number--------");
        System.out.println(list1);

       List  list2= list.stream().filter(num->num%2!=0).map(number->number*2).collect(Collectors.toList());
        System.out.println("--------------List out remaining number--------------");
        System.out.println(list2);
      int list3= list.stream().filter(num->num%2==0).map(number->number*2).reduce(0,(sum,num)->sum+num);
        System.out.println(list3);






    }
}

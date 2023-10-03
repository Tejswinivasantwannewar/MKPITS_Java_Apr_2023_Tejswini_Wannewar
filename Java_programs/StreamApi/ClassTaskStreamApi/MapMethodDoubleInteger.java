package ClassTaskStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodDoubleInteger {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(7,2,5,8,9,3);
       List list1= list.stream().map(number->number*2).collect(Collectors.toList());
        System.out.println("----------------------double integer--------------");
        System.out.println(list1);

    }
}

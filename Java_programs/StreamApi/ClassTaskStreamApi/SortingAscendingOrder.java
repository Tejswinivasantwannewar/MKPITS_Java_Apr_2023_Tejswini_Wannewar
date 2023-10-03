package ClassTaskStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingAscendingOrder {
    public static void main(String[] args) {
        List<Integer> listNumber= Arrays.asList(21,23,2,45,78,75);
        List list=   listNumber.stream().sorted().collect(Collectors.toList());
        System.out.println("--------------sorted elements in ascending order---------------");
        System.out.println(list);

    }
}

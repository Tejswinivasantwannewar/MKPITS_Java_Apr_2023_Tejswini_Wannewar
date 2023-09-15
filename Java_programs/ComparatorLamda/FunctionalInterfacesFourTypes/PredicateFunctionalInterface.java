package FunctionalInterfacesFourTypes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("tejswini","Arun","Achal","priya");
        Predicate <String> nameContainsA = predicateObj ->  predicateObj.contains("A");
        System.out.println("--------------test method in predicate------------" +
                "");
        cities.stream().filter(nameContainsA).forEach(System.out::println);

    }
}

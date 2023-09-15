package FunctionalInterfacesFourTypes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionFunctionalInterface {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("teju","shubham","mina","bhagyashre");
        Function <String,Integer> nameMappingFunction=String::length;
        System.out.println("---Function functional interface consist apply method and this gives you length of the string ");
        cities.stream().map(nameMappingFunction).forEach(System.out::println);

    }
}

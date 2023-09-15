package List;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ListClass {
    public static void main(String[] args) {
        List <String> cities= Arrays.asList("tehu","tejuuu","abhi","Akash");
        Consumer<List<String>> upperCaseConsumer=list->{
            for(int i =0;i< list.size();i++){
                list.set(i, list.get(i).toUpperCase());

            }
        };
        System.out.println("-------------consumer-----------------");
        Consumer<List<String>> printConsumer=list -> list.stream().forEach(System.out::println);
        upperCaseConsumer.andThen(printConsumer).accept(cities);

        //supplier

        System.out.println("-----------supplier -----------------");
        Supplier <Double> supplier=()->{
           return Math.random();

        };
        System.out.println(supplier.get());




        //predicate
        System.out.println("-----------predicate-------------------");

        Predicate <String> namesStartsWithA = str-> str.contains("A");
        cities.stream().filter(namesStartsWithA).forEach(System.out::println);

        //Functional Interface
        System.out.println("-------------Functional Interface provides string length ---------------");

        Function <String,Integer> nameMappingFunction=String::length;
        cities.stream().map(nameMappingFunction).forEach(System.out::println);
 }
}
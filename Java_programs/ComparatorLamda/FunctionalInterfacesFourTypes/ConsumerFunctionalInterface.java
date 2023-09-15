package FunctionalInterfacesFourTypes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("pavan","mrunal","tejswini","kunal","Trupti");


        Consumer <List<String>> upperCaseConsumer = list-> {
            for(int i=0; i< list.size();i++){
                list.set(i,list.get(i).toUpperCase());
            }
        };


        System.out.println("----------------Consumer Functional Interface have Accepts method -----------------java.util.function.Consumer’s functional method, accept(), always takes an argument and never returns anything.-------------------");
        Consumer <List<String>> printConsumer = list-> list.stream().forEach(System.out::println);
        upperCaseConsumer.andThen(printConsumer).accept(cities);
    }
}

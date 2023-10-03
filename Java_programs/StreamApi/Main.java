import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> cities= Arrays.asList("teju","shubham","naina");
    //cities.stream().map(c->c).forEach(System.out::println);

        List list=   cities.stream().map(c->c).collect(Collectors.toList());
        System.out.println("-----------map method in stream collect the elements -----");
        System.out.println(list);


        //second list for filter

        List <Integer>  numbers= Arrays.asList(56,25,45,36,45);
        List list1=   numbers.stream().filter(num->num%2==0).collect(Collectors.toList());
        System.out.println("---------------Filter method in stream filters the elements as per your given condition --------------");
        System.out.println(list1);

//sorted------------------------

//        cities.stream().sorted().forEach(System.out::println);
        List  list2= cities.stream().sorted().collect(Collectors.toList());
        System.out.println("------Sorted method in stream --------------");
        System.out.println(list2);

        int sumOfNumbers= numbers.stream().reduce(0,(sum,num)->sum+num);
        System.out.println("-----Sum Of Numbers---------------");
        System.out.println(sumOfNumbers);

        int sumOfEvenNumber= numbers.stream().filter(num->num%2==0).reduce(0,(sum,num)->sum+num);
        System.out.println("----------Sum oF Even numbers---------");
        System.out.println(sumOfEvenNumber);





    }
}
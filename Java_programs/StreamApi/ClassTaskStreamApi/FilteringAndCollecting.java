package ClassTaskStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringAndCollecting {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Tejswini","Minakshee","Pranali","Achal","Aaarohi");

//        list.stream().filter(filterObject->filterObject.contains("A")).forEach(System.out::println);

        List list1=list.stream().filter(filteobj->filteobj.contains("A")).collect(Collectors.toList());
        System.out.println(list1);
    }

}

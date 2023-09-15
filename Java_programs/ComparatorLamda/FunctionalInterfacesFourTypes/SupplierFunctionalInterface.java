package FunctionalInterfacesFourTypes;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {
    public static void main(String[] args) {

    List <String> cities = Arrays.asList ("tejswini","uttara","tanvi","abhigya");

    Supplier <Double> supplier= ()-> {
       return  Math.random();

    };
        System.out.println("---------get method used in supplier functional interface ------------");
        System.out.println(supplier.get());
}


}

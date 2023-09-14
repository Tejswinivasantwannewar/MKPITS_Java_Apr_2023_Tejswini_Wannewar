package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Arraymain {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList=new ArrayList<Integer>();
        arrayList.addAll(Arrays.asList(7,22,89,56,88));
//        System.out.println(arrayList);
        arrayList.forEach(number-> {
            if (  number%2 == 0){
                System.out.println(number);
            }

        });
    }
}

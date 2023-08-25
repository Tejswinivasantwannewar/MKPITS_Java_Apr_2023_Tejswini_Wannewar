import java.util.Arrays;

public class BinarySearchIndexPosition {

    public static void main(String[] args) {


        System.out.println("-------------The Array Methods----------------");


        int array[]={1,2,4,6,8,10,11,65,67,87,89};
        System.out.println("The Index Position Of An Array is :- "+Arrays.binarySearch(array,3));



        int array1[]={12,2,4,6,80,10,111,65,67,87,89};
        Arrays.sort(array1);
        System.out.println("The Index Position Of An Array is :- "+Arrays.binarySearch(array1,111));


        System.out.println("---------The fill method use to fill number in given array---------");

        Arrays.fill(array,0,5,901);

        for(int fill=0;fill<array.length;fill++){
          System.out.println(array[fill]);      // For Loop  We Use Because You want to Display The Number in array.
      }


    }

}


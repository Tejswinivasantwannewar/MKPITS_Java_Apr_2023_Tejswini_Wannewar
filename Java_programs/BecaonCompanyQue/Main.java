

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        List<Integer> list= Arrays.asList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//
//        System.out.println("Patients according To Their Age "+list);



                int feesForBelowAgeOf_17 = 300;
                int feesForBetweenAgeOf17_To_40 = 200;
                int feesForAgeAbove_40 =400;
                int totalEarningOfTheDay=0;

                int[] age=new int[20];
                Scanner scanner = new Scanner(System.in);


                for (int counter=0;counter<age.length;counter++){
                    System.out.println("Enter age for patient "+counter+ " = ");
                    age[counter]=scanner.nextInt();
                    if (age[counter]<=17){
                        totalEarningOfTheDay=totalEarningOfTheDay+feesForBelowAgeOf_17;
                    }if (age[counter]>=17 && age[counter]<=40){
                        totalEarningOfTheDay=totalEarningOfTheDay+feesForBetweenAgeOf17_To_40;
                    }if (age[counter]>40){
                        totalEarningOfTheDay=totalEarningOfTheDay+feesForAgeAbove_40;
                    }
                    if (age[counter]>=120) {
                        System.out.println("INVALID INPUT");
                    }
                }

                System.out.println("Total earning of the day = "+totalEarningOfTheDay);

//        for (int value:age){
//            System.out.println(value);
//        }
            }
        }

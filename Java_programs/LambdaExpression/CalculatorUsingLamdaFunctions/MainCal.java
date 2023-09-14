package CalculatorUsingLamdaFunctions;

import java.util.Scanner;

public class MainCal {
    public static void main(String[] args) {
        int choice ;
        Scanner scanner=new Scanner(System.in);
        System.out.println("1-Addition   2- Subtraction   3-multiplication");
        choice= scanner.nextInt();
        switch (choice){
            case 1:
                Calculation calculation=((number1, number2) -> {
                    System.out.println(number1+number2);
                });
                System.out.println("-------The Addition  of two number is ---------------");

                calculation.calArea(8,9);
                break;

            case 2:
                Calculation calculation1=((number1, number2) -> {
                    System.out.println(number1-number2);
                });
                System.out.println("-------The Subtraction  of two number is ---------------");

                calculation1.calArea(89,12);
                break;

            case 3:
                Calculation calculation2=(number1, number2) -> {
                    System.out.println(number1*number2);
                };
                System.out.println("-------The multiplication of two number is ---------------");
                calculation2.calArea(5,8);
                break;
        }
    }
}

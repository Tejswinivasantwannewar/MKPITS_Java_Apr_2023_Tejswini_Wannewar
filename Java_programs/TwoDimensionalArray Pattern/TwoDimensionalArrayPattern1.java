import java.util.Scanner;

public class TwoDimensionalArrayPattern1 {




        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter your size of diamond pattern input only odd number : ");
            int rows=sc.nextInt();
            int size = rows;


            int middle = size / 2;

            for (int outerloop= 0; outerloop < rows; outerloop++) {
                for (int col = 0; col < size; col++) {
                    if (outerloop <= middle) {
                        if (col == middle - outerloop|| col == middle + outerloop) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if (col == middle - (size - 1 - outerloop) || col == middle + (size - 1 - outerloop)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }


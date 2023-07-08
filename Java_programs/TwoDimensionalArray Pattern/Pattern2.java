

import java.util.Scanner;


public class Pattern2 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            System.out.print("Enter the row position: ");
            int rowPos = input.nextInt();

            System.out.print("Enter the column position: ");
            int colPos = input.nextInt();

            char[][] pattern = new char[rowPos][colPos];

            for (int outerloop = 0; outerloop < rowPos; outerloop++) {
                for (int innerloop = 0; innerloop < colPos;innerloop++) {
                    if (outerloop + innerloop == 2 && outerloop == rowPos && innerloop == colPos) {
                        pattern[outerloop][innerloop] = '*';
                    } else if (outerloop== 2 || innerloop  ==2 || outerloop == 2 ||  innerloop ==  2  || outerloop-innerloop == 2+1 ||  innerloop-outerloop==2 ) {

                        pattern[outerloop][innerloop] = '*';
                    } else {
                        pattern[outerloop][innerloop] = ' ';
                    }
                    System.out.print(pattern[outerloop][innerloop] + " ");
                }
                System.out.println();
                

            }
        }
    }





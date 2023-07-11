

    /*     <h1>FiveByFiveArrayToPrintPattern  print the  below pattern</h1>
     * * * * *
       * * *
         *
       * * *
     * * * * *

     **/

/**Algorithm to print the pattern



 **/
    import java.util.Scanner;

public class TimerShapePattern {

        public static void main (String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size");
            int size=sc.nextInt();

            int middle=size/2;

            //for upper part
            for (int outerloop = middle ;outerloop >= 1; outerloop--) {
                for (int innerloop = 1; innerloop <= middle -outerloop; innerloop++) {
                    System.out.print(" ");
                }
                for (int innerloop1 = 1; innerloop1<= 2 * outerloop - 1; innerloop1++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            //for lower part

            for (int outerloop = 2; outerloop  <= middle; outerloop ++) {
                for (int col = 1; col <= middle -outerloop ; col++) {
                    System.out.print(" ");
                }
                for (int innerloop1 = 1; innerloop1<= 2 * outerloop  - 1; innerloop1++) {
                    System.out.print("*");
                }
                System.out.println();
            }


        }
    }

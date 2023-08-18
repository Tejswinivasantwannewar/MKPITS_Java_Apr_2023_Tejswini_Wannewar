import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddUsingInputOutput {
    public static void main(String[] args) {
        System.out.println(" -----Enter The number to check the loop-----  ");
        BufferedInputStream bis=new BufferedInputStream(System.in);
        InputStreamReader ir= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        try {
            String nm2=br.readLine();
            System.out.println("enter the number "+nm2);

            if(Integer.parseInt(nm2)%2==0)

                System.out.println("Enterd number is even");

            else
                System.out.println("Entered number is odd");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

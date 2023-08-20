import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareOfNumber {
    public static void main(String[] args) {
        BufferedInputStream bis=new BufferedInputStream(System.in);
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(ir);


        System.out.println("-------------This is to calculate the number calcultions ---------");
        System.out.println(" Enter your number : - ");
        try {

            String nm= br.readLine();
            System.out.println("This is Calculated Square of Number =>  "+(Integer.parseInt(nm)*Integer.parseInt(nm)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

import java.io.*;
import java.nio.file.Files;


public class Main {
    public static void main(String[] args) {
        BufferedInputStream bis=new BufferedInputStream(System.in);
        InputStreamReader ir= new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(ir); //if we make take buffered
        System.out.println("---------This is to Enter The name------------");
        System.out.println("Enter the name which you to print on loop ");
        try {
           String nm1=br.readLine();
           for(int i=0;i<6;i++) {
               System.out.println("enter name :-> " + nm1);
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
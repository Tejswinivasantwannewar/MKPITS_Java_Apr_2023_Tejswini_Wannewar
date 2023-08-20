import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String fname = null;
        try {
            System.out.println("------------ Enter Your File Name --------");
            fname=br.readLine();
            BufferedReader b=new BufferedReader(new FileReader(fname));
            while(fname!=null){
                System.out.println(fname);
                fname=b.readLine();

            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

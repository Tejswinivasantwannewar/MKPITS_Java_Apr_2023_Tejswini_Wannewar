
import java.io.*;

public class Main {
    public static void main(String[] args) {


//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br=new BufferedReader( isr);
//// BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        try {
//            BufferedWriter bw=new BufferedWriter(new FileWriter("teja.txt"));
//            System.out.println("Enter Name :- ");
//            String nm= br.readLine();
//            while (true){
//
//                if(nm.equals("Stop"))
//                    break;
//                bw.write(nm+"\n ");
//
//                nm= br.readLine();
//
//            }
//
////            bw.write(nm);
//            bw.close();
//
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//        public void filecopy(String fname1,String fname2) {


        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.println("enter source file");
            String fName1 = b.readLine();
            File file = new File(fName1);
            if (file.exists()) {
                System.out.println("enter  target file");
                String fName2 = b.readLine();

        FileCopy.fileCopy(fName1,fName2);
            }
            else
                System.out.println("File doesnot exist");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}



















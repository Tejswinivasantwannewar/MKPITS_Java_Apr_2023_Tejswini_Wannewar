import java.io.*;

public class ReadFileIO {
    public static void main(String[] args) {

        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
//        String fname= null;
        try {
            System.out.println("enter file name ");
            File file= new File(b.readLine());
//            fname = b.readLine();

            if(file.exists()) {

                BufferedReader br = new BufferedReader(new FileReader(file));
                String str = br.readLine();


                while (str != null) {
                    System.out.println(str);
                    str = br.readLine();

                }
            }
            else
                System.out.println("file not found");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

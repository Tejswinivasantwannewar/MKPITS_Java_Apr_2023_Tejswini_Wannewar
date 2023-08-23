import java.io.*;

public class ReadThreeLinesFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));


        try {

            System.out.println("Enter File Name");
            File file = new File(read.readLine());
            if (file.exists()) {

                BufferedReader br = new BufferedReader(new FileReader(file));
                String str = br.readLine();

                for(int counter=0;counter<3;counter++)
                {

                    System.out.println(str);
                    str= br.readLine();

//counter++;
                }
            } else

                System.out.println("File not Found");

        } catch (IOException e) {

            System.out.println(e);

        } catch (Exception e) {

            System.out.println(e);

        }



    }
}
import java.io.*;

public class LongestWordInFile {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name :- ");
        File file=new File(bufferedReader.readLine());
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            String string= bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("file not found");
    }
}

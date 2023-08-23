import java.io.*;

public class AppendStringFile {
    public static void writeToTheFile(String fileName) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName,true));

//        System.out.println("Enter String :- ");
//        String str=bufferedReader.readLine();
//        bufferedWriter.write(str+" ");
//        bufferedWriter.close();
        String choice;
        do {
            System.out.println("Enter String :- ");
            String str = bufferedReader.readLine();
            bufferedWriter.write(str + " ");

            System.out.println("Do you want to add another string ");
            choice = bufferedReader.readLine();


        } while (choice.equalsIgnoreCase("yes"));
        bufferedWriter.close();

    }
}
import java.io.*;
import java.util.Scanner;

public class LongestWordUsingScannerClass{
    public static void main(String[] args) {

//        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
//        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String fileName = null;
//        int numberOfLinesInFile=0;

        String longestWord=" ";
//        String longestWord=new String();
        try {
            System.out.println("------------ Enter Your File Name --------");
//            fileName=bufferedReader.readLine();
            Scanner scanner=new Scanner(new File(fileName));

            while(scanner.hasNext()){
//                numberOfLinesInFile++;
                String word= scanner.next(fileName);
                String [] array=fileName.split(" ");

                    if(word.length()>longestWord.length()){
                        longestWord=word;
                    }
                }
            System.out.println("The Longest word in the file is :- " +longestWord);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

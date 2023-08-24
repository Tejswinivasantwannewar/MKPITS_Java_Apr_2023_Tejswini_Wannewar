import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.io.*;

public class ReadLinesAndWordsInFile {



        public static void main(String[] args) {
            InputStreamReader inputStreamReader=new InputStreamReader(System.in);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            String fileName = null;
            int numberOflines=0;
            int wordInLine=0;
            int characteInLines=0;


            try {

                System.out.println("------------ Enter Your File Name --------");
                fileName=bufferedReader.readLine();
                BufferedReader bufferedReader1=new BufferedReader(new FileReader(fileName));
                while(fileName!=null){


                     numberOflines++;
                     String[] array=fileName.split( " ");

                     wordInLine=wordInLine+ array.length;

                     for(int number=1;number< array.length;number++){
                         characteInLines=characteInLines+array[number].length();
                     }

                    fileName=bufferedReader1.readLine();


                }
                System.out.println("Number Of Lines in The Given File is :- "+ numberOflines);
                System.out.println("Number Of Words In The Given file Is :- "+ wordInLine);
                System.out.println("Number Of Characters in the given file is :- " +characteInLines);
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }



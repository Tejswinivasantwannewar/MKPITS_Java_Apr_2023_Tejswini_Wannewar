import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CsvFileReadAndDisplayInTabularFormat {
    public static void main(String[] args) {

//                InputStreamReader inputStreamReader=new InputStreamReader(System.in);
//                BufferedReader bufferedReader=new BufferedReader(inputStreamReader);


                String fileName = null;

                try {
                    System.out.println("------------ Enter Your File Name --------");
                    BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\Java_programs\\Task21August\\src\\data.csv"));
                   fileName=bufferedReader.readLine();

//                    BufferedReader b=new BufferedReader(new FileReader(fileName));
                    while(fileName!=null){


                  String[] array=fileName.split(",");

                        System.out.println(array[0]+" \t"+array[1]+"\t"+array[2]+"\t"+array[3]+"\t"+array[4]+"\t");

                        fileName= bufferedReader.readLine();

                    }

                } catch (IOException e) {
                    System.out.println(e';;kkk') ;
                }
            }
        }



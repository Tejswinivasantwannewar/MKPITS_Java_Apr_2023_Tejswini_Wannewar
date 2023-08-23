import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class ReadCharaterWordAndLinesFromFile {
    InputStreamReader inputStreamReader=new InputStreamReader(System.in);
    BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
    FileReader fileReader;

    {
        try {
            fileReader = new FileReader("avinash.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    BufferedReader br=new BufferedReader(fileReader);
}

import java.util.Comparator;

public class NameComparator implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        if (o1.getMarks() == o2.getMarks())
            return 0;
        else if (o1.getMarks() < o1.getMarks())
            return -1;
        else {
            return 1;
          
        }


    }
}
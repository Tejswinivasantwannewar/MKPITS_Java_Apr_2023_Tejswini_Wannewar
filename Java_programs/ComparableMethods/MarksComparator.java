import java.util.Comparator;

public class MarksComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1.name == o2.getmarks)
            return 0;
        else if (o1.getmarks() < o1.getmarks())
            return -1;
        else {
            return 1;

        }

    }
}

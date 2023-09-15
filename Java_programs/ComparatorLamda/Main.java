import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> linkedList = new LinkedList();


        Student[] students = new Student[4];
        students[0] = new Student("teju", 90);
        students[1] = new Student("goju", 70);
        students[2] = new Student("bheju", 30);
        students[3] = new Student("soju", 780);


        linkedList.addAll(Arrays.asList(students));
        for (Student student : linkedList) {
            System.out.println(student);
        }

//anonymous class of student type

        Collections.sort(linkedList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());

            }

        });
        System.out.println("-----------Sorted elements According to the name-----------");
        System.out.println(linkedList);


        //lambda expression using comparator


        Comparator<Student> comparator = (object1, object2) -> {


            if (object1.getMarks() == object2.getMarks()) {
                return 0;

            } else if (object1.getMarks() > object2.getMarks()) {
                return 1;
            } else
                return -1;


        };

        Collections.sort(linkedList, comparator);
        System.out.println("---------Sorted elements according to the marks---------------");
        System.out.println(linkedList);


        Stream <Student> studentStream= Stream.of(students);
        studentStream.forEach(student -> System.out.println(student));








    }
}

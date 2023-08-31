import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList <Student> data=new LinkedList<Student>();

        Student[] students=new Student[4];
        students[0]=new Student("bru",50);
        students[1]=new Student("arun",55);
        students[2]=new Student("crunal",10);
        students[3]=new Student("pk",80);


        data.addAll(Arrays.asList(students));
        Collections.sort(data);
        for (Student p:data
        ) {
            System.out.println(p.getName()+" "+p.getMarks());

        }

    }
}

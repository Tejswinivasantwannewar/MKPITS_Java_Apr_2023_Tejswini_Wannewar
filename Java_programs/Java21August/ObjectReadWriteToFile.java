import java.io.*;

public class ObjectReadWriteToFile {

public static void writeObjectToFile(Student s) throws IOException {


       ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("teja.txt"));
       objectOutputStream.writeObject(s);
       objectOutputStream.close();

}



        public static void readObjectFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("teja.txt"));
        Student  student = (Student)objectInputStream.readObject(); //downcasting
        System.out.println("Name :- "+student.getName()+"\n "+" Marks :- "+ student.getMarks());

    }




}

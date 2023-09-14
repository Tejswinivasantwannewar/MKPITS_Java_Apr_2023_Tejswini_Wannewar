package FunctionInterface;

public class SingleAbstractMethod {
    public interface MyClass{
       void getName(String name);
    }

    public static void main(String[] args) {
        MyClass myClass=(name)->{
            System.out.println(" The Name is "+name);
        };
        myClass.getName("tejswini");
    }

}

public class Student extends Person{

    @Override
    public void eat() {
        System.out.println("Student can eat the food");
    }

    @Override
    public void walk() {
        System.out.println("Student is walking");
    }

    @Override
    public void talk() {
        System.out.println("Student can walk smoothly");
    }

    public void study(){
        System.out.println("Student can study");
    }
}

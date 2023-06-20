public class Main {
    public static void main(String[] args) {

        // This is related to method Overloading
//        CalculateArea c = new CalculateArea();
//
//        double areaOfCircle = c.getArea(60.54);
//        System.out.println(areaOfCircle);
//
//        c.getArea(20);
//
//        long areaOfRectangle = c.getArea(45,60);
//        System.out.println("Area of reactangle = "+areaOfRectangle+" this is result");



        /////////////////////////////////////////////////////////////////////////////////////////////


        // Overriding Concept


        Person p = new Person();

        Student s = new Student();

        Person p1 = new Student();


        p.eat();
        p.walk();
        p.talk();

        s.eat();
        s.walk();
        s.talk();
        s.study();


    }
}
import java.awt.*;

interface  Shape{
    void calArea( int radius);
}


public class Main {
    public static void main(String[] args) {
        Shape shape=( int radius)-> System.out.println("cal your area"   +Math.PI*radius*radius);
        shape.calArea(56);
    }

}
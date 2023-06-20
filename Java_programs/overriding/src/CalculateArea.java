public class CalculateArea {

    public double getArea(double radius){

        return  (3.14*radius*radius);
    }

    public long getArea(long length , int breadth){

        long area = length * breadth ;

        return area;
    }

    public void getArea(int radius){

        double area= (3.14*radius*radius);

        System.out.println("Area of Circle Int Type ="+area);
    }
}

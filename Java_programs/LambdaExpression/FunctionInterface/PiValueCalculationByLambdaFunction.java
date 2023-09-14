package FunctionInterface;

@FunctionalInterface
interface Addition{
    void getCalculatedValue(int number1,int number2);

}



public class PiValueCalculationByLambdaFunction {
    public static void main(String[] args) {
        Addition  addition=(number1,number2)-> System.out.println(" Addition of two number is :->  "+(number2+number1));
        addition.getCalculatedValue(8,5);
    }
}

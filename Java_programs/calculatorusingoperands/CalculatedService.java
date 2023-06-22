public class CalculatedService {
        void performOperation(String operand ,double operator1,double operator2){

            switch (operand){

                case "+":
                    AdditionOfTwoNumber addValue = new AdditionOfTwoNumber();
                    addValue.getCalculatedValue(operator1,operator2);
                    break;

                case "-":
                    SubtractionOfTwonumber subValue= new  SubtractionOfTwonumber();
                    subValue.getCalculatedValue(operator1,operator2);
                    break;


                case "*":
                    MultiplicationOfTwoNumber mulValue= new MultiplicationOfTwoNumber();
                    mulValue.getCalculatedValue(operator1,operator2);
                    break;

                case "/":
                    DivisionOfTwoNumber divValue= new  DivisionOfTwoNumber();
                    divValue.getCalculatedValue(operator1,operator2);
                    break;



            }
        }
    }


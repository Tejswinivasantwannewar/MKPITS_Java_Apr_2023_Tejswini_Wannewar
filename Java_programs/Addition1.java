
/**
* @param number1- is for the value of numbber 1 which we use for addition1
* @param number2- is for the value of numbber 2 which we use for addition1
* @result result- here we are storing the the result  of two integer
**/



 public class Addition1
{
public int addInteger(int number1,int number2)
{
return number1 + number2;
}

public static void main(String[] args )
{
	int answer;
    Addition1 addition1=new Addition1();
    answer=addition1.addInteger(10,13);
    System.out.println(answer);
}
}




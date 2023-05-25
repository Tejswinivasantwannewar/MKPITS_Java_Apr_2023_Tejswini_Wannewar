
import java.util.Scanner;
/**
*this is the subtraction program
* @version is  11.0.11
*/
public class Subtraction
{ 
/**
*these program is for subtraction 
* @param args the command line argument
	* @param n1 take first number for subtraction
* @param n2 take second number for subtraction
* @param sub take sub variable to store the result

*/
  public static void main(String[] args)
  {
	  System.out.println("subtraction of two number");
	  Scanner sc=new Scanner(System.in);
	  int n1,n2,sub;
	  /**
	  *these n1 and n2 are the variables and sum variable is to store the result
	  */
	  System.out.println("enter the first number");
	  n1=sc.nextInt();
	  System.out.println("enter the second number");
	  n2=sc.nextInt();
	  sub=n1-n2;
	  System.out.println("the  subtraction of two number is = "+sub);
  }
}

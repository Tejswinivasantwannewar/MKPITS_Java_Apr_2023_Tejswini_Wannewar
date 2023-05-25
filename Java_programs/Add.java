

import java.util.Scanner;

public class Add
{
	/**
* Adds two values.
*@param a- first numeric value for the add operation
* @param b- second numericvalue for same purposes
* @return sum of two operands
*/
//this program is for addition of two number

public static void main(String[] args)
{
	int a,b,sum;
	
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	sum=a+b;
	System.out.println("the addition of two number is="+sum);
}
}
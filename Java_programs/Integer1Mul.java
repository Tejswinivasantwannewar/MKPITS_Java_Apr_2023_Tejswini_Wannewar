class IntegerMul
{
public int MulInt(int number1,int number2)
{
return (number1*number2);
}

}


class Integer1Mul
{
public static void main(String[] args)
{
 IntegerMul integer = new  IntegerMul();
int mul = integer.MulInt(15,20);
System.out.println(mul);
}
}
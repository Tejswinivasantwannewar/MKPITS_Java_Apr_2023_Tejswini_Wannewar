class IntegerDiv
{
public int DivInt(int number1,int number2)
{
return (number1/number2);
}
}

class Integer1Div
{
public static void main(String[] args)
{
IntegerDiv integer=new IntegerDiv();
int div=integer.DivInt(12,3);
System .out.println(div);
}
}

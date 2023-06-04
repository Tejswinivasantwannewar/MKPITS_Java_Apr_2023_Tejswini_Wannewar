class IntegerSub
{
public int SubInt(int number1,int number2)
{
return (number1-number2);
}

}


class Integer1Sub
{
public static void main(String[] args)
{
 IntegerSub integer = new  IntegerSub();
int sub = integer.SubInt(15,20);
System.out.println(sub);
}
}
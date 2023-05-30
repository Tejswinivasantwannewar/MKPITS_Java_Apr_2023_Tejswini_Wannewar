class Integer
{
public int AddInt(int number1,int number2)
{
return (number1+number2);
}

}


class Integer1
{
public static void main(String[] args)
{
Integer integer = new Integer();
int add = integer.AddInt(15,20);
System.out.println(add);
}
}
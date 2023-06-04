class IntegerAdd
{
public int AddInt(int number1,int number2)
{
return (number1+number2);
}

}


class Integer1Add
{
public static void main(String[] args)
{
IntegerAdd integer = new IntegerAdd();
int add = integer.AddInt(15,20);
System.out.println(add);
}
}
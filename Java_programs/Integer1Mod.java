class IntegerMod
{
public int ModInt(int number1,int number2)
{
return ( number1%number2);
}
}

class Integer1Mod
{
public static void main(String[] args)
{
IntegerMod integer= new IntegerMod();
int mod = integer.ModInt(20,3);
System.out.println(mod);
}
}
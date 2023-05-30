class Float
{
public float addFloat(float number1,float number2)
{
return number1+number2;
}
}


class Float1
{
public static void main(String[] args)
{
Float float1 = new Float();
float ans = float1.addFloat(2.3f,8.9f);
System.out.println(ans);
}
}
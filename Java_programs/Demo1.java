class Demo1
{

	int num1=10;
	int num2=30;
	
	public int addInteger1()
    {
     return num1 + num2;
    }

    public static void main(String[] args){
	Demo1 add1=new Demo1();
    int answer=add1.addInteger1();
	System.out.println(answer);
}
}
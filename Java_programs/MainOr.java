class logicalOr{
	/*logical operator using two parameter*/

	public boolean logicalTwoOperator(boolean var1, boolean var2){
		return var1 || var2;
	}

	public boolean logicalThreeOperator(boolean var1, boolean var2, boolean var3){
		return var1 || var2 || var3;
	}

	public boolean logicalFourOperator(boolean var1, boolean var2, boolean var3, boolean var4){
		return var1 || var2 || var3 || var4;
	}

	public boolean logicalFiveOperator(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5){
		return var1 || var2 || var3 || var4 || var5;
	}
}
class MainOr{
	public static void main(String[] args){
	/*logical operator using two parameter*/
		logicalOr logicalOperator1 = new logicalOr();
		System.out.println("The value of given logical operator using two parameter is : " + logicalOperator1.logicalTwoOperator(false,false));

	/*logical operator using three parameter*/
		logicalOr logicalOperator2 = new logicalOr();
		System.out.println("The value of given logical operator using three parameter is : " + logicalOperator2.logicalThreeOperator(true,false,true));

	/*logical operator using four parameter*/
		logicalOr logicalOperator3 = new logicalOr();
		System.out.println("The value of given logical operator using four parameter is : " + logicalOperator3.logicalFourOperator(true,true,true,false));

	/*logical operator using five parameter*/
		logicalOr logicalOperator4 = new logicalOr();
		System.out.println("The value of given logical operator using five parameter is : " + logicalOperator4.logicalFiveOperator(false,false,true,false,false));
	}
}
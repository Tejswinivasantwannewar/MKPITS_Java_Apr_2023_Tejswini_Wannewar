
#include<stdio.h>
#include<conio.h>
void main()
{


 long int num, num1,num2,num3,num4,num5,rev;
printf("enter the value of num");
scanf("%ld", &num);

num1=num%10;      //12345=5
num=num/10;
		//1234

num2=num%10;               //1234=4
num=num/10;
			 //123
num3=num%10;                 //123=3
num=num/10;
		//12

num4=num%10;                 //12=2
num=num/10;	      //   1

num5=num%10;
rev=num1*10000+num2*1000+num3*100+num4*10+num5*1;
printf("the rev number is=%ld",rev);
getch();
}              //1=1




// no arg and no returntype
//find maximum of two numbers using a function.


#include<stdio.h>
#include<conio.h>


void func()
{
int n1,n2;
clrscr();
printf("\n enter the two numbers");
scanf("%d %d ",&n1,&n2);
if(n1>n2)
{
printf("\n the max number is=%d",n1);
}
else if(n2>n1)
{
printf("\n the max num is=%d",n2);
}
}

void main()
{
func();
getch();
}
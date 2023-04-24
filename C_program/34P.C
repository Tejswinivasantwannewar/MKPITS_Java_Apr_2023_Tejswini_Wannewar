//write a c progran that reads two number and divide the firstnumber by second number.
//if the division is not possible then print disvisin is not possible.

#include<stdio.h>
#include<conio.h>
void main()
{
int n1,n2;
printf("\n enter the values of two number");
scanf("%d %d",&n1,&n2);
if(n1%n2!=0)
{
printf("\n the division is not possible");
}
getch();
}

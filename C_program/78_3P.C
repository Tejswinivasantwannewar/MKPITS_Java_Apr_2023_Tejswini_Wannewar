//no return type and argument
// sq of number

#include<stdio.h>
#include<conio.h>

void func(int num)
{
int sq;
sq=num*num;
printf("the square of number=%d",sq);
}
void main()
{
int num1;
printf("enter the number");
scanf("%d",&num1);
 func(num1);
 getch();
 }

//sq of number
// returntype and argument

#include<stdio.h>
#include<conio.h>

int func(int num)
{
int sq;
sq=num*num;
  return sq;
}
void main()
{
int num1;
printf("enter the number");
scanf("%d",&num1);
printf("%d",func(num1));
getch();
 }



// return type and no argument
// sq of number

#include<stdio.h>
#include<conio.h>

int func()
{
int num, sq;
printf("enter the number");
scanf("%d",&num);
sq=num*num;
return sq;
}
void main()
{
printf("%d", func());
 getch();
 }

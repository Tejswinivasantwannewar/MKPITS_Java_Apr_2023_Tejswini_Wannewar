//return type with no argument

#include<stdio.h>
#include<conio.h>


int func()
{
int a,b,add;
printf("enter the numbers");
scanf("%d %d ", &a,&b);
add=a+b;
return add;
}

void main()
{
printf("%d",func());
getch();
}
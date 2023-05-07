
//fahrenheit=(celsius*9/5)+32
//no returntype and  argument

#include<stdio.h>
#include<conio.h>

void func(int c)
{
 int f;
 clrscr();
 f=(c*1.8)+32;
 printf("the f=%d",f);
}
void main()
{
int c1;
printf("enter the celcius");
 scanf("%d",&c1);
 func(c1);
  getch();
}
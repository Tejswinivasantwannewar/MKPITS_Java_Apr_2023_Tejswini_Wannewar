
//fahrenheit=(celsius*9/5)+32
// returntype and  no argument

#include<stdio.h>
#include<conio.h>

int func()
{
 int c, f;
 printf("enter the celcius");
 scanf("%d",&c);
 clrscr();
 f=(c*1.8)+32;
 return f;
}
void main()
{
 printf("f=%d",func());
  getch();
}
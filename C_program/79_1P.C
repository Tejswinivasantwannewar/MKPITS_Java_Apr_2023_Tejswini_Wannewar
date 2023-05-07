//fahrenheit=(celsius*9/5)+32
//no returntype and no argument

#include<stdio.h>
#include<conio.h>

void func()
{
 int c,f;
 printf("enter the celcius");
 scanf("%d",&c);
 f=(c*1.8)+32;
 printf("the fahrenheit is =%d",f);
}
void main()
{
  func();
  getch();
}
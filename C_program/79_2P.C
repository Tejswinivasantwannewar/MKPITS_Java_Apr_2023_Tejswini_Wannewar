
//fahrenheit=(celsius*9/5)+32
// returntype and  argument

#include<stdio.h>
#include<conio.h>

int func(int c)
{
 int f;
 clrscr();
 f=(c*1.8)+32;
 return f;
}
void main()
{
int c1;
printf("enter the celcius");
 scanf("%d",&c1);
 printf("%d", func(c1));
  getch();
}
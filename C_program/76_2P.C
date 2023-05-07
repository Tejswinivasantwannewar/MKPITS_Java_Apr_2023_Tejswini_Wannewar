//argument with  returntype
//a=pi*r*r

#include<stdio.h>
#include<conio.h>

float func(float r)
{
float pi=3.142, area;
area=pi*r*r;
return area;
}

void main()
{
float x;
clrscr();
printf("\n enter the value");
scanf("%f",&x);
 printf("%f", func(x));
  getch();
  }

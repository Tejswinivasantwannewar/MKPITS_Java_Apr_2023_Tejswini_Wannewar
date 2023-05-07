//no returntype with argument
//a=pi*r*r

#include<stdio.h>
#include<conio.h>

void func(float r)
{
float pi=3.142,area;
area=pi*r*r;
printf("\n the area of circle is=%f",area);
}

void main()
{
float x;
printf("enter the radius");
scanf("%f",&x);
  func(x);
  getch();
  }
//returntype with no argument
//a=pi*r*r

#include<stdio.h>
#include<conio.h>

float func()
{
float  r,area,pi=3.142;
printf("enter the radius of circle");
scanf("%f",&r);
area=pi*r*r;
return area;
}

void main()
{
  printf("%f",func());
  getch();
  }



//area of circle
//no returntype with no argumnet
//f=pi*r*r

#include<stdio.h>
#include<conio.h>

void func()
{

float pi=3.142,area,r;

printf("enter the radius");
scanf("%f",&r);
area=pi*r*r;
printf("the area is =%f",area);
}

void main()
{
func();
getch();
}


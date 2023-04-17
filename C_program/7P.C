//write a c program for area of circle=pi*r*r
//peri=2*pi*r

#include<stdio.h>
#include<conio.h>
void main()
{
int   r=6;
float pi=3.142,peri,area;
area=pi*r*r;
peri=2*pi*r;
printf("\n the area of circle is=%f",area);
printf("\nthe perimeter of circle is=%f",peri);
getch();
}

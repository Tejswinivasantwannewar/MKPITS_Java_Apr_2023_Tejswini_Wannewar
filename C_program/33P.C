//write a c program to reads the coordinates(x,y) in catesian system and
//and find the quadrant  to which it belomgs
//q1=++   //q2=+-    //q3=--    q4=-+

#include<stdio.h>
#include<conio.h>
void main()
{
int x,y;
printf("\n enter the values of x and y");
scanf("%d %d",&x,&y);
if(x>0 &&y>0)
{
printf("\n the value nelomg to the first quadrant");
}
if(x>0 &&y<0)
{
printf("\n the value belong to the second quadrant");
}
if(x<0 && y<0)
{
printf("the value lies in third quadrant");
}
if(x<0 && y>0)
{
printf("\n the value belongs to the fourth quadrant");
}
getch();
}

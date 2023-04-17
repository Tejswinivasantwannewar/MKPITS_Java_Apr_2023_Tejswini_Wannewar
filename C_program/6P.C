//write a c program to compute the perimeter and area of rectangle with height of 7 inches and width od 5 inches.

//peri of rectangle=2(l+w)
//area of recta=l*w

#include<stdio.h>
#include<conio.h>
void main()

{
int l=7,w=5,area,peri;

 area=l*w;
 printf("\n the area is=%d",area);
 peri=2*l+2*w;
 printf("\n the peri is=%d",peri);
 getch();
 }

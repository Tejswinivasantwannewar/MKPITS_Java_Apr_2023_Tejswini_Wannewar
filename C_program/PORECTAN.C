#include<stdio.h>
#include<conio.h>
void main()
{

float l,b,peri;

printf("enter value of l and b:");//formula=2l+2w//
scanf("%f %f", &l,&b);

peri=(l+b)*2.0;

printf("the perimeter of rectangle is= %f",peri);
getch();
}

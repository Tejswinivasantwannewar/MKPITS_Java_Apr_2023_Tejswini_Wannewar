//no returntype with argument

#include<stdio.h>
#include<conio.h>

void func(int a,int b)
{
int area;
area= 0.50*a*b;
printf("the area of triangle is=%d",area);
}
void main()
{
int l,b;
printf("enter the length and breadth");
scanf("%d %d",&l,&b);
func(l,b);
getch();
}

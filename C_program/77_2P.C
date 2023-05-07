//returntype with argument

#include<stdio.h>
#include<conio.h>

int func(int a,int b)
{
int area;
area= 0.50*a*b;
return area;
}
void main()
{
int l,b;
printf("enter the length and breadth");
scanf("%d %d",&l,&b);
printf("%d",func(l,b));
getch();
}

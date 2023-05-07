//area of triangle
//returntype with no argument

#include<stdio.h>
#include<conio.h>

int func()
{
int l,b,area;
printf("enter the length and breadth");
scanf("%d %d",&l,&b);
area= 0.50*l*b;
return area;
}
void main()
{
printf("%d",func());
getch();
}



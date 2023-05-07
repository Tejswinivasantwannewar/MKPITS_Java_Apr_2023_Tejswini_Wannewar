//no returntype and no agrgument
//a=1/2*l*b

#include<stdio.h>
#include<conio.h>

void func()
{
int l,b,area;
printf("enter the length and breadth");
scanf("%d %d",&l,&b);
area= 0.50*l*b;
printf("%d",area);
}
void main()
{
func();
getch();
}

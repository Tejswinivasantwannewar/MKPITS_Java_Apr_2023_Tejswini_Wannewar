//write a c program to find the sum of two numbers using function.
//function with no  argument and no returntype.

#include<stdio.h>
#include<conio.h>

void func()
{
int a,b,add;
clrscr();
scanf("%d %d ",&a,&b);
add=a+b;
printf("\n the add=%d",add);

}
void main()
{
func();
getch();
}


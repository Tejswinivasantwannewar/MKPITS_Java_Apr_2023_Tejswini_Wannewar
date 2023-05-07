//no returntype with argument

#include<stdio.h>
#include<conio.h>

void func(int n1,int n2)
{
int max;
if(n1>n2)
{
max=n1;
}
else
{
max=n2;
}
printf("\n the max=%d",max);

}

void main()
{
int x,y;
printf("\n enter the two num");
scanf("%d %d", &x,&y);
func(x,y);
getch();

}


//returntype with no argument

#include<stdio.h>
#include<conio.h>

int func()
{
int n1,n2,max;
printf("\n enter the two number ");
scanf("%d %d ", &n1,&n2);
if(n1>n2)
{
printf("\n the max num =%d",n1);
max=n1;
}
else if(n2>n1)
{
printf("\n the max num=%d",n2);
n2=max;
}
return max;
}

void main()
{
func();
getch();
}
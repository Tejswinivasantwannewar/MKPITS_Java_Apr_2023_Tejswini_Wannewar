//return type with argument

#include<stdio.h>
#include<conio.h>


int func(n1,n2)
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
   return max;
}

void main()
{
int x,y,s;
 printf("\n enter the two num");
 scanf("%d %d ", &x,&y);
 s=func(x,y);
 printf("%d",s);
 getch();
 }






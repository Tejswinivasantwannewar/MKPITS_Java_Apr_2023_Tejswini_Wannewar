//write a c program that reads two integer and checks if they are multiplied or not.
//output[15,30]=these numbers are multiplied with each other so correct.
//[2,5]=these numbers are not multiplied with each other so wrong.

#include<stdio.h>
#include<conio.h>
void main()
{
  int n1,n2;
  printf("\n enter the two numbers");
  scanf("%d %d",&n1,&n2);
  if((n1%n2)==0)
  {
  printf("\n the numbers are multiple with esch other");
  }
  else
  {
  printf("\n the numbers are not multiple ");
  }
  getch();
  }
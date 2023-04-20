
//write c program thar accepts three integers and find the maximun of three.

#include<stdio.h>
#include<conio.h>
void main()
{
int n1,n2,n3;
printf("\n enter the number n1,n2 and n3");
scanf("%d %d %d ",&n1,&n2,&n3);

if (n1>n2&&n1>n3)
  printf("\n the max number is=%d",n1);
if(n2>n1&&n2>n3)
 printf("\n the max number is=%d",n2);
if (n3>n1&&n3>n2)
 printf("\n the max number is=%d",n3);

 getch();
 }
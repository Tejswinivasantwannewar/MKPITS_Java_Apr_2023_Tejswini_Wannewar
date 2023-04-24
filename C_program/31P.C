//write a c program to check if two numbers in a pair is in n1 &n2
//ascending(n1<n2) or descending order.(n1>n2)

#include<stdio.h>
#include<conio.h>
void main()
{
   int n1,n2;
   printf("\n enter the values of n1 &n2");
   scanf("%d %d",&n1,&n2);
   if(n1<n2)
   {
   printf("\n the pair of number is in ascending order");
   }
   if(n1>n2)
   {
   printf("\n the number is in descending order");
   }
 getch();
 }
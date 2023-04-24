//write a c program that prints all even numbers between 1 and 50.

#include<stdio.h>
#include<conio.h>
void main ()
{
  int num=1;
  for(num=1;num<=50;num++)
     {					       //if (num%2==0)

     if(num%2==0)
     {
       printf("\n the even number is=%d",num);
      }
   }
getch();
}



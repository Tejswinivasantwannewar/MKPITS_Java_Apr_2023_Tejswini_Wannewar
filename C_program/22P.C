//write a c program that reads an integer and check the
//specified range where it belongs.
// print an error message if the number is negative and greater than 80

#include<stdio.h>
#include<conio.h>
void main()
{

  int num;
  printf("\n enter the number");
  scanf("%d", &num);
   if(num<0 || num>80 )
   {
	   printf("\n the number is in range");
   }

   else
   {
	    printf("\n the number  is not in range");
   }

   getch();
   }

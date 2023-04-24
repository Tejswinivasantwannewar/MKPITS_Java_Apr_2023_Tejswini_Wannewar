//write a c program to find and print the square of each one of the
//even values from 1 to a specified value.
//num
//num%2==0 ...//sq

#include<stdio.h>
#include<conio.h>
void main()
{
int num,count,sq;
printf("\n enter the number ");
scanf("\n%d",&num);
printf("list of square of each one of the even value from 1 to %d",num);
for(count=2;count<=num;count++)
{
   if((count%2)==0)
   {
   sq=count*count;
   printf("\n%d",sq);
  }
}
getch();
}




























































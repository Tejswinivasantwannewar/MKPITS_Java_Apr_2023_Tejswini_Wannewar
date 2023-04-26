       //write c program to find all the numbers which dividing it by 7 and
       // the remainder is equal to 2 or 3 between two given integer numbers.

#include<stdio.h>
#include<conio.h>
void main()
{
int s_no,e_no,count;
clrscr();
printf("\n enter the values of start number and end number");
scanf("%d %d ",&s_no,&e_no);
for(count=s_no;count<= e_no;count++)
{
if((count%7)==2  || (count%7)==3)
{
printf("the number=%d \t", count);
}
}

getch();
}


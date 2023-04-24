//write a c program to calculate the sum of all numbers not divisible by 17 between two given numbers.
// first take range for that take two numbers starting range and ending range.


#include<stdio.h>
#include<conio.h>
void main ()
{
int st_no,end_no,count,sum=0;
printf("\n enter the value of st_no ans end_no");
scanf("%d %d",&st_no,&end_no);
for(count=st_no;count<=end_no;count++)
{

if(count%17!=0)
{
sum=sum+count;
}
}
printf("\n the sum of all no. which are not divisible by 17 =%d",sum);
getch();
}

//write c program to convert  specified days  into years,week,days

#include<stdio.h>
#include<conio.h>
void main()
{

int s_days,years,week,days;
printf("\n enter the specified  days");
scanf("%d",&s_days);

years=s_days/365;       //return remainder
week=(s_days%365)/7;
days=(s_days%365)%7;
printf(" %d= %d years,%d weeks,%d days",s_days,years,week,days);
getch();
}
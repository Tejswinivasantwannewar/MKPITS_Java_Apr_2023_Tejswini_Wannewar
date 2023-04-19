//write c program to convert a given integer (in days) to years,months and days ,assume that all months have 30 days and all years have 365 days .






   #include<stdio.h>
   #include<conio.h>
void main()
{
int no_days,year,month,day;
printf("\n enter the number of days");
scanf("%d",&no_days);

year=no_days/365;
printf("\n the total years is=%d",year);
no_days=no_days-(365*year);

month=no_days/30;
printf("\n the months is=%d",month);
day=no_days-(month*30);
printf("\n the days=%d",day);


getch();
}

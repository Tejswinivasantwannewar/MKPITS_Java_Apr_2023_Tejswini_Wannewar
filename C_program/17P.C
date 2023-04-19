//write c program to convert given integer (in sec),to hours min,seconds.


#include<stdio.h>
#include<conio.h>
void main()
{
int sec,h,m,s;
printf("\n enter the seconds");
scanf("%d", &sec);

h=(sec/3600);
printf("\n the hour is=%d",h);
m=(sec-(3600*h))/60;
printf("\n the min is =%d",m);
s=(sec-(3600*h)-(m*60));
printf("\n the sec is =%d",s);
getch();
}
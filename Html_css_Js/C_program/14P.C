//write c program to to calculate a bikes average consumption from the given total distance (integer value) travelled (in km)and spent fuel (int litres,float numbers -2decimal points).

#include<stdio.h>             //formula
#include<conio.h>             //average=distance/fuel
void main ()
{
   int dist,fuel;
   float ave;
printf("\n enter the total distance ");
scanf("%d",&dist);
printf("\nenter the total fuel in liters");
scanf("%d",&fuel);
ave=dist/fuel;
printf("\n the average is =%.2f",ave);
getch();
}


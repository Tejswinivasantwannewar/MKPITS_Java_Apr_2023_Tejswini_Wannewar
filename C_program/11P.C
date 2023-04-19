//write c program that accepts two items weight (floating pts value) and number of purchase (floating points value) and calcuate the average value of items .

#include<stdio.h>
#include<conio.h>
void main()
{
float iwt1,iwt2,nop1,nop2,ave;
printf("\n enter the value of iwt1 and iwt2");
scanf("%f %f",&iwt1,&iwt2);
printf("\n enter the value of nop1 and nop2");
scanf("%f %f",&nop1,&nop2);

ave=((iwt1*nop1)+(iwt2*nop2))/(nop1+nop2);
printf("\n the ave is=%f",ave);
getch();
}
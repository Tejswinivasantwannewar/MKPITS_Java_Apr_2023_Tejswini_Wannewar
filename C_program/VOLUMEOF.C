#include<stdio.h>
#include<conio.h>
void main()
{

float pi=3.14,c=1.33,vol,rad;   //if we are taking integer value in fraction then we have to take radius as float i taking as digit the it will be in int//

printf("enter the num to calucate vol of sphere:");
scanf("%f",&rad);
  vol=c*pi*rad*rad*rad;
printf("the vol of sphere is = %f",vol);
getch();
}

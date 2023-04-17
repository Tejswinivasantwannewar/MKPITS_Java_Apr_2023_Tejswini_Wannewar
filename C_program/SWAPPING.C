#include<stdio.h>
#include<conio.h>
void main()

{

int first,second,swap;
printf("enter the first and second number");
scanf("%d %d ",&first,&second);
swap=first;
first=second;
second=swap;
printf("\nswapping result is=%d",first);
printf("\nswapping result is=%d",second);

getch();
}
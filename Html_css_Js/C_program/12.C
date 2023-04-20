//c program that accepts an employees id ,total worked hours of a month and the amount he received per hour .
//print employee's id and salary (with two decimal places )of a particular month.

#include<stdio.h>
#include<conio.h>
void main()
{
char e_id[10];
int hr;
double amt,salary;

printf("\n enter the employee id");
scanf("%s", &e_id);
printf("\n enter the employee working hour");
scanf("%d",&hr);
printf("\n the amount per hour");
scanf("%lf",&amt);

salary=amt*hr;
printf("\n the salary is =%lf",salary);
getch();
}

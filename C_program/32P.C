////write a c program that reads a password until it is correct .for wrong password print
//"incorrect pasword"and for correct password print"correct password"
//the correct password is =1234.
#include<stdio.h>
#include<conio.h>
void main()
{
int pass;
printf("\nenter the password");
scanf("%d",&pass);
if(pass==1234)
{
  printf("correct password");
  }
  else
  {
  printf("\n the password is incorrect");
  }

getch();
}
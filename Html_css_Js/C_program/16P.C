//write c program to read an amount (integer value ) and break the amount into smallest possible number of bank notes.

#include<stdio.h>
#include<conio.h>
void main()
{
int amt,total;

printf("\n enter the amount ");
scanf("%d",&amt);

   total=amt/100;
   printf("\n the notes of 100 =%d",total);
   amt=amt-(total*100);

   total=amt/50;
   printf("\n the notes of 50 is=%d",total);
   amt=amt-(total*50);

   total=amt/20;
   printf("\n the notes of 20=%d",total);
   amt=amt-(total*20);

   total=amt/10;
   printf("\n the notes of 10=%d",total);
   amt=amt-(total*10);

   total=amt/5;
   printf("\n the notes of 5=%d",total);
   amt=amt-(total*5);

   total=amt/2;
   printf("\n the notes of 2rs =%d",total);
   amt=amt-(total*2);

   total=amt/1;
   printf("\n the notes of 1rs=%d",total);
   amt=amt-(total*1);

getch();
}

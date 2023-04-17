//write a program to perform the addition of 5digiti nuber//



 #include<stdio.h>
 #include<conio.h>
void main()
{
 long int num,n1,n2,n3,n4,n5,add;
printf("\n enetr the five digit number");
scanf("%ld",&num);


n1=num%10;
num=num/10;

n2=num%10;
num=num/10;

n3=num%10;
num=num/10;

n4=num%10;
num=num/10;

n5=num%10;

add=n1+n2+n3+n4+n5;
printf("\n the addition is=%ld",add);
getch();
}
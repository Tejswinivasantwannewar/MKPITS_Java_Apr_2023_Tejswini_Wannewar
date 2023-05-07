//vowel and consonant
//no returntype and no argument

#include<stdio.h>
#include<conio.h>

void func()
{
char c;
int lowercase,uppercase;
printf("enter the charcter");
scanf("%c",&c);
lowercase=(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
uppercase=(c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
if(lowercase||uppercase)
{
printf("the entered character is vowel");
}
else
{
printf("\n the entered chracter is consonant");
}
}
void main()
{
func();
getch();
}
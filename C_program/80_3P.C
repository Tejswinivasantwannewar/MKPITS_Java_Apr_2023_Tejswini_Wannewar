//vowel and consonant
// no returntype and argument

#include<stdio.h>
#include<conio.h>
void  func(char c)
{
char lowercase,uppercase,chara;
lowercase=(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
uppercase=(c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
if(lowercase||uppercase)
{
printf("this is a vowel");
}
else
{
printf("this character is consonant");
}
}
void main()
{
char c1;
printf("enter the charcter");
scanf("%c",&c1);
func(c1);
getch();
}
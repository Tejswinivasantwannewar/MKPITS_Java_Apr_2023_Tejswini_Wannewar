//vowel and consonant
//returntype and no argument

#include<stdio.h>
#include<conio.h>
char func()
{
char lowercase,uppercase,chara,c;
printf("enter the charcter");
scanf("%c",&c);
lowercase=(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
uppercase=(c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
if(lowercase||uppercase)
{
printf("\n this is a vowel");
chara=lowercase;
chara=uppercase;
}
else
{
printf("this character is consonant");
}
return chara;
}

void main()
{
clrscr();
printf("%c",func());
getch();
}
//vowel and consonant
//returntype and argument

#include<stdio.h>


#include<conio.h>
char func(char c)
{
char lowercase,uppercase,chara;
lowercase=(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
uppercase=(c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
if(lowercase||uppercase)
{
printf("this is a vowel");
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
char c1;
printf("enter the charcter");
scanf("%c",&c1);
printf("%c",func(c1));
getch();
}
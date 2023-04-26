//AAAAA
//BBBBB
//CCCCC
//DDDDD

#include<stdio.h>
#include<conio.h>
void main()
{
int r;
char c;
clrscr();
for(r='A';r<='E';r++)
{
for(c=1;c<=5;c++)
{
printf("%c",r);
}
printf("\n");
}
getch();
}
//   ABCDE
//   ABCD
//   ABC
//   AB
//   A


#include<stdio.h>
#include<conio.h>
void main()
{
int r,c;
clrscr();
for(r='E';r>='A';r--)
{
for(c='A';c<=r;c++)
{
printf("%c",c);
}
printf("\n");
}
getch();
}
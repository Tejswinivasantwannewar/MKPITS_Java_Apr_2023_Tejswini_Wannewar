//A
//Ab
//ABC
//ABCD

#include<stdio.h>
#include<conio.h>
void main()
{
int r ,c;
char r1;
 clrscr();

for(r='A';r<='D';r++)
{
for(c='A';c<=r;c++)
{
printf("%c",c);
}
printf("\n");
}
getch();
}
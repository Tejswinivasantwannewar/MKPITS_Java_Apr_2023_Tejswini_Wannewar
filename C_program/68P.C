//        1
//      1   2
//     1  2   3




#include<stdio.h>
#include<conio.h>
void main()
{
int r,sp,str;
clrscr();
for(r=1;r<=3;r++)
{
for(sp=1;sp<=20-r;sp++)
{
printf(" ");
}
for(str=1;str<=r;str++)
{
printf(" %d",str);
}
printf("\n");
}
getch();
}
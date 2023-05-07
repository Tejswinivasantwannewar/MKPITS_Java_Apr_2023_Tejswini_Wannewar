//    A
//  B  B
// C  C  C

#include<stdio.h>
#include<conio.h>
void main()
{
int r,sp,str;
for(r=65;r<=67;r++)
{
for(sp=1;sp<=80-r;sp++)
{
printf(" ");
}
for(str='A';str<=r;str++)
{
printf(" %c",r);
}
printf("\n");
}
getch();
}
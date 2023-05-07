//     1
//    2 2
//   3 3 3
//  4 4 4 4




#include<stdio.h>
#include<conio.h>
void main()
{
int h,sp,str;
for(h=1;h<=4;h++)
{
for(sp=1;sp<=40-h;sp++)
{
printf(" ");
}
for(str=1;str<=h;str++)
{
printf(" %d",h);
}
printf("\n");
}
getch();
}
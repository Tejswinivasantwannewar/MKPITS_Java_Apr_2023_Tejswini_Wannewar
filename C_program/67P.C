//           1
//         3   3
//       5   5   5
//     7   7   7   7








   #include<stdio.h>
   #include<conio.h>
void main()
{
int r,sp,str;
clrscr();
for(r=1;r<=7;r++)
{
if(r%2==0)
{
r++;
}
for(sp=1;sp<=40-r;sp++)
{
printf(" ");
}
for(str=1;str<=r;str++)
{
printf(" %d",r);
}
printf("\n");
}
getch();
}




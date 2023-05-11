//*******
// *****
//  ***
//   *

   #include<stdio.h>
   #include<conio.h>
   void main()
   {
   char r,sp,str;
   clrscr();

   for(r=7;r>=1;r--)
   {
   if(r%2==0)
   {
   r--;
   }

   for(sp=7;sp<=40-r;sp++)
   {
   printf(" ");
   }
   for(str=1;str<=r;str++)
   {
   printf(" *");
   }
   printf("\n");
   }
   getch();
   }
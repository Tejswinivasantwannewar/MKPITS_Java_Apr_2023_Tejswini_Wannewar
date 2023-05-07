
 //   EEEEE
 ///   DDDD
 //     CCC
 //      BB
 //       A





 #include<stdio.h>
   #include<conio.h>
   void main()
   {

   char r,sp,str;
   clrscr();

   for(r=69;r>=65;r--)
   {
   for(sp=1;sp<=70-r;sp++)
   {
   printf(" ");
   }
   for(str='A';str<=r;str++)
   {
   printf("%c",r);
   }
   printf("\n");
   }
   getch();
   }
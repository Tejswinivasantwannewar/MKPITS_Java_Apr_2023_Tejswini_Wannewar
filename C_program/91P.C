//      A
//    A B C
//  A B C D E
//A B C D E F G


   #include<stdio.h>
   #include<conio.h>
   void main()
   {
   char r,sp,str;
   clrscr();

   for(r=65;r<=71;r++)
   {
   if(r%2==0)
   {
   r++;
   }
   for(sp=1;sp<=78-r;sp++)
   {
   printf(" ");
   }
   for(str='A';str<=r;str++)
   {
   printf(" %c",str);
   }
   printf("\n");
   }
   getch();
   }
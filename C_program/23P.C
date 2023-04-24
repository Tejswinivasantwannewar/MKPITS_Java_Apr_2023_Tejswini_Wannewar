

//write a c program that reads
// 5 numbers and sum of all odd values between  them.
 //odd values are =1,3,5 ...so on

 #include<stdio.h>
 #include<conio.h>
 void main()
 {
   int n1,n2,n3,n4,n5,sum=0;

   printf("\n enter the values of each number");
   scanf("%d %d %d %d %d",&n1,&n2,&n3,&n4,&n5);
   if((n1%2)!=0)
   {
      printf("\n this value is odd");
      sum=sum+n1;
   }
     if ((n2%2)!=0)
     {
     sum=sum+n2;
     }
     if((n3%2)!=0)
     {

     sum=sum+n3;
     }

     if((n4%2)!=0)
     {

     sum=sum+n4;
     }
     if((n5%2)!=0)
     {

     sum=sum+n5;
     }
     printf("\n the sum=%d",sum);


      getch();
      }

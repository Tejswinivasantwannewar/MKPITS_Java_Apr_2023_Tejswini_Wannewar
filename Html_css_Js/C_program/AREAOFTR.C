   #include<stdio.h>
   #include<conio.h>

 void main()

{
	   int s1,s2,s3,perimeter;


   printf("enter the value of side to calculate the perimeter of triangle:");
   scanf("%d %d %d",&s1,&s2,&s3);

	 perimeter=s1+s2+s3;

printf("perimeter of triangle is=%d",perimeter);
getch();
}

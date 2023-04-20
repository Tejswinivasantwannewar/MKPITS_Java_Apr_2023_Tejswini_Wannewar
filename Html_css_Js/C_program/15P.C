//write a c program to calculate distance between two points.
//formula((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))
//square root of(x2-x1)suqare+(y2-y1)square

   #include<stdio.h>
   #include<conio.h>
   void main()
   {
   int x1,x2,y1,y2;
   float dist_points;
   printf("\n enter the value of x1,x2,y1,y2");
   scanf("%d %d %d %d ",&x1,&x2,&y1, &y2);
   dist_points=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
   printf("\n the distance between two points is=%.3f",dist_points);
   getch();
   }
//write c program to print the bhaskar's formula from the given three floating numbers/
//display the message if it is not possible to find the root.
//formula    root1= (-b+((b*b)-(4*a*c))) /  2*a
//           root2=  (-b-((b*b)-(4*a*c))) / 2*a

#include<stdio.h>
#include<conio.h>
#include<math.h>



void main()
{

   double a,b,c, root_part,root1,root2;
   printf("\n enter values of a,b,c");
   scanf("%lf %lf %lf",&a,&b,&c);

   root_part=(b*b)-(4*a*c);
   if(root_part>0&& a!=0)
   {

   root_part=sqrt(root_part);
   root1=(-b+root_part)/(2*a);
   printf("\n the root 1 value is=%lf",root1);

   root2=(-b-root_part)/(2*a);
   printf("\n the root2 value is =%lf",root2);
 }
 else
 {
 printf("\n impossible to find the roots");
 }


getch();

}

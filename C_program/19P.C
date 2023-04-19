//write a c program that accepts 4 integers p,q,r and s from the user .
//where r and s are positive and p is even. ( r&s>0,,,,p%2==0)
//if q is greater than r and s is greater than p.(q>r&s>p)
//and if the sum of r and s is greater than sum of p and q.  (r+s)>(p+q)
// print 'correct values',otherwise print "wrong values".

#include<stdio.h>
#include<conio.h>
void main()
{
   int p,q,r,s;
   printf("\n enter the values of p,q,r and s");
   scanf("%d %d %d %d ",&p,&q,&r,&s);

if(r>0 && s>0 && (p%2==0) && q>r && s>p && (r+s)>(p+q))
{
    printf("\n correct values");
}
else
    {
       printf("\n wrong values");
    }
getch();

}

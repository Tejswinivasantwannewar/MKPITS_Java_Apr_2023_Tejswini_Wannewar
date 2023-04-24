//write a c program that reads 5 numbers and counts the number of positive number and   nrgative numbers.

//n1,n2,n3,n4,n5

//count variable

#include<stdio.h>
#include<conio.h>
void main()
{
int n1,n2,n3,n4,n5,pno=0,nno=0;


printf("\n enter the values of n1,n2,n3,n4 and n5");
scanf("%d %d %d %d %d",&n1,&n2,&n3,&n4,&n5);
 {
if(n1>0)
  {
    pno++;
    }
	else if(n1<0)
    {
      nno++;
    }

	if (n2>0)
       {
	pno++;
	}
	  else if(n2<0)
	 {
	  nno++;
	 }

	     if(n3>0)
	       {
	       pno++;
	       }
	       else if(n3<0)
	       {
	       nno++;
	       }


	     if(n4>0)
	     {
	     pno++;
	     }
	     else if( n4<0)
	     {
	     nno++;
	     }

	  if (n5>0)
	  {
	  pno++;
	  }
	  else if(n5<0)
	  {
	  nno++;
	  }

}
printf("\n the positive numbers =%d",pno);
printf("\n the negative numbers=%d",nno);
getch();
}
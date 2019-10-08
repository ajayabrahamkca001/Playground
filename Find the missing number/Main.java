#include<stdio.h>
int main()
{
 int i,j,arr[30],size,t;
 scanf("%d",&size);
 for(i=1;i<size;i++)
  {
   scanf("%d",&arr[i]);
  }
 for(i=1;i<size;i++)
  {
   for(j=1;j<i;j++)
    {
      if(arr[j]>arr[j+1])
       {
         t=arr[j];
         arr[j]=arr[j+1];
         arr[j+1]=t;
        }
    }
  }
   for(i=2;i<size;i++)
    {
     if(arr[i-1]!=arr[i]-1)
       {
          printf("%d",arr[i]-1);
          break;
       }
  }
 return 0;
}
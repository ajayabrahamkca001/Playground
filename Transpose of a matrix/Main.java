#include<stdio.h>
int main()
{
 int a[20][20],trans[20][20],row,col;
  scanf("%d%d",&row,&col);
  for(int i=0;i<row;i++)
  {
    for(int j=0;j<col;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
   for(int i=0;i<row;i++)
  {
    for(int j=0;j<col;j++)
    {
      trans[j][i]=a[i][j];
    }
   }
   for(int i=0;i<col;i++)
  {
    for(int j=0;j<row;j++)
    {
      printf("%d ",trans[i][j]);
    }
     printf("\n");
   }
  
  
  return 0;
}
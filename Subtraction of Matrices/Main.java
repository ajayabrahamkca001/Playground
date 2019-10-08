#include<stdio.h>
int main()
{
  int a[20][20],b[20][20],row1,col1,diff[20][20];
  
  scanf("%d%d",&row1,&col1);

  for(int i=0;i<row1;i++)
  {
    for(int j=0;j<col1;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  for(int i=0;i<row1;i++)
  {
    for(int j=0;j<col1;j++)
    {
      scanf("%d",&b[i][j]);
    }
  }
  for(int i=0;i<row1;i++)
  {
    for(int j=0;j<col1;j++)
    {
      diff[i][j]=a[i][j]-b[i][j];
    }
  }
   for(int i=0;i<row1;i++)
  {
    for(int j=0;j<col1;j++)
    {
      printf("%d ",diff[i][j]);
    }printf("\n");
   }
	return 0;
}
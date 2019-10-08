#include<stdio.h>
int insertion_sort(int n,int arr[]);
int main()
{
int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0; i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  insertion_sort(n,arr);
	return 0;
}
int insertion_sort( int n , int arr[])
{
  for(int i=1; i<n/2; i++)
  {
    int temp=arr[i];
   int j=i-1;
    while(j>=0 && arr[j]>temp)
    {
      arr[j+1]=arr[j];
      j--;
    }
    arr[j+1]=temp;
  }
  for(int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    return 0;
}

#include<stdio.h>
int sub_array(int n, int arr[], int sum_arr[]);
int main()
{
    int n;
	scanf("%d",&n);
    int arr[n];
    for(int i = 0;i < n; i++)
    {
        scanf("%d", &arr[i]);   
    }
    int sum_arr[3 * n];
  sub_array(n, arr, sum_arr);
    return 0;
}    
int sub_array(int n, int arr[], int sum_arr[])
{
	for(int i = 0; i <= n - 1; i++)
        {
            int temp =  arr[i];
            for(int j = i+1; j <= n-1; j++)
            {       
                    if(arr[j]>temp)
                    printf("%d,%d\n", temp,arr[j]);
            }
        }
    return 0;
}
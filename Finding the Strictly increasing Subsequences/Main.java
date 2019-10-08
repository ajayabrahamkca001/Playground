#include<stdio.h>
int  sub_array(int n, int arr[], int sum_arr[]);
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
int  sub_array(int n, int arr[], int sum_arr[])
{
	for(int i = 0; i <= n - 1; i++)
    {
        int temp =  arr[i];
        int flag = 1;
        for(int j = i+1; j<=n-1;j++)
        {
            if(arr[j]>temp)
            {
                for(int k = i; k <= j; k++)
                {
                    if(arr[k]>arr[j])
                    flag = 0;
                }
                if(flag == 1)
                printf("%d,%d\n", temp, arr[j]);
            }
            flag = 1;
        }
    }
    return 0;
}
#include<stdio.h>
int main()
{
int arr_size;
scanf("%d",&arr_size);
int arr[arr_size];
 for(int index = 0; index <= arr_size - 1; index++)
        {
            scanf("%d",&arr[index]);
        }
        int max;
         if(arr[0] > arr[1])
        {
            max = arr[0];
        }
        else{
             max = arr[1];
        }
        for(int index = 2; index <= arr_size - 1; index++)
        {
            if(max < arr[index])
            {
                max = arr[index];
            }
        }
        printf("%d",max);
    return 0;
}
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
         int search_elem1;
        scanf("%d",&search_elem1);
        int search_elem2;
        scanf("%d",&search_elem2);
         int elem_1 = -1;
        int elem_2 = -1;
         for(int index = 0; index <= arr_size - 1; index++)
        {
            if(search_elem1 == arr[index])
            {
                elem_1= index;
            }
            if(search_elem2 == arr[index])
            {
                elem_2 = index;
            }
        }
        printf("%d\n",elem_1);
        printf("%d\n",elem_2);
    return 0;
}
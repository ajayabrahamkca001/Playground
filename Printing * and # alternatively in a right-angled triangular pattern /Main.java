#include<stdio.h>
int main(){
  int n;
 scanf("%d", &n);
 int temp = 0;
 for(int i = 1;i <= n;i++){
 for(int j = 1; j <=i; j++){
   if(temp == 0)
   {
   printf("*");
    temp = 1;
    }
 else{
  printf("#");
 temp = 0;
            }
        }
        printf("\n");
    }
}
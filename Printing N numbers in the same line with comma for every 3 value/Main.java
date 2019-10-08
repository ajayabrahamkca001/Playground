#include <stdio.h>
int main() {
	int n,m=1,temp,i;
  scanf("%d",&n);
  temp=3*m;      
  for(i=1; i <=n; i++)
        {
          printf("%d",i);
          if(i==temp)
          { printf(",");
              temp=temp+3;
          }
          } 
	return 0;
}
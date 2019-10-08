#include <stdio.h>
int main() {
	int n,sum=0,last,first,temp;
  scanf("%d",&n);
  temp=n;
  last=n%10;
  while(n >= 10)
  {
    n=n/10;
  }
  first=n;
  sum=first+last;
  printf("%d",sum);
	return 0;
}
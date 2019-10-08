#include <stdio.h>
#include <string.h>
 
int main()
{
   char str[100];
   int i = 0,j = 0, count[26] = { 0 };

   gets(str);
 int len=strlen(str);
 for(i=0;i<len;i++)
 {
      if (str[i] >= 'a' && str[i] <= 'z') {
          j= str[i] - 'a';
         count[j]++;
      }
     
      
   }

   
    
     for(i=0;i<26;i++)
     {
         if(count[i] != 0)
         {
             printf("%c%d ", i + 'a', count[i]);
             count[i]=0;
         }
     }


   return 0;
}
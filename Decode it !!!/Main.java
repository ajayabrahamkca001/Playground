#include<stdio.h>
int main()
{
    char str[50], ch;
    int i, key;
    
    scanf("%[^\n]s",str);
    scanf("%d",&key);			
    key=key%26;
   
    for(i = 0; str[i] != '\0';i++)		
    {
        ch = str[i];
        
        if(ch >= 'a' && ch <= 'z')			
        {
            ch = ch - key;
            if(ch < 'a')
            {
                ch = ch + 'z' - 'a' + 1;
            }
            
            str[i] = ch;
        }
       
        else if(ch >= 'A' && ch <= 'Z')		
        {
            ch = ch - key;
            
            if(ch < 'A')
            {
                ch = ch + 'Z' - 'A' + 1;
            }
            str[i] = ch;
        }
    }
   
    printf("%s", str);					
    
    return 0;
}
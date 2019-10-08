#include<stdio.h>
#include<string.h>
int main(){
    char str[100], t[26];
    scanf("%[^\n]s", str);
    int j = 0;
    for(int i = 0; str[i] != '\0'; i++){
        if((str[i] == 't' || 'T') && str[i + 1] == 'h' && str[i + 2] == 'e'){
            i = i + 3;
        }
        else{
            t[j] = str[i];
            j++;
        }
    }
    t[j] = '\0';
    printf("%s\n", t);
    return 0;
}
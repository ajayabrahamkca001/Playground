#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    scanf("%[^\n]s", str);
    char c;
    int repetitive;
    for(int i = 0; str[i] != '\0'; i++){
        repetitive = 0;
        for(int j = 0; str[j] != '\0'; j++){
            if(str[i] == str[j] && i != j){
                repetitive = 1;
                break;
            }
        }
        if(repetitive == 0){
            c = str[i];
            break;
        }
    }
    if(repetitive == 0){
        printf("%c", c);
    }
    else{
        printf("All the characters are repetitive");
    }
}
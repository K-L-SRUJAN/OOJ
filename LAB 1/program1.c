#include <stdio.h> 
int main(){ 
int a; 
printf("Enter the limit :"); 
scanf("%d",&a); 
int num; 
for(int i=0;i<a;i+=2){ 
if(i>a){ 
break; 
} 
printf("%d\n",i); 
} 
}

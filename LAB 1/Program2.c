#include <stdio.h> 
int main(){ 
int a; 
printf("Enter the limit :"); 
scanf("%d",&a); 
int num; 
for(int i=1;i<a;i+=2){ 
num=i*i; 
if(num>a){ 
break; 
} 
printf("%d\n",num); 
} 
}

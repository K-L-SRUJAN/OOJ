#include <stdio.h> 
int main() { 
int a,b=1; 
printf("Enter your number :"); 
scanf("%d",&a); 
if(a%2==0){ 
printf("\nnumber is even "); 
} 
else{ 
printf("\nNumber is odd "); 
} 
printf("\nnumber is : "); 
while (b<=a){ 
printf("\n%d",b); 
b++; 
} 
while (a<10){ 
printf("\n%d",a); 
if(a%2==0){ 
printf("even\n"); 
 
 
        } 
        else{ 
            printf("odd\n"); 
        } 
        a++; 
         
    } 
     
} 

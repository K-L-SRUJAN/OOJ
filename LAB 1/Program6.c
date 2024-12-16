#include <stdio.h> 
int main() { 
char operators; 
int num1, num2, numt; 
printf("Enter the operator (+, -, /, *): "); 
scanf(" %c", &operators);  // Use %c to read a character, and add a space before %c to consume 
newline 
printf("Enter number 1: "); 
scanf("%d", &num1);  // Correct address-of operator 
printf("Enter number 2: "); 
scanf("%d", &num2);  // Correct address-of operator 
switch (operators) { 
case '+': 
numt = num1 + num2; 
printf("\nResult: num1 + num2 :%d ", numt); 
break; 
case '-': 
numt = num1 - num2; 
printf("\nResult: num1 - num2 : %d", numt); 
break; 
case '*': 
numt = num1 * num2; 
printf("\nResult:  num1 * num2 : %d", numt); 
break; 
case '/': 
if (num2 != 0) { 
numt = num1 / num2; 
printf("\nResult:  num1 / num2 :%d ", numt); 
} else { 
printf("\nError: Division by zero is not allowed."); 
} 
break; 
default: 
printf("\nInvalid operator selection."); 
} 
return 0; 
}

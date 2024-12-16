import java.util.Scanner;
class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first numbers : ");
        double a=sc.nextInt();
        System.out.println("Enter the second numbers : ");
        double b=sc.nextInt();
        
        double c=a*b;
        System.out.println("The Product of  numbers : "+c);
    }
}
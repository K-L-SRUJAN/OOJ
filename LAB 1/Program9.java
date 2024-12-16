import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter the third number: ");
        double c = scanner.nextDouble();
        
        double dis=b*b-4*a*c;
        
        if (dis> 0) {
            double root1= ((-b)+Math.sqrt(dis))/2*a;
            double root2= ((-b)-Math.sqrt(dis))/2*a;
            System.out.println("Roots are : " + root2 + " and " + root1);
        } else if(dis==0){
            System.out.println("Entered number have one root");
        }
        else{
             System.out.println("Entered number have no roots");
        }

        scanner.close();
    }
}

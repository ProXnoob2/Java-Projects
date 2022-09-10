import java.util.Scanner;
public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an operation to perform");
        System.out.println("1. ADD");
        System.out.println("2. SUBTRACT");
        System.out.println("3. MULTIPLY");
        System.out.println("4. DIVIDE");

        int operation = sc.nextInt();

        if(operation == 1){
            System.out.print("Enter First Number: ");
            double a = sc.nextDouble();
            System.out.print("Enter Second Number: ");
            double b = sc.nextDouble();
            double result = a+b;
            System.out.println("Sum = " +result);

        }else if(operation == 2){
            System.out.print("Enter First Number: ");
            double a = sc.nextDouble();
            System.out.print("Enter Second Number: ");
            double b = sc.nextDouble();
            double result = a-b;
            System.out.println("Subtraction = " +result);

        }else if(operation == 3){
            System.out.print("Enter First Number: ");
            double a = sc.nextDouble();
            System.out.print("Enter Second Number: ");
            double b = sc.nextDouble();
            double result = a*b;
            System.out.println("Product = " +result);

        }else if(operation == 4){
            System.out.print("Enter First Number: ");
            double a = sc.nextDouble();
            System.out.print("Enter Second Number: ");
            double b = sc.nextDouble();
            double result = a/b;
            System.out.println("Quotient = " +result);

        }else{
            System.out.println("Invalid Entry");
        }
    }
}
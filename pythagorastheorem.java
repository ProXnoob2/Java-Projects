import java.sql.SQLNonTransientConnectionException;
import java.util.Scanner;
public class pythagorastheorem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to calculate");
        System.out.println("1. Hypotenuse");
        System.out.println("2. Base");
        System.out.println("3. Height");

        int operation = sc.nextInt();

        if(operation == 1){
            System.out.print("Enter Base: ");
            double base = sc.nextDouble();
            System.out.print("Enter Height: ");
            double height = sc.nextDouble();
            double hysqaured = (base*base)+(height*height);
            double hy = Math.sqrt(hysqaured);
            System.out.println("Hypotenuse = " +hy);

        }else if(operation == 2){
            System.out.print("Enter Hypotenuse: ");
            double hypotenuse = sc.nextDouble();
            System.out.print("Enter Height: ");
            double height = sc.nextDouble();
            double bsquared = (hypotenuse*hypotenuse)-(height*height);
            double b = Math.sqrt(bsquared);
            System.out.println("Base = " +b);

        }else if(operation == 3){
            System.out.print("Enter Hypotenuse: ");
            double hypotenuse = sc.nextDouble();
            System.out.print("Enter Base: ");
            double base = sc.nextDouble();
            double hsquared = (hypotenuse*hypotenuse)-(base*base);
            double h = Math.sqrt(hsquared);
            System.out.println("Height = " +h);
        }else{
            System.out.print("Invalid Entry");
        }
    }
}
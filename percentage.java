import java.util.Scanner;
public class percentage{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double v,tv,p=0;
        System.out.print("Enter Value: ");
        v = sc.nextDouble();
        System.out.print("Enter Total Value: ");
        tv = sc.nextDouble();
        p = v/tv*100;
        System.out.println("Percentage = "+p+"%");
    }
}
import java.util.Scanner;
public class swapper{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.println("Input a = " +a +", b = " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Output a = " +a +", b = " +b);
    }
}
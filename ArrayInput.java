import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int innums[] = new int[5];
        int i;
        System.out.println("Enter Any 5 Numbers: ");
        for (i=0; i<5; i++){
            innums[i] = sc.nextInt();
        }
        System.out.println("Entered Number Are: ");
        for (i=0; i<5; i++){
            System.out.println(innums[i]);
        }
    }
}
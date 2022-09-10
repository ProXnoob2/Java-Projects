public class stringswap {
    public static void main(String[] args) {
        String[] cars = {"BMW", "LAMBO", "BUGATI"};
        String[] bikes = {"HAYABUSA", "PULSAR", "HONDA"};
        int i;
        System.out.println("Before Swapping: ");
        System.out.println("Cars: ");
        for (i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
        System.out.println("\n");
        System.out.println("Bikes:  ");
        for (i=0; i<bikes.length; i++){
            System.out.println(bikes[i]);
        }
        System.out.println("\n");
        String[] temp = cars;
        cars = bikes;
        bikes = temp;
        System.out.println("After Swapping: ");
        System.out.println("Cars: ");
        for (i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
        System.out.println("\n");
        System.out.println("Bikes:  ");
        for (i=0; i<bikes.length; i++){
            System.out.println(bikes[i]);
        }
    }
}

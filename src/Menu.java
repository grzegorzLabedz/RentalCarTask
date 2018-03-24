import java.util.Scanner;

public class Menu {

    public static int mainScreen() {

        System.out.println("1. Add car.");
        System.out.println("2. Carslist.");
        System.out.println("3. Exit.");

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();

    }

    public static int carTypeScreen(){

        System.out.println("1. Family Car.");
        System.out.println("2. Bus.");
        System.out.println("3. Truck.");
        System.out.println("5. Offroad.");
        System.out.println("4. Back.");

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();

    }

}

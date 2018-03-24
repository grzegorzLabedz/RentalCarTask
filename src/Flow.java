import java.util.InputMismatchException;
import java.util.Scanner;

public class Flow {

    public static void start() {

        boolean exitFlag = false;
        do {
            System.out.println();
            System.out.println();
            int choice = Menu.mainScreen();

            switch (choice) {
                case 1:
                    typeCarFlow();
                    break;
                case 2:
                    CarRepositry.showCars();
                    break;
                case 3:
                    exitFlag = true;
                    break;
            }
        } while (!exitFlag);

        System.exit(0);
    }

    private static void typeCarFlow() {
        int choice = Menu.carTypeScreen();
        CarDataWrapper cdw;
        Scanner scanner = new Scanner(System.in);

        switch (choice) {
            case 1:
                cdw = readMainParameters();
                System.out.println("Seat numbers: ");
                int seats = scanner.nextInt();

                FamilyCar fc = new FamilyCar(cdw, seats);
                break;
            case 2:
                cdw = readMainParameters();
                System.out.print("Seat numbers: ");
                int seatsNumber = scanner.nextInt();
                System.out.print("Standig places: ");
                int  standingPlaces = scanner.nextInt();
                System.out.print("Length: ");
               double length = scanner.nextDouble();
                System.out.print("Height: ");
               double height = scanner.nextDouble();


               Bus b = new Bus(cdw, seatsNumber, standingPlaces, length, height);
                break;
        }

    }

    private static CarDataWrapper readMainParameters() {

        CarDataWrapper carDataWrapper = new CarDataWrapper();
        Scanner scanner = new Scanner(System.in);

            System.out.print("Brand: ");
            carDataWrapper.brand = scanner.nextLine();
            System.out.print("Model: ");
            carDataWrapper.model = scanner.nextLine();
            System.out.print("Color: ");
            carDataWrapper.color = scanner.nextLine();
            carDataWrapper.rentPrice = ourScanner("Rent price: ");
            carDataWrapper.power = ourScanner("Power: ");
            carDataWrapper.engineCapasity = ourScanner("Engine capasity: ");
            System.out.print("Fuel consumption: ");
            carDataWrapper.fuelConsumtion = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Registration number: ");
            carDataWrapper.registrationNumber = scanner.nextLine();


            return carDataWrapper;
        }

        public static int ourScanner(String parameterName){
          int result = 0;
           while(true) {
               try {
                   Scanner scanner = new Scanner(System.in);
                   System.out.print(parameterName + ": ");
                   result = scanner.nextInt();
               } catch (InputMismatchException e) {
                   System.out.println(e.getCause());
                   System.out.println("Zepsuło się!");
                   continue;
               }
               break;
           }
           return result;

    }
}

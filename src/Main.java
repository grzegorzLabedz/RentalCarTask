public class Main {

    public static void main(String[] args) {

        FamilyCar familyCar = new FamilyCar("BMW", "M3", "red", 150, 2000,
                5, 10, "111111");

        CarRepositry.carsList.add(familyCar);

        Flow.start();

        // jest błąd przy dodawaniu nowego Busa,

    }

}

public class Bus extends Car{

    private int seatsNumber, standingPlaces;
    private double length, height;

    public Bus(String brand, String model, String color, int power, int engineCapasity, double fuelConsumtion, String registrationNumber, int seatsNumber, int standingPlaces, double length, double height) {
        super(brand, model, color, power, engineCapasity, fuelConsumtion, registrationNumber);
        this.seatsNumber = seatsNumber;
        this.standingPlaces = standingPlaces;
        this.length = length;
        this.height = height;

    }

    public Bus(CarDataWrapper carDataWrapper, int seatsNumber, int standingPlaces, double length, double height) {
        super(carDataWrapper);
        createMainBusParametrs (seatsNumber, standingPlaces, length, height);
    }

    private void createMainBusParametrs (int seatsNumber, int standingPlaces, double length, double height){
            this.seatsNumber = seatsNumber;
            this.standingPlaces = standingPlaces;
            this.length = length;
            this.height = height;
        }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public int getStandingPlaces() {
        return standingPlaces;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Bus " + super.toString() +
                ", seatsNumber=" + seatsNumber +
                ", standingPlaces=" + standingPlaces +
                ", length=" + length +
                ", height=" + height;
    }
}

public class FamilyCar extends Car {

    private int seatsNumber;

    public FamilyCar(String brand, String model, String color,int rentPrice, int power, int engineCapasity, int seatsNumber, double fuelConsumtion, String registrationNumber) {
        super(brand, model, color, rentPrice, power, engineCapasity, fuelConsumtion, registrationNumber);

        this.seatsNumber = seatsNumber;
    }
    public FamilyCar(CarDataWrapper carDataWrapper, int seatsNumber ){
        super(carDataWrapper);

        this.seatsNumber = seatsNumber;
    }



    public int getSeatsNumber() {
        return seatsNumber;
    }

    @Override
    public String toString() {
        return "FamilyCar " + super.toString() +
                ", seatsNumber=" + seatsNumber;
    }
}

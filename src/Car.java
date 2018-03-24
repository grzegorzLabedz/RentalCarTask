public class Car {

    private String brand;
    private String model;
    private String color;
    private int rentPrice;
    private int power;
    private int engineCapasity;
    private double fuelConsumtion;
    private String registrationNumber;

    public Car(String brand, String model, String color, int rentPrice, int power, int engineCapasity, double fuelConsumtion, String registrationNumber) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.rentPrice = rentPrice;
        this.power = power;
        this.engineCapasity = engineCapasity;
        this.fuelConsumtion = fuelConsumtion;
        this.registrationNumber = registrationNumber;

        CarRepositry.carsList.add(this);
    }

    public Car(CarDataWrapper carDataWrapper ){
        carDataWrapper.brand = brand;
        carDataWrapper.model = model;
        carDataWrapper.color = color;
        carDataWrapper.power = power;
        carDataWrapper.engineCapasity = engineCapasity;
        carDataWrapper.fuelConsumtion = fuelConsumtion;
        carDataWrapper.registrationNumber = registrationNumber;
        carDataWrapper.rentPrice = rentPrice;
        CarRepositry.carsList.add(this);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public int getPower() {
        return power;
    }

    public int getEngineCapasity() {
        return engineCapasity;
    }

    public double getFuelConsumtion() {
        return fuelConsumtion;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public void setFuelConsumtion(double fuelConsumtion) {
        this.fuelConsumtion = fuelConsumtion;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {

        return "brand=" + brand +
                ", model=" + model +
                ", color=" + color +
                ", rentPrice=" + rentPrice +
                ", power=" + power +
                ", engineCapasity=" + engineCapasity +
                ", fuelConsumtion=" + fuelConsumtion +
                ", registrationNumber=" + registrationNumber;
    }

}

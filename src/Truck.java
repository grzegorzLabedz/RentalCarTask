public class Truck extends Car {

    private int maxCarWeight, axlesNumber;
    private double height;
    private boolean trailer;

    public Truck(String brand, String model, String color, int power, int engineCapasity, double fuelConsumtion, String registrationNumber,
                 int maxCarWeight, int axlesNumber, double height, boolean trailer) {
        super(brand, model, color, power, engineCapasity, fuelConsumtion, registrationNumber);
        this.maxCarWeight = maxCarWeight;
        this.axlesNumber = axlesNumber;
        this.height = height;
        this.trailer = trailer;
    }

    public int getMaxCarWeight() {
        return maxCarWeight;
    }

    public int getAxlesNumber() {
        return axlesNumber;
    }

    public double getHeight() {
        return height;
    }

    public boolean isTrailer() {
        return trailer;
    }

    public void setAxlesNumber(int axlesNumber) {
        this.axlesNumber = axlesNumber;
    }

    @Override
    public String toString() {
        return "Truck " + super.toString() +
                ", maxCarWeight=" + maxCarWeight +
                ", axlesNumber=" + axlesNumber +
                ", height=" + height +
                ", trailer=" + trailer;
    }
}

public class Offroad extends Car {

    private boolean reductor, x4drive, spareWheel;

    public Offroad(String brand, String model, String color, int power, int engineCapasity, double fuelConsumtion, String registrationNumber, boolean reductor, boolean x4drive, boolean spareWheel) {
        super(brand, model, color, power, engineCapasity, fuelConsumtion, registrationNumber);
        this.reductor = reductor;
        this.x4drive = x4drive;
        this.spareWheel = spareWheel;
    }

    public boolean isReductor() {
        return reductor;
    }

    public boolean isX4drive() {
        return x4drive;
    }

    public boolean isSpareWheel() {
        return spareWheel;
    }

    @Override
    public String toString() {
        return "Offroad " + super.toString() +
                ", reductor=" + reductor +
                ", x4drive=" + x4drive +
                ", spareWheel=" + spareWheel;
    }
}

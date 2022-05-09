public class Car extends Vehicle {
    public Car(String brand, String model, double price, String plate) {
        super(brand, model, price, plate);
    }

    public Car() {
    }

    @Override
    public String toString() {
        return addRent(super.toString());
    }
}

package pl.camp.it.car.rent.model;

public class Car extends Vehicle {
    public Car(String brand, String model, double price, String plate) {
        super(brand, model, price, plate);
    }

    public Car() {
        super();
    }

    @Override
    public String toString() {
        return addRent(super.toString());
    }

    @Override
    public String convertToFileFormat() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Car")
                .append(";")
                .append(super.convertToFileFormat());
        return stringBuilder.toString();
    }
}

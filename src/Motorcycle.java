public class Motorcycle {
    private String brand;
    private String model;
    private double price;
    private String plate;
    private boolean rent;
    private int capacity;
    private int wheels;

    public Motorcycle(String brand, String model, double price, String plate, int capacity, int wheels) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.plate = plate;
        this.rent = false;
        this.capacity = capacity;
        this.wheels = wheels;
    }

    public Motorcycle() {
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWheels() {
        return wheels;
    }
}

public class Bus {
    private String brand;
    private String model;
    private double price;
    private String plate;
    private boolean rent;
    private int seats;

    public Bus(String brand, String model, double price, String plate, int seats) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.plate = plate;
        this.rent = false;
        this.seats = seats;
    }

    public Bus() {
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

    public int getSeats() {
        return seats;
    }
}

public class Vehicle {
    private String brand;
    private String model;
    private double price;
    private String plate;
    private boolean rent;

    public Vehicle(String brand, String model, double price, String plate) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.plate = plate;
        this.rent = false;
    }

    public Vehicle() {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getBrand())
                .append(" ")
                .append(this.getModel())
                .append(" Cena: ")
                .append(this.getPrice())
                .append(" Numer rejestracyjny: ")
                .append(this.getPlate());

        return sb.toString();
    }

    public String addRent(String x) {
        if (this.isRent()) {
            return x + " Zajety : Tak";
        } else {
            return x + " Zajety : Nie";
        }
    }
}

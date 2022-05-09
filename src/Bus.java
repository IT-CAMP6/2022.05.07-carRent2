public class Bus extends Vehicle {
    private int seats;

    public Bus(String brand, String model, double price, String plate, int seats) {
        super(brand, model, price, plate);
        this.seats = seats;
    }

    public Bus() {
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(" Ilosc miejsc: ")
                .append(this.seats);

        return addRent(sb.toString());
    }
}

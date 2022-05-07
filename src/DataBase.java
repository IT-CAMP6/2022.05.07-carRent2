public class DataBase {
    private Car[] cars = new Car[4];
    private Bus[] buses = new Bus[2];
    private Motorcycle[] motorcycles = new Motorcycle[2];

    private static final DataBase instance = new DataBase();

    private DataBase() {
        this.cars[0] = new Car("BMW", "3", 500.00, "KR11");
        this.cars[1] = new Car("Audi", "A3", 400.00, "KR22");
        this.cars[2] = new Car("Toyota", "Corolla", 300.00, "KR33");
        this.cars[3] = new Car("Kia", "Ceed", 200.00, "KR44");

        this.buses[0] = new Bus("Mercedes", "E-1000", 900.00, "KB11", 50);
        this.buses[1] = new Bus("Solaris", "Electric", 1100.00, "KB22", 45);

        this.motorcycles[0] = new Motorcycle("Suzuki", "1000", 700.00, "KM11", 500, 2);
        this.motorcycles[1] = new Motorcycle("BMW", "E2000", 800.00, "KM22", 600, 3);
    }

    public boolean rentVehicle(String plate) {
        for (Car car : this.cars) {
            if (car.getPlate().equals(plate)) {
                if (!car.isRent()) {
                    car.setRent(true);
                    return true;
                } else {
                    return false;
                }
            }
        }

        for (Bus bus : this.buses) {
            if (bus.getPlate().equals(plate)) {
                if (!bus.isRent()) {
                    bus.setRent(true);
                    return true;
                } else {
                    return false;
                }
            }
        }

        for (Motorcycle motorcycle : this.motorcycles) {
            if (motorcycle.getPlate().equals(plate)) {
                if (!motorcycle.isRent()) {
                    motorcycle.setRent(true);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public Car[] getCars() {
        return this.cars;
    }

    public Bus[] getBuses() {
        return this.buses;
    }

    public Motorcycle[] getMotorcycles() {
        return this.motorcycles;
    }

    public static DataBase getInstance() {
        return instance;
    }
}

public class DataBase {
    private final Vehicle[] vehicles = new Vehicle[8];

    private static final DataBase instance = new DataBase();

    private DataBase() {
        this.vehicles[0] = new Car("BMW", "3", 500.00, "KR11");
        this.vehicles[1] = new Car("Audi", "A3", 400.00, "KR22");
        this.vehicles[2] = new Car("Toyota", "Corolla", 300.00, "KR33");
        this.vehicles[3] = new Car("Kia", "Ceed", 200.00, "KR44");

        this.vehicles[4] = new Bus("Mercedes", "E-1000", 900.00, "KB11", 50);
        this.vehicles[5] = new Bus("Solaris", "Electric", 1100.00, "KB22", 45);

        this.vehicles[6] = new Motorcycle("Suzuki", "1000", 700.00, "KM11", 500, 2);
        this.vehicles[7] = new Motorcycle("BMW", "E2000", 800.00, "KM22", 600, 3);
    }

    public boolean rentVehicle(String plate) {
        for (Vehicle vehicle : this.vehicles) {
            if (vehicle.getPlate().equals(plate)) {
                if (!vehicle.isRent()) {
                    vehicle.setRent(true);
                    return true;
                } else {
                    return false;
                }
            }
        }

        return false;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public static DataBase getInstance() {
        return instance;
    }
}

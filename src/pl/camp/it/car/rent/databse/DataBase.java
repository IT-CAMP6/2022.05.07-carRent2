package pl.camp.it.car.rent.databse;

import pl.camp.it.car.rent.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
    private final List<Vehicle> vehicles = new ArrayList<>();
    private final Map<String, User> users = new HashMap<>();

    private static final DataBase instance = new DataBase();

    private DataBase() {
        this.vehicles.add(new Car("BMW", "3", 500.00, "KR11"));
        this.vehicles.add(new Car("Audi", "A3", 400.00, "KR22"));
        this.vehicles.add(new Car("Toyota", "Corolla", 300.00, "KR33"));
        this.vehicles.add(new Car("Kia", "Ceed", 200.00, "KR44"));

        this.vehicles.add(new Bus("Mercedes", "E-1000", 900.00, "KB11", 50));
        this.vehicles.add(new Bus("Solaris", "Electric", 1100.00, "KB22", 45));

        this.vehicles.add(new Motorcycle("Suzuki", "1000", 700.00, "KM11", 500, 2));
        this.vehicles.add(new Motorcycle("BMW", "E2000", 800.00, "KM22", 600, 3));

        this.users.put("admin", new User("admin", "admin"));
        this.users.put("janusz", new User("janusz", "janusz123"));
        this.users.put("tomasz", new User("tomasz", "tajnehaslo098"));
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

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public User getUserByLogin(String login) {
        return this.users.get(login);
    }

    public static DataBase getInstance() {
        return instance;
    }
}

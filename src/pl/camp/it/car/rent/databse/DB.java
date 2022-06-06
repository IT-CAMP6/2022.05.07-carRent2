package pl.camp.it.car.rent.databse;

import pl.camp.it.car.rent.model.User;
import pl.camp.it.car.rent.model.Vehicle;

import java.util.List;

public interface DB {
    boolean rentVehicle(String plate);
    List<Vehicle> getVehicles();
    void addVehicle(Vehicle vehicle);
    User getUserByLogin(String login);
    void save();
}

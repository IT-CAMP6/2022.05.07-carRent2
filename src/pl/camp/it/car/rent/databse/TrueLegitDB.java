package pl.camp.it.car.rent.databse;

import pl.camp.it.car.rent.model.User;
import pl.camp.it.car.rent.model.Vehicle;

import java.util.List;

public class TrueLegitDB implements DB {
    @Override
    public boolean rentVehicle(String plate) {
        return false;
    }

    @Override
    public List<Vehicle> getVehicles() {
        return null;
    }

    @Override
    public void addVehicle(Vehicle vehicle) {

    }

    @Override
    public User getUserByLogin(String login) {
        return null;
    }

    @Override
    public void save() {

    }
}

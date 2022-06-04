package pl.camp.it.car.rent.databse;

import org.apache.commons.codec.digest.DigestUtils;
import pl.camp.it.car.rent.model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
    private final List<Vehicle> vehicles = new ArrayList<>();
    private final Map<String, User> users = new HashMap<>();

    public static final String seed = "8i6sadgfi6agsd76fgasi7d6gf7ias6gdfi76gasid76fjgcjhg";

    private static final DataBase instance = new DataBase();

    private DataBase() {
        /*this.vehicles.add(new Car("BMW", "3", 500.00, "KR11"));
        this.vehicles.add(new Car("Audi", "A3", 400.00, "KR22"));
        this.vehicles.add(new Car("Toyota", "Corolla", 300.00, "KR33"));
        this.vehicles.add(new Car("Kia", "Ceed", 200.00, "KR44"));

        this.vehicles.add(new Bus("Mercedes", "E-1000", 900.00, "KB11", 50));
        this.vehicles.add(new Bus("Solaris", "Electric", 1100.00, "KB22", 45));

        this.vehicles.add(new Motorcycle("Suzuki", "1000", 700.00, "KM11", 500, 2));
        this.vehicles.add(new Motorcycle("BMW", "E2000", 800.00, "KM22", 600, 3));

        this.users.put("admin", new User("admin", DigestUtils.md5Hex(seed + "admin")));
        this.users.put("janusz", new User("janusz", DigestUtils.md5Hex(seed + "janusz123")));
        this.users.put("tomasz", new User("tomasz", DigestUtils.md5Hex(seed + "tajnehaslo098")));*/
        try {
            BufferedReader br = new BufferedReader(new FileReader("baza.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] tab = line.split(";");
                Vehicle vehicle;
                switch (tab[0]) {
                    case "Car":
                        vehicle = new Car(tab[1], tab[2], Double.parseDouble(tab[3]), tab[4]);
                        vehicle.setRent(Boolean.parseBoolean(tab[5]));
                        this.vehicles.add(vehicle);
                        break;
                    case "Bus":
                        vehicle = new Bus(tab[1], tab[2], Double.parseDouble(tab[3]),
                                tab[4], Integer.parseInt(tab[6]));
                        vehicle.setRent(Boolean.parseBoolean(tab[5]));
                        this.vehicles.add(vehicle);
                        break;
                    case "Motorcycle":
                        vehicle = new Motorcycle(tab[1], tab[2],
                                Double.parseDouble(tab[3]), tab[4],
                                Integer.parseInt(tab[6]), Integer.parseInt(tab[7]));
                        vehicle.setRent(Boolean.parseBoolean(tab[5]));
                        this.vehicles.add(vehicle);
                        break;
                    case "User":
                        this.users.put(tab[1], new User(tab[1], tab[2]));
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    public void save() throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter("baza.txt"));
        for (Vehicle vehicle : this.vehicles) {
            writer.write(vehicle.convertToFileFormat());
            writer.newLine();
            //System.out.println(vehicle.convertToFileFormat());
        }

        for (User user : this.users.values()) {
            writer.write(user.convertToFileFormat());
            writer.newLine();
            //System.out.println(user.convertToFileFormat());
        }

        writer.close();
    }
}

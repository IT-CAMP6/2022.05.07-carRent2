package pl.camp.it.car.rent.gui;

import pl.camp.it.car.rent.Main;
import pl.camp.it.car.rent.databse.DataBase;
import pl.camp.it.car.rent.model.Vehicle;

public class GUI {
    public static void showMainMenu() {
        System.out.println("1. List vehicles");
        System.out.println("2. Rent vehicle");
        System.out.println("3. Exit");
        if(Main.isLoggedUserAdmin)
            System.out.println("4. Add vehicle");
    }
    public static void listVehicles() {
        for (Vehicle vehicle : DataBase.getInstance().getVehicles()) {
            System.out.println(vehicle.toString());
        }
    }

    public static  void showAddCarMenu() {
        System.out.println("Jaki pojazd chcesz stworzyc ??");
        System.out.println("1. Samochod");
        System.out.println("2. Motor");
        System.out.println("3. Autobus");
    }
}

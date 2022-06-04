package pl.camp.it.car.rent;

import org.apache.commons.codec.digest.DigestUtils;
import pl.camp.it.car.rent.databse.DataBase;
import pl.camp.it.car.rent.gui.GUI;
import pl.camp.it.car.rent.model.*;

import java.util.Scanner;

public class Main {
    public static boolean isLoggedUserAdmin = false;
    public static void main(String[] args) throws Exception {
        DataBase db = DataBase.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj login:");
        String login = scanner.nextLine();
        System.out.println("Podaj haslo:");
        String password = scanner.nextLine();

        User user = db.getUserByLogin(login);
        if(user == null || !user.getPassword().equals(DigestUtils.md5Hex(DataBase.seed + password))) {
            return;
        }
        Main.isLoggedUserAdmin = user.getLogin().equals("admin");

        while (true) {
            GUI.showMainMenu();
            switch (scanner.nextLine()) {
                case "1":
                    GUI.listVehicles();
                    break;
                case "2":
                    System.out.println("Podaj numer rejestracyjny: ");
                    if (db.rentVehicle(scanner.nextLine())) {
                        System.out.println("OK !!!");
                    } else {
                        System.out.println("Nie ma takiego pojazdu lub jest niedostepny !!");
                    }
                    break;
                case "3":
                    db.save();
                    System.exit(0);
                    break;
                case "4":
                    if(!Main.isLoggedUserAdmin) {
                        break;
                    }
                    GUI.showAddCarMenu();
                    String choose = scanner.nextLine();
                    Vehicle v = null;
                    switch (choose) {
                        case "1":
                            v = new Car();
                            break;
                        case "2":
                            v = new Motorcycle();
                            break;
                        case "3":
                            v = new Bus();
                            break;
                    }
                    db.addVehicle(v);
                    break;
                default:
                    break;
            }
        }
    }
}

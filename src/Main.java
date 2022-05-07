import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBase db = DataBase.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            GUI.showMainMenu();
            switch (scanner.nextLine()) {
                case "1":
                    GUI.listCars();
                    GUI.listBuses();
                    GUI.listMotorcycles();
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
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}

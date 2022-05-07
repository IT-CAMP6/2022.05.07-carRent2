public class GUI {
    public static void showMainMenu() {
        System.out.println("1. List vehicles");
        System.out.println("2. Rent vehicle");
        System.out.println("3. Exit");
    }

    public static void listCars() {
        for (Car car : DataBase.getInstance().getCars()) {
            System.out.print(car.getBrand() + " " +
                    car.getModel() + " Cena: " +
                    car.getPrice() + " Numer rejestracyjny: " +
                    car.getPlate() + " Zajety : ");

            if (car.isRent()) {
                System.out.println("Tak");
            } else {
                System.out.println("Nie");
            }
        }
    }

    public static void listBuses() {
        for (Bus bus : DataBase.getInstance().getBuses()) {
            System.out.print(bus.getBrand() + " " +
                    bus.getModel() + " Cena: " +
                    bus.getPrice() + " Numer rejestracyjny: " +
                    bus.getPlate() + " Ilosc miejsc: " +
                    bus.getSeats() + " Zajety : ");

            if (bus.isRent()) {
                System.out.println("Tak");
            } else {
                System.out.println("Nie");
            }
        }
    }

    public static void listMotorcycles() {
        for (Motorcycle motorcycle : DataBase.getInstance().getMotorcycles()) {
            System.out.print(motorcycle.getBrand() + " " +
                    motorcycle.getModel() + " Cena: " +
                    motorcycle.getPrice() + " Numer rejestracyjny: " +
                    motorcycle.getPlate() + " Pojemnosc: " +
                    motorcycle.getCapacity() + " Ilosc kol: " +
                    motorcycle.getWheels() + " Zajety : ");

            if (motorcycle.isRent()) {
                System.out.println("Tak");
            } else {
                System.out.println("Nie");
            }
        }
    }
}

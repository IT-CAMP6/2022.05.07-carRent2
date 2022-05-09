public class GUI {
    public static void showMainMenu() {
        System.out.println("1. List vehicles");
        System.out.println("2. Rent vehicle");
        System.out.println("3. Exit");
    }
    public static void listVehicles() {
        for (Vehicle vehicle : DataBase.getInstance().getVehicles()) {
            System.out.println(vehicle.toString());
        }
    }
}

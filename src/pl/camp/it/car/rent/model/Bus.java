package pl.camp.it.car.rent.model;

import java.util.Scanner;

public class Bus extends Vehicle {
    private int seats;

    public Bus(String brand, String model, double price, String plate, int seats) {
        super(brand, model, price, plate);
        this.seats = seats;
    }

    public Bus() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc siedzen:");
        this.seats = Integer.parseInt(scanner.nextLine());
        //this.seats = (Integer) "12";
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(" Ilosc miejsc: ")
                .append(this.seats);

        return addRent(sb.toString());
    }

    @Override
    public String convertToFileFormat() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bus")
                .append(";")
                .append(super.convertToFileFormat())
                .append(";")
                .append(this.seats);

        return stringBuilder.toString();
    }
}

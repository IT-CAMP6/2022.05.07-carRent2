package pl.camp.it.car.rent.model;

import java.util.Scanner;

public class Motorcycle extends Vehicle {
    private int capacity;
    private int wheels;

    public Motorcycle(String brand, String model, double price, String plate, int capacity, int wheels) {
        super(brand, model, price, plate);
        this.capacity = capacity;
        this.wheels = wheels;
    }

    public Motorcycle() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pojemnosc:");
        this.capacity = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj ilosc kol:");
        this.wheels = Integer.parseInt(scanner.nextLine());
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(" Pojemnosc: ")
                .append(this.capacity)
                .append(" Ilosc kol: ")
                .append(this.wheels);

        return addRent(sb.toString());
    }
}

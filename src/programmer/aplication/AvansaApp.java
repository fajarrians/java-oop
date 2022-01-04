package programmer.aplication;

import programmer.data.Avansa;
import programmer.data.Car;

public class AvansaApp {
    public static void main(String[] args) {
        Car car = new Avansa();
        System.out.println(car.getTier());
        car.drive();
    }
}

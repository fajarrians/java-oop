package programmer.aplication;

import programmer.data.City;
import programmer.data.Location;

public class LocationApp {
    public static void main(String[] args) {
//        var lokasi = new Location();   //ERROR
        var city = new City();
        city.nama = "Jakarta";

        System.out.println(city.nama);
    }
}

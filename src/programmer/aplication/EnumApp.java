package programmer.aplication;

import programmer.data.Customer;
import programmer.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("fajar");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name(); //mengubah enum ke string
        System.out.println(levelName);

        Level level = Level.valueOf("VIP"); //mengubah string ke enum
        System.out.println(level);

        System.out.println("Print level");
        for (var value : Level.values()){ // mengambil semua data enum
            System.out.println(value);
        }
    }
}

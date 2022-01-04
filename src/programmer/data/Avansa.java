package programmer.data;

public class Avansa implements Car, IsMaintenance {


    public void drive() {
        System.out.println("Avansa Drive");
    }

    public int getTier() {
        return 4;
    }


    public String getBrand() {
        return "Toyota";
    }


    public boolean isMaintenance() {
        return false;
    }
}

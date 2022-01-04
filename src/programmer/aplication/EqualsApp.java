package programmer.aplication;

public class EqualsApp {
    public static void main(String[] args) {
        String frist = "Fajar";
        frist = frist + " " + "Rian";
        System.out.println(frist);

        String second = "Fajar Rian";
        System.out.println(frist == second);
        System.out.println(frist.equals(second));

        String third = "Fajar Rian";

        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}

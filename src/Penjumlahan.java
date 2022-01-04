import java.util.Scanner;

public class Penjumlahan {
    public static void main(String[] args) {
        System.out.println("Tambah Tambahan");
        int numbers1, numbers2, total;

        Scanner scen = new Scanner(System.in);

        System.out.print("Masukkan Angka Pertama");
        numbers1 = scen.nextInt();
        System.out.print("Masukan Angka Kedua ");
        numbers2 = scen.nextInt();

        total = numbers1 + numbers2;
        System.out.println("totalnya adalah " + total);


    }
}

public class PersonApp {
    public static void main(String[] args) {
        var person = new Person("fajar","jateng");
        var person1 = new  Person("fsjsr"); //constructor overlosding
        person.nama = "fajar"; //jika memakai constructor ini tidak dipakai
//        person.nomor; ERORR karena object sudah final

        System.out.println(person.nama);
        System.out.println(person.nomor);
//        memanggil method
        person.seyHello("budi");

    }
}

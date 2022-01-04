class Person {
    String nama;
    String alamat;
    final Integer nomor = 010101;

//    membuat constructor
    Person(String pramNama, String pramAlamat){
        nama = pramNama;
        alamat = pramAlamat;
    }
//    constructor overloading
    Person(String pramNama){
        nama = pramNama;
//        this(pramNama, null); //pilihan ke dua

    }
    Person(){
//        this(null);
    }
//    membuat method
    void seyHello(String namamu){
        System.out.println("heloo " + namamu + "my name is " + nama);
    }
}

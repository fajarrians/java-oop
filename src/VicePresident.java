class VicePresident extends MAnager {

    VicePresident(String nama) {
        super(nama);
    }

    void seyHello(String paramNama){ //overriding di MAnagerApp
        System.out.println("hi " + nama + "myname is men" + paramNama);
    }
}

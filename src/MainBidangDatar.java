public class MainBidangDatar {
    public static void main(String[] args) {
        var P = new Persegi();
        P.setSisi(6);

        System.out.println("Luas Persginya adalah: " + P.Luas());
        nama("aku","xii");


    }
    public void Luas(BidangDatar x){
        x.Luas();
    }

    public static void nama(String parmNama, String paramKelas){
        System.out.println("Nama Pembuat adalah " + parmNama + "dari kelas " + paramKelas);
    }

    public static void nama(String parmNama){
        System.out.println("Nama Pembuat Adalah " + parmNama);
    }
}

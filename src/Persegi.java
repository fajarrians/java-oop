public class Persegi implements BidangDatar{

    private int sisi;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public int Luas() {
        return this.sisi * this.sisi;
    }
    @Override
    public int Keliling() {
        return 4 * this.sisi;
    }
}

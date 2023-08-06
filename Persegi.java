public class Persegi {
    private static Persegi instance;
    private double panjangSisi;

    private Persegi(double panjangSisi) {
        this.panjangSisi = panjangSisi;
    }

    public static Persegi getInstance(double panjangSisi) {
        if (instance == null) {
            instance = new Persegi(panjangSisi);
        }
        return instance;
    }

    public double getLuas() {
        return panjangSisi * panjangSisi;
    }
}
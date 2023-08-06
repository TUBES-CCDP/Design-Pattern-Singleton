public class Main {
    public static void main(String[] args) {
        Persegi persegi1 = Persegi.getInstance(5.0);
        Persegi persegi2 = Persegi.getInstance(10.0);

        System.out.println("Luas persegi1: " + persegi1.getLuas());
        System.out.println("Luas persegi2: " + persegi2.getLuas());
    }
}
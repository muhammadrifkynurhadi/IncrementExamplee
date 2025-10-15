public class SegitigaPhytagoras {
    public static void main(String[] args) {
        // Deklarasi variabel
        double a = 3;
        double b = 4;

        // Rumus Pythagoras: c = √(a² + b²)
        double c = Math.sqrt((a * a) + (b * b));

        // Tampilkan hasil
        System.out.println("=== Program Segitiga Pythagoras ===");
        System.out.println("Sisi a = " + a);
        System.out.println("Sisi b = " + b);
        System.out.println("Sisi miring c = " + c);
    }
}
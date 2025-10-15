public class PersamaanKuadrat {
    public static void main(String[] args) {
        // Deklarasi variabel
        int a = 2;
        int b = 3;
        int c = 1;
        int x = 5;

        // Rumus y = a*x^2 + b*x + c
        int y = a * (x * x) + b * x + c;

        // Tampilkan hasil
        System.out.println("=== Program Persamaan Kuadrat ===");
        System.out.println("Rumus: y = a*x^2 + b*x + c");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("x = " + x);
        System.out.println("Hasil y = " + y);
    }
}
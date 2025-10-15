public class Segitigaa {
    public static void main(String[] args) {
        // Deklarasi variabel
        double alas = 20;
        double tinggi = 25;
        double sisi1 = 20;
        double sisi2 = 25;
        double sisi3 = 30;

        // Rumus luas dan keliling
        double luas = (alas * tinggi) / 2;
        double keliling = sisi1 + sisi2 + sisi3;

        // Tampilkan hasil
        System.out.println("=== Program Menghitung Luas dan Keliling Segitiga ===");
        System.out.println("Alas      : " + alas);
        System.out.println("Tinggi    : " + tinggi);
        System.out.println("Sisi 1    : " + sisi1);
        System.out.println("Sisi 2    : " + sisi2);
        System.out.println("Sisi 3    : " + sisi3);
        System.out.println("Luas      : " + luas);
        System.out.println("Keliling  : " + keliling);
    }
}
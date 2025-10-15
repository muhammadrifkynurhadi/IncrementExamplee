public class operasiMatematika {
    public static void main(String[] args) {
        // Deklarasi variabel
        int a = 20;
        int b = 6;

        // Operasi dasar
        int tambah = a + b;
        int kurang = a - b;
        int kali = a * b;
        double bagi = (double) a / b; // dibagi dengan tipe double agar hasil desimal
        int modulus = a % b; // sisa bagi

        // Tampilkan hasil
        System.out.println("=== Operasi Matematika ===");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Penjumlahan (a + b) = " + tambah);
        System.out.println("Pengurangan (a - b) = " + kurang);
        System.out.println("Perkalian (a * b) = " + kali);
        System.out.println("Pembagian (a / b) = " + bagi);
        System.out.println("Modulus (a % b) = " + modulus);
    }
}
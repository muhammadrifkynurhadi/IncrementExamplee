public class MengubahString {
    public static void main(String[] args) {
        // Deklarasi variabel string
        String kalimat = "Saya belajar Java di NetBeans";

        // Ubah ke huruf besar
        String hurufBesar = kalimat.toUpperCase();

        // Ubah ke huruf kecil
        String hurufKecil = kalimat.toLowerCase();

        // Tampilkan hasil
        System.out.println("=== Program Ubah Huruf Besar & Kecil ===");
        System.out.println("Kalimat Asli   : " + kalimat);
        System.out.println("Huruf Besar    : " + hurufBesar);
        System.out.println("Huruf Kecil    : " + hurufKecil);
    }
}
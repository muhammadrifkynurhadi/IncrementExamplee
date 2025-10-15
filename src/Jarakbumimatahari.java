public class Jarakbumimatahari {
    public static void main(String[] args) {
        // Deklarasi variabel
        double jarakKm = 149_600_000; // 149,6 juta kilometer

        // Konversi ke meter (1 km = 1000 meter)
        double jarakMeter = jarakKm * 1000;

        // Tampilkan hasil
        System.out.println("=== Program Jarak Bumi ke Matahari ===");
        System.out.println("Jarak dalam Kilometer : " + jarakKm + " km");
        System.out.println("Jarak dalam Meter     : " + jarakMeter + " meter");
    }
}
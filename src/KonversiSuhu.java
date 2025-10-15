public class KonversiSuhu {
    public static void main(String[] args) {
        // Deklarasi variabel
        double celcius = 30; // contoh suhu dalam Celcius
        double fahrenheit;

        // Konversi Celcius ke Fahrenheit
        fahrenheit = (celcius * 9 / 5) + 32;

        // Konversi Fahrenheit ke Celcius (balikannya)
        double celciusDariFahrenheit = (fahrenheit - 32) * 5 / 9;

        // Tampilkan hasil
        System.out.println("=== Program Konversi Suhu ===");
        System.out.println("Suhu dalam Celcius     : " + celcius + "°C");
        System.out.println("Hasil ke Fahrenheit    : " + fahrenheit + "°F");
        System.out.println("Konversi balik ke Celcius : " + celciusDariFahrenheit + "°C");
    }
}

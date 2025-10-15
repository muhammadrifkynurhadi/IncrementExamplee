public class IncrementExample {
    public static void main(String[] args) {
        int angka = 5;
        System.out.println("Nilai awal  = " + angka);
        
        System.out.println("Setelah pre-increment (++angka): " + (++angka));
        
         System.out.println("Setelah post-increment (++angka): " + (angka++));
         System.out.println("Nilai akhir setelah post-increment: " + angka);
    }
}
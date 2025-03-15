import java.util.Scanner;

/* Program untuk membaca nilai x dan menjumlahkannya menggunakan while */
public class PrintXWhile {
    public static void main(String[] args) {
        // Kamus
        int Sum = 0;
        int x;
        Scanner masukan = new Scanner(System.in);

        // Program
        System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
        x = masukan.nextInt(); // First Element

        while (x != 999) { // Kondisi berhenti
            Sum += x; // Proses penjumlahan
            System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
            x = masukan.nextInt(); // Next Element
        }

        System.out.println("Hasil penjumlahan = " + Sum); // Terminasi
        
        masukan.close(); // Menutup Scanner untuk menghindari kebocoran sumber daya
    }
}

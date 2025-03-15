import java.util.Scanner;

/* Program untuk membaca nilai x dan menjumlahkannya menggunakan do-while */
public class PrintXRepeat {
    public static void main(String[] args) {
        // Kamus
        int Sum = 0;
        int x;
        Scanner masukan = new Scanner(System.in);

        // Program
        System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
        x = masukan.nextInt(); // First Element

        if (x == 999) {
            System.out.println("Kasus kosong");
        } else { 
            // Minimal ada satu data yang dijumlahkan
            do {
                Sum += x; // Proses penjumlahan
                System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
                x = masukan.nextInt(); // Next Element
            } while (x != 999); // Kondisi pengulangan

            System.out.println("Hasil penjumlahan = " + Sum);
        }

        masukan.close(); // Menutup Scanner untuk menghindari kebocoran sumber daya
    }
}

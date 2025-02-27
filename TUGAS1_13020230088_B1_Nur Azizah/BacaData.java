import java.util.Scanner;

public class BacaData {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in); // Deklarasi Scanner
        
        System.out.print("Contoh membaca dan menulis, ketik nilai integer: ");
        int a = masukan.nextInt(); // Membaca input integer
        
        System.out.println("Nilai yang dibaca: " + a); // Menampilkan output
        
        masukan.close(); // Menutup Scanner
    }
}

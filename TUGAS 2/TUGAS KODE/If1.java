import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        // Kamus 
        Scanner masukan = new Scanner(System.in);
        int a;

        // Program
        System.out.print("Contoh IF satu kasus \n"); 
        System.out.print("Ketikkan suatu nilai integer: "); 
        a = masukan.nextInt();

        if (a >= 0) {
            System.out.print("\nNilai a positif: " + a);
        }

        masukan.close(); // Menutup Scanner untuk mencegah kebocoran sumber daya
    }
}

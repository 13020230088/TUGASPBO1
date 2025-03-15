import java.util.Scanner;

/* Maksimum dua bilangan yang dibaca */
public class Max2 {
    public static void main(String[] args) {
        // Kamus
        int a, b;
        Scanner masukan = new Scanner(System.in);

        // Program
        System.out.println("Maksimum dua bilangan:");
        System.out.print("Ketikkan dua bilangan, pisahkan dengan RETURN: ");
        
        a = masukan.nextInt();
        b = masukan.nextInt();

        System.out.println("Kedua bilangan: a = " + a + ", b = " + b);
        
        if (a >= b) {
            System.out.println("Nilai maksimum adalah: " + a);
        } else {
            System.out.println("Nilai maksimum adalah: " + b);
        }

        masukan.close(); // Menutup Scanner untuk mencegah kebocoran sumber daya
    }
}

import java.util.Scanner;

/* Contoh program yang mengandung prosedur dan fungsi */
public class SubProgram {
    
    // Fungsi untuk mencari maksimum dua bilangan bulat
    public static int maxab(int a, int b) {
        return (a >= b) ? a : b;
    }
    
    // Prosedur untuk menukar dua bilangan bulat
    public static void tukar(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Maksimum dua bilangan");
        System.out.print("Ketikkan dua bilangan, pisahkan dengan ENTER: \n");
        
        int a = masukan.nextInt();
        int b = masukan.nextInt();
        
        System.out.println("Ke dua bilangan: a = " + a + " b = " + b);
        System.out.println("Maksimum = " + maxab(a, b));
        
        System.out.println("Tukar kedua bilangan...");
        
        int[] arr = {a, b};
        tukar(arr);
        
        System.out.println("Ke dua bilangan setelah tukar: a = " + arr[0] + " b = " + arr[1]);
        
        masukan.close();
    }
}

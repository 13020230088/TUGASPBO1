public class Oprator {
    public static void main(String[] args) {
        // Deklarasi variabel
        boolean Bool1, Bool2, TF;
        int i, j, hsl;
        double x, y, res;

        // Menampilkan pesan awal
        System.out.println("Silahkan baca teksnya dan lihat hasil dari berbagai operasi:");

        // Operasi Boolean
        Bool1 = true;
        Bool2 = false;

        System.out.println("\n=== Operasi Boolean ===");
        System.out.println("Bool1: " + Bool1);
        System.out.println("Bool2: " + Bool2);

        TF = Bool1 && Bool2; // Boolean AND
        System.out.println("Bool1 && Bool2: " + TF);

        TF = Bool1 || Bool2; // Boolean OR
        System.out.println("Bool1 || Bool2: " + TF);

        TF = !Bool1; // NOT
        System.out.println("!Bool1: " + TF);

        TF = Bool1 ^ Bool2; // XOR
        System.out.println("Bool1 ^ Bool2: " + TF);

        // Operasi numerik dengan integer
        i = 5;
        j = 2;

        System.out.println("\n=== Operasi Numerik (Integer) ===");
        System.out.println("i: " + i + ", j: " + j);

        hsl = i + j;
        System.out.println("i + j = " + hsl);

        hsl = i - j;
        System.out.println("i - j = " + hsl);

        hsl = i * j;
        System.out.println("i * j = " + hsl);

        hsl = i / j; // Pembagian bulat
        System.out.println("i / j = " + hsl);

        hsl = i % j; // Modulo
        System.out.println("i % j = " + hsl);

        // Operasi numerik dengan double
        x = 5.0;
        y = 2.0;

        System.out.println("\n=== Operasi Numerik (Double) ===");
        System.out.println("x: " + x + ", y: " + y);

        res = x + y;
        System.out.println("x + y = " + res);

        res = x - y;
        System.out.println("x - y = " + res);

        res = x * y;
        System.out.println("x * y = " + res);

        res = x / y;
        System.out.println("x / y = " + res);

        // Operasi relasional numerik dengan integer
        System.out.println("\n=== Operasi Relasional (Integer) ===");
        System.out.println("i == j: " + (i == j));
        System.out.println("i != j: " + (i != j));
        System.out.println("i < j: " + (i < j));
        System.out.println("i > j: " + (i > j));
        System.out.println("i <= j: " + (i <= j));
        System.out.println("i >= j: " + (i >= j));

        // Operasi relasional numerik dengan double
        System.out.println("\n=== Operasi Relasional (Double) ===");
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x <= y: " + (x <= y));
        System.out.println("x >= y: " + (x >= y));
    }
}
import java.util.Scanner;

public class Tugas206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal 3.");
        } else {
            int total = 0;

            // Perulangan untuk baris
            for (int i = 1; i <= n; i++) {
                // Perulangan untuk kolom
                for (int j = 1; j <= n; j++) {
                    int hasil = i * j;
                    System.out.print(hasil + "\t");
                    total += hasil;
                }
                System.out.println("Total seluruh hasil perkalian: " + total);
            }
            sc.close();
        }
    }
}

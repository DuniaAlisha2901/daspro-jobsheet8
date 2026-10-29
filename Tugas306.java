import java.util.Scanner;

public class Tugas306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1.");
            }
        } while (jumlahToko < 1);
        int totalSemuaBarang = 0;
        int barangTerbanyak = -1;
        int tokoTerbaik = 0;
        for (int i = 1; i <= jumlahToko; i++) {
            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan toko " + i + ": ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif.");
                }
            } while (jumlahPelanggan < 0);
            int totalBarangToko = 0;
            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahBarang;
                do {
                    System.out.print("Jumlah barang pelanggan " + j + ": ");
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif.");
                    }
                } while (jumlahBarang < 0);
                totalBarangToko = totalBarangToko + jumlahBarang;
            }
            System.out.println("Jumlah pelanggan toko " + i + ": " + jumlahPelanggan);
            System.out.println("Total barang toko " + i + ": " + totalBarangToko);
            totalSemuaBarang = totalSemuaBarang + totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbaik = i;
            }
        }
        System.out.println("\nTotal barang seluruh toko: " + totalSemuaBarang);
        System.out.println("Toko dengan barang terbanyak: Toko " + tokoTerbaik);
        System.out.println("Jumlah barang terbanyak: " + barangTerbanyak);
        sc.close();
    }
}

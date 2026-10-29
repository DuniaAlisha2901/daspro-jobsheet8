import java.util.Scanner;

public class NilaiKelompok06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai : ");
        int jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKelompok = 1; // penghitung outer loop
            double rataTertinggi = -1; // -1 agar kelompok pertama pasti tercatat
            int kelompokTerbaik = 0;

            // Outer loop untuk memproses setiap kelompok
            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("Kelompok " + nomorKelompok);
                double totalNilai = 0;
                // Loop untuk memasukkan nilai setiap penilai
                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    // Mengulang input jika nilai tidak valid
                    do {
                        System.out.print(" Nilai dari Penilai " + j + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println(" Nilai harus 0 - 100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                }
                // Menghitung rata - rata nilai kelompok
                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok + ": nilai rata - rata = " + rataNilai);
                // Menentukan kelompok dengan rata - rata tertinggi
                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                }
                nomorKelompok++;
            }
            // Menampilkan hasil akhir
            System.out.println("==============================");
            System.out.println("Kelompok terbaik    : " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi : " + rataTertinggi);
            sc.close();
        }
    }
}

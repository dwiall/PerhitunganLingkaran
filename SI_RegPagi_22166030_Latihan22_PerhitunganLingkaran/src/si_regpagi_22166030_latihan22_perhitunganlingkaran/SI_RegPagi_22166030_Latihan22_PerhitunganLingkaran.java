package si_regpagi_22166030_latihan22_perhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi
 * NIM      : 22166030
 * Deskripsi program : Pembuatan program perhitungan lingkaran yang inputannya berasal dari user. Dengan ketentuan, jika nilai diameter yang dimasukkan kurang dari sama dengan 0 atau bukan angka, maka harus mengisi ulang nilai diameter hingga sesuai.
 * Diameter digunakan untuk mendapatkan jari-jari, luas, dan keliling lingkaran.
 */
public class SI_RegPagi_22166030_Latihan22_PerhitunganLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Variabel
        final double phi = 3.14;
        double L, K, r, d;
        
        //Memberikan judul dan memasukkan nilai diameter lingkaran
        System.out.println("=======Perhitungan Lingkaran=======\n");
        do {
        System.out.print("Masukkan nilai diameter lingkaran = ");
        if (input.hasNextDouble()) {
                d = input.nextDouble();
                if (d <= 0) {
                    System.out.println("Nilai Diameter Tidak Sesuai");
                    System.out.println("\n");
                }
            } else {
                System.out.println("Nilai Diameter Tidak Sesuai");
                System.out.println("\n");
                input.next(); // Membersihkan input yang tidak valid
                d = -1; // Menandakan input tidak sesuai
            }
        } while (d <= 0);
        input.close();
        
        //Menghitung jari-jari, luas, dan keliling lingkaran
        r = d / 2;
        L = phi * r * r;
        K = 2 * d;
        
        //Mencetak hasil perhitungan lingkaran, dari jari-jari, luas, dan keliling lingkaran.
        System.out.println("\n=====Hasil Perhitungan Lingkaran=====\n");
        System.out.println("Jari-jari Lingkaran = " + r + "cm");
        System.out.println("Luas Lingkaran = " + L + "cm");
        System.out.println("Keliling Lingkaran = " + K + "cm");
    }
    
}
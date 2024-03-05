package praktikumsatu;

import java.util.*;

public class tempatnya {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        perpus perpustakaan = new perpus();

        do {
            String menu[] = { "\n=====[Perpustakaan]=====", "\n1. Teknologi",
                    "\n2. Filsafat",
                    "\n3. Sejarah", "\n4. Agama", "\n5. Psikologi", "\n6. Politik", "\n7. Fiksi",
                    "\n8. Tampilkan jumlah buku", "\n9. Keluar" };

            for (int i = 0; i < menu.length; i++) {
                System.out.print(menu[i]);

            }
            System.out.println();
            System.out.print("Masukkan pilihan anda = ");
            pilihan = input.nextInt();
            System.out.println();

            if (pilihan == 1) {
                System.out.println("Buku dalam kategori Teknologi:");
                perpus.nampilinbuku(perpustakaan.getTeknologi());
            } else if (pilihan == 2) {
                System.out.println("Buku dalam kategori Filsafat:");
                perpus.nampilinbuku(perpustakaan.getFilsafat());
            } else if (pilihan == 3) {
                System.out.println("Buku dalam kategori Sejarah:");
                perpus.nampilinbuku(perpustakaan.getSejarah());
            } else if (pilihan == 4) {
                System.out.println("Buku dalam kategori Agama:");
                perpus.nampilinbuku(perpustakaan.getAgama());
            } else if (pilihan == 5) {
                System.out.println("Buku dalam kategori Psikologi:");
                perpus.nampilinbuku(perpustakaan.getPsikologi());
            } else if (pilihan == 6) {
                System.out.println("Buku dalam kategori Politik:");
                perpus.nampilinbuku(perpustakaan.getPolitik());
            } else if (pilihan == 7) {
                System.out.println("Buku dalam kategori Fiksi:");
                perpus.nampilinbuku(perpustakaan.getFiksi());
            } else if (pilihan == 8) {
                System.out.println("Jumlah total buku: " + perpustakaan.hasiljumlah());
            } else if (pilihan != 9) {
                System.out.println("Pilihan tidak valid. Silakan pilih angka 1 hingga 9.");
            }
        } while (pilihan != 9);

        System.out.println("Terimakasih sudah menggunakan sistem ini");
        input.close();
    }

}

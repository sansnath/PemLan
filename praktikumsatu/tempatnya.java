package praktikumsatu;

import java.util.*;

public class tempatnya {
    // Samuel Nathanael Sitompul 235150407111034
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        perpus perpustakaan = new perpus();
        perpus perpustakaan2 = new perpus(perpustakaan);

        do {
            String menu[] = { "\n=====[Perpustakaan]=====", "\n1. Kategori Teknologi",
                    "\n2. Kategori Filsafat",
                    "\n3. Kategori Sejarah", "\n4. Kategori Agama", "\n5. Kategori Psikologi", "\n6. Kategori Politik",
                    "\n7. Kategori Fiksi",
                    "\n8. Tampilkan jumlah buku", "\n9. Jumlah kata sinopsi", "\n10. Cek Kesamaan Objek",
                    "\n11. Keluar" };

            for (int i = 0; i < menu.length; i++) {
                System.out.print(menu[i]);

            }
            System.out.println();
            System.out.print("Masukkan pilihan anda = ");
            pilihan = input.nextInt();
            System.out.println();

            if (pilihan == 1) {
                System.out.println("Buku dalam kategori Teknologi: \n");
                perpus.nampilinbuku(perpustakaan.getTeknologi());
                System.out.println("Hasil buku yang disalin: \n ");
                perpus.nampilinbuku(perpustakaan2.getTeknologi());
            } else if (pilihan == 2) {
                System.out.println("Buku dalam kategori Filsafat: \n");
                perpus.nampilinbuku(perpustakaan.getFilsafat());
                System.out.println("Hasil buku yang disalin: \n ");
                perpus.nampilinbuku(perpustakaan2.getFilsafat());
            } else if (pilihan == 3) {
                System.out.println("Buku dalam kategori Sejarah: \n");
                perpus.nampilinbuku(perpustakaan.getSejarah());
                System.out.println("Hasil buku yang disalin: \n ");
                perpus.nampilinbuku(perpustakaan2.getSejarah());
            } else if (pilihan == 4) {
                System.out.println("Buku dalam kategori Agama: \n");
                perpus.nampilinbuku(perpustakaan.getAgama());
                System.out.println("Hasil buku yang disalin: \n ");
                perpus.nampilinbuku(perpustakaan2.getAgama());
            } else if (pilihan == 5) {
                System.out.println("Buku dalam kategori Psikologi: \n");
                perpus.nampilinbuku(perpustakaan.getPsikologi());
                System.out.println("Hasil buku yang disalin: \n ");
                perpus.nampilinbuku(perpustakaan2.getPsikologi());
            } else if (pilihan == 6) {
                System.out.println("Buku dalam kategori Politik: \n");
                perpus.nampilinbuku(perpustakaan.getPolitik());
                System.out.println("Hasil buku yang disalin: \n ");
                perpus.nampilinbuku(perpustakaan2.getPolitik());
            } else if (pilihan == 7) {
                System.out.println("Buku dalam kategori Fiksi: \n");
                perpus.nampilinbuku(perpustakaan.getFiksi());
                System.out.println("Hasil buku yang disalin: \n ");
                perpus.nampilinbuku(perpustakaan2.getFiksi());
            } else if (pilihan == 8) {
                System.out.println("Jumlah total buku: \n " + perpustakaan.hasiljumlah());
                System.out.println("Jumlah total buku salinan:  " + perpustakaan2.hasiljumlah());
            } else if (pilihan == 9) {
                System.out.println("Pilih kategori buku untuk menghitung sinopsis:");
                System.out.println("1. Teknologi");
                System.out.println("2. Filsafat");
                System.out.println("3. Sejarah");
                System.out.println("4. Agama");
                System.out.println("5. Psikologi");
                System.out.println("6. Politik");
                System.out.println("7. Fiksi");
                System.out.print("Masukkan pilihan kategori: ");
                int kategori = input.nextInt();
                System.out.println();

                if (kategori >= 1 && kategori <= 7) {
                    String[][] bukuKategori = null;
                    String namaKategori = "";
                    switch (kategori) {
                        case 1:
                            bukuKategori = perpustakaan.getTeknologi();
                            namaKategori = "Teknologi";
                            break;
                        case 2:
                            bukuKategori = perpustakaan.getFilsafat();
                            namaKategori = "Filsafat";
                            break;
                        case 3:
                            bukuKategori = perpustakaan.getSejarah();
                            namaKategori = "Sejarah";
                            break;
                        case 4:
                            bukuKategori = perpustakaan.getAgama();
                            namaKategori = "Agama";
                            break;
                        case 5:
                            bukuKategori = perpustakaan.getPsikologi();
                            namaKategori = "Psikologi";
                            break;
                        case 6:
                            bukuKategori = perpustakaan.getPolitik();
                            namaKategori = "Politik";
                            break;
                        case 7:
                            bukuKategori = perpustakaan.getFiksi();
                            namaKategori = "Fiksi";
                            break;
                    }
                    if (bukuKategori != null) {
                        System.out.println("Jumlah kata sinopsis untuk kategori " + namaKategori + ":");
                        for (int i = 0; i < bukuKategori.length; i++) {
                            System.out.println("Judul: " + bukuKategori[i][0]);
                            int jumlahKata = perpustakaan.hitungJumlahKataSinopsisBuku(bukuKategori[i]);
                            System.out.println("Jumlah kata sinopsis: " + jumlahKata);
                            System.out.println();
                        }
                    }
                }
            } else if (pilihan == 10) {
                double persentaseKesamaan = perpustakaan.cekKesamaan(perpustakaan2);
                System.out.println("Persentase Kesamaan Objek:  " + persentaseKesamaan + " %");
            } else if (pilihan != 11) {
                System.out.println("Pilihan tidak valid. Silakan pilih angka 1 hingga 10");
            }
        } while (pilihan != 11);

        System.out.println("Terimakasih sudah menggunakan sistem ini");
        input.close();
    }
}

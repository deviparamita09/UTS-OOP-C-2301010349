
package film;

import java.util.Scanner;

/**
 *
 * @author devi paramita
 * tgl: 9 mei 2025
 */

public class AplikasiFilm {
    private final Film[] daftarFilm;
    private int jumlahFilm;

    // Konstruktor
    public AplikasiFilm(int kapasitas) {
        daftarFilm = new Film[kapasitas];
        jumlahFilm = 0;
    }

    // Method untuk menambah film
    public void tambahFilm(Film film) {
        if (jumlahFilm < daftarFilm.length) {
            daftarFilm[jumlahFilm] = film;
            jumlahFilm++;
            System.out.println("Data film telah ditambahkan.");  // Pesan setelah film ditambah
        } else {
            System.out.println("Array penuh, tidak bisa menambah film.");
        }
    }

    // Method untuk menampilkan film
    public void tampilkanFilm() {
        if (jumlahFilm == 0) {
            System.out.println("Tidak ada film untuk ditampilkan.");
            return;
        }
        for (int i = 0; i < jumlahFilm; i++) {
            System.out.println((i + 1) + ". " + daftarFilm[i].toString());
        }
    }

    // Method untuk memperbarui film
    public void ubahFilm(int indeks, Film filmBaru) {
        if (indeks >= 0 && indeks < jumlahFilm) {
            daftarFilm[indeks] = filmBaru;
            System.out.println("Film berhasil diperbarui.");  // Pesan setelah film diperbarui
        } else {
            System.out.println("Indeks film tidak valid.");
        }
    }

    // Method untuk menghapus film
    public void hapusFilm(int indeks) {
        if (indeks >= 0 && indeks < jumlahFilm) {
            for (int i = indeks; i < jumlahFilm - 1; i++) {
                daftarFilm[i] = daftarFilm[i + 1];
            }
            daftarFilm[jumlahFilm - 1] = null; // Menghapus elemen terakhir
            jumlahFilm--;
            System.out.println("Data film telah dihapus.");  // Pesan setelah film dihapus
        } else {
            System.out.println("Indeks film tidak valid.");
        }
    }

    // Menu untuk memilih tindakan
    public void tampilMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu Aplikasi Film:");
            System.out.println("1. Tambah Film");
            System.out.println("2. Tampilkan Film");
            System.out.println("3. Ubah Film");
            System.out.println("4. Hapus Film");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    // Input data film
                    System.out.print("Masukkan judul film: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan genre film: ");
                    String genre = scanner.nextLine();
                    System.out.print("Masukkan nama sutradara: ");
                    String sutradara = scanner.nextLine();
                    System.out.print("Masukkan tahun rilis: ");
                    int tahun = scanner.nextInt();
                    Film filmBaru = new Film(judul, genre, sutradara, tahun);
                    tambahFilm(filmBaru);
                    break;
                case 2:
                    tampilkanFilm();
                    break;
                case 3:
                    // Ubah film
                    System.out.print("Masukkan indeks film yang ingin diubah (1 - " + jumlahFilm + "): ");
                    int indeksUbah = scanner.nextInt() - 1;
                    scanner.nextLine(); // Clear buffer
                    if (indeksUbah >= 0 && indeksUbah < jumlahFilm) {
                        System.out.print("Masukkan judul film baru: ");
                        judul = scanner.nextLine();
                        System.out.print("Masukkan genre film baru: ");
                        genre = scanner.nextLine();
                        System.out.print("Masukkan sutradara film baru: ");
                        sutradara = scanner.nextLine();
                        System.out.print("Masukkan tahun rilis film baru: ");
                        tahun = scanner.nextInt();
                        Film filmUpdate = new Film(judul, genre, sutradara, tahun);
                        ubahFilm(indeksUbah, filmUpdate);
                    } else {
                        System.out.println("Indeks tidak valid.");
                    }
                    break;
                case 4:
                    // Hapus film
                    System.out.print("Masukkan indeks film yang ingin dihapus (1 - " + jumlahFilm + "): ");
                    int indeksHapus = scanner.nextInt() - 1;
                    hapusFilm(indeksHapus);
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void main(String[] args) {
        AplikasiFilm app = new AplikasiFilm(10); // Kapasitas array film 10
        app.tampilMenu();
}
}





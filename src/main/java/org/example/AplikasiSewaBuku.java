package org.example;

import java.util.Scanner;

/**
 * Kelas {@code Buku} merepresentasikan entitas buku dalam aplikasi sewa buku.
 */
class Buku {
    /**
     * Judul buku.
     */
    String judul;

    /**
     * Status ketersediaan buku.
     */
    boolean tersedia;

    /**
     * Konstruktor untuk membuat objek Buku dengan judul tertentu.
     *
     * @param judul Judul buku.
     */
    Buku(String judul) {
        this.judul = judul;
        this.tersedia = true;
    }
}

/**
 * Kelas {@code AplikasiSewaBuku} merupakan aplikasi sederhana untuk sewa dan pengembalian buku.
 */
public class AplikasiSewaBuku {
    /**
     * Metode utama yang akan dijalankan saat program dimulai.
     *
     * @param args Argumen baris perintah yang dapat digunakan (tidak digunakan dalam aplikasi ini).
     */
    public static void main(String[] args) {
        // Inisialisasi koleksi buku
        Buku buku1 = new Buku("Java Programming");
        Buku buku2 = new Buku("Python Basics");

        Buku[] koleksiBuku = {buku1, buku2};

        // Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Loop utama aplikasi
        while (true) {
            tampilkanMenu();
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanKoleksi(koleksiBuku);
                    break;
                case 2:
                    pinjamBuku(koleksiBuku, scanner);
                    break;
                case 3:
                    kembalikanBuku(koleksiBuku, scanner);
                    break;
                case 0:
                    System.out.println("Terima kasih! Keluar dari aplikasi.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }
        }
    }

    /**
     * Menampilkan menu utama aplikasi.
     */
    private static void tampilkanMenu() {
        System.out.println("=== Aplikasi Sewa Buku ===");
        System.out.println("1. Tampilkan Koleksi Buku");
        System.out.println("2. Pinjam Buku");
        System.out.println("3. Kembalikan Buku");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    /**
     * Menampilkan koleksi buku beserta status ketersediaannya.
     *
     * @param koleksiBuku Array buku yang akan ditampilkan.
     */
    private static void tampilkanKoleksi(Buku[] koleksiBuku) {
        System.out.println("Koleksi Buku:");
        for (Buku buku : koleksiBuku) {
            System.out.println(buku.judul + " - " + (buku.tersedia ? "Tersedia" : "Tidak Tersedia"));
        }
        System.out.println();
    }

    /**
     * Metode untuk melakukan pinjam buku dari koleksi.
     *
     * @param koleksiBuku Array buku yang tersedia untuk dipinjam.
     * @param scanner     Scanner untuk input pengguna.
     */
    private static void pinjamBuku(Buku[] koleksiBuku, Scanner scanner) {
        tampilkanKoleksi(koleksiBuku);
        System.out.print("Masukkan nomor buku yang ingin dipinjam: ");
        int nomorBuku = scanner.nextInt();

        if (nomorBuku >= 0 && nomorBuku < koleksiBuku.length) {
            if (koleksiBuku[nomorBuku].tersedia) {
                koleksiBuku[nomorBuku].tersedia = false;
                System.out.println("Anda berhasil meminjam buku " + koleksiBuku[nomorBuku].judul);
            } else {
                System.out.println("Maaf, buku tidak tersedia.");
            }
        } else {
            System.out.println("Nomor buku tidak valid.");
        }
        System.out.println();
    }

    /**
     * Metode untuk melakukan pengembalian buku ke koleksi.
     *
     * @param koleksiBuku Array buku yang dapat dikembalikan.
     * @param scanner     Scanner untuk input pengguna.
     */
    private static void kembalikanBuku(Buku[] koleksiBuku, Scanner scanner) {
        tampilkanKoleksi(koleksiBuku);
        System.out.print("Masukkan nomor buku yang ingin dikembalikan: ");
        int nomorBuku = scanner.nextInt();

        if (nomorBuku >= 0 && nomorBuku < koleksiBuku.length) {
            if (!koleksiBuku[nomorBuku].tersedia) {
                koleksiBuku[nomorBuku].tersedia = true;
                System.out.println("Anda berhasil mengembalikan buku " + koleksiBuku[nomorBuku].judul);
            } else {
                System.out.println("Maaf, buku belum dipinjam.");
            }
        } else {
            System.out.println("Nomor buku tidak valid.");
        }
        System.out.println();
    }
}



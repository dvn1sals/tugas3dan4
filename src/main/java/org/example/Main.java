package org.example;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Bambang", 20, "Informatika");

        // Menampilkan informasi awal mahasiswa
        System.out.println("Informasi Awal:");
        mahasiswa1.tampilkanInfo();

        // Merubah jurusan mahasiswa
        mahasiswa1.ubahJurusan("Sistem Informasi");

        // Menampilkan informasi setelah perubahan
        System.out.println("\nInformasi Setelah Perubahan:");
        mahasiswa1.tampilkanInfo();
    }
}

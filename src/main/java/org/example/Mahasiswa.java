package org.example;

public class Mahasiswa {
    // Atribut
    private String nama;
    private int umur;
    private String jurusan;

    // Konstruktor
    public Mahasiswa(String nama, int umur, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jurusan: " + jurusan);

    }

    // Metode untuk merubah jurusan mahasiswa
    public void ubahJurusan(String newJurusan) {
        this.jurusan = newJurusan;
        System.out.println("Jurusan berhasil diubah menjadi: " + jurusan);
    }
}


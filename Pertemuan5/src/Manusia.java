/* Nama File    : Manusia.java
 Deskripsi      : berisi atribut dan method dalam class Manusia
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 28 Maret 2026 
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Manusia{
    /*************ATRIBUT********************/
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    private static int counterMns =0;

    /*****************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter 
    public Manusia(){
        counterMns++;
    }

    //Konstruktor dengan Parameter
    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = konversiTanggal(tgl_mulai_kerja);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut nama
    public String getNama(){
        return nama;
    }

    //Mengembalikan nilai atribut tgl_mulai_kerja
    public LocalDate getTglMulaiKerja(){
        return tgl_mulai_kerja;
    }

    //Mengembalikan nilai atribut alamat
    public String getAlamat(){
        return alamat;
    }

    //Mengembalikan nilai atribut Pendapatan
    public double getPendapatan(){
        return pendapatan;
    }

    //Mengembalikan jumlah objek Manusia 
    public static int getCounterMns(){
        return counterMns;
    }

    /*============MUTATOR============*/
    //Mengubah nilai atribut nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //Mengubah nilai atribut tgl_mulai_kerja
    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    //Mengubah nilai atribut alamat
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    //Mengubah nilai atribut pendapatan
    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    /*==========Method Lainnya==========*/
    //menggunakan bentuk string ke LocalDate
    public static LocalDate konversiTanggal(String tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(tanggal, formatter);
    }

    //Method abstrak untuk menghitung masa kerja manusia
    public abstract int hitungMasaKerja();

    //Menampilkan semua info Manusia
    public void cetakInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: Rp" + String.format("%,.0f", pendapatan));
    }
 } //end class Manusia
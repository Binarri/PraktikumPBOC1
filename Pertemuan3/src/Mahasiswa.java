/* Nama File    : Mahasiswa.java
 Deskripsi      : berisi atribut dan method dalam class Mahasiswa
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 8 Maret 2026
  */

import java.util.ArrayList;

public class Mahasiswa {
    /*************ATRIBUT********************/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private static int countMahasiswa=0;

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Mahasiswa(){
        this.nim = " ";
        this.nama = " ";
        this.prodi = " ";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
        countMahasiswa++;
    }

    //Konstruktor dengan Parameter
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
        countMahasiswa++;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut NIM
    public String getNIM(){
        return nim;
    }

    //Mengembalikan nilai atribut Nama
    public String getNama(){
        return nama;
    }

    //Mengembalikan nilai atribut Prodi
    public String getProdi(){
        return prodi;
    }

    //Mengembalikan nilai atribut listMatkul
    public ArrayList<MataKuliah> getListMatkul(){
        return listMatkul;
    }

    //Mengembalikan nilai atribut dosenWali
    public Dosen getDosenWali(){
        return dosenWali;
    }

    //Mengembalikan nilai atribut kendaraan
    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    //Mengembalikan nilai countMahasiswa
    public static int getCountMahasiswa(){
        return countMahasiswa;
    }

    /*============MUTATOR============*/
    //Mengubah nilai NIM
    public void setNIM(String nim){
        this.nim = nim;
    }

    //Mengubah nilai atribut Nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //Mengubah nilai atribut Prodi
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    //Mengubah nilai atribut listMatkul
    public void setListMatkul(ArrayList<MataKuliah> listMatkul){
        this.listMatkul = listMatkul;
    }

    //Mengubah nilai atribut dosenWali
    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    //Mengubah nilai atribut kendaraan
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }


    /*============Method Lainnya============*/
    //Menambahkan sebuah mata kuliah ke atribut listMatkul
    public void addMatkul(MataKuliah newMatKul){
        listMatkul.add(newMatKul);
    }

    //Mendapatkan jumlah SKS mata kuliah yang diambil mahasiswa
    public int getJumlahSKS(){
        int jumlahSKS=0;
        for(int i=0; i<listMatkul.size(); i++){
            jumlahSKS += listMatkul.get(i).getSKS();
        }
        return jumlahSKS;
    }

    // Mendapatkan jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    //Menampilkan nim, nama, prodi mahasiswa
    public void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    //Menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, data kendaraan yang dimiliki mahasiswa
    public void printDetailMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for(i=0; i<listMatkul.size(); i++){
            System.out.println("ID Matkul: " + listMatkul.get(i).getIdMatkul());
            System.out.println("Nama Matkul: " + listMatkul.get(i).getNama());
            System.out.println("SKS: " + listMatkul.get(i).getSKS());
        }
        System.out.println("NIP Dosen Wali: " + dosenWali.getNip());
        System.out.println("Nama Dosen Wali: " + dosenWali.getNama());
        System.out.println("Prodi Dosen Wali: " + dosenWali.getProdi());
        System.out.println("Kendaraan: " + kendaraan.getNoPlat());
        System.out.println("Jenis Kendaraan: " + kendaraan.getJenis());
    }
} //end of class Mahasiswa


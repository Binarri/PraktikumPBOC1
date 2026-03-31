/* Nama File    : MataKuliah.java
 Deskripsi      : berisi atribut dan method dalam class Mata Kuliah
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 8 Maret 2026
  */

public class MataKuliah {
    /*************ATRIBUT********************/
    private String idMatkul;
    private String nama;
    private int sks;
    private static int countMataKuliah=0;

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public MataKuliah(){
        this.idMatkul = " ";
        this.nama = " ";
        this.sks = 0;
        countMataKuliah++;
    }

    //Konstruktor dengan Parameter
    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
        countMataKuliah++;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut Id Matkul
    public String getIdMatkul(){
        return idMatkul;
    }

    //Mengembalikan nilai atribut Nama
    public String getNama(){
        return nama;
    }

    //Mengembalikan nilai atribut SKS
    public int getSKS(){
        return sks;
    }

    //Mengembalikan nilai countMataKuliah
    public static int getCountMataKuliah(){
        return countMataKuliah;
    }
   
    /*============MUTATOR============*/
    //Mengubah nilai Id Matkul
    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    //Mengubah nilai atribut Nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //Mengubah nilai atribut SKS
    public void setSKS(int sks){
        this.sks = sks;
    }

    /*============Method Lainnya============*/
    //Menampilkan data Mata kuliah
    public void printMataKuliah(){
        System.out.println("Id Matkul: " + idMatkul);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
    }
} //end of class MataKuliah

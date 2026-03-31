/* Nama File    : Dosen.java
 Deskripsi      : berisi atribut dan method dalam class Dosen
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 8 Maret 2026
  */

public class Dosen {
    /*************ATRIBUT********************/
    private String nip;
    private String nama;
    private String prodi;
    private static int countDosen=0;

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Dosen(){
        this.nip = " ";
        this.nama = " ";
        this.prodi = " ";
        countDosen++;
    }

    //Konstruktor dengan Parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
        countDosen++;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut NIP
    public String getNip(){
        return nip;
    }

    //Mengembalikan nilai atribut Nama
    public String getNama(){
        return nama;
    }

    //Mengembalikan nilai atribut Prodi
    public String getProdi(){
        return prodi;
    }

    //Mengembalikan nilai countDosen
    public static int getCountDosen(){
        return countDosen;
    }

    /*============MUTATOR============*/
    //Mengubah nilai NIP
    public void setNip(String nip){
        this.nip = nip;
    }

    //Mengubah nilai atribut Nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //Mengubah nilai atribut Prodi
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    /*============Method Lainnya============*/
    //Menampilkan data dosen
    public void printDosen(){
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
} //end of class Dosen

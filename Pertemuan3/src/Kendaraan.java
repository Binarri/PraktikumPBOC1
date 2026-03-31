/* Nama File    : Kendaraan.java
 Deskripsi      : berisi atribut dan method dalam class Kendaraan
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 8 Maret 2026
  */

public class Kendaraan {
    /*************ATRIBUT********************/
    private String noPlat;
    private String jenis;
    private static int countKendaraan=0;

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Kendaraan(){
        this.noPlat = " ";
        this.jenis = " ";
        countKendaraan++;
    }

    //Konstruktor dengan Parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
        countKendaraan++;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut No Plat
    public String getNoPlat(){
        return noPlat;
    }

    //Mengembalikan nilai atribut Jenis
    public String getJenis(){
        return jenis;
    }

    //Mengembalikan nilai countKendaraan
    public static int getCountKendaraan(){
        return countKendaraan;
    }
   
    /*============MUTATOR============*/
    //Mengubah nilai No Plat
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    //Mengubah nilai atribut Jenis
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    /*============Method Lainnya============*/
    //Menampilkan data kendaraan
    public void printKendaraan(){
        System.out.println("No Plat: " + noPlat);
        System.out.println("Jenis: " + jenis);
    }
} //end of class Kendaraan

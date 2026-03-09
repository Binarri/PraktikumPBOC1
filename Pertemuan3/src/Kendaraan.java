/* Nama File    : Kendaraan.java
 Deskripsi      : berisi atribut dan method dalam class Kendaraan
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 8 Maret 2026
  */

public class Kendaraan {
    /*************ATRIBUT********************/
    private String noPlat;
    private String jenis;
    private static int countKendaraan;

    /***************KONSTRUKTOR******************/
    //Tanpa Parameter
    public Kendaraan(){
        this.noPlat = " ";
        this.jenis = " ";
        countKendaraan++;
    }

    //Dengan Parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /***************SELEKTOR******************/
    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public static int getCountKendaraan(){
        return countKendaraan;
    }
   
    /***************MUTATOR******************/
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }


    //Menampilkan data kendaraan
    public void printKendaraan(){
        System.out.println("No Plat: " + noPlat);
        System.out.println("Jenis: " + jenis);
    }
}

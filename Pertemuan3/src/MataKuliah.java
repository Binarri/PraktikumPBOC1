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
    private static int countMataKuliah;

    /***************KONSTRUKTOR******************/
    //Tanpa Parameter
    public MataKuliah(){
        this.idMatkul = " ";
        this.nama = " ";
        this.sks = 0;
        countMataKuliah++;
    }

    //Dengan Parameter
    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    /***************SELEKTOR******************/
    public String getIdMatkul(){
        return idMatkul;
    }

    public String getNama(){
        return nama;
    }

    public int getSKS(){
        return sks;
    }

    public static int getCountMataKuliah(){
        return countMataKuliah;
    }
   
    /***************MUTATOR******************/
    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSKS(int sks){
        this.sks = sks;
    }


    //Menampilkan data Mata kuliah
    public void printMataKuliah(){
        System.out.println("Id Matkul: " + idMatkul);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
    }

  
}

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
    private static int countDosen;

    /***************KONSTRUKTOR******************/
    //Tanpa Parameter
    public Dosen(){
        this.nip = " ";
        this.nama = " ";
        this.prodi = " ";
        countDosen++;
    }

    //Dengan Parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    /***************SELEKTOR******************/
    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public static int getCountDosen(){
        return countDosen;
    }

    /***************MUTATOR******************/
    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }


    //Menampilkan data dosen
    public void printDosen(){
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

}

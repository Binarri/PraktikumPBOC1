/* Nama File    : BangunDatar.java
 Deskripsi      : berisi atribut dan method dalam class Bangun Datar
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 12 Maret 2026 
 */

public class BangunDatar { /*Jika ditambahkan keyword final pada class BangunDatar, class Persegi dan Lingkaran tidak bisa mewarisi class BangunDatar */
    /*************ATRIBUT********************/
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    
    /*************KONSTRUKTOR********************/
    //Tanpa parameter
    public BangunDatar(){
        counterBangunDatar++;
    }

    //Dengan Parameter
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }



    /*************SELEKTOR********************/
    //Mengembalikan nilai jmlSisi
    public int getJmlSisi(){
        return jmlSisi;
    }

    //Mengembalikan nilai warna
    public String getWarna(){
        return warna;
    }

    //Mengembalikan nilai border
    public String getBorder(){
        return border;
    }

    /*************MUTATOR********************/
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setBorder(String border){
        this.border = border;
    }

    /*************METHOD********************/
    //Menampilkan jumlah objek BangunDatar
    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    //Menampilkan info BangunDatar
    public void printInfo(){ /*Jika ditambahkan keyword final pada method printInfo() class BangunDatar, maka method printInfo() class Persegi dan Lingkaran tidak bisa dioverride */
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}

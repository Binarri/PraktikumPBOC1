/* Nama File    : BangunDatar.java
 Deskripsi      : berisi atribut dan method dalam class Bangun Datar
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 26 Maret 2026 
 */

public abstract class BangunDatar { 
    // Jika BangunDatar tidak dijadikan sebagai abstract class maka method isEqualLuas() dan isEqualKeliling() tetap bisa dibuat, tetapi kurang tepat karena method getLuas() dan getKeliling() harus diberikan nilai default (misalnya 0), sehingga hasil perhitungannya tidak selalu merepresentasikan kondisi sebenarnya dari bangun datar.
    // Kelebihan class BangunDatar dijadikan sebagai abstract class yaitu untuk menyediakan kerangka method yang dapat diimplementasikan secara berbeda-beda oleh subclass, sehingga setiap objek memiliki perilaku yang sama meskipun rumus yang digunakan berbeda.
    
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
    public abstract double getLuas();
    public abstract double getKeliling();
    
    //Untuk mengecek apakah sebuah objek bangun datar memiliki luas yang sama dengan bangun datar lainnya
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    //Untuk mengecek apakah sebuah objek bangun datar memiliki keliling yang sama dengan objek lainnya
    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    //Menampilkan jumlah objek BangunDatar
    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    //Menampilkan info BangunDatar
    public void printInfo(){ 
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}

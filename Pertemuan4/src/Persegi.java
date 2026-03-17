/* Nama File    : Persegi.java
 Deskripsi      : berisi atribut dan method dalam class Persegi
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 12 Maret 2026 
 */

public class Persegi extends BangunDatar {
    /*************ATRIBUT********************/
    private double sisi;

    /*************KONSTRUKTOR********************/
    //Tanpa parameter
    public Persegi(){
        setJmlSisi(4);
    }

    //Dengan Parameter
    public Persegi(double sisi, String warna, String border){
        // this.sisi = sisi;
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(4);

        // this.jmlSisi = 4;
        // this.warna = warna;
        // this.border = border; 
        // this.sisi = sisi;  /*{Tidak bisa direalisasikan, karena atribut BangunDatar bersifat private}*/
        /*{Setelah access modifier atribut pada class BangunDatar diubah jadi protected, konstruktor ini dapat direalisasikan,
        Karena protected memungkinkan akses dalam class yang sama, dalam subclass}*/

        super(4, warna, border);
        this.sisi = sisi;
    }


    /*************SELEKTOR********************/
    public double getSisi(){
        return sisi;
    }


    /*************MUTATOR********************/
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    /*************METHOD********************/
    //Menghitung luas persegi
    public double getLuas(){
        return sisi * sisi;
    }

    //Menghitung keliling persegi
    public double getKeliling(){
        return 4 * sisi;
    }

    //Menghitung diagonal persegi
    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    //Menampilkan info Persegi
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

}

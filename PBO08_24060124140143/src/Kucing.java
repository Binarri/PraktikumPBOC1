/* Nama File    : Kucing.java
 Deskripsi      : Kucing merupakan subclass dari Anabul
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 30 April 2026
*/

public class Kucing extends Anabul{
    /*************ATRIBUT********************/
    //1a. Menambahkan atribut bobot
    private double bobot;

    
    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor dengan parameter
    public Kucing(String nama, double bobot){
        super(nama);
        this.bobot = bobot;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut bobot
    public double getBobot(){
        return bobot;
    }

    /*============MUTATOR============*/
    //Mengubah nilai atribut bobot
    public void setBobot(double Bobot){
        this.bobot = Bobot;
    }

    /*============Method Lainnya============*/
    //Untuk menampilkan gerakan kucing
    public void Gerak(){
        System.out.println("Gerak: Melata");
    }
    //Untuk menampilkan suara kucing
    public void Bersuara(){
        System.out.println("Suara: meong");
    }
} //end of class Kucing

/* Nama File    : Kucing.java
 Deskripsi      : Kucing merupakan subclass dari Anabul
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 26 April 2026
*/

public class Kucing extends Anabul{
    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor dengan parameter
    public Kucing(String nama){
        super(nama);
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

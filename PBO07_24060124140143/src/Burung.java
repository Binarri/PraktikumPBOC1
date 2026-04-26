/* Nama File    : Burung.java
 Deskripsi      : Burung merupakan subclass dari Anabul
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 26 April 2026
*/

public class Burung extends Anabul{
    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor dengan parameter
    public Burung(String nama){
        super(nama);
    }

    /*============Method Lainnya============*/
    //Untuk menampilkan gerakan burung
    public void Gerak(){
        System.out.println("Gerak: Terbang");
    }
    //Untuk menampilkan suara burung
    public void Bersuara(){
        System.out.println("Suara: cuit");
    }
} //end of class Burung

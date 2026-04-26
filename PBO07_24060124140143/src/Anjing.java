/* Nama File    : Anjing.java
 Deskripsi      : Anjing merupakan subclass dari Anabul
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 26 April 2026
*/

public class Anjing extends Anabul{
    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor dengan parameter
    public Anjing(String nama){
        super(nama);
    }

    /*============Method Lainnya============*/
    //Untuk menampilkan gerakan anjing
    public void Gerak(){
        System.out.println("Gerak: Melata");
    }
    //Untuk menampilkan suara anjing
    public void Bersuara(){
        System.out.println("Suara: guk-guk");
    }
} //end of class Anjing

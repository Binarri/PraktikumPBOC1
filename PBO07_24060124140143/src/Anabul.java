/* Nama File    : Anabul.java
 Deskripsi      : Kelas Anabul merupakan superclass untuk mendemonstrasikan konsep pewarisan (inheritance) pada kelas kucing dan anjing.
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 26 April 2026
*/

public class Anabul {
    /*************ATRIBUT********************/
    private String nama;
    

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Anabul(){
        this.nama = "n/a";
    }
    //Konstruktor dengan parameter
    public Anabul(String Nama){
        this.nama = Nama;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut Nama
    public String getNama(){
        return nama;
    }

    /*============MUTATOR============*/
    //Mengubah nilai atribut Nama
    public void setNama(String Nama){
        this.nama = Nama;
    }

    /*============Method Lainnya============*/
    //Untuk menampilkan gerakan anabul
    public void Gerak(){ }
    //Untuk menampilkan suara anabul
    public void Bersuara(){ }
} //end of class Anabul

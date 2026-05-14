/* Nama File    : Anabul.java
 Deskripsi      : Kelas Anabul merupakan superclass untuk mendemonstrasikan konsep pewarisan (inheritance) pada kelas kucing, Anjing, burung.
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 14 Mei 2026
*/

package KoleksiAnabul;

public class Anabul {
    //2a. menambahkan atribut panggilan, disertai dengan fungsi getNama() dan prosedur setNama(nama)
    /*************ATRIBUT********************/
    private String panggilan;
    

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Anabul(){
        this.panggilan = "n/a";
    }
    //Konstruktor dengan parameter
    public Anabul(String Nama){
        this.panggilan = Nama;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut Nama
    public String getNama(){
        return panggilan;
    }

    /*============MUTATOR============*/
    //Mengubah nilai atribut nama
    public void setNama(String nama){
        this.panggilan = nama;
    }

    /*============Method Lainnya============*/
    //Untuk menampilkan gerakan anabul
    public void Gerak(){ }
    //Untuk menampilkan suara anabul
    public void Bersuara(){ }
} //end of class Anabul

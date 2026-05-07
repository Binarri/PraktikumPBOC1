/* Nama File    : Datum.java
 Deskripsi      : Datum adalah kelas generik yang dapat menyimpan dan mengelola data dari berbagai tipe data. 
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 30 April 2026
*/

// 2. Mendefinisikan sebuah kelas generik bernama Datum 
public class Datum<T> {
    /*************ATRIBUT GENERIK********************/
    private T isi;


    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor dengan parameter
    public Datum(T isi){
        this.isi = isi;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai isi
    public T getIsi(){
        return isi;
    }

    /*============MUTATOR============*/
    //Mengubah nilai isi
    public void setIsi(T isiBaru){
        this.isi = isiBaru;
    }
}//end of class Datum

/* Nama File    : Data.java
 Deskripsi      : Kelas Data merupakan kelas generik yang dapat menyimpan dan mengelola data dari berbagai tipe, dengan kapasitas maksimum 100 elemen. Kelas ini menyediakan metode untuk mengatur dan mengambil data berdasarkan posisi, serta melacak jumlah elemen yang saat ini disimpan.
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 6 Mei 2026
*/

//4a. Membuat realisasi kelas data
public class Data<T> {
    /*************ATRIBUT********************/
    private static final int kapasitas = 100;
    private T[] ruang;
    private int banyak;


    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    @SuppressWarnings("unchecked")
    public Data(){
        ruang = (T[]) new Object[kapasitas];
        banyak = 0;
    }

    /*============SELEKTOR============*/
    //4c. Membuat realisasi fungsi getIsi
    //Mengembalikan nilai atribut isi pada posisi tertentu
    @SuppressWarnings("unchecked")
    public T getIsi(int posisi){
        if(posisi >= 1 && posisi <= kapasitas && posisi <= banyak){
            return(T) ruang[posisi -1];
        }
        return null;
    }

    //4d. Membuat realisasi fungsi grtSize
    //Mengembalikan nilai atribut banyak
    public int getSize(){
        return banyak;
    }

    //Mengembalikan nilai atribut kapasitas
    public int getKapasitas(){
        return kapasitas;
    }

    /*============MUTATOR============*/
    //4b. Membuat realisasi prosedur setIsi 
    //Mengubah nilai atribut isi pada posisi tertentu
    public void setIsi(int posisi, T isi){
        if(posisi >= 1 && posisi <= kapasitas){
            ruang[posisi - 1] = isi;
            if(posisi > banyak){
                banyak = posisi;
            }
        }
    }

}//end of class Data

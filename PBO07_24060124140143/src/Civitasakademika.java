/* Nama File    : Civitasakademika.java
 Deskripsi      : Civitasakademika merupakan superclass dari Dosen dan Mahasiswa
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 26 April 2026
*/

//4a. Membuat kelas rujukan Civitasakademika dengan atribut dan metode yang relevan
public class Civitasakademika {
    /***************ATRIBUT********************/
    private String nama;


    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Civitasakademika(){
        this.nama = " ";
    }
    //Konstruktor dengan parameter
    public Civitasakademika(String nama){
        this.nama = nama;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut Nama
    public String getNama(){
        return nama;
    }

    /*============MUTATOR============*/
    //Mengubah nilai atribut Nama
    public void setNama(String nama){
        this.nama = nama;
    }

    /*============Method Lainnya============*/
    //Untuk menampilkan nomor identitas (akan di override pada kelas Dosen dan Mahasiswa)
    public String getNomor(){ 
        return " ";
    }
    
} //end of class Civitasakademika

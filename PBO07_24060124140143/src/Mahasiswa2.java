/* Nama File    : Mahasiswa2.java
 Deskripsi      : Mahasiswa merupakan subclass dari Civitasakademika 
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 26 April 2026
*/

//4a. Membuat kelas Mahasiswa yang merupakan subclass dari Civitasakademika dengan atribut dan metode yang relevan
public class Mahasiswa2 extends Civitasakademika{
    /***************ATRIBUT********************/
    private String NIM;
    private Dosen wali;

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Mahasiswa2(){
        super();
        this.NIM = " ";
        this.wali = new Dosen();
    }
    //Konstruktor dengan parameter
    public Mahasiswa2(String nama, String NIM, Dosen wali){
        super(nama);
        this.NIM = NIM;
        this.wali = wali;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut NIM
    public String getNIM(){
        return NIM;
    }
    //Mengembalikan nilai atribut wali
    public Dosen getWali(){
        return wali;
    }

    /*============MUTATOR============*/
    //Mengubah nilai atribut NIM
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    //4i. Mengubah nilai atribut wali
    public void setWali(Dosen wali){
        this.wali = wali;
    }

    /*============Method Lainnya============*/
    //Untuk menampilkan nomor identitas NIM
    @Override
    public String getNomor(){
        return NIM;
    }
    //4j. Untuk menampilkan data NIM, Nama Mahasiswa, dan Nama Dosen Wali
    public void tampilDataMahasiswa(){
        System.out.println("Nama Mahasiswa: " + getNama());
        System.out.println("NIM: " + getNIM());
        System.out.println("Nama Dosen Wali: " + wali.getNama());
        System.out.println("------------------------------");
    }
} //end of class Mahasiswa2 

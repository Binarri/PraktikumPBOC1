/* Nama File    : Anggora.java
 Deskripsi      : Anggora merupakan subclass dari Kucing
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 30 April 2026
*/

// 1b. Membuat kelas Anggora yang mewarisi kelas kucing
public class Anggora extends Kucing{
    /*************ATRIBUT********************/
    private String jenisRambut;


    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor dengan parameter
    public Anggora(String nama, double bobot){
        super(nama, bobot);
        this.jenisRambut = "Panjang";
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut jenisRambut
    public String getJenisRambut(){
        return jenisRambut;
    }

    /*============MUTATOR============*/
    //Mengubah nilai atribut jenisRambut
    public void setJenisRambut(String jenisRambut){
        this.jenisRambut = jenisRambut;
    }

    /*============Method Lainnya============*/
    //Untuk menampilkan gerakan anggora
    @Override
    public void Gerak(){
        System.out.println("Gerak: Berlari dengan elegan");
    }
    //Untuk menampilkan suara anggora
    @Override
    public void Bersuara(){
        System.out.println("Suara: meong halus");
    }
} //end of class Anggora

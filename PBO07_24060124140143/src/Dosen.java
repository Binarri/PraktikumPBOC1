/* Nama File    : Dosen.java
 Deskripsi      : Dosen merupakan subclass dari Civitasakademika
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 26 April 2026
*/

//4a. Membuat kelas Dosen yang merupakan subclass dari Civitasakademika dengan atribut dan metode yang relevan
public class Dosen extends Civitasakademika{
    /***************ATRIBUT********************/
    private String NIP;
    

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Dosen(){
        super();
        this.NIP = " ";
    }
    //Konstruktor dengan parameter
    public Dosen(String nama, String NIP){
        super(nama);
        this.NIP = NIP;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut NIP
    public String getNIP(){
        return NIP;
    }

    /*============MUTATOR============*/
    //Mengubah nilai atribut NIP
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    /*============Method Lainnya============*/
    //Untuk menampilkan nomor identitas NIP
    @Override
    public String getNomor(){
        return NIP;
    }
    //Untuk menampilkan informasi dosen
    public void print(){
        System.out.println("Nama: " + getNama());
        System.out.println("NIP: " + getNIP());
    }
} //end of class Dosen

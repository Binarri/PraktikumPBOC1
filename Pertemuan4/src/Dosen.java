/* Nama File    : Dosen.java
 Deskripsi      : berisi atribut dan method dalam class Dosen
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 18 Maret 2026 
 */

public class Dosen extends Pegawai{
    /*************ATRIBUT********************/
    protected String fakultas;

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Dosen(){
        super();
        this.fakultas = " ";
    }

    //Konstruktor dengan Parameter
    public Dosen(String NIP, String nama, Tanggal tglLahir, Tanggal TMT, double gaji_pokok, String fakultas){
        super(NIP, nama, tglLahir, TMT, gaji_pokok);
        this.fakultas = fakultas;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai fakultas
    public String getFakultas(){
        return fakultas;
    }

    /*============MUTATOR============*/
    //Mengubah nilai fakultas
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    /*============Method Lainnya============*/
    //Menampilkan info Dosen
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
} //end of class Dosen

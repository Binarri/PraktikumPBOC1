/* Nama File    : Lingkaran.java
 Deskripsi      : berisi atribut dan method dalam class Lingkaran
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 12 Maret 2026 
 */

public class Lingkaran extends BangunDatar {
    /*************ATRIBUT********************/
    private double jari;

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Lingkaran(){
        setJmlSisi(1);
    }

    //Konstruktor dengan parameter
    public Lingkaran(double jari, String warna, String border){
        // this.jari = jari;
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(1);
        
        super(1, warna, border);
        this.jari = jari;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai jari-jari
    public double getJari(){
        return jari;
    }


    /*============MUTATOR============*/
    //Mengubah nilai jari-jari
    public void setJari(double jari){
        this.jari = jari;
    }


    /*============Method Lainnya============*/
    //Menghitung Luas Lingkaran
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    //Menghitung keliling lingkaran
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    //Menampilkan info Lingkaran
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-Jari: " + jari);
    }
} //end of class Lingkaran

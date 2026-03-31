/* Nama File    : Lingkaran.java
Deskripsi      : berisi atribut dan method dalam class Lingkaran
Pembuat        : Binar Ridha Wiritanaya
Tanggal        : 26 Maret 2026 
*/

public class Lingkaran extends BangunDatar implements IResize{
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
        this.jari = jari;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(1);
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut jari
    public double getJari(){
        return jari;
    }

    /*============MUTATOR============*/
    //Mengubah nilai jari
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
        System.out.println("Jumlah sisi lingkaran: " + getJmlSisi());
        System.out.println("Warna lingkaran: " + getWarna());
        System.out.println("Border lingkaran: " + getBorder());
        System.out.println("Jari-Jari lingkaran: " + jari);
    }

    //Method dari interface IResize
    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * (1 + percent/100);
    }

}

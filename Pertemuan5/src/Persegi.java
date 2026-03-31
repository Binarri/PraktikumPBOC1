/* Nama File    : Persegi.java
 Deskripsi      : berisi atribut dan method dalam class Persegi
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 26 Maret 2026 
 */

public class Persegi extends BangunDatar implements IResize{
    /*************ATRIBUT********************/
    private double sisi;

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Persegi(){
        setJmlSisi(4);
    }

    //Konstruktor dengan Parameter
    public Persegi(double sisi, String warna, String border){
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut sisi
    public double getSisi(){
        return sisi;
    }

    /*============MUTATOR============*/
    //Mengubah nilai sisi
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    /*============Method Lainnya============*/
    //Menghitung luas persegi
    public double getLuas(){
        return sisi * sisi;
    }

    //Menghitung keliling persegi
    public double getKeliling(){
        return 4 * sisi;
    }

    //Menghitung diagonal persegi
    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    //Menampilkan info Persegi
    @Override
    public void printInfo(){
        System.out.println("Jumlah sisi persegi: " + getJmlSisi());
        System.out.println("Warna persegi: " + getWarna());
        System.out.println("Border persegi: " + getBorder());
        System.out.println("Sisi persegi: " + sisi);
    }

    //Method dari interface IResize
    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * (1 + percent/100);
    }
}//end class Persegi

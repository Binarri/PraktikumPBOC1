/* Nama File    : Garis.java
   Deskripsi    : berisi atribut dan method dalam class Garis
   Pembuat      : Binar Ridha Wiritanaya
   Tanggal      : 2 Maret 2026
*/
public class Garis {
    /*************ATRIBUT********************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Garis(){
        titikAwal = new Titik(0,0);
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    //Konstruktor dengan parameter
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai titik awal
    public Titik getTitikAwal(){
        return titikAwal;
    }

    //Mengembalikan nilai titik akhir
    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    //Mengembalikan nilai counterGaris
    public static int getCounterGaris(){
        return counterGaris;
    }

    /*============MUTATOR============*/
    //Mengubah nilai titik awal dengan nilai baru t
    public void setTitikAwal(Titik t){
        titikAwal = t;
    }

    //Mengubah nilai titik akhir dengan nilai baru t
    public void setTitikAkhir(Titik t){
        titikAkhir = t;
    }

    /*============Method Lainnya============*/
    //Mendapatkan panjang dari sebuah garis
    public double getPanjang(){
        return titikAwal.getJarak(titikAkhir);
    }

    //Mendapatkan gradien dari sebuah garis
    public double getGradien(){
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    //Mendapatkan titik tengah dari sebuah garis
    public Titik getTitikTengah(){
        Titik T2 = new Titik(((titikAwal.getAbsis()+titikAkhir.getAbsis())/2),((titikAwal.getOrdinat()+titikAkhir.getOrdinat())/2));
        return T2;
    }

    //Mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya
    public boolean IsSejajar(Garis G){
        return getGradien() == G.getGradien();
    }

    //Mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya
    public boolean IsTegakLurus(Garis G){
        return getGradien()* G.getGradien() == -1;
    }

    //Menampilkan ke layar titik awal dan titik akhir
    public void printGaris(){
        System.out.println("Titik awal garis: (" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + ")");
        System.out.println("Titik akhir garis: (" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")");
    }

    //Menampilkan persamaan garis dalam bentuk string y=mx+c
    public String getPersamaanGaris(){
        double c = titikAwal.getOrdinat()-(getGradien()*titikAwal.getAbsis());
        return "y = " + getGradien() + "x + " + c;
    }
} //end class Garis

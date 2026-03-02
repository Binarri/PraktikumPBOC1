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

    /***************KONSTRUKTOR******************/
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

    /***************SELEKTOR******************/
    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public static int getCounterGaris(){
        return counterGaris;
    }

    /***************MUTATOR******************/
    public void setTitikAwal(Titik t){
        titikAwal = t;
    }

    public void setTitikAkhir(Titik t){
        titikAkhir = t;
    }

    /***************METHOD******************/
    //mendapatkan panjang sebuah garis
    public double getPanjang(){
        return titikAwal.getJarak(titikAkhir);
    }

    //mendapatkan gradien dari sebuah garis
    public double getGradien(){
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    //mendapatkan titik tengah dari sebuah garis
    public Titik getTitikTengah(){
        Titik T2 = new Titik(((titikAwal.getAbsis()+titikAkhir.getAbsis())/2),((titikAwal.getOrdinat()+titikAkhir.getOrdinat())/2));
        return T2;
    }

    //mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya
    public boolean IsSejajar(Garis G){
        return getGradien() == G.getGradien();
    }

    //mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya
    public boolean IsTegakLurus(Garis G){
        return getGradien()* G.getGradien() == -1;
    }

    //menampilkan ke layar titik awal dan titik akhir
    public void printGaris(){
    System.out.println("Titik awal garis: (" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + ")");
    System.out.println("Titik akhir garis: (" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")");
    }

    //menampilkan persamaan garis dalam bentuk string y=mx+c
    public String getPersamaanGaris(){
        double c = titikAwal.getOrdinat()-(getGradien()*titikAwal.getAbsis());
        return "y = " + getGradien() + "x + " + c;
    }
}

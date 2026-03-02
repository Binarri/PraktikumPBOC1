/* Nama File    : Garis.java
   Deskripsi    : berisi atribut dan method dalam class Garis
   Pembuat      : Binar Ridha Wiritanaya
   Tanggal      : 2 Maret 2026
*/
public class Garis {
    /*************ATRIBUT********************/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /***************KONSTRUKTOR******************/
    //Konstruktor tanpa parameter
    Garis(){
        titikAwal = new Titik(0,0);
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    //Konstruktor dengan parameter
    Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    /***************SELEKTOR******************/
    Titik getTitikAwal(){
        return titikAwal;
    }

    Titik getTitikAkhir(){
        return titikAkhir;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    /***************MUTATOR******************/
    void setTitikAwal(Titik t){
        titikAwal = t;
    }

    void setTitikAkhir(Titik t){
        titikAkhir = t;
    }

    /***************METHOD******************/
    //mendapatkan panjang sebuah garis
    double getPanjang(){
        return titikAwal.getJarak(titikAkhir);
    }

    //mendapatkan gradien dari sebuah garis
    double getGradien(){
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    //mendapatkan titik tengah dari sebuah garis
}

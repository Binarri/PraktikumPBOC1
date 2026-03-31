/* Nama File    : mGaris.java
   Deskripsi    : berisi atribut dan method dalam class Garis
   Pembuat      : Binar Ridha Wiritanaya
   Tanggal      : 2 Maret 2026
*/

public class mGaris {
    public static void main(String[] args) {
        //Pembuatan Objek Titik
        // objek 1
        Titik T1 = new Titik(-2,0);
        // objek 2
        Titik T2 = new Titik(0,4);


        //Pembuatan Objek Garis
        // objek 1
        Garis G1 = new Garis();
        // objek 2
        Garis G2 = new Garis(T1,T2);


        //Implementasi Method
        System.out.println("Titik Awal G1: "); 
        G1.getTitikAwal().printTitik(); //menampilkan titik awal garis G1
        System.out.println("\nTitik Akhir G1: "); 
        G1.getTitikAkhir().printTitik();//menampilkan titik akhir garis G1
        System.out.println("\nTitik Awal G2: ");
        G2.getTitikAwal().printTitik(); //menampilkan titik awal garis G2
        System.out.println("\nTitik Akhir G2: ");
        G2.getTitikAkhir().printTitik(); //menampilkan titik akhir garis G2
        System.out.println("\nJumlah Objek Garis = " + Garis.getCounterGaris()); //menghitung jumlah objek garis yang telah dibuat


        System.out.println("\nPanjang G1: " + G1.getPanjang()); //menghitung panjang dari garis G1
        System.out.println("Panjang G2: " + G2.getPanjang()); //menghitung panjang dari garis G2
        System.out.println("\nGradien G1: " + G1.getGradien()); //menghitung gradien dari garis G1
        System.out.println("Gradien G2: " + G2.getGradien()); //menghitung gradien dari garis G2

        System.out.println("\nTitik Tengah G1: ");
        G1.getTitikTengah().printTitik(); //menghitung titik tengah dari garis G1 dan menampilkan koordinatnya
        System.out.println("\nTitik Tengah G2: ");
        G2.getTitikTengah().printTitik(); //menghitung titik tengah dari garis G2 dan menampilkan koordinatnya

        G1.setTitikAwal(T1); //mengubah titik awal garis G1 dengan titik T1
        G1.setTitikAkhir(T2); //mengubah titik akhir garis G1 dengan titik T2
        System.out.println("\nG1: ");
        G1.printGaris(); //menampilkan titik awal dan titik akhir dari garis G1
        System.out.println("\nG2: ");
        G2.printGaris(); //menampilkan titik awal dan titik akhir dari garis G2

        System.out.println("\nIsSejajar G1 dan G2: " + G1.IsSejajar(G2)); //mengecek apakah garis G1 sejajar dengan garis G2
        System.out.println("IsTegakLurus G1 dan G2: " + G1.IsTegakLurus(G2)); //mengecek apakah garis G1 tegak lurus dengan garis G2
        System.out.println("\nPersamaan Garis G1: " + G1.getPersamaanGaris()); //menampilkan persamaan garis G1 dalam bentuk string y=mx+c
        System.out.println("Persamaan Garis G2: " + G2.getPersamaanGaris()); //menampilkan persamaan garis G2 dalam bentuk string y=mx+c
    }
}

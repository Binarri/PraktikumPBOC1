/* Nama File    : mGaris.java
   Deskripsi    : berisi atribut dan method dalam class Garis
   Pembuat      : Binar Ridha Wiritanaya
   Tanggal      : 2 Maret 2026
*/

public class mGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(-2,0);
        Titik T2 = new Titik(0,4);

        Garis G1 = new Garis();
        Garis G2 = new Garis(T1,T2);

        System.out.println("Jumlah Objek Garis = " + Garis.getCounterGaris());

        System.out.println("G1: ");
        G1.printGaris();
        System.out.println("\nG2: ");
        G2.printGaris();

        System.out.println("\nPanjang G1: " + G1.getPanjang());
        System.out.println("Gradien G2: " + G2.getGradien());

        System.out.println("\nTitik Tengah G1: ");
        G1.getTitikTengah().printTitik();

        G1.setTitikAwal(T1);
        G1.setTitikAkhir(T2);
        System.out.println("\nIsSejajar G1 dan G2: " + G1.IsSejajar(G2));
        System.out.println("IsTegakLurus G1 dan G2: " + G1.IsTegakLurus(G2));
        System.out.println("Persamaan Garis G2: " + G2.getPersamaanGaris());
    }
}

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
        System.out.println("Panjang G2: " + G2.getPanjang());
        System.out.println("Gradien G2: " + G2.getGradien());
    }
}

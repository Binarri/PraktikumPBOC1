/* Nama File    : MBangunDatar.java
 Deskripsi      : berisi atribut dan method dalam class Bangun Datar
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 26 Maret 2026 
 */

public class MBangunDatar {
    public static void main(String[] args){
        // BangunDatar B1 = new BangunDatar();  {error, karena BangunDatar adalah abstract class, sehingga tidak bisa dibuat objek}
        // BangunDatar P1 = new Persegi(10);    {error, karena pada konstruktor persegi membutuhkan 3 parameter(sisi,warna,border)}
        // Persegi P2 = new Persegi(5);         {error, karena pada konstruktor class persegi membutuhkan 3 parameter(sisi,warna,border)}
        // BangunDatar L1 = new Lingkaran(7);   {error, karena konstruktor lingkaran membutuhkan 3 parameter(jari,warna,border)}
        // Lingkaran L1 = new Lingkaran (14);   {error, karena nama variabel L1 sudah digunakan sebelumnya dan konstruktor lingkaran membutuhkan 3 parameter(jari,warna,border)}

        System.out.println("PERSEGI P1");
        BangunDatar P1 = new Persegi(10, "coklat", "putih");
        P1.printInfo();
        System.out.println("\nPERSEGI P2");
        Persegi P2 = new Persegi(5, "Merah", "Putih");
        P2.printInfo();

        System.out.println("\nLINGKARAN L1");
        BangunDatar L1 = new Lingkaran(7, "Hitam", "Putih");
        L1.printInfo();

        System.out.println("\nLINGKARAN L2");
        Lingkaran L2 = new Lingkaran (14, "Coklat", "Hitam");
        L2.printInfo();


        System.out.println("\nLuas Persegi P1: " + P1.getLuas());
        System.out.println("Keliling Persegi P1: " + P1.getKeliling());

        System.out.println("\nLuas Persegi P2: " + P2.getLuas());
        System.out.println("Keliling Persegi P2: " + P2.getKeliling());

        System.out.println("\nLuas Lingkaran L1: " + L1.getLuas());
        System.out.println("Keliling Lingkaran L1: " + L1.getKeliling());

        System.out.println("\nLuas Lingkaran L2: " + L2.getLuas());
        System.out.println("Keliling Lingkaran L2: " + L2.getKeliling());



        System.out.println("\nIsEqualLuas P1 dan L2: " + P1.isEqualLuas(L2));
        System.out.println("IsEqualKeliling P1 dan L2: " + P1.isEqualKeliling(L2));
        //Method isEqualLuas dan isEqualKeliling bisa digunakan untuk membandingkan objek bangun datar yang berbeda. Karena semua turunan BangunDatar punya method getLuas() dan getKeliling()


        L2.zoomIn();
        System.out.println("\nLuas Lingkaran setelah zoomIn: " + L2.getLuas());
        L2.zoomOut();
        System.out.println("Luas Lingkaran setelah zoomOut: " + L2.getLuas());
        L2.zoom(50);
        System.out.println("Luas Lingkaran setelah zoom 50: " + L2.getLuas());

    }
}



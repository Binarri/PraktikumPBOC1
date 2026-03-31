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

        /*============Implementasi class Persegi============*/
        //Objek 1 dengan tipe data BangunDatar
        System.out.println("PERSEGI P1");
        BangunDatar P1 = new Persegi(10, "coklat", "putih");
        //Implementasi selektor
        System.out.println("Sisi : " + ((Persegi) P1).getSisi());
        //Implementasi mutator
        ((Persegi)P1).setSisi(4);
        //Implementasi method lainnya
        P1.printInfo();
        System.out.println("Diagonal Persegi P1: " + ((Persegi)P1).getDiagonal());
        System.out.println("Luas Persegi P1: " + P1.getLuas());
        System.out.println("Keliling Persegi P1: " + P1.getKeliling());

        //Objek 2 dengan tipe data Persegi
        System.out.println("\nPERSEGI P2");
        Persegi P2 = new Persegi(5, "Merah", "Putih");
        //Implementasi selektor
        System.out.println("Sisi : " + P2.getSisi());
        //Implementasi mutator
        P2.setSisi(6);
        //Implementasi method lainnya
        P2.printInfo();
        System.out.println("Diagonal Persegi P1: " + P2.getDiagonal());
        System.out.println("Luas Persegi P2: " + P2.getLuas());
        System.out.println("Keliling Persegi P2: " + P2.getKeliling());


        /*============Implementasi class Lingkaran============*/
        //Objek 1 dengan tipe data BangunDatar
        System.out.println("\nLINGKARAN L1");
        BangunDatar L1 = new Lingkaran(7, "Hitam", "Putih");
        //Implementasi selektor
        System.out.println("Jari : " + ((Lingkaran)L1).getJari());
        //Implementasi mutator
        ((Lingkaran)L1).setJari(6);
        //Implementasi method lainnya
        L1.printInfo();
        System.out.println("Luas Lingkaran L1: " + L1.getLuas());
        System.out.println("Keliling Lingkaran L1: " + L1.getKeliling());

        //Objek 2 dengan tipe data Lingkaran
        System.out.println("\nLINGKARAN L2");
        Lingkaran L2 = new Lingkaran (14, "Coklat", "Hitam");
        //Implementasi selektor
        System.out.println("Jari : " + L2.getJari());
        //Implementasi mutator
        L2.setJari(21);
        //Implementasi method lainnya
        L2.printInfo();
        System.out.println("Luas Lingkaran L2: " + L2.getLuas());
        System.out.println("Keliling Lingkaran L2: " + L2.getKeliling());


        /*============Implementasi class Bangun Datar============*/
        //Implementasi method lainnya
        System.out.println("\nIsEqualLuas P1 dan L2: " + P1.isEqualLuas(L2));
        System.out.println("IsEqualKeliling P1 dan L2: " + P1.isEqualKeliling(L2));
            /*Method isEqualLuas dan isEqualKeliling bisa digunakan untuk membandingkan objek bangun datar yang berbeda. Karena semua turunan BangunDatar punya method getLuas() dan getKeliling()*/


        /*============Implementasi interface IResize pada class Lingkaran============*/
        L2.zoomIn();
        System.out.println("\nLuas Lingkaran L2 setelah zoomIn: " + L2.getLuas());
        L2.zoomOut();
        System.out.println("Luas Lingkaran L2 setelah zoomOut: " + L2.getLuas());
        L2.zoom(50);
        System.out.println("Luas Lingkaran L2 setelah zoom 50: " + L2.getLuas());

    }
}



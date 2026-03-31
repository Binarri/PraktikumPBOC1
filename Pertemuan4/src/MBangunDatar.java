/* Nama File    : MBangunDatar.java
 Deskripsi      : berisi atribut dan method dalam class Bangun Datar
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 12 Maret 2026 
 */

public class MBangunDatar {
    public static void main(String[] args){
        /*============Implementasi class Bangun Datar============*/
        System.out.println("BANGUN DATAR");
        //Pembuatan objek BangunDatar
        BangunDatar BD1 = new BangunDatar();
        //Implementasi selektor
        System.out.println("Jumlah Sisi: " + BD1.getJmlSisi());
        System.out.println("Warna: " + BD1.getWarna());
        System.out.println("Border: " + BD1.getBorder());
        //Implementasi mutator
        BD1.setJmlSisi(5);
        BD1.setWarna("Biru");
        BD1.setBorder("Putih");
        //Implementasi method lainnya
        System.out.println();
        BD1.printInfo();
        BangunDatar.printCounterBangunDatar();


        /*============Implementasi class Persegi============*/
        System.out.println("\nPERSEGI");
        //Pembuatan objek Persegi
        Persegi P1 = new Persegi();
        //Implementasi selektor
        System.out.println("Sisi: " + P1.getSisi());
        System.out.println("Jumlah Sisi: " + P1.getJmlSisi());
        System.out.println("Warna: " + P1.getWarna());
        System.out.println("Border: " + P1.getBorder());
        //Implementasi mutator
        P1.setSisi(12);
        P1.setJmlSisi(4);
        P1.setWarna("Merah");
        P1.setBorder("Putih");
        //Implementasi method lainnya
        System.out.println();
        P1.printInfo();
        System.out.println("Luas Persegi: " + P1.getLuas());
        System.out.println("Keliling Persegi: " + P1.getKeliling());
        System.out.println("Diagonal Persegi: " + P1.getDiagonal());


        /*============Implementasi class Lingkaran============*/
        System.out.println("\nLINGKARAN");
        //Pembuatan objek Lingkaran
        Lingkaran L1 = new Lingkaran();
        //Implementasi selektor
        System.out.println("Jari-Jari: " + L1.getJari());
        System.out.println("Jumlah Sisi: " + L1.getJmlSisi());
        System.out.println("Warna: " + L1.getWarna());
        System.out.println("Border: " + L1.getBorder());
        //Implementasi mutator
        L1.setJari(7);
        L1.setJmlSisi(1);
        L1.setWarna("Hitam");
        L1.setBorder("Putih");
        //Implementasi method lainnya
        System.out.println();
        L1.printInfo();
        System.out.println("Luas Lingkaran: " + L1.getLuas());
        System.out.println("Keliling Lingkaran: " + L1.getKeliling());
    }
}



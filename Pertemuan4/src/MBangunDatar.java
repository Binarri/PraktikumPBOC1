/* Nama File    : MBangunDatar.java
 Deskripsi      : berisi atribut dan method dalam class Bangun Datar
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 12 Maret 2026 
 */

public class MBangunDatar {
    public static void main(String[] args){
        System.out.println("BANGUN DATAR");
        BangunDatar BD1 = new BangunDatar();
        BD1.setJmlSisi(5);
        BD1.setWarna("Biru");
        BD1.setBorder("Putih");
        BD1.printInfo();
        BangunDatar.printCounterBangunDatar();

        
        System.out.println("\nPERSEGI");
        Persegi P1 = new Persegi();
        P1.setSisi(12);
        P1.setJmlSisi(4);
        P1.setWarna("Merah");
        P1.setBorder("Putih");
        P1.printInfo();
        System.out.println("Luas Persegi: " + P1.getLuas());
        System.out.println("Keliling Persegi: " + P1.getKeliling());
        System.out.println("Diagonal Persegi: " + P1.getDiagonal());


        System.out.println("\nLINGKARAN");
        Lingkaran L1 = new Lingkaran();
        L1.setJari(7);
        L1.setJmlSisi(1);
        L1.setWarna("Hitam");
        L1.setBorder("Putih");
        L1.printInfo();
        System.out.println("Luas Lingkaran: " + L1.getLuas());
        System.out.println("Keliling Lingkaran: " + L1.getKeliling());

    }
}



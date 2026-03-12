public class MBangunDatar {
    public static void main(String[] args){
        BangunDatar BD1 = new BangunDatar();
        BD1.setJmlSisi(4);
        BD1.setWarna("Biru");
        BD1.setBorder("Putih");
        BD1.printInfo();
        BangunDatar.printCounterBangunDatar();

        Persegi P1 = new Persegi();
        P1.setSisi(12);
        P1.setJmlSisi(4);
        P1.setWarna("Merah");
        P1.setBorder("Putih");
        P1.printInfo();

        Lingkaran L1 = new Lingkaran();
        L1.printInfo();
        L1.setJari(7);
        L1.setJmlSisi(1);
        L1.setWarna("Hitam");
        L1.setBorder("Putih");
        L1.printInfo();
    }
}

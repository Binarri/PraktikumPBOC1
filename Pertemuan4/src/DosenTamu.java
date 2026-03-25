/* Nama File    : DosenTamu.java
 Deskripsi      : berisi atribut dan method dalam class Dosen tamu
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 18 Maret 2026 
 */

public class DosenTamu extends Dosen{
    /*************ATRIBUT********************/
    private String NIDK;
    private Tanggal lastMasaKontrak;

    /*************KONSTRUKTOR********************/
    //Tanpa Parameter
    public DosenTamu(){
        super();
        this.NIDK = " ";
        this.lastMasaKontrak = new Tanggal();
    }

    //Dengan Parameter
    public DosenTamu(String NIP, String NIDK, String nama, Tanggal tglLahir, Tanggal TMT, double gaji_pokok, String fakultas, Tanggal Akhirkontrak){
        super(NIP, nama, tglLahir, TMT, gaji_pokok, fakultas);
        this.NIDK = NIDK;
        this.lastMasaKontrak = Akhirkontrak;
    }

    /*************SELEKTOR********************/
    public String getNIDK(){
        return NIDK;
    }

    public Tanggal getAkhirKontrak(){ 
        return lastMasaKontrak; 
    }

    /*************MUTATOR********************/
    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    public void setAkhirKontrak(Tanggal lastMasaKontrak){
        this.lastMasaKontrak = lastMasaKontrak;
    }

    /*************METHOD********************/
    //Menghitung sisa kontrak dalam bulan
    public int getSisaKontrakBulan(){
        int nowTahun = 2025;
        int nowBulan = 3;

        int selisihTahun = lastMasaKontrak.getTahun() - nowTahun;
        int selisihBulan = lastMasaKontrak.getBulan() - nowBulan;
        return selisihTahun * 12 + selisihBulan;
    }

    //Menampilkan info Dosen Tamu
    @Override
    public void printInfo() {
        double tunjangan = 0.025 * gaji_pokok;
        System.out.println("NIP: " + NIP);
        System.out.println("NIDK: " + NIDK);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tglLahir.print());
        System.out.println("TMT: " + TMT.print());
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Akhir Masa Kontrak: " + lastMasaKontrak.print());
        System.out.println("Sisa Kontrak : " + getSisaKontrakBulan() + " bulan");
        System.out.println("Gaji Pokok : Rp " + String.format("%,.0f", gaji_pokok));
        System.out.println("Tunjangan: 2.5% x Rp " + String.format("%,.0f", gaji_pokok) + " = Rp " + String.format("%,.0f", tunjangan));
    }
}

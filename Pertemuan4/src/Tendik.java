/* Nama File    : Tendik.java
 Deskripsi      : berisi atribut dan method dalam class Tendik
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 18 Maret 2026 
 */

public class Tendik extends Pegawai{
    /*************ATRIBUT********************/
    private String Bidang;
    private static int BUP = 55;

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Tendik(){
        super();
        this.Bidang = " ";
    }

    //Konstruktor dengan Parameter
    public Tendik(String NIP, String nama, Tanggal tglLahir, Tanggal TMT, double gaji_pokok, String Bidang){
        super(NIP, nama, tglLahir, TMT, gaji_pokok);
        this.Bidang = Bidang;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai bidang
    public String getBidang(){
        return Bidang;
    }

    /*============MUTATOR============*/
    //Mengubah nilai bidang
    public void setBidang(String Bidang){
        this.Bidang = Bidang;
    }

    /*============Method Lainnya============*/
    //Menghitung tanggal pensiun
    public Tanggal hitungTglPensiun() {
        int thnPensiun = tglLahir.getTahun() + BUP;
        int blnPensiun = tglLahir.getBulan() + 1;
        int hriPensiun = 1;

        if (blnPensiun > 12) {
            blnPensiun = 1;
            thnPensiun++;
        }
        return new Tanggal(hriPensiun, blnPensiun, thnPensiun);
    }

    //Menampilkan info Tendik
    @Override
    public void printInfo() {
        double tunjangan = 0.01 * getMasaKerjaTahun() * gaji_pokok;

        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: Tendik");
        System.out.println("Bidang: " + Bidang);
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("Tanggal Pensiun: " + hitungTglPensiun().print());
        System.out.println("Tunjangan: 1% x " + getMasaKerjaTahun() + " x Rp " + String.format("%,.2f", gaji_pokok) + " = Rp " + String.format("%,.2f", tunjangan));
    }
} //end of class Tendik

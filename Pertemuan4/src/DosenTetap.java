/* Nama File    : DosenTetap.java
 Deskripsi      : berisi atribut dan method dalam class Dosen Tetap
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 18 Maret 2026 
 */

public class DosenTetap extends Dosen{
    /*************ATRIBUT********************/
    private String NIDN;
    private static int BUP = 65;

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public DosenTetap(){
        super();
        this.NIDN = " ";
    }

    //Konstruktor dengan Parameter
    public DosenTetap(String NIP, String NIDN, String nama, Tanggal tglLahir, Tanggal TMT, double gaji_pokok, String fakultas){
        super(NIP, nama, tglLahir, TMT, gaji_pokok, fakultas);
        this.NIDN = NIDN;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai NIDN
    public String getNIDN(){
        return NIDN;
    }


    /*============MUTATOR============*/
    //Mengubah nilai NIDN
    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }


    /*============Method Lainnya============*/
    //Menghitung tanggal pensiun
    public Tanggal TglPensiun() {
        int thnPensiun = tglLahir.getTahun() + BUP;
        int blnPensiun = tglLahir.getBulan() + 1;
        int hriPensiun = 1;

        if (blnPensiun > 12) {
            blnPensiun = 1;
            thnPensiun++;
        }
        return new Tanggal(hriPensiun, blnPensiun, thnPensiun);
    }

    //Menampilkan info DosenTetap
    @Override
    public void printInfo() {
        double tunjangan = 0.02 * getMasaKerjaTahun() * gaji_pokok;

        System.out.println("NIP: " + NIP);
        System.out.println("NIDN: " + NIDN);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tglLahir.print());
        System.out.println("TMT: " + TMT.print());
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("Tanggal Pensiun: " + TglPensiun().print());
        System.out.println("Gaji Pokok: Rp " + String.format("%,.2f", gaji_pokok));
        System.out.println("Tunjangan: 2% x " + getMasaKerjaTahun() + " x Rp " + String.format("%,.2f", gaji_pokok) + " = Rp " + String.format("%,.2f", tunjangan));
    }
} //end of class DosenTetap

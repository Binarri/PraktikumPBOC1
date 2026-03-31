/* Nama File    : Pengusaha.java
 Deskripsi      : berisi atribut dan method dalam class Pengusaha
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 28 Maret 2026 
*/

package TugasPelaporanPajak;

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak{
    /*************ATRIBUT********************/
    private String npwp;
    private static int counterPengusaha=0;


    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa Parameter
    public Pengusaha(){
        counterPengusaha++;
    }

    //Konstruktor dengan Parameter
    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut NPWP
    public String getNPWP(){
        return npwp;
    }

    //Mengembalikan jumlah objek Pengusaha
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    /*************MUTATOR********************/
    //Mengubah nilai NPWP
    public void setNPWP(String npwp){
        this.npwp = npwp;
    }

    /*============Method Lainnya============*/
    //Menghitung Masa Kerja Pengusaha
    @Override
    public int hitungMasaKerja(){
        //NIM: 24060124140143
        int B = 4;
        Period p = Period.between(tgl_mulai_kerja, LocalDate.now());
        return p.getYears() + B;
    }

    //Menghitung Pajak Pengusaha
    @Override
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    //Menampilkan info Pengusaha
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}//end class Pengusaha

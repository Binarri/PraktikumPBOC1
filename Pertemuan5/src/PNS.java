/* Nama File    : PNS.java
 Deskripsi      : berisi atribut dan method dalam class PNS
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 28 Maret 2026 
*/

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{
    /***************ATRIBUT********************/
    private String nip;
    private static int counterPNS=0;

    
    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa Parameter
    public PNS(){
        counterPNS++;
    }

    //Konstruktor dengan Parameter
    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai NIP
    public String getNIP(){
        return nip;
    }

    //Mengembalikan jumlah objek PNS
    public static int getCounterPNS(){
        return counterPNS;
    }

    /*============MUTATOR============*/
    //Mengubah nilai NIP
    public void setNIP(String nip){
        this.nip = nip;
    }
    
    /*============Method Lainnya============*/
    //Menghitung masa kerja PNS
    @Override
    public int hitungMasaKerja(){
        //NIM: 24060124140143
        int A = 3;
        Period p = Period.between(tgl_mulai_kerja, LocalDate.now());
        return p.getYears() + A;
    }

    //Menghitung pajak pada PNS
    @Override
    public double hitungPajak(){
        return 0.1 * pendapatan;
    }

    //Menampilkan info PNS
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}//end class PNS

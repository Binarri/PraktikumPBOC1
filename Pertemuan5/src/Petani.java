/* Nama File    : Petani.java
 Deskripsi      : berisi atribut dan method dalam class Petani
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 28 Maret 2026 
 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    /*************ATRIBUT********************/
    private String asal_kota;
    private static int counterPetani=0;
    
    
    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa Parameter
    public Petani(){
        counterPetani++;
    }

    //Konstruktor dengan Parameter
    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut asal kota
    public String getAsalKota(){
        return asal_kota;
    }

    //Mengembalikan jumlah objek Petani
    public static int getCounterPetani(){
        return counterPetani;
    }

    /*============MUTATOR============*/
    //Mengubah nilai asal kota
    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    /*============Method Lainnya============*/
    //Menghitung masa kerja petani
    @Override
    public int hitungMasaKerja(){
        //NIM: 24060124140143
        int C = 1;
        Period p = Period.between(tgl_mulai_kerja, LocalDate.now());
        return p.getYears() + C;
    }

    //Menghitung pajak petani
    @Override
    public double hitungPajak(){
        return 0;
    }

    //Menampilkan info petani
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}//end class Petani

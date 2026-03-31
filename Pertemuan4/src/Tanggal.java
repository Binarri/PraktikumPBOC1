/* Nama File    : Pegawai.java
 Deskripsi      : berisi atribut dan method dalam class Tanggal
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 20 Maret 2026 
 */

public class Tanggal {
    /*************ATRIBUT********************/
    private int hari, bulan, tahun;
    private static int counterTanggal=0;


    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Tanggal(){
        counterTanggal++;
    }

    //Konstruktor dengan Parameter
    public Tanggal(int hari, int bulan, int tahun) {
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
        counterTanggal++;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai hari
    public int getHari(){ 
        return hari; 
    }

    //Mengembalikan nilai bulan
    public int getBulan(){ 
        return bulan; 
    }

    //Mengembalikan nilai tahun
    public int getTahun(){ 
        return tahun; 
    }

    //Mengembalikan nilai counterTanggal
    public static int getCounterTanggal() {
        return counterTanggal;
    }

    /*============MUTATOR============*/
    //Mengubah nilai hari
    public void setHari(int hari){ 
        this.hari = hari; 
    }

    //Mengubah nilai bulan
    public void setBulan(int bulan){ 
        this.bulan = bulan; 
    }

    //Mengubah nilai tahun
    public void setTahun(int tahun){ 
        this.tahun = tahun; 
    }

    /*============Method Lainnya============*/
    //Mengubah bulan dari integer jadi string
    public String getNamaBulan() {
        String[] bulanString = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        return bulanString[this.bulan - 1];
    }
    
    //Menampilkan informasi tanggal
    public String print() {
        return hari + " " + getNamaBulan() + " " + tahun;
    }
} //end of class Tanggal

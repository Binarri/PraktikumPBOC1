/* Nama File    : Pegawai.java
 Deskripsi      : berisi atribut dan method dalam class Tanggal
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 20 Maret 2026 
 */

public class Tanggal {
    /*************ATRIBUT********************/
    private int hari, bulan, tahun;
    private static int counterTanggal=0;

    /*************KONSTRUKTOR********************/
    //Tanpa Parameter 
    public Tanggal(){
        counterTanggal++;
    }

    //Dengan Parameter
    public Tanggal(int hari, int bulan, int tahun) {
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
        counterTanggal++;
    }

    /*************SELEKTOR********************/
    public int getHari(){ 
        return hari; 
    }

    public int getBulan(){ 
        return bulan; 
    
    }
    public int getTahun(){ 
        return tahun; 
    }

    /*************MUTATOR********************/
    public void setHari(int hari){ 
        this.hari = hari; 
    }

    public void setBulan(int bulan){ 
        this.bulan = bulan; 
    }

    public void setTahun(int tahun){ 
        this.tahun = tahun; 
    }

    /*************METHOD********************/
    //Mengubah bulan dari integer jadi string
    public String getNamaBulan() {
        String[] bulanString = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        return bulanString[this.bulan - 1];
    }
    
    //Menampilkan informasi tanggal
    public String print() {
        return hari + " " + getNamaBulan() + " " + tahun;
    }
}

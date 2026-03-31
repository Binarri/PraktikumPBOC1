/* Nama File    : Pegawai.java
 Deskripsi      : berisi atribut dan method dalam class Pegawai
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 18 Maret 2026 
 */


public class Pegawai {
    /*************ATRIBUT********************/
    protected String NIP;
    protected String nama;
    protected Tanggal tglLahir;
    protected Tanggal TMT;
    protected double gaji_pokok;
    private static int counterPegawai = 0;

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Pegawai(){
        this.NIP = " ";
        this.nama = " ";
        this.tglLahir = new Tanggal();
        this.TMT = new Tanggal();
        this.gaji_pokok = 0;
        counterPegawai++;
    }

    //Konstruktor dengan Parameter
    public Pegawai(String NIP, String nama, Tanggal tglLahir, Tanggal TMT, double gaji_pokok){
        this.NIP = NIP;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.TMT = TMT;
        this.gaji_pokok = gaji_pokok;
        counterPegawai++;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai NIP
    public String getNIP(){
        return NIP;
    }

    //Mengembalikan nilai nama
    public String getNama(){
        return nama;
    }

    //Mengembalikan nilai tanggal lahir
    public Tanggal getTglLahir(){
        return tglLahir;
    }

    //Mengembalikan nilai TMT
    public Tanggal getTMT(){
        return TMT;
    }

    //Mengembalikan nilai gaji pokok
    public double getGajiPokok(){
        return gaji_pokok;
    }

    //Mengembalikan nilai counterPegawai
    public static int getCounterPegawai() {
        return counterPegawai;
    }

    /*============MUTATOR============*/
    //Mengubah nilai NIP
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    //Mengubah nilai nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //Mengubah nilai tanggal lahir
    public void setTglLahir(Tanggal tglLahir){
        this.tglLahir = tglLahir;
    }

    //Mengubah nilai TMT
    public void setTMT(Tanggal TMT){
        this.TMT = TMT;
    }

    //Mengubah nilai gaji pokok
    public void setGajiPokok(double gaji_pokok){
        this.gaji_pokok = gaji_pokok;
    }

    /*============Method Lainnya============*/
    //Menghitung masa kerja dalam tahun..bulan..
    public String getMasaKerja(){
        int nowTahun = 2025;
        int nowBulan = 3;

        int tahun = nowTahun - TMT.getTahun();
        int bulan = nowBulan - TMT.getBulan();
        if(bulan < 0){
            tahun--;
            bulan += 12;
        }
        return tahun + " tahun " + bulan + " bulan";
    }

    // Untuk hitung tahun masa kerja
    public int getMasaKerjaTahun() {
        return 2025 - TMT.getTahun(); 
    }

    //Menampilkan info pegawai
    public void printInfo(){
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tglLahir.print());
        System.out.println("TMT: " + TMT.print());
        System.out.println("Gaji Pokok: Rp " + String.format("%,.2f", gaji_pokok));
    }
} //end of class Pegawai

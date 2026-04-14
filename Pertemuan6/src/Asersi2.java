/* Nama File    : Asersi2.java
 Deskripsi      : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 14 April 2026 
 */

 //Class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//Class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

/*==========Secara konsep, pada program Asersi2 ada yang kurang tepat==========*/
//Saat program Asersi2 dijalankan dengan perintah java Asersi2, nilai jariJari = 0 tetap diproses sehingga program berjalan dan menghasilkan output Keliling lingkaran = 0.0, karena asersi tidak aktif. 
//Namun saat dijalankan dengan java -enableassertions Asersi2, kondisi assert(jariJari > 0) akan diperiksa dan karena tidak terpenuhi, program langsung berhenti dengan error seuai pesan asersi. 
//Hal ini menunjukkan bahwa hasil program bergantung pada cara menjalankannya, sehingga penggunaan asersi untuk kondisi ini kurang tepat karena program tetap bisa berjalan meskipun input tidak valid jika asersi tidak diaktifkan.

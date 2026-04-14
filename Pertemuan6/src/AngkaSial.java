/* Nama File    : AngkaSial.java
 Deskripsi      : Program penggunaan exception buataan sendiri
                  Pengenalan klausa 'throw' dan 'throws'
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 14 April 2026 
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        } 
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}


// Baris 12 tidak dieksekusi ketika exception terjadi, karena saat cobaAngka(13) dijalankan, perintah throw langsung menghentikan eksekusi method dan program berpindah ke blok catch, sehingga baris tersebut dilewati.
// Baris 21 juga tidak dieksekusi karena setelah exception terjadi di dalam blok try, program tidak melanjutkan ke baris berikutnya, termasuk pemanggilan cobaAngka(12), dan langsung masuk ke blok catch untuk menampilkan pesan yang sudah didefinisikan.
/* Nama File    : SeminarMain.java
 Deskripsi      : Main class untuk menguji implementasi kelas Civitasakademika, Dosen, Mahasiswa, dan Seminar.
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 26 April 2026
*/


public class SeminarMain {
    public static void main(String[] args) {
        /*====4e. Membuat 2 objek Dosen dan 5 objek Mahasiswa======*/
        //Pembuatan objek Dosen
        Dosen D1 = new Dosen("Dr. Smith", "123456789");
        Dosen D2 = new Dosen("Dr. Johnson", "987654321");
        //Pembuatan objek Mahasiswa
        Mahasiswa2 M1 = new Mahasiswa2("Alice", "2406012414442", D1);
        Mahasiswa2 M2 = new Mahasiswa2("Budi", "2406012412154", D2);
        Mahasiswa2 M3 = new Mahasiswa2("Christy", "2406012432145", D1);
        Mahasiswa2 M4 = new Mahasiswa2("David", "24060124123541", D2);
        Mahasiswa2 M5 = new Mahasiswa2("Indah", "24060124140143", D1);
        
        /*====4b.Membuat objek Seminar=======*/
        Seminar seminar = new Seminar();

        /*====4f.Aplikasikan prosedur registrasi==========*/
        seminar.registrasi(D1);
        seminar.registrasi(D2);
        seminar.registrasi(M1);
        seminar.registrasi(M2);
        seminar.registrasi(M3);
        seminar.registrasi(M4);
        seminar.registrasi(M5);
        
        /*====4i.Aplikasikan setWali=======*/
        M1.setWali(D2);
        M2.setWali(D1);
        M3.setWali(D2);
        M4.setWali(D1);
        M5.setWali(D2);

        /*====4j.Menampilkan Data mahasiswa=====*/
        System.out.println("\nData Mahasiswa: ");
        M1.tampilDataMahasiswa();
        M2.tampilDataMahasiswa();
        M3.tampilDataMahasiswa();
        M4.tampilDataMahasiswa();
        M5.tampilDataMahasiswa();
        
        /*====4g.Menampilkan daftar peserta==========*/
        seminar.tampilPeserta();

        /*====4c.Menampilkan banyaknya peserta=========*/
        System.out.println("\nJumlah peserta seminar: " + seminar.countPeserta());

        /*====4h.Menampilkan banyaknya mahasiswa======*/
        System.out.println("Jumlah mahasiswa seminar: " + seminar.countMahasiswa());
    }
} //end of class SeminarMain


/*============Kesimpulan Cara kerja Polimorfisme================*/
/*Polimorfisme memungkinkan objek dari kelas yang berbeda untuk diperlakukan sebagai objek dari kelas yang sama melalui pewarisan. 
 Dalam contoh ini, baik Dosen maupun Mahasiswa dapat diregistrasi sebagai peserta seminar karena keduanya merupakan subclass dari Civitasakademika.
 Dengan menggunakan metode yang sama (seperti getNomor() dan getNama()), kita dapat mengakses informasi dari objek Dosen dan Mahasiswa tanpa perlu mengetahui jenis spesifiknya.
*/
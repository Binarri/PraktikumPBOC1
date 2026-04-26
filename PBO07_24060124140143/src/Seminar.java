/* Nama File    : Seminar.java
 Deskripsi      : Seminar merupakan kelas yang mengelola peserta seminar yang terdiri dari civitas akademika (dosen dan mahasiswa)
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 26 April 2026
*/

//4b. Membuat kelas aplikator Seminar yang memiliki atribut sebuah array statis dan sebuah atribut banyak peserta
//    Pada Konstruktor Seminar pasttikan banyak peserta seminar diinisialisasi dengan nilai 0
public class Seminar {
    /***************ATRIBUT********************/
    private Civitasakademika[] pesertas;
    private int banyakpeserta;

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor tanpa parameter
    public Seminar(){
        this.pesertas = new Civitasakademika[100]; //peserta seminar maksimum 100 peserta
        this.banyakpeserta = 0;
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut banyakpeserta
    public int getBanyakPeserta(){
        return banyakpeserta;
    }

    /*============MUTATOR============*/
    //Mengubah nilai atribut banyakpeserta
    public void setBanyakPeserta(int banyakpeserta){
        this.banyakpeserta = banyakpeserta;
    }

    /*============Method Lainnya============*/
    //4c. Fungsi untuk menghitung banyaknya peserta seminar
    public int countPeserta(){
        return banyakpeserta;
    }

    //4d. Prosedur untuk menambahkan seorang peserta
    public void registrasi(Civitasakademika peserta){
        if (banyakpeserta < pesertas.length) {
            pesertas[banyakpeserta] = peserta;
            banyakpeserta++;
        } else {
            System.out.println("Kapasitas seminar sudah penuh!");
        }
    }

    //4g. Prosedur untuk menampilkan daftar Nomor dan Nama semua peserta seminar
    public void tampilPeserta(){
        System.out.println("\nDaftar Peserta Seminar: ");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println("Nomor: " + pesertas[i].getNomor());
            System.out.println("Nama: " + pesertas[i].getNama());
            System.out.println("===============================");
        }
    }

    //4h. Fungsi untuk menghitung banyaknya peserta mahasiswa
    public int countMahasiswa(){
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa2) {
                count++;
            }
        }
        return count;
    }
} //end of class Seminar

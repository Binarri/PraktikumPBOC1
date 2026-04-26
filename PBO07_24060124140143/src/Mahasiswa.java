/* Nama File    : Mahasiswa.java
 Deskripsi      : Kelas mahasiswa untuk mendemonstrasikan ad hoc polymorphism (overloading).
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 26 April 2026
*/

//2a. Realisasi kelas Mahasiswa
public class Mahasiswa {
    /*************ATRIBUT********************/
    private String NIM;
    private String Nama;
    private String Programstudi;
    

    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //2c. Konstruktor tanpa parameter
    public Mahasiswa(){
        this.NIM = "-999";
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    //2d. Konstruktor dengan parameter
    public Mahasiswa(String NIM, String Nama, String Programstudi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    //2e. Konstruktor kloning
    public Mahasiswa(Mahasiswa m){
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.Programstudi = m.Programstudi;
    }


    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut NIM
    public String getNIM(){
        return NIM;
    }
    //Mengembalikan nilai atribut Nama
    public String getNama(){
        return Nama;
    }
    //Mengembalikan nilai atribut Program Studi
    public String getProgramStudi(){
        return Programstudi;
    }


    /*============MUTATOR============*/
    //Mengubah nilai atribut NIM
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    //Mengubah nilai atribut Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    //Mengubah nilai atribut Program Studi
    //Varian pertama: tanpa parameter
    public void setProgramStudi(){
        this.Programstudi = "Kosong";
    }
    //Varian kedua: satu parameter string
    public void setProgramStudi(String prodi){
        this.Programstudi = prodi;
    }
    //Varian ketiga: satu parameter objek mahasiswa lain
    public void setProgramStudi(Mahasiswa m){
        this.Programstudi = m.getProgramStudi();
    }


    /*============Method Lainnya============*/
    //Menampilkan info mahasiswa
    public void print(){
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Program Studi: " + Programstudi);
        System.out.println();
    }
} //end of class Mahasiswa

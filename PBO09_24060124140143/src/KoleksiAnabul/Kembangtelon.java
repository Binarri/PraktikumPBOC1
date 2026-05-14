/* Nama File    : Kembangtelon.java
 Deskripsi      : Kembangtelon merupakan subclass dari Kucing
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 14 Mei 2026
*/

package KoleksiAnabul;

public class Kembangtelon extends Kucing{
    /*************ATRIBUT********************/
    private String jenisRambut;

    
    /***************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Konstruktor dengan parameter
    public Kembangtelon(String nama, double bobot){
        super(nama, bobot);
        this.jenisRambut = "Pendek";
    }

    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut jenisRambut
    public String getJenisRambut(){
        return jenisRambut;
    }

    /*============MUTATOR============*/
    //Mengubah nilai atribut jenisRambut
    public void setJenisRambut(String jenisRambut){
        this.jenisRambut = jenisRambut;
    }

    /*============Method Lainnya============*/
    //Untuk menampilkan gerakan kembangtelon
    @Override
    public void Gerak(){
        System.out.println("Gerak: Meloncat cepat");
    }
    //Untuk menampilkan suara kembangtelon
    @Override
    public void Bersuara(){
        System.out.println("Suara: meong kembang");
    }

}//end of class Kembangtelon

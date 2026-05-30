/* Nama File    : LambdaList.java
 Deskripsi      : Program main yang digunakan untuk menampilkan nama-nama mahasiswa dari sebuah List dengan menggunakan ekspresi lambda.
 Pembuat        : Binar Ridha Wiritanaya - 24060124140143
 Tanggal        : 30 Mei 2026 
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args){
        //Membuat List nama mahasiswa
        ArrayList<String> mahasiswaList = new ArrayList<>();
        //Menambahkan nama mahasiswa ke dalam List
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}

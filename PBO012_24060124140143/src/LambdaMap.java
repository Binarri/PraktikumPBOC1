/* Nama File    : LambdaMap.java
 Deskripsi      : Program main yang digunakan untuk menampilkan key dan value dari sebuah Map dengan menggunakan ekspresi lambda.
 Pembuat        : Binar Ridha Wiritanaya - 24060124140143
 Tanggal        : 30 Mei 2026 
 */

import java.util.HashMap;
import java.util.Map;

/* LATIHAN
Buatlah sebuah program yang digunakan untuk menampilkan key dan value dari sebuah Map,
dimana key merupakan NIM dan value merupakan nama mahasiswa, menggunakan ekspresi
lambda!*/
public class LambdaMap {
        public static void main(String[] args){
        //Membuat Map nama mahasiswa dengan NIM sebagai key dan nama sebagai value
        Map<String, String> mahasiswaMap = new HashMap<>();
        //Menambahkan data mahasiswa ke dalam Map
        mahasiswaMap.put("24060124130001","Adi");
        mahasiswaMap.put("24060124130002","Bambang");
        mahasiswaMap.put("24060124130003","Cici");
        mahasiswaMap.put("24060124130004","Didi");

        //lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim,nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}

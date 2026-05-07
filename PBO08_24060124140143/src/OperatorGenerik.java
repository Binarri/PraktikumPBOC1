/* Nama File    : OperatorGenerik.java
 Deskripsi      : Operator Generik adalah kelas yang berisi prosedur dan fungsi generik untuk melakukan operasi pada berbagai tipe data.
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 30 April 2026
*/

// 3. Definisi sebuah kelas OperatorGenerik
public class OperatorGenerik {
    //3a. Membuat realisasi prosedur generik Tukar
    /**
     * Prosedur generik Tukar untuk menukar nilai dua parameter
     * Menggunakan array untuk memungkinkan penukaran nilai aktual
     * @param <T> Tipe data generik
     * @param arr Array yang berisi dua elemen untuk ditukar
     */
    public static <T> void Tukar(T[] arr){
        if (arr.length >= 2){
            T temp=arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }

    //3c. Membuat realisasi fungsi generik Bobot2
    /**
     * Fungsi generik Bobot2 untuk menghitung jumlah bobot dua objek
     * @param k1 Objek kucing pertama
     * @param k2 Objek kucing kedua
     * @return Jumlah bobot kedua kucing
     */
    public static double Bobot2(Kucing k1, Kucing k2){
        return k1.getBobot() + k2.getBobot();
    }
}//end of class OperatorGenerik

/* Nama File    : DiskonLambda.java
 Deskripsi      : Program main yang digunakan untuk menghitung diskon dengan menggunakan ekspresi lambda
 Pembuat        : Binar Ridha Wiritanaya - 24060124140143
 Tanggal        : 30 Mei 2026 
 */


 interface IDiskon{
    public double hitungDiskon(int harga);
 }

 public class DiskonLambda{
    public static void main(String[] args){
        //tanpa lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };

        //dengan lambda inline
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        //dengan lambda dengan block statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        //dengan lambda dengan block statement
        IDiskon diskonBertingkat = (harga) -> {
            if(harga >= 100000){
                return harga - (harga * 0.3); //diskon 30% untuk harga >= 100rb
            } else if(harga >= 50000){
                return harga - (harga * 0.15); //diskon 15% untuk harga >= 50 rb
            } else {
                return harga;  //tidak ada diskon
            }
        };

        //Menampilkan hasil diskon
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
        System.out.println("Diskon Bertingkat: " + diskonBertingkat.hitungDiskon(45000));
    }
 }

 
/* Dapatkah anda membedakan antara bagamana diskonLebaran dan diskonBiasa diimplementasikan ? 
DiskonLebaran diimplementasikan menggunakan lambda inline karena hanya terdiri dari satu ekspresi sederhana sehingga tidak memerlukan blok maupun keyword return. 
Sedangkan diskonBiasa diimplementasikan menggunakan lambda block statement yang menggunakan kurung kurawal dan keyword return. 
Perbedaan output terjadi karena masing-masing menggunakan persentase diskon yang berbeda.
*/


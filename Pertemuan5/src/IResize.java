/* Nama File    : IResize.java
 Deskripsi      : berisi method zoomIn, zoomOut, zoom 
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 27 Maret 2026 
 */

public interface IResize {
    //Menambah ukuran menjadi 10 % lebih besar
    public void zoomIn();

    //Mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    //Menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);


    //Keuntungan method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface IResize yaitu lebih fleksibel karena dapat digunakan oleh berbagai class tanpa harus memiliki hubungan inheritance, serta hanya digunakan pada class yang membutuhkan saja yang mengimplementasikannya
}//end interface IResize
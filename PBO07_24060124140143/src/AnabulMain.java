/* Nama File    : AnabulMain.java
 Deskripsi      : Kelas main untuk menguji implementasi kelas Anabul dan subclassnya (Kucing, Anjing, Burung).
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 26 April 2026
*/

public class AnabulMain {
    public static void main(String[] args) {
        /*============Implementasi class Kucing============*/
        System.out.println("====ANABUL KUCING====");
        //Pembuatan objek
        Anabul k1 = new Kucing("Coco");
        //Implementasi method
        System.out.println("Nama: " + k1.getNama());
        k1.Gerak();
        k1.Bersuara();

        /*============Implementasi class Anjing============*/
        System.out.println("\n====ANABUL ANJING====");
        //Pembuatan objek
        Anabul a1 = new Anjing("Poppy");
        //Implementasi method
        System.out.println("Nama: " + a1.getNama());
        a1.Gerak();
        a1.Bersuara();

        /*============Implementasi class Burung============*/
        System.out.println("\n====ANABUL BURUNG====");
        //Pembuatan objek
        Anabul b1 = new Burung("Kairo");
        //Implementasi method
        System.out.println("Nama: " + b1.getNama());
        b1.Gerak();
        b1.Bersuara();
    }
} //end of class AnabulMain

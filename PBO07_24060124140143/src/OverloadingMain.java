/* Nama File    : OverloadingMain.java
 Deskripsi      : Aplikasi untuk mendemonstrasikan penggunaan overloading pada kelas mahasiswa
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 26 April 2026
*/

public class OverloadingMain {
    public static void main(String[] args){
        System.out.println("2b.Contoh aplikasi semua varian operator kelas Mahasiswa");

        //2c. aplikasi konstruktor mahasiswa tanpa parameter
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Mahasiswa 1: ");
        m1.print();
        //2d. aplikasi konstruktor mahasiswa dengan parameter 
        Mahasiswa m2 = new Mahasiswa("24060124130172", "Almahira", "Informatika");
        System.out.println("Mahasiswa 2: ");
        m2.print();
        //2e. aplikasi konstruktor kloning
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("Mahasiswa 3: ");
        m3.print();

        System.out.println("\n======================================");
        //Varian1: tanpa parameter
        System.out.println("Mengubah program studi m1 tanpa parameter");
        m1.setProgramStudi();
        m1.print();
        //Varian2: satu parameter string
        System.out.println("Mengubah program studi m1 dengan satu parameter string");
        m1.setProgramStudi("Manajemen");
        m1.print();
        //Varian3: satu parameter objek mahasiswa lain
        System.out.println("Mengubah program studi m1 dengan satu parameter objek mahasiswa lain(m2)");
        m1.setProgramStudi(m2);
        m1.print();
    }
} //end of class OverloadingMain

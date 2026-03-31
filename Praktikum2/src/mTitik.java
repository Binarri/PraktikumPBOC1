/* Nama File    : mTitik.java
   Deskripsi    : berisi atribut dan method dalam class Titik
   Pembuat      : Binar Ridha Wiritanaya
   Tanggal      : 26 Februari 2026
*/
public class mTitik {
    public static void main(String[] args) {
        // Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        // T1.setAbsis (3); //mengubah absis T1 dengan nilai 3
        // T1.setOrdinat(4); //mengubah ordinet T1 dengan nilai 4
        // T1.printTitik(); //mencetak koordinat T1 ke layar
        // T1.geser(3,4); //menggeser T1 sejauh (3,4)
        // T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        // Titik T2 = T1;
        // T2.printTitik();
        // T1.setAbsis(10);
        // T1.setOrdinat(10);
        // T2.printTitik();

        //Pembuatan Objek
        // objek 1
        Titik T1= new Titik(); //Membuat objek titik T1(0,0)
        // objek 2
        Titik T2 = new Titik(3,5); //Membuat objek titik T2(3,5)
        // objek 3
        Titik T3 = new Titik();


        //Implementasi Method
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        //System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());

        System.out.println("Kuadran T1: " + T1.getKuadran()); //menghitung kuadran T1
        System.out.println("Kuadran T2: " + T2.getKuadran()); //menghitung kuadran T2

        System.out.println("Jarak T1 ke pusat: " + T1.getJarakPusat()); //menghitung jarak T1 ke pusat koordinat
        System.out.println("Jarak T2 ke pusat: " + T2.getJarakPusat()); //menghitung jarak T2 ke pusat koordinat

        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2)); //menghitung jarak T1 ke T2

        T2.refleksiX(); //merefleksikan T2 terhadap sumbu x
        T2.printTitik();

        T1= T2.getRefleksiX(); //merefleksikan T2 terhadap sumbu x tanpa mengubah T2, hasilnya disimpan di T1
        T1.printTitik();

        T2.refleksiY(); //merefleksikan T2 terhadap sumbu y
        T2.printTitik();
        
        T3=T2.getRefleksiY(); //merefleksikan T2 terhadap sumbu y tanpa mengubah T2, hasilnya disimpan di T3
        T3.printTitik();
    }
}

/* Nama File    : MainPiaraan.java
 Deskripsi      : Program utama untuk mengimplementasikan class Piaraan
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 14 Mei 2026
*/

package KoleksiAnabul;

public class MainPiaraan {
    public static void main(String[] args){
        /***********Pembuatan Objek************/
        Piaraan P = new Piaraan();
        //Objek Anabul
        Anjing A = new Anjing("Doggy");
        Burung B = new Burung("Merpati");
        Kucing K = new Kucing("Kitty", 4.5);
        Anggora G = new Anggora("Milo", 5.0);
        Kembangtelon KT = new Kembangtelon("Max", 3.4);

        /*************Implementasi Mutator*************/
        //2b ii. enqueueAnabul(anabul)
        P.enqueueAnabul(A);
        P.enqueueAnabul(B);
        P.enqueueAnabul(K);
        P.enqueueAnabul(G);
        P.enqueueAnabul(KT);
        P.showAnabul();
        
        
        /*************Implementasi Selektor*************/
        //2b i. getNbelm()
        System.out.println("\nJumlah Anabul: " + P.getNbelm());
        //2b iv. getAnabul()
        System.out.println("\nAnabul pertama: " + P.getAnabul().getNama());
        
        
        /*************Implementasi Mutator*************/
        //2b v. dequeueAnabul()
        System.out.println("\nHewan yang keluar antrean: " + P.dequeueAnabul().getNama());
        System.out.println("Setelah dequeue ");


        /*************Implementasi Method Lainnya*************/
        //2c. showAnabul()
        P.showAnabul();
        //2b iii. isMember(anabul)
        System.out.println("\nisMember Kitty? : " + P.isMember(K));
        //2d. countKucing()
        System.out.println("\nJumlah keluarga kucing: " + P.countKucing());
        //2e. bobotKucing()
        System.out.println("\nTotal bobot keluarga kucing: " + P.bobotKucing());
        //2f. showJenisAnabul
        System.out.println();
        P.showJenisAnabul();

    }
} //end of class MainPiaraan


/*============Kesimpulan Cara kerja Koleksi================*/
/*Konsep koleksi memungkinkan sekumpulan objek disimpan dalam satu wadah sehingga data dapat dikelola, ditambah, dihapus, dan dicari dengan lebih mudah.*/
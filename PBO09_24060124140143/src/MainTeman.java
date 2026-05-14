/* Nama File    : MainTeman.java
 Deskripsi      : Program utama untuk mengimplementasikan class Teman
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 7 Mei 2026
*/

public class MainTeman {
    public static void main(String[] args){
        //Pembuatan Objek
        Teman T = new Teman();  

        /************Implementasi method lainnya**********/
        //1d. addNama(nama)
        T.addNama("Annis");
        T.addNama("Anna");
        T.addNama("Mimo");
        T.addNama("Naya");
        T.showTeman();


        /**********Implementasi selektor*********/
        //1a. getNbelm()
        System.out.println("\nJumlah Teman: " + T.getNbelm());
        //1b. getNama(indeks)
        System.out.println("\nNama pada indeks ke-0 : "+ T.getNama(0));
        System.out.println("Nama pada indeks ke-1 : "+ T.getNama(1));
        System.out.println("Nama pada indeks ke-2 : "+ T.getNama(2));
        System.out.println("Nama pada indeks ke-3 : "+ T.getNama(3));


        /********Implementasi mutator*******/
        //1c. setNama(indeks, nama)
        T.setNama(2,"Citra");
        System.out.println("\nSetelah diubah");
        T.showTeman();


        /************Implementasi method lainnya**********/
        //1f. isMember(nama)
        System.out.println("\nIsMember Anna? : " + T.isMember("Anna"));

        //1g. gantiNama(nama, namabaru)
        T.gantiNama("Annis", "Naya");
        System.out.println("\nSetelah ganti Nama");
        T.showTeman();

        //1e. delNama(nama)
        T.delNama("Anna");
        System.out.println("\nSetelah hapus nama");
        //1i. showTeman()
        T.showTeman();

        //1h. countNama(nama)
        System.out.println("\nJumlah nama Naya: " + T.countNama("Naya"));
            
    } 
} //end of class MainTeman

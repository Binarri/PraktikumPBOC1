/* Nama File    : MainData.java
 Deskripsi      : Kelas MainData merupakan kelas utama untuk menguji implementasi kelas Data generik dengan berbagai tipe data, termasuk tipe primitif (Integer), tipe referensi (String), dan tipe objek (Anabul dan subclassnya).
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 6 Mei 2026
*/

public class MainData {
    public static void main(String[] args){
        //4a. Membuat aplikasi kelas Data generik
        System.out.println("/*============Implementasi class Data Generik ==============*/");

        System.out.println("\nAPLIKASI DATA DENGAN INTEGER");
        Data<Integer> dataInteger = new Data<>();
        System.out.println("Kapasitas: " + dataInteger.getKapasitas() + " elemen");
        System.out.println("Ukuran awal: " + dataInteger.getSize() + " elemen\n");

        //Mengisi beberapa elemen dengan Integer
        dataInteger.setIsi(1,10);
        dataInteger.setIsi(2,20);
        dataInteger.setIsi(3,30);
        dataInteger.setIsi(5,50);

        System.out.println("Setelah setIsi beberapa nilai:");
        System.out.println("Ukuran: " + dataInteger.getSize() + " elemen");
        System.out.println("Nilai di posisi 1: " + dataInteger.getIsi(1));
        System.out.println("Nilai di posisi 2: " + dataInteger.getIsi(2));
        System.out.println("Nilai di posisi 3: " + dataInteger.getIsi(3));
        System.out.println("Nilai di posisi 4: " + dataInteger.getIsi(4)); //null karena 4 ke skip
        System.out.println("Nilai di posisi 5: " + dataInteger.getIsi(5));
        

        System.out.println("\nAPLIKASI DATA DENGAN STRING");
        Data<String> dataString = new Data<>();
        //Mengisi beberapa elemen dengan String
        dataString.setIsi(1, "Hello");
        dataString.setIsi(2, "World");
        dataString.setIsi(3, "Data Generik");

        System.out.println("Setelah setIsi beberapa nilai:");
        System.out.println("Ukuran: " + dataString.getSize());
        System.out.println("Elemen di posisi 1: " + dataString.getIsi(1));
        System.out.println("Elemen di posisi 2: " + dataString.getIsi(2));
        System.out.println("Elemen di posisi 3: " + dataString.getIsi(3));
        


        //4b. Membuat aplikasi setIsi dengan keluarga Anabul
        System.out.println("\nSet isi dengan keluarga Anabul");
        System.out.println("\nAPLIKASI DATA DENGAN ANABUL");
        Data<Anabul> dataAnabul = new Data<>();

        System.out.println("Memasukkan objek Anabul: ");
        dataAnabul.setIsi(1, new Anjing("Doggy"));
        System.out.println(" setIsi(1, Anjing 'Doggy')");

        dataAnabul.setIsi(2, new Kucing("Preety", 3.5));
        System.out.println(" setIsi(2, Kucing 'Kitty' dengan bobot 3.5 kg)");
        
        dataAnabul.setIsi(3, new Burung("Tweety"));
        System.out.println(" setIsi(3, Burung 'Tweety')");
        
        dataAnabul.setIsi(4, new Anggora("Anggora pink", 2.5));
        System.out.println(" setIsi(4, Anggora 'Anggora Pink' dengan bobot 2.5 kg)");

        dataAnabul.setIsi(5, new Kembangtelon("Kembangtelon HItam", 1.5));
        System.out.println(" setIsi(5, Kembangtelon 'Kembangtelon Hitam' dengan bobot 1.5 kg)");


        //4c. Membuat aplikasi getIsi dengan keluarga Anabul
        System.out.println("\nGet isi dengan keluarga Anabul");
        for (int i=1; i<=dataAnabul.getSize(); i++){
            Anabul anabul = dataAnabul.getIsi(i);
            if(anabul != null){
                System.out.println("\n---Posisi " + i + "------");
                System.out.println(anabul.getNama());
                anabul.Gerak();
                anabul.Bersuara();

                if(anabul instanceof Kucing){
                    Kucing kucing = (Kucing) anabul;
                    System.out.println("Bobot: " + kucing.getBobot() + " kg");

                    if(anabul instanceof Anggora){
                        Anggora anggora = (Anggora) anabul;
                        System.out.println("Jenis Rambut: " + anggora.getJenisRambut());
                    } else if(anabul instanceof Kembangtelon){
                        Kembangtelon kembangtelon = (Kembangtelon) anabul;
                        System.out.println("Jenis Rambut: " + kembangtelon.getJenisRambut());
                    }
                }
            }
        }

        //Contoh getIsi dengan posisi yang tidak ada
        System.out.println("\nPosisi 10(tidak ada) --");
        System.out.println("Hasil getIsi(10): " + dataAnabul.getIsi(10));


        //4d. Membuat aplikasi getSize dengan keluarga Anabul
        //getSize dengan keluarga Anabul
        System.out.println("\n=======getSize dengan keluarga Anabul=======");
        System.out.println("Data Anabul saat ini memiliki " + dataAnabul.getSize() + " elemen");
        System.out.println("Kapasitas maksimal: " + dataAnabul.getKapasitas() + " elemen");
        System.out.println("Sisa kapasitas: " + (dataAnabul.getKapasitas() - dataAnabul.getSize()) + " elemen");



        //Kombinasi: Demonstrasi Lengkap
        System.out.println("\n=======DEMONSTRASI LENGKAP: Semua Fungsi Data=======");
        Data<Anabul> dataLengkap = new Data<>();

        //Memasukkan data
        dataLengkap.setIsi(1, new Anjing("Aldo"));
        dataLengkap.setIsi(2, new Kucing("Mimi", 3.2));
        dataLengkap.setIsi(3, new Burung("Cici"));
        dataLengkap.setIsi(4, new Anggora("Anggora Coklat", 3.2));
        dataLengkap.setIsi(5, new Kembangtelon("KembangTelon Putih", 2.9));

        System.out.println("Total Anabul: " + dataLengkap.getSize());
        System.out.println("\nDaftar Anabul: ");
        for (int i=1; i<=dataLengkap.getSize(); i++){
            Anabul anabul = dataLengkap.getIsi(i);
            System.out.print(i + ". " + anabul.getNama());
            if(anabul instanceof Kucing){
                System.out.print("(Kucing - " + ((Kucing) anabul).getBobot() + " kg");
            }
            System.out.println();
        }

        System.out.println("\n====Perilaku Setiap Anabul====");
        for(int i=1; i<= dataLengkap.getSize(); i++){
            System.out.println("\n" + dataLengkap.getIsi(i).getNama());
            dataLengkap.getIsi(i).Gerak();
            dataLengkap.getIsi(i).Bersuara();
        }
    }
}//end of class MainData


//Simpulkan bagaimana cara kerja konsep Generik sesuai kalimat Anda sendiri!
// Konsep generik memungkinkan sebuah class atau method bekerja dengan berbagai tipe data tanpa perlu membuat kode yang berbeda untuk setiap tipe data.

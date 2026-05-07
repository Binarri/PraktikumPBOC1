/* Nama File    : MainDatum.java
 Deskripsi      : MainDatum merupakan program untuk mengilustrasikan kelas generik Datum dengan berbagai tipe data
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 30 April 2026
*/

//2. Aplikasi keluarga kelas Anabul dengan menggunakan kelas generik Datum
public class MainDatum {
    public static void main(String[] args){
        /*============Implementasi class Datum dengan tipe String============*/
        System.out.println("\nDATUM DENGAN STRING");
        //Pembuatan objek
        Datum<String> datumString = new Datum<>("Nama Hewan");
        //Implementasi selektor
        System.out.println("Isi Datum: " + datumString.getIsi());
        //Implementasi mutator
        datumString.setIsi("Seekor Anjing peliharaan");
        //Implementasi method lainnya
        System.out.println("Isi Datum setelah diubah: " + datumString.getIsi());


        /*============Implementasi class Datum dengan tipe Integer============*/
        System.out.println("\nDATUM DENGAN INTEGER");
        //Pembuatan objek
        Datum<Integer> datumInteger = new Datum<>(35);
        //Implementasi selektor
        System.out.println("Isi Datum: " + datumInteger.getIsi());
        //Implementasi mutator
        datumInteger.setIsi(70);
        //Implementasi method lainnya
        System.out.println("Isi Datum setelah diubah: " + datumInteger.getIsi());


        /*============Implementasi class Datum dengan tipe Double============*/
        System.out.println("\nDATUM DENGAN DOUBLE");
        //Pembuatan objek
        Datum<Double> datumDouble = new Datum<>(2.5);
        //Implementasi selektor
        System.out.println("Isi Datum: " + datumDouble.getIsi() + " kg");
        //Implementasi mutator
        datumDouble.setIsi(3.7);
        //Implementasi method lainnya
        System.out.println("Isi Datum setelah diubah: " + datumDouble.getIsi());


        /*============Implementasi class Datum dengan tipe Anabul (SuperClass)============*/
        System.out.println("\nDATUM DENGAN ANABUL");
        //Pembuatan objek
        Datum<Anabul> datumAnabul = new Datum<>(new Anjing("Hound Dog"));
        //Implementasi selektor
        System.out.println("Nama: " + datumAnabul.getIsi().getNama());
        datumAnabul.getIsi().Gerak();
        datumAnabul.getIsi().Bersuara();
        //Implementasi mutator
        datumAnabul.setIsi(new Kucing("Ragdoll", 4.1));
        //Implementasi method lainnya
        System.out.println("--------------------------------");
        System.out.println("Isi Datum setelah diubah: ");
        System.out.println("Nama: " + datumAnabul.getIsi().getNama());
        datumAnabul.getIsi().Gerak();
        datumAnabul.getIsi().Bersuara();


        /*============Implementasi class Datum dengan tipe Burung============*/
        System.out.println("\nDATUM DENGAN BURUNG");
        //Pembuatan objek
        Datum<Burung> datumBurung = new Datum<>(new Burung("Merpati"));
        //Implementasi selektor
        System.out.println("Nama : " + datumBurung.getIsi().getNama());
        datumBurung.getIsi().Gerak();
        datumBurung.getIsi().Bersuara();
        //Implementasi mutator
        datumBurung.setIsi(new Burung("Kenari"));
        //Implementasi method lainnya
        System.out.println("--------------------------------");
        System.out.println("Isi Datum setelah diubah: ");
        System.out.println("Nama : " + datumBurung.getIsi().getNama());
        datumBurung.getIsi().Gerak();
        datumBurung.getIsi().Bersuara();


        //============Implementasi class Datum dengan Anggora ============//
        System.out.println("\nDATUM DENGAN ANGGORA");
        //Pembuatan objek
        Datum<Anggora> datumAnggora = new Datum<>(new Anggora("Loreng", 2.8));
        //Implementasi selektor
        Anggora anggora = datumAnggora.getIsi();
        System.out.println("Nama : " + anggora.getNama());
        System.out.println("Bobot: " + anggora.getBobot() + " kg");
        System.out.println("Jenis Rambut: " + anggora.getJenisRambut());
        //Implementasi mutator
        anggora.setJenisRambut("lembut");
        //Implementasi method lainnya
        System.out.println("--------------------------------");
        System.out.println("Isi Datum setelah diubah: ");
        System.out.println("Nama : " + anggora.getNama());
        System.out.println("Bobot: " + anggora.getBobot() + " kg");
        System.out.println("Jenis Rambut: " + anggora.getJenisRambut());
        anggora.Gerak();
        anggora.Bersuara();


        /*============Implementasi class Datum dengan KembangTelon============*/
        System.out.println("\nDATUM DENGAN KEMBANG TELON");
        //Pembuatan objek
        Datum<Kembangtelon> datumKembang = new Datum<>(new Kembangtelon("Mimi", 3.2));
        //Implementasi selektor
        Kembangtelon kembang = datumKembang.getIsi();
        System.out.println("Nama : " + kembang.getNama());
        System.out.println("Bobot: " + kembang.getBobot() + " kg");
        System.out.println("Jenis Rambut: " + kembang.getJenisRambut());
        //Implementasi mutator
        kembang.setJenisRambut("halus");
        //Implementasi method lainnya
        System.out.println("--------------------------------");
        System.out.println("Isi Datum setelah diubah: ");
        System.out.println("Nama : " + kembang.getNama());
        System.out.println("Bobot: " + kembang.getBobot() + " kg");
        System.out.println("Jenis Rambut: " + kembang.getJenisRambut());
        kembang.Gerak();
        kembang.Bersuara();
    }
}//end of class MainDatum

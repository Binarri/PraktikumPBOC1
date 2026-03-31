/* Nama File    : MPegawai.java
 Deskripsi      : berisi atribut dan method dalam class Pegawai
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 23 Maret 2026 
 */

public class MPegawai {
    public static void main(String[] args) {
        /*============Implementasi class Pegawai============*/
        System.out.println("====PEGAWAI====");
        //Pembuatan objek
        Tanggal tgl1 = new Tanggal(1, 1, 1995);
        Tanggal tmt1 = new Tanggal(1, 1, 2020);
        Pegawai p1 = new Pegawai("9930752222", "Azka", tgl1, tmt1, 3500000);
        //Implementasi Selektor
        System.out.println("NIP: " + p1.getNIP());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Tanggal Lahir: " + p1.getTglLahir().print());
        System.out.println("Tanggal Masuk Kerja: " + p1.getTMT().print());
        System.out.println("Gaji Pokok: Rp" + p1.getGajiPokok());
        System.out.println("Jumlah Pegawai: " + Pegawai.getCounterPegawai());
        //Implementasi Mutator
        p1.setNIP("9930206201");
        p1.setNama("Arka Pratama");
        p1.setGajiPokok(3000000);
        //Implementasi method lainnya
        System.out.println("\nSetelah diubah:");
        p1.printInfo();


        /*============Implementasi class Dosen============*/
        System.out.println("\n\n====DOSEN====");
        //Pembuatan objek
        Tanggal tgl2 = new Tanggal(2,2,1990);
        Tanggal tmt2 = new Tanggal(1,2,2018);
        Dosen d1 = new Dosen("9920510231", "Kiara", tgl2, tmt2, 4000000, "Fakultas Sains dan Matematika");
        //Implementasi Selektor
        System.out.println("NIP: " + d1.getNIP());
        System.out.println("Nama: " + d1.getNama());
        System.out.println("Tanggal Lahir: " + d1.getTglLahir().print());
        System.out.println("Tanggal Masuk Kerja: " + d1.getTMT().print());
        System.out.println("Gaji Pokok: Rp" + d1.getGajiPokok());
        System.out.println("Fakultas: " + d1.getFakultas());
        //Implementasi Mutator
        d1.setNIP("9920510231");
        d1.setNama("Kiara Putri");
        d1.setGajiPokok(4500000);
        d1.setFakultas("Fakultas Teknik");
        //Implementasi method lainnya
        System.out.println("\nSetelah diubah:");
        d1.printInfo();


        /*============Implementasi class Dosen Tetap============*/
        System.out.println("\n====DOSEN TETAP====");
        //Pembuatan objek
        Tanggal tgl3 = new Tanggal(5, 5, 1990);
        Tanggal tmt3 = new Tanggal(1, 1, 2015);
        DosenTetap dtp1 = new DosenTetap("9545643555", "78647809", "Andi Pratama", tgl3, tmt3, 5500000, "Fakultas Teknik");
        //Implementasi Selektor
        System.out.println("NIP: " + dtp1.getNIP());
        System.out.println("NIDN: " + dtp1.getNIDN());
        System.out.println("Nama: " + dtp1.getNama());
        System.out.println("Tanggal Lahir: " + dtp1.getTglLahir().print());
        System.out.println("Tanggal Masuk Kerja: " + dtp1.getTMT().print());
        System.out.println("Gaji Pokok: Rp" + dtp1.getGajiPokok());
        System.out.println("Fakultas: " + dtp1.getFakultas());
        //Implementasi Mutator
        dtp1.setNIP("9545647548");
        dtp1.setNIDN("78647324");
        dtp1.setNama("Andi");
        dtp1.setGajiPokok(5000000);
        dtp1.setFakultas("Fakultas Sains dan Matematika");
        //Implementasi method lainnya
        System.out.println("\nSetelah diubah:");
        dtp1.printInfo();


        /*============Implementasi class Dosen Tamu============*/
        System.out.println("\n====DOSEN TAMU====");
        //Pembuatan objek
        Tanggal tgl4 = new Tanggal(10,10,1992);
        Tanggal tmt4 = new Tanggal(1,9,2022);
        Tanggal akhirKontrak = new Tanggal(1,9,2026);
        DosenTamu dtm1 = new DosenTamu("2001033478", "50097890", "Anisa", tgl4, tmt4, 4500000, "Fakultas Teknik", akhirKontrak);
        //Implementasi Selektor
        System.out.println("NIP: " + dtm1.getNIP());
        System.out.println("NIDK: " + dtm1.getNIDK());
        System.out.println("Nama: " + dtm1.getNama());
        System.out.println("Tanggal Lahir: " + dtm1.getTglLahir().print());
        System.out.println("Tanggal Masuk Kerja: " + dtm1.getTMT().print());
        System.out.println("Gaji Pokok: Rp" + dtm1.getGajiPokok());
        System.out.println("Fakultas: " + dtm1.getFakultas());
        System.out.println("Akhir Masa Kontrak: " + dtm1.getAkhirKontrak().print());
        //Implementasi Mutator
        dtm1.setNIP("2001032812");
        dtm1.setNIDK("50012058");
        dtm1.setNama("Dewi Lestari");
        dtm1.setGajiPokok(5000000);
        dtm1.setFakultas("Fakultas Hukum");
        //Implementasi method lainnya
        System.out.println("\nSetelah diubah:");
        dtm1.printInfo();


        /*============Implementasi class Tendik============*/
        System.out.println("\n\n====TENDIK====");
        //Pembuatan objek
        Tanggal tgl5 = new Tanggal(10, 8, 1985);
        Tanggal tmt5 = new Tanggal(1, 3, 2020);
        Tendik t1 = new Tendik("19850810", "Santoso", tgl5, tmt5, 4000000, "Akademik");
        //Implementasi Selektor
        System.out.println("NIP: " + t1.getNIP());
        System.out.println("Nama: " + t1.getNama());
        System.out.println("Tanggal Lahir: " + t1.getTglLahir().print());
        System.out.println("Tanggal Masuk Kerja: " + t1.getTMT().print());
        System.out.println("Gaji Pokok: Rp" + t1.getGajiPokok());
        System.out.println("Bidang: " + t1.getBidang());
        //Implementasi Mutator
        t1.setNIP("19850811");
        t1.setNama("Budi");
        t1.setGajiPokok(4500000);
        t1.setBidang("Sumber Daya");
        //Implementasi method lainnya
        System.out.println("\nSetelah diubah:");
        t1.printInfo();
    }
}

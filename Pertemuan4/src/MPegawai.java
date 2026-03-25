/* Nama File    : MPegawai.java
 Deskripsi      : berisi atribut dan method dalam class Pegawai
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 23 Maret 2026 
 */

public class MPegawai {
    public static void main(String[] args) {
        System.out.println("====PEGAWAI====");
        Tanggal tgl1 = new Tanggal(1, 1, 1995);
        Tanggal tmt1 = new Tanggal(1, 1, 2020);
        Pegawai p1 = new Pegawai("9930206201", "Arka", tgl1, tmt1, 3000000);
        p1.printInfo();


        System.out.println("\n\n====DOSEN====");
        Tanggal tgl2 = new Tanggal(2,2,1990);
        Tanggal tmt2 = new Tanggal(1,2,2018);
        Dosen d1 = new Dosen("9920510231", "Kiara", tgl2, tmt2, 4000000, "Fakultas Sains dan Matematika");
        d1.printInfo();

        System.out.println("\n====DOSEN TETAP====");
        Tanggal tgl3 = new Tanggal(5, 5, 1990);
        Tanggal tmt3 = new Tanggal(1, 1, 2015);
        DosenTetap dtp1 = new DosenTetap("9545647548", "78647324", "Andi", tgl3, tmt3, 5000000, "Fakultas Sains dan Matematika");
        dtp1.printInfo();

        System.out.println("\n====DOSEN TAMU====");
        Tanggal tgl4 = new Tanggal(10,10,1992);
        Tanggal tmt4 = new Tanggal(1,9,2022);
        Tanggal akhirKontrak = new Tanggal(1,9,2026);
        DosenTamu dtm1 = new DosenTamu("2001032812", "50012058", "Dewi", tgl4, tmt4, 4500000, "Fakultas Teknik", akhirKontrak);
        dtm1.printInfo();


        System.out.println("\n\n====TENDIK====");
        Tanggal tgl5 = new Tanggal(10, 8, 1985);
        Tanggal tmt5 = new Tanggal(1, 3, 2020);
        Tendik t1 = new Tendik("19850810", "Budi Santoso", tgl5, tmt5, 4000000, "Akademik");
        t1.printInfo();
    }
}

/* Nama File    : main.java
 Deskripsi      : berisi atribut dan method dalam class main
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 8 Maret 2026
  */

public class main {
    public static void main(String[] args){
        /*============Implementasi class Dosen============*/
        System.out.println("******Data Dosen******");
        //Pembuatan objek
        Dosen D1 = new Dosen("1345680191341", "Andi", "Manajemen");
        //Implementasi selektor
        System.out.println("NIP: " + D1.getNip());
        System.out.println("Nama: " + D1.getNama());
        System.out.println("Prodi: " + D1.getProdi());
        System.out.println("Jumlah Dosen: " + Dosen.getCountDosen());
        //Implementasi mutator
        System.out.println("\nData Dosen Setelah Diubah:");
        D1.setNip("1345680191109");
        D1.setNama("Annis");
        D1.setProdi("Informatika");
        //Implementasi method lainnya
        D1.printDosen();


        /*============Implementasi class Mata Kuliah============*/
        System.out.println("\n******Data Mata Kuliah******");
        //Pembuatan objek
        MataKuliah MK1 = new MataKuliah("PK4580", "Sistem Informasi", 3);
        //Implementasi selektor
        System.out.println("Id Matkul: " + MK1.getIdMatkul());
        System.out.println("Nama: " + MK1.getNama());
        System.out.println("SKS: " + MK1.getSKS());
        System.out.println("Jumlah Mata Kuliah: " + MataKuliah.getCountMataKuliah());
        //Implementasi mutator
        System.out.println("\nData Mata Kuliah Setelah Diubah:");
        MK1.setIdMatkul("PK6780");
        MK1.setNama("PBO");
        MK1.setSKS(3);
        //Implementasi method lainnya
        MK1.printMataKuliah();
       
        
        /*============Implementasi class Kendaraan============*/
        System.out.println("\n******Data Kendaraan******");
        //Pembuatan objek
        // objek 1
        Kendaraan J1 = new Kendaraan("H 458 CU", "Motor");
        // objek 2
        Kendaraan J2 = new Kendaraan("K 124 IT", "Mobil");
        //Implementasi selektor
        System.out.println("No Plat: " + J1.getNoPlat());
        System.out.println("Jenis: " + J1.getJenis());

        System.out.println("\nNo Plat: " + J2.getNoPlat());
        System.out.println("Jenis: " + J2.getJenis());
        System.out.println("Jumlah Kendaraan: " + Kendaraan.getCountKendaraan());
        //Implementasi mutator
        System.out.println("\nData Kendaraan Setelah Diubah:");
        J1.setNoPlat("H 437 YU");
        J1.setJenis("Mobil");
        J2.setNoPlat("H 524 IP");
        J2.setJenis("Motor");
        //Implementasi method lainnya
        J1.printKendaraan();
        System.out.println();
        J2.printKendaraan();


        /*============Implementasi class Mahasiswa============*/
        System.out.println("\n******Data Mahasiswa******");
        //Pembuatan objek
        Mahasiswa M1 = new Mahasiswa("24060124130097", "Fathiya", "Ekonomi");
        //Implementasi selektor
        System.out.println("NIM: " + M1.getNIM());
        System.out.println("Nama: " + M1.getNama());
        System.out.println("Prodi: " + M1.getProdi());
        System.out.println("Jumlah Mahasiswa: " + Mahasiswa.getCountMahasiswa());
        //Implementasi mutator
        System.out.println("\nData Mahasiswa Setelah Diubah:");
        M1.setNIM("24060124140143");
        M1.setNama("Anna");
        M1.setProdi("Informatika");
        M1.setDosenWali(D1);
        M1.setKendaraan(J2);
        //Implementasi method lainnya
        M1.printMhs();
        M1.addMatkul(MK1);
        System.out.println("Jumlah SKS: " + M1.getJumlahSKS());
        System.out.println("Jumlah Mata Kuliah: " + M1.getJumlahMatkul());
        System.out.println("\nDetail Data Mahasiswa:");
        M1.printDetailMhs();
    }
}

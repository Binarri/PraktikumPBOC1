/* Nama File    : main.java
 Deskripsi      : berisi atribut dan method dalam class main
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 8 Maret 2026
  */

public class main {
    public static void main(String[] args){
        Dosen D1 = new Dosen();
        MataKuliah MK1 = new MataKuliah();
        Kendaraan J1 = new Kendaraan();
        Kendaraan J2 = new Kendaraan();
        Mahasiswa M1 = new Mahasiswa();

        System.out.println("******Data Dosen******");
        D1.setNip("1345680191109");
        D1.setNama("Annis");
        D1.setProdi("Informatika");
        D1.printDosen();

        System.out.println("\n******Data Mata Kuliah******");
        MK1.setIdMatkul("PK6780");
        MK1.setNama("PBO");
        MK1.setSKS(3);
        MK1.printMataKuliah();

        System.out.println("\n******Data Kendaraan******");
        J1.setNoPlat("H 437 YU");
        J1.setJenis("Mobil");
        J1.printKendaraan();

        J2.setNoPlat("H 524 IP");
        J2.setJenis("Motor");

        System.out.println("\n******Data Mahasiswa******");
        M1.setNIM("24060124140143");
        M1.setNama("Anna");
        M1.setProdi("Informatika");
        M1.printMhs();

        M1.setDosenWali(D1);
        M1.setKendaraan(J2);
        M1.addMatkul(MK1);
        System.out.println("Jumlah SKS: " + M1.getJumlahSKS());
        System.out.println("Jumlah Mata Kuliah: " + M1.getJumlahMatkul());
        
        System.out.println("\n*******Detail Mahasiswa*******");
        M1.printDetailMhs();






    }
}

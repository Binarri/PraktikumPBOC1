/* Nama File    : MainOperatorGenerik.java
 Deskripsi      : MainOperatorGenerik adalah program yang mendemonstrasikan penggunaan prosedur dan fungsi generik yang didefinisikan dalam kelas OperatorGenerik untuk berbagai tipe data, termasuk tipe data primitif dan objek.
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 30 April 2026
*/

public class MainOperatorGenerik {
    public static void main(String[] args){
        //3b. Membuat aplikasi prosedur generik Tukar
        /*============Prosedur Generik Tukar============*/
        System.out.println("/*============Prosedur Generik Tukar============*/");

        System.out.println("\nTUKAR DENGAN INTEGER");
        Integer[] arrInteger = {3,6};
        System.out.println("Sebelum Tukar: a= " + arrInteger[0] + ", b= " + arrInteger[1]);
        OperatorGenerik.Tukar(arrInteger);
        System.out.println("Setelah Tukar: a= " + arrInteger[0] + ", b= " + arrInteger[1]);

        System.out.println("\nTUKAR DENGAN STRING");
        String[] arrString = {"Kelinci","Kucing"};
        System.out.println("Sebelum Tukar: a= \"" + arrString[0] + "\", b= \"" + arrString[1] + "\"");
        OperatorGenerik.Tukar(arrString);
        System.out.println("Setelah Tukar: a= \"" + arrString[0] + "\", b= \"" + arrString[1] + "\"");

        System.out.println("\nTUKAR DENGAN ANJING");
        Anjing anjing1 = new Anjing("Bulldog1");
        Anjing anjing2 = new Anjing("Bulldog2");
        Anjing[] arrAnjing = {anjing1, anjing2};
        System.out.println("Sebelum Tukar: ");
        System.out.println(" a = " + arrAnjing[0].getNama());
        System.out.println(" b = " + arrAnjing[1].getNama());
        OperatorGenerik.Tukar(arrAnjing);
        System.out.println("Setelah Tukar: ");
        System.out.println(" a = " + arrAnjing[0].getNama());
        System.out.println(" b = " + arrAnjing[1].getNama());

        System.out.println("\nTUKAR DENGAN Kucing");
        Kucing kucing1 = new Kucing("Kucing putih", 4.5);
        Kucing kucing2 = new Kucing("Kucing hitam", 3.9);
        Kucing[] arrKucing = {kucing1, kucing2};
        System.out.println("Sebelum Tukar: ");
        System.out.println(" a = " + arrKucing[0].getNama() + ", Bobot = " + arrKucing[0].getBobot() + " kg");
        System.out.println(" b = " + arrKucing[1].getNama() + ", Bobot = " + arrKucing[1].getBobot() + " kg");
        OperatorGenerik.Tukar(arrKucing);
        System.out.println("Setelah Tukar: ");
        System.out.println(" a = " + arrKucing[0].getNama() + ", Bobot = " + arrKucing[0].getBobot() + " kg");
        System.out.println(" b = " + arrKucing[1].getNama() + ", Bobot = " + arrKucing[1].getBobot() + " kg");

        System.out.println("\nTUKAR DENGAN Burung");
        Burung burung1 = new Burung("Garuda");
        Burung burung2 = new Burung("Rajawali");
        Burung[] arrBurung = {burung1, burung2};
        System.out.println("Sebelum Tukar: ");
        System.out.println(" a = " + arrBurung[0].getNama());
        System.out.println(" b = " + arrBurung[1].getNama());
        OperatorGenerik.Tukar(arrBurung);
        System.out.println("Setelah Tukar: ");
        System.out.println(" a = " + arrBurung[0].getNama());
        System.out.println(" b = " + arrBurung[1].getNama());


        //3c. Membuat aplikasi fungsi generik Bobot2
        /*============Fungsi Generik Bobot2============*/
        System.out.println("/\n*============Fungsi Generik Bobot2============*/");

        System.out.println("\nBOBOT2 DENGAN KUCING");
        Kucing kucingA = new Kucing("Kucing A", 3.6);
        Kucing kucingB = new Kucing("Kucing B", 5.0);
        double totalBobot1 = OperatorGenerik.Bobot2(kucingA, kucingB);
        System.out.println("Kucing A: " + kucingA.getNama() + ", Bobot = " + kucingA.getBobot() + " kg");
        System.out.println("Kucing B: " + kucingB.getNama() + ", Bobot = " + kucingB.getBobot() + " kg");
        System.out.println("Total Bobot: " + totalBobot1 + " kg");

        System.out.println("\nBOBOT2 DENGAN ANGGORA");
        Anggora anggora1 = new Anggora("Anggora Hitam", 4.6);
        Anggora anggora2 = new Anggora("Anggora Abu Abu", 3.0);
        double totalBobot2 = OperatorGenerik.Bobot2(anggora1, anggora2);
        System.out.println("Anggora 1: " + anggora1.getNama() + ", Bobot = " + anggora1.getBobot() + " kg");
        System.out.println("Anggora 2: " + anggora2.getNama() + ", Bobot = " + anggora2.getBobot() + " kg");
        System.out.println("Total Bobot: " + totalBobot2 + " kg");

        System.out.println("\nBOBOT2 DENGAN KEMBANGTELON");
        Kembangtelon kembang1 = new Kembangtelon("KembangTelon Hitam", 2.6);
        Kembangtelon kembang2 = new Kembangtelon("KembangTelon Abu Abu", 3.1);
        double totalBobot3 = OperatorGenerik.Bobot2(kembang1, kembang2);
        System.out.println("KembangTelon 1: " + kembang1.getNama() + ", Bobot = " + kembang1.getBobot() + " kg");
        System.out.println("KembangTelon 2: " + kembang2.getNama() + ", Bobot = " + kembang2.getBobot() + " kg");
        System.out.println("Total Bobot: " + totalBobot3 + " kg");

        System.out.println("\nBOBOT2 DENGAN ANGGORA DAN KEMBANGTELON");
        Anggora anggora3 = new Anggora("Anggora Putih", 2.0);
        Kembangtelon kembang3 = new Kembangtelon("KembangTelon Kuning", 4.1);
        double totalBobot4 = OperatorGenerik.Bobot2(anggora3, kembang3);
        System.out.println("Anggora: " + anggora3.getNama() + ", Bobot = " + anggora3.getBobot() + " kg");
        System.out.println("KembangTelon: " + kembang3.getNama() + ", Bobot = " + kembang3.getBobot() + " kg");
        System.out.println("Total Bobot: " + totalBobot4 + " kg");

    }
}//end of class MainOperatorGenerik

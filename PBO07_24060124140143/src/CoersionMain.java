/* Nama File    : CoersionMain.java
 Deskripsi      : Berisi beberapa proses konversi tipe data seperti integer, string, char, dan double.
 Pembuat        : Binar Ridha Wiritanaya / 24060124140143
 Tanggal        : 23 April 2026
*/

public class CoersionMain {
    public static void main(String[] args){ 
        //1a. Polimorfisme nilai integer 65
        int intValue = 65;
        System.out.println("Nilai integer: " + intValue);
        System.out.println("Hasil konversi integer 65 ke char: " + (char)intValue);
        System.out.println("Hasil konversi integer 65 ke real: " + (double)intValue);

        //1b. Mengkonversi integer ke real dan dikembalikan ke format integer di dalam variabel yang beda
        double realValue = (double) intValue;
        int newIntValue = (int) realValue;
        System.out.println("\nHasil konversi integer 65 ke real: " + realValue);
        System.out.println("Kembalikan ke integer: " + newIntValue);

        //1c. Konkatenasi dan penjumlahan string X dan Y
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("\nHasil konkatenasi X dan Y: " + S);
        System.out.println("Hasil penjumlahan X dan Y: " + Z);

        //1d. Konkatenasi dan penjumlahan string P dan Q 
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("\nHasil konkatenasi P dan Q: " + R);
        System.out.println("Hasil penjumlahan P dan Q: " + D);

        //1e. Mengkonversi nilai S menjadi Integer
        Integer A = Integer.parseInt(S);
        System.out.println("\nHasil konversi nilai String S ke Integer A: " + A);
        System.out.println("Tipe A: " + A.getClass().getSimpleName()); //Menampilkan tipe data

        //1f. Mengkonversi nilai T menjadi String
        String T = A.toString();
        System.out.println("\nHasil konversi nilai Integer A ke String T: " + T);
        System.out.println("Tipe T: " + T.getClass().getSimpleName()); //Menampilkan tipe data
    }
} //end of class CoersionMain

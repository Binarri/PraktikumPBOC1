/* Nama File    : ExceptionOnArray.java
 Deskripsi      : Program penggunaan eksepsi nebggunakan class library Java
 Pembuat        : Binar Ridha Wiritanaya
 Tanggal        : 14 April 2026 
 */

 
public class ExceptionOnArray {
    public static void main(String[] args){
        //instansi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}

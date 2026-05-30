/** Binar Ridha Wiritanaya - 24060124140143
 * File : MysqlUtility.java
 * Deskripsi : Kelas utility untuk koneksi database MySQL
 * Tanggal : 21 Mei 2026
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;
import java.sql.*;
/**
 *
 * @author IDEAPET 5
 */

public class MysqlUtility {
    /*************ATRIBUT********************/
    private static Connection koneksi;
    
    /*************METHOD********************/
    //Untuk mendapatkan koneksi database
    public static Connection getConnection(){
        if(koneksi == null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs";
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
                if(koneksi != null){
                    System.out.println("Koneksi berhasil");
                }
            }catch(ClassNotFoundException cne){
                System.out.println("Gagal load driver : " + cne.getMessage());
            }catch(SQLException sqle){
                System.out.println("Gagal Koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}

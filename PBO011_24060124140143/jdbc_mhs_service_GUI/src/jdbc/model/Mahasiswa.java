/** Binar Ridha Wiritanaya - 24060124140143
 * File : Mahasiswa.java
 * Deskripsi : Model untuk tabel mahasiswa
 * Tanggal: 21 Mei 2026
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 *
 * @author IDEAPET 5
 */

public class Mahasiswa {
    /*************ATRIBUT********************/
    private int id;
    private String nama;
    
    /*************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Constructor tanpa parameter
    public Mahasiswa(){
    }
    //Constructor dengan parameter
    public Mahasiswa(int id, String nama){
        this.id = id;
        this.nama = nama;
    }
    
    /*============SELEKTOR============*/
    //Mengembalikan nilai atribut id
    public int getId(){
        return id;
    }
    //Mengembalikan nilai atribut nama
    public String getNama(){
        return nama;
    }
        
    /*============MUTATOR============*/
    //mengubah nilai atribut id
    public void setId(int id){
        this.id = id;
    }
    //Mengubah nilai atribut nama
    public void setNama(String nama){
        this.nama = nama;
    }
    
    /*============METHOD LAIN============*/
    //Mengubah objek mahasiswa menjadi bentuk String
    @Override
    public String toString(){
        return "Mahasiswa(" + "id= " + id + ", nama= " + nama + ")";
    }
}

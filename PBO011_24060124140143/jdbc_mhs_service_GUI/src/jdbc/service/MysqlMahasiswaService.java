/** Binar Ridha Wiritanaya - 24060124140143
 * File : MysqlMahasiswaService.java
 * Deskripsi : Service CRUD tabel mahasiswa
 * Tanggal: 21 Mei 2026
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import java.sql.*;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
/**
 *
 * @author IDEAPET 5
 */

public class MysqlMahasiswaService {
    /*************ATRIBUT********************/
    Connection koneksi = null;
    
    /*************METHOD********************/
    /*============KONSTRUKTOR============*/
    //Membuat objek service dan membuka koneksi
    public MysqlMahasiswaService(){
        koneksi = MysqlUtility.getConnection();
    }
    
    /*============METHOD LAIN============*/
    //Membuat objek mahasiswa
    public Mahasiswa makeMhsObject(){
        return new Mahasiswa();
    }
    
    //Menambahkan data mahasiswa
    public void add(Mahasiswa mhs){
        try{
            String query = "INSERT INTO mahasiswa(id, nama) VALUES(" + mhs.getId() + ",'" + mhs.getNama() + "')";
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil insert");
        } catch (SQLException e){
            System.out.println("Gagal insert: " + e.getMessage());
        }
    }
    
    //Update data mahasiswa
    public void update(Mahasiswa mhs){
        try{
            String query = "UPDATE mahasiswa SET nama= '" + mhs.getNama() + "' WHERE id= " + mhs.getId();
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil update");
        } catch (SQLException e){
            System.out.println("Gagal update: " + e.getMessage());
        }
    }
    
    //Delete data mahasiswa sesuai id
    public void delete(int id){
        try{
            String query = "DELETE FROM mahasiswa WHERE id= " + id;
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil delete");
        } catch (SQLException e){
            System.out.println("Gagal delete: " + e.getMessage());
        }
    }
    
    //Ambil mahasiswa sesuai id
    public Mahasiswa getById(int id){
        Mahasiswa mhs = null;
        try {
            String query = "SELECT * FROM mahasiswa WHERE id= " + id;
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        } catch (SQLException e) {
            System.out.println("Gagal getById: " + e.getMessage());
        }
        return mhs;
    }
    
    //Ambil semua isi tabel mahasiswa
    public List<Mahasiswa> getAll(){
        List<Mahasiswa> list = new ArrayList<>();
        try{
            String query = "SELECT * FROM mahasiswa";
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                list.add(mhs);
            }
        } catch (SQLException e) {
            System.out.println("Gagal getAll: " + e.getMessage());
        }
        return list;
    }
    
    //Reset indeks tabel mahasiswa ke 1
    public void indexReset(){
        try{
            String query = "ALTER TABLE mahasiswa Auto_Increment = 1";
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Index di reset ke 0");
        } catch(SQLException e){
            System.out.println("Gagal reset index: " + e.getMessage());
        }
    }
    
    //Memeriksa apakah tabel kosong
    public boolean isEmpty(){
        try{
            String query = "SELECT COUNT(*) FROM mahasiswa";
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if(rs.next()){
                return rs.getInt(1) == 0;
            }
        } catch(SQLException e){
            System.out.println("Gagal cek isEmpty: " + e.getMessage());
        }
        return true;
    }
    
    //Menutup koneksi ke DB
    public void closeConnection(){
        try{
            if(koneksi != null && !koneksi.isClosed()){
                koneksi.close();
                System.out.println("Koneksi ditutup");
            }
        } catch(SQLException e){
            System.out.println("Gagal tutup koneksi: " + e.getMessage());
        }
    }
}


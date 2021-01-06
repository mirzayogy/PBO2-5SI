package model;

import db.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mahasiswa {
   //atribut
    private String npm;
    private String nama;
    private int jumlahMatakuliahSudahDiambil;
    private double ipk;
    
    
    Database db;
    Connection con;
    
    //method/behavior

    public Mahasiswa() {
        db = new Database();
        con = db.getConnection();
    }
    
    

    public Mahasiswa(String npm, String nama, int jumlahMatakuliahSudahDiambil, double ipk) {
        db = new Database();
        con = db.getConnection();
        
        this.npm = npm;
        this.nama = nama;
        this.jumlahMatakuliahSudahDiambil = jumlahMatakuliahSudahDiambil;
        this.ipk = ipk;
    }
    
    public void create(){
        
        String insertSql = "INSERT INTO mahasiswa (npm, nama, jumlah_matakuliah, ipk) "
                + "VALUES (?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(insertSql);
            ps.setString(1, this.npm);
            ps.setString(2, this.nama);
            ps.setInt(3, this.jumlahMatakuliahSudahDiambil);
            ps.setDouble(4, this.ipk);
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public ArrayList<Mahasiswa> read(){
        ArrayList<Mahasiswa> list = new ArrayList<Mahasiswa>();
        
        String selectSql = "SELECT * FROM mahasiswa";
        
        Statement statement;
        try {
            
            statement = con.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(selectSql);
            
            while(resultSet.next()){
                Mahasiswa mahasiswa = new Mahasiswa(
                    resultSet.getString("npm"),
                    resultSet.getString("nama"),
                    resultSet.getInt("jumlah_matakuliah"),
                    resultSet.getDouble("ipk"));
                
                list.add(mahasiswa);
            }
            
            return list;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
        
    }
    
    public void update(){
        String updateSql = "UPDATE mahasiswa SET "
                + "nama = ?, "
                + "ipk = ?, "
                + "jumlah_matakuliah =? "
                + "WHERE npm = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(updateSql);
            ps.setString(1, this.nama);
            ps.setDouble(2, this.ipk);
            ps.setInt(3, this.jumlahMatakuliahSudahDiambil);
            ps.setString(4, this.npm);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(){
        String deleteSql = "DELETE FROM mahasiswa WHERE npm = ?";
        try {
            PreparedStatement ps = con.prepareStatement(deleteSql);
            ps.setString(1, this.npm);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahMatakuliahSudahDiambil() {
        return jumlahMatakuliahSudahDiambil;
    }

    public void setJumlahMatakuliahSudahDiambil(int jumlahMatakuliahSudahDiambil) {
        this.jumlahMatakuliahSudahDiambil = jumlahMatakuliahSudahDiambil;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    
    
    public void ambilMatakuliah(){
        
    }
    
    public void mengisiAbsensi(){
        
    }
}

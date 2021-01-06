package view;

import db.Database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Mahasiswa;

public class MahasiswaView extends JFrame{
    
    Mahasiswa mahasiswa;
    
    JTextField eNpm = new JTextField();
    JTextField eNama = new JTextField();
    JTextField eJumlahMatakuliah = new JTextField();
    JTextField eIpk = new JTextField();
    
    
    JLabel lNpm = new JLabel("NPM");
    JLabel lNama = new JLabel("Nama");
    JLabel lJumlahMatakuliah = new JLabel("Jumlah Matakuliah");
    JLabel lIpk = new JLabel("IPK");
    JLabel lTitle = new JLabel("Data Mahasiswa");
    
    JButton bSimpan = new JButton("Simpan");
    JButton bBatal = new JButton("Batal");

    public MahasiswaView() {
    }

    public MahasiswaView(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    
    
    
    public void isiData(Mahasiswa mahasiswa){
        eNpm.setText(mahasiswa.getNpm());
        eNama.setText(mahasiswa.getNama());
        eJumlahMatakuliah.setText(String.valueOf(mahasiswa.getJumlahMatakuliahSudahDiambil()));
        eIpk.setText(String.valueOf(mahasiswa.getIpk()));
    }
    
    public void isiData(){
        if(this.mahasiswa != null){
            eNpm.setText(this.mahasiswa.getNpm());
            eNama.setText(this.mahasiswa.getNama());
            eJumlahMatakuliah.setText(String.valueOf(this.mahasiswa.getJumlahMatakuliahSudahDiambil()));
            eIpk.setText(String.valueOf(this.mahasiswa.getIpk()));
        }else{
            
        }
        
    }
    
    
    
    public void tampil(){
        setSize(500, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void taruhKomponen(){
        setLayout(null);
        
        getContentPane().add(lTitle);
        lTitle.setBounds(200,40,200,30);
        
        getContentPane().add(lNpm);
        lNpm.setBounds(10,70,100,30);
        
        getContentPane().add(eNpm);
        eNpm.setBounds(10,100,480,30);
        
        getContentPane().add(lNama);
        lNama.setBounds(10,135,100,30);
        
        getContentPane().add(eNama);
        eNama.setBounds(10,165,480,30);
        
        getContentPane().add(lJumlahMatakuliah);
        lJumlahMatakuliah.setBounds(10,195,400,30);
        
        getContentPane().add(eJumlahMatakuliah);
        eJumlahMatakuliah.setBounds(10,225,480,30);
        
        getContentPane().add(lIpk);
        lIpk.setBounds(10,260,100,30);
        
        getContentPane().add(eIpk);
        eIpk.setBounds(10,290,480,30);
        
        getContentPane().add(bSimpan);
        bSimpan.setBounds(10,325,100,50);
        
        getContentPane().add(bBatal);
        bBatal.setBounds(115,325,100,50);
    }
    
    public void beriEvent(){
        bBatal.addActionListener((ActionEvent e) -> {
            dispose();       
        });
        
        bSimpan.addActionListener((ActionEvent e) -> {
            
            String execQuery;
            
            if(this.mahasiswa == null){
                
              this.mahasiswa = new Mahasiswa();
              this.mahasiswa.setNpm(eNpm.getText());
              this.mahasiswa.setNama(eNama.getText());
              this.mahasiswa.setIpk(Double.parseDouble(eIpk.getText()));
              this.mahasiswa.setJumlahMatakuliahSudahDiambil(Integer.parseInt(eJumlahMatakuliah.getText()));

              execQuery = "INSERT INTO mahasiswa (npm,nama,ipk,jumlah_matakuliah) VALUES (?,?,?,?)";
              
              execQuery = "INSERT INTO mahasiswa "
                      + "(npm, nama, ipk, jumlah_matakuliah) "
                      + "VALUES "
                      + "('"+this.mahasiswa.getNpm()+"',' "
                      + this.mahasiswa.getNama()+"',"
                      + this.mahasiswa.getIpk()+","
                      + this.mahasiswa.getJumlahMatakuliahSudahDiambil()+")";  
            }else{
                
              this.mahasiswa.setNpm(eNpm.getText());
              this.mahasiswa.setNama(eNama.getText());
              this.mahasiswa.setIpk(Double.parseDouble(eIpk.getText()));
              this.mahasiswa.setJumlahMatakuliahSudahDiambil(Integer.parseInt(eJumlahMatakuliah.getText()));

              //UPDATE nama_tabel SET field=value, field=value WHERE pk=value
              execQuery = "UPDATE mahasiswa SET "
                      + "nama = '" +this.mahasiswa.getNama()+"', "
                      + "ipk = " +this.mahasiswa.getIpk()+", "
                      + "jumlah_matakuliah = "+this.mahasiswa.getJumlahMatakuliahSudahDiambil()
                      + " WHERE npm = '"+this.mahasiswa.getNpm()+"'";  
            }
            
            
            
            System.out.println(execQuery);
            
            Database database = new Database();
            Connection connection = database.getConnection();
            try {
                Statement statement = connection.createStatement();
                statement.execute(execQuery);
                JOptionPane.showMessageDialog(null, "Data sudah disimpan");
//                eNpm.setText("");
//                eNama.setText("");
//                eJumlahMatakuliah.setText("");
//                eIpk.setText("");
                dispose();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Data gagal disimpan");
            }
        });
    }
    
}

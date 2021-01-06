/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Mahasiswa;

/**
 *
 * @author mirza
 */
public class MahasiswaTableView extends javax.swing.JFrame {

    Mahasiswa mahasiswa;
    public MahasiswaTableView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        etCari = new javax.swing.JTextField();
        btCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMahasiswa = new javax.swing.JTable();
        btTambah = new javax.swing.JButton();
        btUbah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btBatal = new javax.swing.JButton();
        btTutup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Cari NPM/Nama");

        etCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etCariActionPerformed(evt);
            }
        });

        btCari.setText("Cari");

        tbMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NPM", "Nama", "IPK", "Jumlah Matakuliah"
            }
        ));
        jScrollPane1.setViewportView(tbMahasiswa);
        if (tbMahasiswa.getColumnModel().getColumnCount() > 0) {
            tbMahasiswa.getColumnModel().getColumn(0).setMinWidth(100);
            tbMahasiswa.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbMahasiswa.getColumnModel().getColumn(0).setMaxWidth(100);
            tbMahasiswa.getColumnModel().getColumn(2).setMinWidth(70);
            tbMahasiswa.getColumnModel().getColumn(2).setPreferredWidth(70);
            tbMahasiswa.getColumnModel().getColumn(2).setMaxWidth(70);
            tbMahasiswa.getColumnModel().getColumn(3).setMinWidth(200);
            tbMahasiswa.getColumnModel().getColumn(3).setPreferredWidth(200);
            tbMahasiswa.getColumnModel().getColumn(3).setMaxWidth(200);
        }

        btTambah.setText("Tambah");
        btTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahActionPerformed(evt);
            }
        });

        btUbah.setText("Ubah");
        btUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUbahActionPerformed(evt);
            }
        });

        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btBatal.setText("Batal");

        btTutup.setText("Tutup");
        btTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTutupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCari))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btTutup)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(etCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTambah)
                    .addComponent(btUbah)
                    .addComponent(btHapus)
                    .addComponent(btBatal)
                    .addComponent(btTutup))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etCariActionPerformed

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        // TODO add your handling code here:
        MahasiswaView mahasiswaView = new MahasiswaView();
        mahasiswaView.taruhKomponen();
        mahasiswaView.isiData();
        mahasiswaView.tampil();
        mahasiswaView.beriEvent();
    }//GEN-LAST:event_btTambahActionPerformed

    private void btUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUbahActionPerformed
        // TODO add your handling code here:
        
        int barisTerpilih = tbMahasiswa.getSelectedRow();
        
        if(barisTerpilih >= 0){
            String npm = tbMahasiswa.getValueAt(barisTerpilih, 0).toString();
            String nama = tbMahasiswa.getValueAt(barisTerpilih, 1).toString();
            double ipk = Double.parseDouble(tbMahasiswa.getValueAt(barisTerpilih, 2).toString());
            int jumlah = Integer.parseInt(tbMahasiswa.getValueAt(barisTerpilih, 3).toString());

            Mahasiswa mahasiswa = new Mahasiswa(npm,nama,jumlah,ipk);

            MahasiswaView mahasiswaView = new MahasiswaView(mahasiswa);
            mahasiswaView.taruhKomponen();
            mahasiswaView.isiData();
            mahasiswaView.tampil();
            mahasiswaView.beriEvent();
        }else{
            JOptionPane.showMessageDialog(null, "Pilih dulu data");
        }
        
        
    }//GEN-LAST:event_btUbahActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        int barisTerpilih = tbMahasiswa.getSelectedRow();
        
        if(barisTerpilih >= 0){
            String npm = tbMahasiswa.getValueAt(barisTerpilih, 0).toString();
            mahasiswa = new Mahasiswa();
            mahasiswa.setNpm(npm);
            mahasiswa.delete();
        }else{
            JOptionPane.showMessageDialog(null, "Pilih dulu data");
        }
    }//GEN-LAST:event_btHapusActionPerformed

    private void btTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTutupActionPerformed
        // TODO add your handling code here:
//        System.exit(0);
        dispose();
    }//GEN-LAST:event_btTutupActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        mahasiswa = new Mahasiswa();
        ArrayList<Mahasiswa> list = mahasiswa.read();
        DefaultTableModel tableModel = (DefaultTableModel) tbMahasiswa.getModel();
        Object row[] = new Object[4];
        
        tableModel.setRowCount(0);
        
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getNpm();
            row[1] = list.get(i).getNama();
            row[2] = list.get(i).getIpk();
            row[3] = list.get(i).getJumlahMatakuliahSudahDiambil();

            tableModel.addRow(row);
        }
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MahasiswaTableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MahasiswaTableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MahasiswaTableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MahasiswaTableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MahasiswaTableView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBatal;
    private javax.swing.JButton btCari;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btTambah;
    private javax.swing.JButton btTutup;
    private javax.swing.JButton btUbah;
    private javax.swing.JTextField etCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMahasiswa;
    // End of variables declaration//GEN-END:variables
}

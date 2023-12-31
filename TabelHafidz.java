/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package myProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Hafidz
 */
public class TabelHafidz extends javax.swing.JFrame {
    private DefaultTableModel mod;
    Object[] data = new Object[4];

    /**
     * Creates new form TabelHafidz
     */
    public TabelHafidz() {
        initComponents();
        mod = (DefaultTableModel)  tableMahasiswa.getModel();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMahasiswa = new javax.swing.JTable();
        tfnim = new javax.swing.JTextField();
        tfnama = new javax.swing.JTextField();
        tfkelas = new javax.swing.JTextField();
        tfprodi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hafidz Nifa - Mahasiswa");
        setResizable(false);

        tableMahasiswa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 0, 0), null, null));
        tableMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Nim", "Kelas", "Prodi"
            }
        ));
        tableMahasiswa.setGridColor(new java.awt.Color(0, 0, 0));
        tableMahasiswa.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tableMahasiswa.setSurrendersFocusOnKeystroke(true);
        tableMahasiswa.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableMahasiswaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tableMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMahasiswa);

        tfnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnimActionPerformed(evt);
            }
        });

        tfnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnamaActionPerformed(evt);
            }
        });

        tfkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfkelasActionPerformed(evt);
            }
        });

        tfprodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfprodiActionPerformed(evt);
            }
        });

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Kelas");

        jLabel4.setText("Prodi");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Hafidz Nifa");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfnim, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfprodi, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHapus)
                            .addComponent(btnEdit)
                            .addComponent(btnTambah)
                            .addComponent(btnCari))
                        .addGap(17, 17, 17))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfkelas, tfnama, tfnim});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfprodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfkelas, tfnama, tfnim, tfprodi});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMahasiswaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableMahasiswaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMahasiswaAncestorAdded

    private void tfkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfkelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfkelasActionPerformed

    private void tfprodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfprodiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfprodiActionPerformed

    private void tfnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnimActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int konf = 
                JOptionPane.showConfirmDialog(this,
                        "Yakin menghapus"
                        +tfnama.getText()+"?", "Konfirmasi",
                        JOptionPane.YES_NO_OPTION);
        if(konf==0){
            String nim = tfnim.getText();
            runSQL("DELETE FROM mhs WHERE nim='"+nim+"'");
            loadTable();
            kosong();
    }//GEN-LAST:event_btnHapusActionPerformed
    }
    
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        String nim = tfnim.getText();
        String nama = tfnama.getText();
        String kelas = tfkelas.getText();
        String prodi = tfprodi.getText();
        String sql = "INSERT INTO mhs VALUES('"+nim+"','"+nama+"','"+kelas+"','"+prodi+"')";
        runSQL(sql);
        loadTable();
        tfnim.setText("");
        tfnama.setText("");
        tfkelas.setText("");
        tfprodi.setText("");
    
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        String nim = tfnim.getText();
        String nama = tfnama.getText();
        String kelas = tfkelas.getText();
        String prodi = tfprodi.getText();
        int konf = JOptionPane.showConfirmDialog(this, "Yakin merubah data" + tfnama.getText() + "?", "Konfirmasi Edit",
                JOptionPane.YES_NO_OPTION);
        
        if (konf==0) {
            runSQL("UPDATE mhs SET nama='"+nama+"'," + "kelas='"+kelas+"'," + "prodi='"+prodi+"' WHERE nim='"+nim+"' ");
            loadTable();
            kosong();
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void tableMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMahasiswaMouseClicked
        // TODO add your handling code here:
        int row = tableMahasiswa.getSelectedRow();
        tfnim.setText(
        tableMahasiswa.getModel().getValueAt(row,0).toString());
        tfnama.setText(
        tableMahasiswa.getModel().getValueAt(row,1).toString());
        tfkelas.setText(
        tableMahasiswa.getModel().getValueAt(row,2).toString());
        tfprodi.setText(
        tableMahasiswa.getModel().getValueAt(row,3).toString());
    }//GEN-LAST:event_tableMahasiswaMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
       String nim=tfnim.getText();
       String nama="%"+tfnama.getText()+"%";
       String kelas=tfkelas.getText();
       String prodi=tfprodi.getText();
       String sql="";
       
       if(!nim.isEmpty())
           sql="SELECT * FROM mhs WHERE nim='"+nim+"'";
       else if (!nama.isEmpty()){
           nama= "%"+nama+"%";
           sql ="SELECT * FROM mhs WHERE nama like '"+nama+"'";
       } else if (!kelas.isEmpty())
           sql = "SELECT * FROM mhs WHERE kelas='"+kelas+"'";
       else if (!prodi.isEmpty())
           sql = "SELECT * FROM mhs WHERE prodi='"+prodi+"'";
               
       DefaultTableModel mod= new DefaultTableModel();
       mod.addColumn("nim");
       mod.addColumn("nama");
       mod.addColumn("kelas");
       mod.addColumn("prodi");
        try {
//           String sql = "SELECT * FROM mhs WHERE nim='"+nim+"'";
//           String sql = "SELECT * FROM mhs WHERE nama like '"+nama+"'";
//           String sql = "SELECT * FROM mhs WHERE kelas='"+kelas+"'";
//           String sql = "SELECT * FROM mhs WHERE prodi='"+prodi+"'";
            java.sql.Connection conn = (Connection)configDB.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while (res.next()) {
                mod.addRow(new Object[] {res.getString(1),
                res.getString(2), res.getString(3), 
                res.getString(4) });
            }
            tableMahasiswa.setModel(mod);
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void tfnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnamaActionPerformed

        private void runSQL(String sql) {
        try {
            java.sql.Connection conn = (Connection)configDB.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            System.err.println("SQL Gagal!");
        }
    }
    
    private void loadTable() {
        mod.setRowCount(0); // Menghapus semua baris yang ada di tabel
        try {
            String sql = "SELECT * FROM mhs";
            java.sql.Connection conn = (Connection)configDB.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while (res.next()) {
                mod.addRow(new Object[] {res.getString(1),
                res.getString(2), res.getString(3), 
                res.getString(4) });
            }
            tableMahasiswa.setModel(mod);
        } catch (Exception e) {
            
        }
    }
    
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
            java.util.logging.Logger.getLogger(TabelHafidz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelHafidz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelHafidz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelHafidz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelHafidz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableMahasiswa;
    private javax.swing.JTextField tfkelas;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tfnim;
    private javax.swing.JTextField tfprodi;
    // End of variables declaration//GEN-END:variables

    private void kosong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

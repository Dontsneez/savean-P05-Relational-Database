package p_19092001;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JavaMySQL extends javax.swing.JFrame {

    int idBaris = 0;
    String role;
    DefaultTableModel model;

    public JavaMySQL() {
        initComponents();
        aturModelTabel();
        pangkat();
        jafung();
        showForm(false);
        showData("");
        KoneksiDB.sambungDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        btncari = new javax.swing.JButton();
        txtcari = new javax.swing.JTextField();
        btntambah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        areaSplit = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        txtnidn = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbjafung = new javax.swing.JComboBox<String>();
        cmbpangkat = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtnohp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnsimpan = new javax.swing.JButton();
        btntutup = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("18090061 Dimas Shofa gunarso");

        jPanel2.setToolTipText("18090061 Dimas Shofa Gunarso");

        btncari.setText("CARI");

        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcariKeyReleased(evt);
            }
        });

        btntambah.setText("Tambah Data");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnhapus.setText("Hapus Data");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(btntambah)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(txtcari, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(btncari)
                    .addGap(24, 24, 24)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btntambah)
                            .addComponent(btnhapus)
                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btncari, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap(38, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        areaSplit.setDividerLocation(300);
        areaSplit.setDividerSize(10);
        areaSplit.setOneTouchExpandable(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtnidn, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 13, 113, -1));
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 42, 113, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("NIDN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 15, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("NAMA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 44, -1, -1));

        cmbjafung.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbjafung, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 71, 113, -1));

        cmbpangkat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbpangkat, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 100, 113, -1));

        jLabel3.setText("JABATAN FUNGSIONAL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 74, 133, -1));

        jLabel4.setText("PANGKAT/GOLONGAN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 103, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 158, 258, -1));
        jPanel1.add(txtnohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 129, 113, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("NO HP");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 131, -1, -1));

        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 167, -1, -1));

        btntutup.setText("Tutup");
        btntutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntutupActionPerformed(evt);
            }
        });
        jPanel1.add(btntutup, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 167, -1, -1));

        areaSplit.setLeftComponent(jPanel1);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        areaSplit.setRightComponent(jScrollPane1);

        jPanel3.add(areaSplit, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        role = "Tambah";
        btnsimpan.setText("SIMPAN");
        idBaris = 0;
        resetForm();
        showForm(true);
        btnhapus.setEnabled(false);
                
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        if (role.equals("Tambah")) {
            simpanData();
        }else if (role.equals("Ubah")) {
            ubahData();
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btntutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntutupActionPerformed
        resetForm();
        showForm(false);
        btnhapus.setEnabled(false);
        idBaris = 0;
    }//GEN-LAST:event_btntutupActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        if (idBaris == 0) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan di hapus");
        }else{
            hapusData(idBaris);
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
        String key = txtcari.getText();
        showData(key);
    }//GEN-LAST:event_txtcariKeyReleased

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        role = "Ubah";
        int row = tblData.getRowCount();
        if (row > 0) {
            int sel = tblData.getSelectedRow();
            if (sel != -1) {
                pilihData(tblData.getValueAt(sel, 0).toString());
            }
        }
    }//GEN-LAST:event_tblDataMouseClicked

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
            java.util.logging.Logger.getLogger(JavaMySQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaMySQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaMySQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaMySQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaMySQL().setVisible(true);
            }
        });
    }

    private void aturModelTabel() {
        Object[] kolom = {"No", "NIDN", "NAMA", "JAFUNG", "Golongan/Pangkat", "No HP"};
        model = new DefaultTableModel(kolom, 0) {
            boolean[] canEdit = new boolean[]{false, false, false, false, false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        tblData.setModel(model);
        tblData.setRowHeight(20);
        tblData.getColumnModel().getColumn(0).setMinWidth(0);
        tblData.getColumnModel().getColumn(0).setMaxWidth(0);
    }

    private void showForm(boolean b) {
        areaSplit.setDividerLocation(0.3);
        areaSplit.getLeftComponent().setVisible(b);
    }

    private void resetForm() {
        tblData.clearSelection();
        txtnidn.setText("");
        txtnama.setText("");
        cmbjafung.setSelectedIndex(0);
        cmbpangkat.setSelectedIndex(0);
        txtnohp.setText("");
        txtnidn.requestFocus();
    }

    private void pangkat() {
        cmbpangkat.removeAllItems();
        cmbpangkat.addItem("Pilih Golongan/Pangkat");
        cmbpangkat.addItem("Belum ada");
        cmbpangkat.addItem("II/c (Pengatur)");
        cmbpangkat.addItem("II/d (Pengatur Tk. I)");
        cmbpangkat.addItem("III/a (Penata Muda)");
        cmbpangkat.addItem("III/b (Penata Muda Tk. I)");
        cmbpangkat.addItem("III/c (Penata)");
        cmbpangkat.addItem("III/d (Penata Tk. I)");
        cmbpangkat.addItem("IV/a (Pembina)");
        cmbpangkat.addItem("IV/b (Pembina Tk. I)");
        cmbpangkat.addItem("IV/c (Pembina Utama Muda)");
        cmbpangkat.addItem("IV/d (Pembina Utama Madya)");
        cmbpangkat.addItem("IV/e (Pembina Utama)");
    }

    private void jafung() {
        cmbjafung.removeAllItems();
        cmbjafung.addItem("Pilih Golongan/Pangkat");
        cmbjafung.addItem("Belum ada");
        cmbjafung.addItem("Asisten Ahli (100)");
        cmbjafung.addItem("Asisten Ahli (150)");
        cmbjafung.addItem("Lektor (200)");
        cmbjafung.addItem("Lektor (300)");
        cmbjafung.addItem("Lektor Kepala (400)");
        cmbjafung.addItem("Lektor Kepala (550)");
        cmbjafung.addItem("Lektor Kepala (700)");
        cmbjafung.addItem("Profesor (850)");
        cmbjafung.addItem("Profesor (1050)");
    }

    private void showData(String key) {
        model.getDataVector().removeAllElements();
        String where = "";
        if (!key.isEmpty()) {
            where += "WHERE nidn LIKE '%" + key + "%' " + "OR nama LIKE '%" + key + "%' " + "OR jabatan_fungsional LIKE '%" + key + "%' " + "OR pangkat_golongan LIKE '%" + key + "%' " + "OR no_hp LIKE '%" + key + "%'";
        }
        String sql = "SELECT * FROM data_dosen " + where;
        Connection con;
        Statement st;
        ResultSet rs;
        int baris = 0;
        try {
            con = KoneksiDB.sambungDB();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Object id = rs.getInt(1);
                Object nidn = rs.getString(2);
                Object nama = rs.getString(3);
                Object jafung = rs.getString(4);
                Object pangkat = rs.getString(5);
                Object no_hp = rs.getString(6);
                Object[] data = {id, nidn, nama, jafung, pangkat, no_hp};
                model.insertRow(baris, data);
                baris++;
            }
            st.close();
            con.close();
            tblData.revalidate();
            tblData.repaint();
        } catch (SQLException e) {
            System.err.println("showData(): " + e.getMessage());
        }
    }

    private void resetView() {
        resetForm();
        showForm(false);
        showData("");
        btnhapus.setEnabled(false);
        idBaris = 0;
    }

    private void pilihData(String n) {
        btnhapus.setEnabled(true);
        String sql = "SELECT * FROM data_dosen WHERE id='" + n + "'";
        Connection con;
        Statement st;
        ResultSet rs;
        try {
            con = KoneksiDB.sambungDB();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String nidn = rs.getString(2);
                String nama = rs.getString(3);
                Object jafung = rs.getString(4);
                Object pangkat = rs.getString(5);
                String no_hp = rs.getString(6);
                idBaris = id;
                txtnidn.setText(nidn);
                txtnama.setText(nama);
                cmbjafung.setSelectedItem(jafung);
                cmbpangkat.setSelectedItem(pangkat);
                txtnohp.setText(no_hp);
            }
            st.close();
            con.close();
            showForm(true);
        } catch (SQLException e) {
            System.err.println("pilihData(): " + e.getMessage());
        }
    }

    private void simpanData() {
        String nidn = txtnidn.getText();
        String nama = txtnama.getText();
        int jafung = cmbjafung.getSelectedIndex();
        int pangkat = cmbpangkat.getSelectedIndex();
        String nohp = txtnohp.getText();
        if (nidn.isEmpty() || nama.isEmpty() || jafung == 0 || pangkat == 0 || nohp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon lengkapi data!");
        } else {
            String jafung_isi = cmbjafung.getSelectedItem().toString();
            String pangkat_isi = cmbpangkat.getSelectedItem().toString();
            String sql = "INSERT INTO data_dosen (nidn,nama,jabatan_fungsional," + "pangkat_golongan,no_hp) " + "VALUES (\"" + nidn + "\",\"" + nama + "\"," + "\"" + jafung_isi + "\",\"" + pangkat_isi + "\",\"" + nohp + "\")";
            Connection con;
            Statement st;
            try {
                con = KoneksiDB.sambungDB();
                st = con.createStatement();
                st.executeUpdate(sql);
                st.close();
                con.close();
                resetView();
                JOptionPane.showMessageDialog(this, "Data telahdisimpan!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }

    private void ubahData() {
        String nidn = txtnidn.getText();
        String nama = txtnama.getText();
        int jafung = cmbjafung.getSelectedIndex();
        int pangkat = cmbpangkat.getSelectedIndex();
        String nohp = txtnohp.getText();
        if (nidn.isEmpty() || nama.isEmpty() || jafung == 0 || pangkat == 0 || nohp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon lengkapi data!");
        } else {
            String jafung_isi = cmbjafung.getSelectedItem().toString();
            String pangkat_isi = cmbpangkat.getSelectedItem().toString();
            String sql = "UPDATE data_dosen " + "SET nidn=\"" + nidn + "\"," + "nama=\"" + nama + "\"," + "jabatan_fungsional=\"" + jafung_isi + "\"," + "pangkat_golongan=\"" + pangkat_isi + "\"," + "no_hp=\"" + nohp + "\"WHERE id=\"" + idBaris + "\"";
            Connection con;
            Statement st;
            try {
                con = KoneksiDB.sambungDB();
                st = con.createStatement();
                st.executeUpdate(sql);
                st.close();
                con.close();
                resetView();
                JOptionPane.showMessageDialog(this, "Data telah diubah!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }

    private void hapusData(int baris) {
        Connection con;
        Statement st;
        try {
            con = KoneksiDB.sambungDB();
            st = con.createStatement();
            st.executeUpdate("DELETE FROM data_dosen WHERE id=" + baris);
            st.close();
            con.close();
            resetView();
            JOptionPane.showMessageDialog(this, "Data telah dihapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane areaSplit;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btntutup;
    private javax.swing.JComboBox<String> cmbjafung;
    private javax.swing.JComboBox<String> cmbpangkat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnidn;
    private javax.swing.JTextField txtnohp;
    // End of variables declaration//GEN-END:variables
}

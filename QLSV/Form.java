/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSV;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class Form extends javax.swing.JFrame {

    private Connection cn;
    private DefaultTableModel model;

    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
        this.setLocationRelativeTo(null);
        cn = Connect.ketnoi("QLSV1");
        model = (DefaultTableModel) tblShow.getModel();
        LoadDataToCBO();
        LoadDataToTable();

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
        cboMaKN = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShow = new javax.swing.JTable();
        lblTenClass = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtSoDT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã KN");

        cboMaKN.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMaKNItemStateChanged(evt);
            }
        });

        tblShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Sinh Viên", "Họ Tên", "Số Điện Thoại", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblShowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblShow);

        lblTenClass.setText("...........");

        jLabel2.setText("Mã SV");

        jLabel3.setText("Họ Tên");

        jLabel4.setText("Số ĐT");

        jLabel5.setText("Email");

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setToolTipText("");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cboMaKN, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lblTenClass)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSoDT)
                    .addComponent(txtHoTen)
                    .addComponent(txtMaSV)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMaKN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblTenClass))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnNew)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnSave)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnDelete)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboMaKNItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMaKNItemStateChanged
        // TODO add your handling code here:
        try {
            String sql = "Select Masv,Hoten,DienThoai,email from SINHVIEN where MaKN = '" + cboMaKN.getSelectedItem().toString() + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
                txtMaSV.setText(tblShow.getValueAt(0, 0).toString());
                txtHoTen.setText(tblShow.getValueAt(0, 1).toString());
                txtSoDT.setText(tblShow.getValueAt(0, 2).toString());
                txtEmail.setText(tblShow.getValueAt(0, 3).toString());
            }
            String sql1 = "select TenKN from KHOANGANH  where MaKN = '" + cboMaKN.getSelectedItem().toString() + "'";
            ResultSet rs2 = st.executeQuery(sql1);
            while (rs2.next()) {
                lblTenClass.setText(rs2.getString(1));
            }
            LoadDataToTable();
            if (tblShow.getRowCount() > 0) {
                tblShow.setRowSelectionInterval(0, 0);
                showDetail(0);
            }
            if(tblShow.getRowCount() <= 0) {
            txtHoTen.setText("");
            txtMaSV.setText("");
            txtSoDT.setText("");
            txtEmail.setText("");

        }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cboMaKNItemStateChanged

    private void tblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowMouseClicked
        // TODO add your handling code here:
        showDetail(tblShow.getSelectedRow());
    }//GEN-LAST:event_tblShowMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txtHoTen.setText("");
        txtMaSV.setText("");
        txtSoDT.setText("");
        txtEmail.setText("");

        tblShow.clearSelection();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            try {
                if (txtMaSV.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Mã sinh viên không được bỏ trống");
                    return;
                }
               check();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (txtHoTen.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Họ tên không được bỏ trống");
                    return;
                }

            } catch (Exception e) {
            }
            try {
                if (txtSoDT.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Số điện thoại không được bỏ trống");
                    return;
                }
                if (txtSoDT.getText().matches("[0-9]{10}")) {

                } else {
                    JOptionPane.showMessageDialog(this, "Số điện thoại không đúng định dạng");
                    return;
                }
            } catch (Exception e) {
            }
            try {
                if (txtEmail.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Email không được bỏ trống");
                    return;
                }
                if (txtEmail.getText().matches("[A-Za-z0-9._]{0,100}@fpt.edu.vn$")) {

                } else {
                    JOptionPane.showMessageDialog(this, "Email không đúng định dạng");
                    return;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            String sql = "Insert into SINHVIEN(Masv,Hoten,MaKN,DienThoai,email) values(?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, txtMaSV.getText());
            ps.setString(2, txtHoTen.getText());
            ps.setString(3, cboMaKN.getSelectedItem().toString());
            ps.setString(4, txtSoDT.getText());
            ps.setString(5, txtEmail.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            LoadDataToTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "Delete from SINHVIEN where Masv = '"+txtMaSV.getText()+"'";
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Xoá thành công");
            LoadDataToTable();
            tblShow.setRowSelectionInterval(0, 0);
            showDetail(0);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
    public void LoadDataToTable() {
        try {
            model.setRowCount(0);
            String sql = "Select Masv,Hoten,DienThoai,email from SINHVIEN where MaKN = '" + cboMaKN.getSelectedItem().toString() + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
      
    }

    public void LoadDataToCBO() {
        try {
            String sql = "select MaKN from KHOANGANH";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cboMaKN.addItem(rs.getString(1));
            }
        } catch (Exception e) {
        }

    }
    public void check(){
         try {
            String sql1 = "select Masv from SINHVIEN join KHOANGANH on SINHVIEN.MaKN = KHOANGANH.MaKN where KHOANGANH.MaKN='" + cboMaKN.getSelectedItem().toString() + "'";
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql1);
                while (rs.next()) {
                    if (txtMaSV.getText().equals(rs.getString(1))) {
                        System.out.println(rs.getString(1));
                        JOptionPane.showMessageDialog(this, "Mã sinh viên đã tồn tại trong ngành");
                        return;
                    }
                }
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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboMaKN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTenClass;
    private javax.swing.JTable tblShow;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtSoDT;
    // End of variables declaration//GEN-END:variables

    private void showDetail(int index) {
        index = tblShow.getSelectedRow();
        txtMaSV.setText(tblShow.getValueAt(index, 0).toString());
        txtHoTen.setText(tblShow.getValueAt(index, 1).toString());
        txtSoDT.setText(tblShow.getValueAt(index, 2).toString());
        txtEmail.setText(tblShow.getValueAt(index, 3).toString());
    }
}
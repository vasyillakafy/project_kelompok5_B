import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.connect;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syil
 */
public class form_resep extends javax.swing.JFrame {

    /**
     * Creates new form form_resep
     */
    public form_resep() {
        initComponents();
        datatable();
        setTitle("CAHAYA PERMATA OPTICAL");
    }

        public void datatable(){
        DefaultTableModel tbl=new DefaultTableModel();
        tbl.addColumn("ID Konsumen");
        tbl.addColumn("ID Resep");
        tbl.addColumn("SPH Kanan");
        tbl.addColumn("SPH Kiri");
        tbl.addColumn("CYL Kanan");
        tbl.addColumn("CYL Kiri");  
        tbl.addColumn("AS Kanan"); 
        tbl.addColumn("AS Kiri");  
        tabelresep.setModel(tbl);
        
        try{
            Statement statement=(Statement)connect.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("select * from resep");
            while(res.next())
            {
                tbl.addRow(new Object[]{
                    res.getString("ID_Konsumen"),
                    res.getString("ID_Resep"),
                    res.getString("SPH_kn"),
                    res.getString("SPH_kr"),
                    res.getString("CYL_kn"),
                    res.getString("CYL_kr"), 
                    res.getString("AS_kn"),
                    res.getString("AS_kr")
                });
                tabelresep.setModel(tbl);
            }} 
        catch (Exception e){
                JOptionPane.showMessageDialog(rootPane, "salah");
    }
}
        
        public void kosong(){
        txtidkonsumen.setText("");
        txtidresep.setText("");
        txtsphkanan.setText("");       
        txtsphkiri.setText("");
        txtcylkanan.setText("");
        txtcylkiri.setText("");
        txtaskanan.setText("");
        txtaskiri.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtidkonsumen = new javax.swing.JTextField();
        txtidresep = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelresep = new javax.swing.JTable();
        txtsphkanan = new javax.swing.JTextField();
        txtsphkiri = new javax.swing.JTextField();
        txtcylkanan = new javax.swing.JTextField();
        txtcylkiri = new javax.swing.JTextField();
        txtaskanan = new javax.swing.JTextField();
        txtaskiri = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("RESEP (Hasil Pemeriksaan)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/100x86.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 100));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("ID Resep");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("ID Konsumen");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("SPH Kanan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("SPH Kiri");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("CYL Kanan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("CYL Kiri");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("AS Kanan");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("AS Kiri");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, 30));

        txtidkonsumen.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtidkonsumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, -1));

        txtidresep.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtidresep, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 180, -1));

        tabelresep.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tabelresep.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelresep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelresepMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelresep);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 600, 90));

        txtsphkanan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtsphkanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 80, -1));

        txtsphkiri.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtsphkiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 80, -1));

        txtcylkanan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtcylkanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 80, 30));

        txtcylkiri.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtcylkiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 80, -1));

        txtaskanan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtaskanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 80, -1));

        txtaskiri.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtaskiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 80, -1));

        btncari.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btncari.setText("Cari");
        btncari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncariMouseClicked(evt);
            }
        });
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        getContentPane().add(btncari, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        btnnew.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        getContentPane().add(btnnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        btnsave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        btnedit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        btnback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        btnnext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnnext.setText("Next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });
        getContentPane().add(btnnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        btndelete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background(800).jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 720, 440));

        setSize(new java.awt.Dimension(733, 566));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        try {
            Statement statement = (Statement)connect.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from resep where + "
                    + "ID_Resep='" + txtidresep.getText() + "'");
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("ID Konsumen");
            tbl.addColumn("ID Resep");
            tbl.addColumn("SPH Kanan");
            tbl.addColumn("SPH Kiri");
            tbl.addColumn("CYL Kanan");
            tbl.addColumn("CYL Kiri");
            tbl.addColumn("AS Kanan");
            tbl.addColumn("AS Kiri");
            
            tabelresep.setModel(tbl);
            while (res.next()){
                tbl.addRow(new Object[] {
                        res.getString("ID_Konsumen"),
                        res.getString("ID_Resep"),
                        res.getString("SPH_kn"),
                        res.getString("SPH_kr"),
                        res.getString("CYL_kn"),                       
                        res.getString("CYL_kr"),
                        res.getString("AS_kn"),
                        res.getString("AS_kr")
                });
                tabelresep.setModel(tbl); 
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
        }
    }//GEN-LAST:event_btncariActionPerformed
  
    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        kosong();
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String ID_Konsumen = txtidkonsumen.getText();
        String ID_Resep = txtidresep.getText();
        String SPH_kn = txtsphkanan.getText();
        String SPH_kr = txtsphkiri.getText();           
        String CYL_kn = txtcylkanan.getText();        
        String CYL_kr = txtcylkiri.getText();
        String AS_kn = txtaskanan.getText();
        String AS_kr = txtaskiri.getText();

        try{
            if (txtidkonsumen.getText().equals("") ^ txtidresep.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "ID tidak boleh kosong");    
            } else if (txtidkonsumen.getText().equals("") && txtidresep.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "ID tidak boleh kosong");    
            } else {
                Statement statement = (Statement)connect.GetConnection().createStatement();
                statement.executeUpdate("insert into resep VALUES ('" +ID_Konsumen+ "', "
                        + " '" +ID_Resep+ "', '" +SPH_kn+ "', '" +SPH_kr+ "', '" +CYL_kn+ "', "
                        + " '" +CYL_kr+ "', '" +AS_kn+ "', '" +AS_kr+ "' );");
            statement.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            }
        } 
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }
        datatable();
        kosong();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try {
            String sql ="UPDATE resep SET ID_Konsumen = '"+txtidkonsumen.getText()+"', "
                    + "ID_Resep = '"+txtidresep.getText()+"', SPH_kn = '"+txtsphkanan.getText()+"', "
                    + "SPH_kr = '"+txtsphkiri.getText()+"', CYL_kn = '"+txtcylkanan.getText()+"', "
                    + "CYL_kr = '"+txtcylkiri.getText()+"', AS_kn = '"+txtaskanan.getText()+"', " 
                    + "AS_kr = '"+txtaskiri.getText()+"' WHERE ID_Resep = '"+txtidresep.getText()+"'";
            java.sql.Connection conn=(Connection)connect.GetConnection();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        datatable();
       
    }//GEN-LAST:event_btneditActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        String ID_Resep = txtidresep.getText();

        try {
            Statement statement = (Statement)connect.GetConnection() .createStatement();
            statement.executeUpdate("DELETE from resep where ID_Resep=('" +ID_Resep+ "');");
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            txtidkonsumen.setText("");
            txtidresep.setText("");
            txtsphkanan.setText("");
            txtsphkiri.setText("");
            txtcylkanan.setText("");
            txtcylkiri.setText("");
            txtaskanan.setText("");
            txtaskiri.setText("");
            txtidresep.requestFocus();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
        datatable();
    
    }//GEN-LAST:event_btndeleteActionPerformed

    private void tabelresepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelresepMouseClicked
        int baris = tabelresep.rowAtPoint(evt.getPoint());
        
        String ID_Konsumen =tabelresep.getValueAt(baris, 0).toString();
        txtidkonsumen.setText(ID_Konsumen);
        
        String ID_Resep =tabelresep.getValueAt(baris, 1).toString();
        txtidresep.setText(ID_Resep);
        
        String SPH_kn =tabelresep.getValueAt(baris, 2).toString();
        txtsphkanan.setText(SPH_kn);
        
        String SPH_kr = tabelresep.getValueAt(baris, 3).toString();
        txtsphkiri.setText(SPH_kr);
        
        String CYL_kn =tabelresep.getValueAt(baris, 4).toString();
        txtcylkanan.setText(CYL_kn);
              
        String CYL_kr =tabelresep.getValueAt(baris, 5).toString();
        txtcylkiri.setText(CYL_kr);
        
        String AS_kn =tabelresep.getValueAt(baris, 6).toString();
        txtaskanan.setText(AS_kn);
        
        String AS_kr =tabelresep.getValueAt(baris, 7).toString();
        txtaskiri.setText(AS_kr);

    }//GEN-LAST:event_tabelresepMouseClicked

    private void btncariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncariMouseClicked

    }//GEN-LAST:event_btncariMouseClicked

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new form_konsumen().setVisible(true);
        dispose();
        //this.setVisible(false);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        new form_kacamata().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnnextActionPerformed

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
            java.util.logging.Logger.getLogger(form_resep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_resep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_resep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_resep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_resep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelresep;
    private javax.swing.JTextField txtaskanan;
    private javax.swing.JTextField txtaskiri;
    private javax.swing.JTextField txtcylkanan;
    private javax.swing.JTextField txtcylkiri;
    private javax.swing.JTextField txtidkonsumen;
    private javax.swing.JTextField txtidresep;
    private javax.swing.JTextField txtsphkanan;
    private javax.swing.JTextField txtsphkiri;
    // End of variables declaration//GEN-END:variables
}
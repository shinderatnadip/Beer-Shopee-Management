/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author Ratnadip
 */
public class TransportVehicle extends javax.swing.JFrame {
java.sql.Connection conn = null;
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;
    /**
     * Creates new form TransportVehicle
     */
    public TransportVehicle() {
        initComponents();
                        conn = Dbconnect.ConnectDb();

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        transportnumber = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        district = new javax.swing.JTextField();
        vehiclenumber = new javax.swing.JTextField();
        kindoflicence = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Beer & Wine Shopee");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 50, 454, 60);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText(" Vehicle Registration");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 120, 280, 26);

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel3.setText("Transport Number");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 180, 150, 23);

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel4.setText("Name Address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 230, 150, 23);

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel5.setText("District");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(310, 280, 150, 23);

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel6.setText("Vahicle Number");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 330, 150, 23);

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel7.setText("Kind of Licence");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 380, 150, 23);

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel8.setText("Quantity");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(310, 430, 150, 23);
        getContentPane().add(transportnumber);
        transportnumber.setBounds(490, 180, 150, 30);
        getContentPane().add(name);
        name.setBounds(490, 230, 150, 30);
        getContentPane().add(district);
        district.setBounds(490, 280, 150, 30);
        getContentPane().add(vehiclenumber);
        vehiclenumber.setBounds(490, 330, 150, 30);
        getContentPane().add(kindoflicence);
        kindoflicence.setBounds(490, 380, 150, 30);
        getContentPane().add(quantity);
        quantity.setBounds(490, 430, 150, 30);

        save.setBackground(new java.awt.Color(0, 153, 0));
        save.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(360, 490, 90, 29);

        cancel.setBackground(new java.awt.Color(255, 0, 0));
        cancel.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(520, 490, 90, 29);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/Images/budwisertruck.jpg"))); // NOI18N
        jLabel9.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel9.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel9.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
         try {
            String sql = "Insert into TRANSPORTINFO (TRANSPORTNO,NAMEADDRESS,DISTRICT,VEHICLENO,KINDOFLICENCE,QUANTITY) values (?,?,?,?,?,?)";
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, transportnumber.getText());

            pst.setString(2, name.getText());
            pst.setString(3, district.getText());

            pst.setString(4, vehiclenumber.getText());
            pst.setString(5, kindoflicence.getText());
            pst.setString(6, quantity.getText());
            rs = (OracleResultSet) pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        transportnumber.setText("");
        name.setText("");
        district.setText("");
        vehiclenumber.setText("");
        kindoflicence.setText("");
        quantity.setText("");
                                                           

    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        AdminHome AH = new AdminHome();
        AH.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(TransportVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransportVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransportVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransportVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransportVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField district;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kindoflicence;
    private javax.swing.JTextField name;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton save;
    private javax.swing.JTextField transportnumber;
    private javax.swing.JTextField vehiclenumber;
    // End of variables declaration//GEN-END:variables
}

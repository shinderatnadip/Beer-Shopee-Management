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
public class AdminLogin extends javax.swing.JFrame {
    
    java.sql.Connection conn=null;
OraclePreparedStatement pst=null;
OracleResultSet rs=null;
    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adminusername = new javax.swing.JTextField();
        adminpassword = new javax.swing.JPasswordField();
        AdminLoginbtn = new javax.swing.JButton();
        AdminCancelbtn = new javax.swing.JButton();
        adminForgotPassword = new javax.swing.JLabel();
        AdminRegister = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText(" Beer & Wine Shopee");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(382, 103, 466, 66);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Admin Login");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(810, 210, 113, 26);

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(680, 290, 100, 20);

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(680, 370, 61, 20);
        getContentPane().add(adminusername);
        adminusername.setBounds(850, 280, 147, 30);

        adminpassword.setText("jPasswordField1");
        getContentPane().add(adminpassword);
        adminpassword.setBounds(850, 360, 147, 31);

        AdminLoginbtn.setBackground(new java.awt.Color(0, 204, 0));
        AdminLoginbtn.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        AdminLoginbtn.setText("Login");
        AdminLoginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(AdminLoginbtn);
        AdminLoginbtn.setBounds(730, 440, 80, 29);

        AdminCancelbtn.setBackground(new java.awt.Color(255, 0, 0));
        AdminCancelbtn.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        AdminCancelbtn.setText("Cancel");
        AdminCancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminCancelbtnActionPerformed(evt);
            }
        });
        getContentPane().add(AdminCancelbtn);
        AdminCancelbtn.setBounds(860, 440, 77, 29);

        adminForgotPassword.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        adminForgotPassword.setForeground(new java.awt.Color(0, 0, 204));
        adminForgotPassword.setText("Forgot Password ?");
        adminForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminForgotPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(adminForgotPassword);
        adminForgotPassword.setBounds(720, 500, 116, 20);

        AdminRegister.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        AdminRegister.setForeground(new java.awt.Color(0, 153, 0));
        AdminRegister.setText("Register");
        AdminRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminRegisterMouseClicked(evt);
            }
        });
        getContentPane().add(AdminRegister);
        AdminRegister.setBounds(860, 500, 54, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/Images/glassbeer.jpg"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminLoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginbtnActionPerformed
        // TODO add your handling code here:
        conn = Dbconnect.ConnectDb();
        try{
            String sql ="Select * from ADMIN where USERNAME=? and PASSWORD=?";
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1,adminusername.getText());
             pst.setString(2,adminpassword.getText());
             rs = (OracleResultSet) pst.executeQuery();
             if(rs.next()){
                // close();
                 AdminHome hme= new AdminHome();
                 hme.setVisible(true);
                 this.setVisible(false);
             }
             else{
                JOptionPane.showMessageDialog(null, " Login Failed");
         
             }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_AdminLoginbtnActionPerformed

    private void adminForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminForgotPasswordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adminForgotPasswordMouseClicked

    private void AdminRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminRegisterMouseClicked
        // TODO add your handling code here:
        AdminRegistration AR = new AdminRegistration();
        this.setVisible(false);
        AR.setVisible(true);
    }//GEN-LAST:event_AdminRegisterMouseClicked

    private void AdminCancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminCancelbtnActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_AdminCancelbtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminCancelbtn;
    private javax.swing.JButton AdminLoginbtn;
    private javax.swing.JLabel AdminRegister;
    private javax.swing.JLabel adminForgotPassword;
    private javax.swing.JPasswordField adminpassword;
    private javax.swing.JTextField adminusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
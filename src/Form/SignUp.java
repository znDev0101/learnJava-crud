/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ZULFA
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    
    public Statement st;
    public ResultSet rs;
    
    public PreparedStatement pst;

    Connection cn = DataBase.DataBase.configDB();
    
    
    public SignUp() {
        initComponents();
    }
    
    private void clearSignUp(){
        txtFirstname.setText("");
        txtLastname.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtRetypePassword.setText("");
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
        txtUsername = new javax.swing.JTextField();
        txtFirstname = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtRetypePassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setText("Sign Up");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("lastname");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("firstname");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setText("username");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setText("password");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setText("re-type password");

        btnSignup.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnSignup.setText("Sign Up");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 183, Short.MAX_VALUE)
                                .addComponent(btnSignup))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFirstname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtLastname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRetypePassword))))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5))
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtRetypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnSignup)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        String Firstname = txtFirstname.getText();
        String Lastname = txtLastname.getText();
        String Username = txtUsername.getText();
        String Pass = String.valueOf(txtPassword.getPassword());
        String RePass = String.valueOf(txtRetypePassword.getPassword());
        String sql = "INSERT INTO data_user (`firstname`,`lastname`,`username`,`password`) VALUES(?,?,?,?)";
        String cekUsername = "SELECT * FROM data_user WHERE username= '"+ Username +"' ";
        try{
            st = cn.createStatement();
            pst = cn.prepareStatement(sql);
            pst.setString(1, Firstname);
            pst.setString(2, Lastname);
            pst.setString(3, Username);
            pst.setString(4, Pass);
            rs = st.executeQuery(cekUsername);
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "USERNAME INI SUDAH DI GUNAKAN", "GAGAL", JOptionPane.INFORMATION_MESSAGE);
            }else if(Firstname.equals("") || Lastname.equals("") || Username.equals("") || Pass.equals("") || RePass.equals("")){
                JOptionPane.showMessageDialog(null, "DATA HARUS DI ISI LENGKAP", "GAGAL", JOptionPane.INFORMATION_MESSAGE);
            }else if(!Pass.equals(RePass)){
                 JOptionPane.showMessageDialog(null, "Re Type Password tidak valid", "PASSWORD GAGAL", JOptionPane.INFORMATION_MESSAGE);
            }else if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "SUCCESS ACCOUNT");
                clearSignUp();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSignupActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRetypePassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

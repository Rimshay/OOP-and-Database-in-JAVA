/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframe;

import conn.JavaConnectDBROLE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author rimsh
 */
public class DoctorRecord extends javax.swing.JFrame {
  Connection connection = null;
    
    String username = null;
    String password = null;
    /**
     * Creates new form ManagerJframe
     */
    public DoctorRecord() {
        initComponents();
            Updated_Table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        DoctorTitle = new javax.swing.JLabel();
        DoctorRecordTitle = new javax.swing.JLabel();
        DoctorId = new javax.swing.JLabel();
        DoctorNAME = new javax.swing.JLabel();
        DoctorEMAIL = new javax.swing.JLabel();
        DoctorID = new javax.swing.JTextField();
        DoctorName = new javax.swing.JTextField();
        DoctorEmail = new javax.swing.JTextField();
        DoctorAddBtn = new javax.swing.JButton();
        DoctorUpdateBtn = new javax.swing.JButton();
        DoctorTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        DoctorCNIC = new javax.swing.JLabel();
        DoctorNIC = new javax.swing.JTextField();
        DoctorPHONE = new javax.swing.JLabel();
        DoctorPhone = new javax.swing.JTextField();
        DoctorLogoutBtn = new javax.swing.JButton();
        DoctorADDRESS = new javax.swing.JLabel();
        DoctorAddress = new javax.swing.JTextField();
        DoctorSPECIALIZATION = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DoctorSpecialization = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel6.setLayout(null);

        DoctorTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        DoctorTitle.setForeground(new java.awt.Color(0, 102, 102));
        DoctorTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DoctorTitle.setText("Doctor");
        jPanel6.add(DoctorTitle);
        DoctorTitle.setBounds(90, 50, 170, 50);

        DoctorRecordTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DoctorRecordTitle.setForeground(new java.awt.Color(0, 102, 102));
        DoctorRecordTitle.setText("Doctors Records");
        jPanel6.add(DoctorRecordTitle);
        DoctorRecordTitle.setBounds(660, 90, 220, 30);

        DoctorId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DoctorId.setForeground(new java.awt.Color(0, 102, 102));
        DoctorId.setText("ID");
        jPanel6.add(DoctorId);
        DoctorId.setBounds(70, 140, 19, 22);

        DoctorNAME.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DoctorNAME.setForeground(new java.awt.Color(0, 102, 102));
        DoctorNAME.setText("Name");
        jPanel6.add(DoctorNAME);
        DoctorNAME.setBounds(40, 240, 90, 22);

        DoctorEMAIL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DoctorEMAIL.setForeground(new java.awt.Color(0, 102, 102));
        DoctorEMAIL.setText("Email");
        jPanel6.add(DoctorEMAIL);
        DoctorEMAIL.setBounds(30, 290, 90, 22);
        jPanel6.add(DoctorID);
        DoctorID.setBounds(140, 140, 170, 30);
        jPanel6.add(DoctorName);
        DoctorName.setBounds(140, 240, 170, 30);

        DoctorEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorEmailActionPerformed(evt);
            }
        });
        jPanel6.add(DoctorEmail);
        DoctorEmail.setBounds(140, 290, 170, 30);

        DoctorAddBtn.setBackground(new java.awt.Color(0, 102, 102));
        DoctorAddBtn.setForeground(new java.awt.Color(255, 255, 255));
        DoctorAddBtn.setText("ADD");
        DoctorAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorAddBtnActionPerformed(evt);
            }
        });
        jPanel6.add(DoctorAddBtn);
        DoctorAddBtn.setBounds(50, 580, 100, 40);

        DoctorUpdateBtn.setBackground(new java.awt.Color(0, 102, 102));
        DoctorUpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        DoctorUpdateBtn.setText("Update");
        DoctorUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorUpdateBtnActionPerformed(evt);
            }
        });
        jPanel6.add(DoctorUpdateBtn);
        DoctorUpdateBtn.setBounds(200, 580, 100, 40);

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        DoctorTable.setViewportView(jTable1);

        jPanel6.add(DoctorTable);
        DoctorTable.setBounds(490, 160, 600, 400);

        DoctorCNIC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DoctorCNIC.setForeground(new java.awt.Color(0, 102, 102));
        DoctorCNIC.setText("CNIC");
        jPanel6.add(DoctorCNIC);
        DoctorCNIC.setBounds(60, 190, 60, 22);
        jPanel6.add(DoctorNIC);
        DoctorNIC.setBounds(140, 190, 170, 30);

        DoctorPHONE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DoctorPHONE.setForeground(new java.awt.Color(0, 102, 102));
        DoctorPHONE.setText("Phone Number");
        jPanel6.add(DoctorPHONE);
        DoctorPHONE.setBounds(20, 340, 120, 22);
        jPanel6.add(DoctorPhone);
        DoctorPhone.setBounds(140, 340, 170, 30);

        DoctorLogoutBtn.setBackground(new java.awt.Color(255, 255, 204));
        DoctorLogoutBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DoctorLogoutBtn.setForeground(new java.awt.Color(0, 102, 102));
        DoctorLogoutBtn.setText("Logout");
        DoctorLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorLogoutBtnActionPerformed(evt);
            }
        });
        jPanel6.add(DoctorLogoutBtn);
        DoctorLogoutBtn.setBounds(1110, 320, 110, 40);

        DoctorADDRESS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DoctorADDRESS.setForeground(new java.awt.Color(0, 102, 102));
        DoctorADDRESS.setText("Address");
        jPanel6.add(DoctorADDRESS);
        DoctorADDRESS.setBounds(40, 400, 70, 30);
        jPanel6.add(DoctorAddress);
        DoctorAddress.setBounds(140, 400, 170, 30);

        DoctorSPECIALIZATION.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DoctorSPECIALIZATION.setForeground(new java.awt.Color(0, 102, 102));
        DoctorSPECIALIZATION.setText("Specialization ");
        jPanel6.add(DoctorSPECIALIZATION);
        DoctorSPECIALIZATION.setBounds(20, 470, 120, 30);

        DoctorSpecialization.setColumns(20);
        DoctorSpecialization.setRows(5);
        jScrollPane2.setViewportView(DoctorSpecialization);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(140, 450, 166, 96);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 1366, 768);

        setSize(new java.awt.Dimension(1235, 675));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void connection (Connection connection) throws ClassNotFoundException{ //establishing conncetion with oracle
        
       // This function is for creating connection with oracle database
        
        try {
            Class.forName("oracle.jdbc.OracleDriver"); // defining the oracle driver 
             connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:rimsha", "rimsha", "rimsha"); // establishing connection with user in orcale database
        } 
        
        catch (SQLException ex) { // throwing exception if thus user is not available
            
            Logger.getLogger(ComplainsRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    private void DoctorEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorEmailActionPerformed

    private void DoctorAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorAddBtnActionPerformed

      
          try{
        Connection connection = null;
       connection(connection);
        String sql="insert into DOCTORS"+"(D_ID,D_NAME,D_ADDRESS,D_EMAILADDRESS,D_PHONE,D_CNIC,SPECIALIZATION)"+"values(?,?,?,?,?,?,?)";
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        int a=(int) Integer.parseInt(DoctorID.getText());
        
 preparedstatement.setInt(1, a);
 
        preparedstatement.setString(2, DoctorName.getText());
       preparedstatement.setString(3, DoctorAddress.getText());
        preparedstatement.setString(4, DoctorEmail.getText());
        preparedstatement.setString(5, DoctorPhone.getText());
         preparedstatement.setString(6, DoctorNIC.getText());
         preparedstatement.setString(7, DoctorSpecialization.getText());
        
        preparedstatement.executeUpdate();
        JOptionPane.showMessageDialog(this,"Successfully Inserted!");
       }
       catch(Exception e)
       {JOptionPane.showMessageDialog(this,e.getMessage());
       }
        
 Updated_Table();
        
    }//GEN-LAST:event_DoctorAddBtnActionPerformed

    
    
     public void Updated_Table()
{//
   // Connection conn = JavaConnectDBROLE.ConnectDB(u , p);
    try{
       Connection connection = null;
       connection(connection);
        String sql="Select * from DOCTORS";
        PreparedStatement preparedstatement=null;
       preparedstatement=connection.prepareStatement(sql);
        ResultSet resultset=null;
        resultset=preparedstatement.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(resultset));
       
       }
       catch(Exception e)
       {JOptionPane.showMessageDialog(this,e.getMessage());
       }  
}
    
    
    
    
    
    private void DoctorUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorUpdateBtnActionPerformed
//Connection conn = JavaConnectDBROLE.ConnectDB(u , p);
        
         try{
       Connection connection = null;
       connection(connection);
        String sql="Update DOCTORS set D_NAME =?,D_ADDRESS=?,D_EMAILADDRESS=?,D_PHONE=?,D_CNIC=?,SPECIALIZATION=?"+" where D_ID =?";
        PreparedStatement preparedstatement=connection.prepareStatement(sql);
        
        
 //pst.setString(1, CID2.getText());
       preparedstatement.setString(1, DoctorName.getText());
        preparedstatement.setString(2, DoctorAddress.getText());
        preparedstatement.setString(3, DoctorEmail.getText());
        preparedstatement.setString(4, DoctorPhone.getText());
         preparedstatement.setString(5, DoctorNIC.getText());
         preparedstatement.setString(6, DoctorSpecialization.getText());
         int a=(int) Integer.parseInt(DoctorID.getText());
        
 preparedstatement.setInt(7, a);
        
        
        
        
   
       preparedstatement.executeUpdate();
        JOptionPane.showMessageDialog(this,"Successfully Updated!");
       }
       catch(Exception e)
       {JOptionPane.showMessageDialog(this,e.getMessage());
       }  
        
         Updated_Table();
        
        
    }//GEN-LAST:event_DoctorUpdateBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void DoctorLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorLogoutBtnActionPerformed

        new DistributorVisitorLogin().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_DoctorLogoutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DoctorADDRESS;
    private javax.swing.JButton DoctorAddBtn;
    private javax.swing.JTextField DoctorAddress;
    private javax.swing.JLabel DoctorCNIC;
    private javax.swing.JLabel DoctorEMAIL;
    private javax.swing.JTextField DoctorEmail;
    private javax.swing.JTextField DoctorID;
    private javax.swing.JLabel DoctorId;
    private javax.swing.JButton DoctorLogoutBtn;
    private javax.swing.JLabel DoctorNAME;
    private javax.swing.JTextField DoctorNIC;
    private javax.swing.JTextField DoctorName;
    private javax.swing.JLabel DoctorPHONE;
    private javax.swing.JTextField DoctorPhone;
    private javax.swing.JLabel DoctorRecordTitle;
    private javax.swing.JLabel DoctorSPECIALIZATION;
    private javax.swing.JTextArea DoctorSpecialization;
    private javax.swing.JScrollPane DoctorTable;
    private javax.swing.JLabel DoctorTitle;
    private javax.swing.JButton DoctorUpdateBtn;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

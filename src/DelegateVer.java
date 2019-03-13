
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kalra
 */
public class DelegateVer extends javax.swing.JFrame {

    /**
     * Creates new form DelegateVer
     */
    public DelegateVer() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        team_id = new javax.swing.JTextField();
        team_name = new javax.swing.JTextField();
        attend_ns = new javax.swing.JRadioButton();
        attend_s = new javax.swing.JRadioButton();
        pay_ns = new javax.swing.JRadioButton();
        pay_s = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        mail_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        team_members = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        college_Name = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Team Verification: CodeBreak");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoHead.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Logout Me!");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CodeBreak Participation Verification", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 11))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Team Id:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Team Name:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Mark Attendance:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Payment Status:");

        team_id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        team_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                team_idKeyPressed(evt);
            }
        });

        team_name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        team_name.setEnabled(false);
        team_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                team_nameActionPerformed(evt);
            }
        });

        attend_ns.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(attend_ns);
        attend_ns.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        attend_ns.setText("Absent");
        attend_ns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attend_nsActionPerformed(evt);
            }
        });

        attend_s.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(attend_s);
        attend_s.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        attend_s.setText("Present");
        attend_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attend_sActionPerformed(evt);
            }
        });

        pay_ns.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup2.add(pay_ns);
        pay_ns.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pay_ns.setText("Not Done");
        pay_ns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_nsActionPerformed(evt);
            }
        });

        pay_s.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup2.add(pay_s);
        pay_s.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pay_s.setText("Done");
        pay_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_sActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Reset");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Lead Mail ID:");

        mail_id.setEditable(false);
        mail_id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mail_id.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Team Members Name:");

        team_members.setEditable(false);
        team_members.setColumns(20);
        team_members.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        team_members.setRows(5);
        team_members.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        team_members.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                team_membersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(team_members);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("College Name:");

        college_Name.setEditable(false);
        college_Name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        college_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                college_NameKeyPressed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Update Team Members");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(team_id, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(mail_id)
                                    .addComponent(team_name)
                                    .addComponent(college_Name)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(38, 38, 38)
                                    .addComponent(attend_s)
                                    .addGap(53, 53, 53)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(attend_ns)
                                        .addComponent(pay_ns)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addGap(49, 49, 49)
                                .addComponent(pay_s)
                                .addGap(199, 199, 199)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(team_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(team_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(mail_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(college_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(attend_s)
                    .addComponent(attend_ns))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pay_s)
                    .addComponent(pay_ns))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int r=JOptionPane.showConfirmDialog(this, "Are you sure you want to Logout?");
        if(r==1){
            this.setVisible(false);
            this.setVisible(true);
        }
        else if(r==0){
            this.setVisible(false);
            LoginPage m=new LoginPage();
            m.setVisible(true);
            JOptionPane.showMessageDialog(this, "You are successfully logged out!!","Logout Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pay_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_sActionPerformed
        int stat = JOptionPane.showConfirmDialog(this,"Payment Done for : "+team_id.getText());
        if(stat == 0 ){
            try {
                DBConnect D  = new DBConnect();
                PreparedStatement e = D.InsertConnect("Update Participant_Master set Payment_Status=? where Team_ID='"+team_id.getText()+"'");
                e.setInt(1,1);
                e.executeUpdate();
                JOptionPane.showMessageDialog(this,"Payment Done Successfully!");
             } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error in Connecting Database!");
            }
        }
    }//GEN-LAST:event_pay_sActionPerformed

    private void team_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_team_idKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try {
                String Query = team_id.getText();
                String q = "Select * from Participant_Master where Team_ID = '"+Query+"'";
                DBConnect d = new DBConnect();
                java.sql.Statement s = d.SelectConnect();
                ResultSet rs = s.executeQuery(q);
                while(rs.next()){
                    team_name.setText(String.valueOf(rs.getString("Team_Name")));
                    mail_id.setText(String.valueOf(rs.getString("Lead_Mail")));
                    team_members.setText(String.valueOf(rs.getString("Members_Name")));
                    college_Name.setText(String.valueOf(rs.getString("College_Name")));
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Please Search for a Valid Id!","Invalid Data",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_team_idKeyPressed

    private void attend_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attend_sActionPerformed
        int stat = JOptionPane.showConfirmDialog(this,"Do you want to mark Present for : "+team_id.getText());
        if(stat == 0 ){
            try {
                DBConnect D  = new DBConnect();
                PreparedStatement e = D.InsertConnect("Update Participant_Master set Attendance_Status=? where Team_ID='"+team_id.getText()+"'");
                e.setInt(1,1);
                e.executeUpdate();
                JOptionPane.showMessageDialog(this,"Attendance Marked Successfully!");
             } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error in Connecting Database!");
            }
        }
    }//GEN-LAST:event_attend_sActionPerformed

    private void attend_nsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attend_nsActionPerformed
        int stat = JOptionPane.showConfirmDialog(this,"Do you want to mark Absent for : "+team_id.getText());
        if(stat == 0 ){
            try {
                DBConnect D  = new DBConnect();
                PreparedStatement e = D.InsertConnect("Update Participant_Master set Attendance_Status=? where Team_ID='"+team_id.getText()+"'");
                e.setInt(1,0);
                e.executeUpdate();
                JOptionPane.showMessageDialog(this,"Attendance Marked Successfully!");
             } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error in Connecting Database!");
            }
        }
    }//GEN-LAST:event_attend_nsActionPerformed

    private void pay_nsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_nsActionPerformed
        int stat = JOptionPane.showConfirmDialog(this,"Payment Not Done by : "+team_id.getText());
        if(stat == 0 ){
            try {
                DBConnect D  = new DBConnect();
                PreparedStatement e = D.InsertConnect("Update Participant_Master set Payment_Status=? where Team_ID='"+team_id.getText()+"'");
                e.setInt(1,0);
                e.executeUpdate();
                JOptionPane.showMessageDialog(this,"Payment Not Done Successfully!");
             } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error in Connecting Database!");
            }
        }
    }//GEN-LAST:event_pay_nsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        team_id.setText("");
        team_name.setText("");
        mail_id.setText("");
        team_members.setText("");
        college_Name.setText("");
        
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void team_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_team_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_team_nameActionPerformed

    private void college_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_college_NameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_college_NameKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int stat = JOptionPane.showConfirmDialog(this,"Do you want to update Team Members for : "+team_id.getText());
        if(stat == 0 ){
            try {
                DBConnect D  = new DBConnect();
                PreparedStatement e = D.InsertConnect("Update Participant_Master set Members_Name=? where Team_ID='"+team_id.getText()+"'");
                e.setString(1,team_members.getText());
                e.executeUpdate();
                JOptionPane.showMessageDialog(this,"Team Members Updated Successfully!");
                team_members.setEditable(false);
             } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error in Connecting Database!");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void team_membersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_team_membersMouseClicked
        team_members.setEditable(true);
        JOptionPane.showMessageDialog(this,"You can now starting Typing!");
    }//GEN-LAST:event_team_membersMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DelegateVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DelegateVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DelegateVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DelegateVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DelegateVer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton attend_ns;
    private javax.swing.JRadioButton attend_s;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField college_Name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mail_id;
    private javax.swing.JRadioButton pay_ns;
    private javax.swing.JRadioButton pay_s;
    private javax.swing.JTextField team_id;
    private javax.swing.JTextArea team_members;
    private javax.swing.JTextField team_name;
    // End of variables declaration//GEN-END:variables
}


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nihara
 */
public class dept7 extends javax.swing.JFrame {

    /**
     * Creates new form dept7
     */
    public dept7() {
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

        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 111, 50));

        jCheckBox1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(242, 221, 221));
        jCheckBox1.setText("Completeness of infrastructure maintenance and development");

        jCheckBox2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(233, 214, 214));
        jCheckBox2.setText("Report and data collection regarding past NBA visits and placements");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(239, 220, 220));
        jCheckBox3.setText("Implementation of suggested method of teaching and conducting examinations");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(250, 234, 234));
        jCheckBox4.setText("Completion of reports regarding results");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(238, 217, 217));
        jCheckBox5.setText("Budget completed");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(239, 229, 229));
        jCheckBox6.setText("Professional society activities,events,conferences organised");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(254, 254, 254));
        jCheckBox7.setText("Performance evaluation of faculty");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("FreeSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 245, 245));
        jLabel1.setText("ELECTRICAL ENGINEERING");

        jButton1.setBackground(new java.awt.Color(64, 64, 36));
        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(236, 207, 207));
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(50, 50, 31));
        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 219, 219));
        jButton2.setText("REFRESH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jCheckBox1)
                .addGap(43, 43, 43)
                .addComponent(jCheckBox2)
                .addGap(29, 29, 29)
                .addComponent(jCheckBox3)
                .addGap(34, 34, 34)
                .addComponent(jCheckBox4)
                .addGap(44, 44, 44)
                .addComponent(jCheckBox5)
                .addGap(34, 34, 34)
                .addComponent(jCheckBox6)
                .addGap(28, 28, 28)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        //System.out.print("connect");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javapro","nihu","Nihar@25*");
        
        if(jCheckBox1.isSelected())
        {String i="yes";
        String sql = "UPDATE electrical SET status='"+i+"'WHERE no='"+"1"+"' ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.execute();
        }
        if(jCheckBox2.isSelected())
        {String i="yes";
        String sql = "UPDATE electrical SET status='"+i+"'WHERE no='"+"2"+"' ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.execute();
        }
        if(jCheckBox3.isSelected())
        {String i="yes";
        String sql = "UPDATE electrical SET status='"+i+"'WHERE no='"+"3"+"' ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.execute();
        }
        if(jCheckBox4.isSelected())
        {String i="yes";
        String sql = "UPDATE electrical SET status='"+i+"'WHERE no='"+"4"+"' ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.execute();
        }
        if(jCheckBox5.isSelected())
        {String i="yes";
        String sql = "UPDATE electrical SET status='"+i+"'WHERE no='"+"5"+"' ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.execute();
        }
        if(jCheckBox6.isSelected())
        {String i="yes";
        String sql = "UPDATE electrical SET status='"+i+"'WHERE no='"+"6"+"' ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.execute();
        }
        if(jCheckBox7.isSelected())
        {String i="yes";
        String sql = "UPDATE electrical SET status='"+i+"'WHERE no='"+"7"+"' ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.execute();
        }
        
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {Class.forName("com.mysql.cj.jdbc.Driver");
        //System.out.print("connect");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javapro","nihu","Nihar@25*");
        
        String i="yes";
        Statement st=con.createStatement();
        String query="Select no from electrical where status='"+i+"'";
        ResultSet rs=st.executeQuery(query);
        int p,c=0;
        while(rs.next())
        {
        p=rs.getInt("no");
        if(p==1)
        {
            jCheckBox1.setSelected(true);
            jCheckBox1.setEnabled(false);
        }
        if(p==2)
        {
           jCheckBox2.setSelected(true);
            jCheckBox2.setEnabled(false); 
        }
        if(p==3)
        {
            jCheckBox3.setSelected(true);
            jCheckBox3.setEnabled(false);
        }
        if(p==4)
        {
            jCheckBox4.setSelected(true);
            jCheckBox4.setEnabled(false);
        }
        if(p==5)
        {
            jCheckBox5.setSelected(true);
            jCheckBox5.setEnabled(false);
        }
        if(p==6)
        {jCheckBox6.setSelected(true);
            jCheckBox6.setEnabled(false);
                    }
        if(p==7)
        {
           jCheckBox7.setSelected(true);
            jCheckBox7.setEnabled(false); 
        }
        
        
        }
        String k="no";
        Statement smt=con.createStatement();
        String q="Select no from electrical where status='"+k+"'";
        ResultSet r=smt.executeQuery(q);
        int s;
        while(r.next())
        {
        s=r.getInt("no");
        if(s==1)
        {
            jCheckBox1.setSelected(false);
            //jCheckBox1.setEnabled(false);
        }
        if(s==2)
        {
           jCheckBox2.setSelected(false);
            //jCheckBox2.setEnabled(false); 
        }
        if(s==3)
        {
            jCheckBox3.setSelected(false);
            //jCheckBox3.setEnabled(false);
        }
        if(s==4)
        {
            jCheckBox4.setSelected(false);
            //jCheckBox4.setEnabled(false);
        }
        if(s==5)
        {
            jCheckBox5.setSelected(false);
            //jCheckBox5.setEnabled(false);
        }
        if(s==6)
        {jCheckBox6.setSelected(false);
            //jCheckBox6.setEnabled(false);
                    }
        if(s==7)
        {
           jCheckBox7.setSelected(false);
            //jCheckBox7.setEnabled(false); 
        }
        
        
        
        }
        
        
        
        
        
        
        }
        catch(Exception e)
        {
            System.out.print(e);}
        
        
  

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

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
            java.util.logging.Logger.getLogger(dept7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dept7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dept7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dept7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dept7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

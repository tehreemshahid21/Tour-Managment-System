/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.project;

import javax.swing.JOptionPane;

/**
 *
 * @author ahmad
 */
public class LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public LOGIN() {
        initComponents();
        setComponentName();
    }
    private void setComponentName()
    {
        b2.setName("b2");
        b1.setName("b1");
        ll1.setName("ll1");
        ll2.setName("ll2");
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t4.setName("t4");
        t5.setName("t5");
        t6.setName("t6");
        t7.setName("t7");
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        t6 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        ll1 = new javax.swing.JTextField();
        ll2 = new javax.swing.JPasswordField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        l = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        t6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmad\\OneDrive\\Documents\\NetBeansProjects\\GUI PROJECT\\tour6.jpg")); // NOI18N
        t6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 4));

        t7.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmad\\OneDrive\\Documents\\NetBeansProjects\\GUI PROJECT\\tour7.jpg")); // NOI18N
        t7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 5));

        t5.setBackground(new java.awt.Color(51, 0, 0));
        t5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmad\\OneDrive\\Documents\\NetBeansProjects\\GUI PROJECT\\tour8.jpg")); // NOI18N
        t5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 5));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(t6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t7)
                .addContainerGap())
        );

        t3.setBackground(new java.awt.Color(0, 0, 0));
        t3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 0, 51));
        t3.setText("ADMIN-ID");
        t3.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        t4.setBackground(new java.awt.Color(0, 0, 0));
        t4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 51, 51));
        t4.setText("PASSWORD");
        t4.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        ll1.setBackground(new java.awt.Color(204, 0, 51));
        ll1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ll1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ll1ActionPerformed(evt);
            }
        });

        ll2.setBackground(new java.awt.Color(204, 0, 51));
        ll2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ll2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ll2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ll2ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(204, 0, 51));
        b1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(51, 0, 0));
        b1.setText("LOGIN");
        b1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(204, 0, 51));
        b2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        b2.setText("RETURN");
        b2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });

        l.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        l.setForeground(new java.awt.Color(0, 51, 204));

        l1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        l1.setForeground(new java.awt.Color(0, 51, 204));

        t2.setBackground(new java.awt.Color(0, 0, 0));
        t2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 0, 51));
        t2.setText(" WELCOME ADMIN");

        t1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 0, 51));
        t1.setText("FAST TOUR COMPANY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(t3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(l1)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ll2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                            .addComponent(ll1)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(l)
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                            .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addComponent(t1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(t2)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(t1)
                .addGap(18, 18, 18)
                .addComponent(t2)
                .addGap(42, 42, 42)
                .addComponent(t3)
                .addGap(8, 8, 8)
                .addComponent(ll1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(t4)
                .addGap(21, 21, 21)
                .addComponent(ll2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(l))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ll1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ll1ActionPerformed

    private void ll2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ll2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ll2ActionPerformed

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        int a = ll1.getText().length();
        int c=  ll2.getText().length();
         boolean b = false;
        if(ll1.getText().isEmpty()&& ll2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"OOops!!! USERNAME AND PASSWORD ARE Missing");
        }
        else if(ll1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"OOops!!! USERNAME is Missing");
        }
        else if(ll2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"OOops!!! PASSWORD is Missing");
        }
        else if(ll2.getText().length()<4)
        {
            l.setText("weak password");  
            JOptionPane.showMessageDialog(this,"OOops!!! PASSWORD is Weak,Should be of 5 or more words");
        }
        else
        {
            for (int i = 0; i < a; i++)
            {
                if (ll1.getText().charAt(i) == '@')
                {
                    b = true;
                    break;
                }
            }
            if (b == false)
            {
                l1.setText("@ is missing"); 
                JOptionPane.showMessageDialog(this,"OOops!!! Entered Incorrect Email");
            }
            else
            {
                l.setText("Strong password");  
                new FORM().setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_b1MouseClicked

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        new select().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b2MouseClicked

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        int a = ll1.getText().length();
        int c=  ll2.getText().length();
         boolean b = false;
        if(ll1.getText().isEmpty()&& ll2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"OOops!!! ADMIN ID AND PASSWORD ARE Missing");
        }
        else if(ll1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"OOops!!! ADMIN ID is Missing");
        }
        else if(ll2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"OOops!!! PASSWORD is Missing");
        }
        else if(ll1.getText().equals("Admin")&& ll2.getText().equals("123"))
        {
            new FORM().setVisible(true);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"OOops!!! Wrong ID or Password");
            ll1.setText(null);
            ll2.setText(null);
        }
    }//GEN-LAST:event_b1ActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel l;
    private javax.swing.JLabel l1;
    private javax.swing.JTextField ll1;
    private javax.swing.JPasswordField ll2;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JLabel t7;
    // End of variables declaration//GEN-END:variables
}


package gui.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class TICKETS extends javax.swing.JFrame {

   
    public TICKETS() {
        initComponents();
        getPassenger();
        t5.setEditable(false);
        t1.setEditable(false);
        t2.setEditable(false);
        t3.setEditable(false);
        getTour();
        displayBooking();
        setComponentName();
    }
    private void setComponentName()
    {
        b1.setName("b1");
        b2.setName("b2");
        b3.setName("b3");
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t4.setName("t4");
        t5.setName("t5");
        l1.setName("l1");
        l2.setName("l2");
        l3.setName("l3");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pgen = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pstatus = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        t4 = new javax.swing.JTextField();
        l3 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        passidcb = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingtable = new javax.swing.JTable();
        b2 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tcodecb = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pgen.setBackground(new java.awt.Color(0, 0, 0));
        pgen.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        pgen.setForeground(new java.awt.Color(255, 0, 51));
        pgen.setText("GENDER");

        b3.setBackground(new java.awt.Color(102, 0, 0));
        b3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 0, 51));
        b3.setText("RETURN");
        b3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("TOUR CODE");

        pstatus.setBackground(new java.awt.Color(0, 0, 0));
        pstatus.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        pstatus.setForeground(new java.awt.Color(255, 0, 51));
        pstatus.setText("TICKET ID");

        t1.setBackground(new java.awt.Color(102, 0, 0));
        t1.setForeground(new java.awt.Color(255, 0, 51));
        t1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("PERSON ID");

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        t4.setBackground(new java.awt.Color(102, 0, 0));
        t4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 0, 51));
        t4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });

        l3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 0, 51));
        l3.setText("LIST OF BOOKINGS");
        l3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        b1.setBackground(new java.awt.Color(102, 0, 0));
        b1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 0, 51));
        b1.setText("BOOK");
        b1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        l1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 0, 51));
        l1.setText("FAST TOUR COMPANY");
        l1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        passidcb.setBackground(new java.awt.Color(102, 0, 0));
        passidcb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passidcb.setForeground(new java.awt.Color(255, 0, 51));
        passidcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passidcbActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("AMOUNT");

        bookingtable.setBackground(new java.awt.Color(102, 0, 0));
        bookingtable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bookingtable.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        bookingtable.setForeground(new java.awt.Color(255, 204, 51));
        bookingtable.setModel(new javax.swing.table.DefaultTableModel(
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
        bookingtable.setSelectionBackground(new java.awt.Color(255, 102, 255));
        bookingtable.setSelectionForeground(new java.awt.Color(0, 0, 255));
        jScrollPane1.setViewportView(bookingtable);

        b2.setBackground(new java.awt.Color(102, 0, 0));
        b2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 0, 51));
        b2.setText("RESET");
        b2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        l2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 0, 51));
        l2.setText("TICKET CONFIRMING");
        l2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("PERSON NAME");

        t5.setBackground(new java.awt.Color(102, 0, 0));
        t5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        t5.setForeground(new java.awt.Color(255, 0, 51));
        t5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("STATUS");

        tcodecb.setBackground(new java.awt.Color(102, 0, 0));
        tcodecb.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        tcodecb.setForeground(new java.awt.Color(255, 0, 51));

        t2.setBackground(new java.awt.Color(102, 0, 0));
        t2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 0, 51));
        t2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t3.setBackground(new java.awt.Color(102, 0, 0));
        t3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 0, 51));
        t3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(passidcb, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tcodecb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pgen)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pstatus)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(l2)
                                .addComponent(l3)))
                        .addGap(144, 144, 144)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(l1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(pstatus)
                    .addComponent(pgen)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tcodecb)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t5, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addComponent(t1)
                        .addComponent(t4)
                        .addComponent(passidcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(t2)
                    .addComponent(t3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(l3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(664, 664, 664)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
            new FORM().setVisible(true);
                    this.dispose();        
    }//GEN-LAST:event_b3ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed
    Connection con=null;
    PreparedStatement put=null;
    ResultSet rs=null,rs1=null;
    Statement s=null,s1=null;
    private void getPassenger()
    {
        try
        {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3307/tourdb","root","arsenal360");
             s=con.createStatement();
             String query="select * from passengertable";
             rs=s.executeQuery(query);
             while(rs.next())
             {
                 String pid=String.valueOf(rs.getInt("Pid"));
                 passidcb.addItem(pid);
             }
        }catch(Exception e)
        {
            
        } 
    }
    private void getTour()
    {
        try
        {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3307/tourdb","root","arsenal360");
             s=con.createStatement();
             String query="select * from flighttable";
             rs=s.executeQuery(query);
             while(rs.next())
             {
                 String fcode=rs.getString("FIcode");
                 tcodecb.addItem(fcode);
             }
        }catch(Exception e)
        {
            
        } 
    }
    private void getPassengerData()
    {
        String query="select * from passengertable where Pid="+passidcb.getSelectedItem().toString();
        Statement st;
        ResultSet rs;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/tourdb","root","arsenal360");
            st=con.createStatement();
            rs=st.executeQuery(query);
            if(rs.next())
            {
                t1.setText(rs.getString("Pname"));
                t2.setText(rs.getString("Pgen"));
                t3.setText(rs.getString("Ppass"));
                t5.setText(rs.getString("Pnat")); 
            }
        }catch(Exception e){
            
        } 
    }
    private void displayBooking()
    {
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/tourdb","root","arsenal360");
            s=con.createStatement();
            rs=s.executeQuery("select * from bookingtable");
            bookingtable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            
        } 
        
    }
    int tid=0;
    private void countTours()
    {
        try
        {
            s1=con.createStatement();
            rs1=s1.executeQuery("select MAX(ticketid) from bookingtable");
            rs1.next(); 
            tid=rs1.getInt(1)+1; 
        }catch(Exception e){
            
        }    
    }
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(passidcb.getSelectedIndex()==-1||tcodecb.getSelectedIndex()==-1||t4.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "missing information");
        }
        else
        {
            try
            {
                countTours();
                con=DriverManager.getConnection("jdbc:mysql://localhost:3307/tourdb","root","arsenal360");
                PreparedStatement add=con.prepareStatement("insert into bookingtable values(?,?,?,?,?,?,?)");
                add.setInt(1,tid);
                add.setString(2, t1.getText());
                add.setString(3,tcodecb.getSelectedItem().toString());
                add.setString(4,t2.getText());
                add.setString(5,t3.getText());
                add.setInt(6, Integer.valueOf(t4.getText()));
                add.setString(7, t5.getText());
                int row=add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Ticket Booked");
                con.close();
                displayBooking();
                clear(); 
            }catch(Exception e){   
                 JOptionPane.showMessageDialog(this, e );
            }
        } 
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        clear();
    }//GEN-LAST:event_b2ActionPerformed

    private void clear()
    {
        tcodecb.setSelectedIndex(-1);
        //passidcb.setSelectedIndex(-1);
        t5.setText("");
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        
    }
    
    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
        new FORM().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b3MouseClicked

    private void passidcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passidcbActionPerformed
        getPassengerData();
    }//GEN-LAST:event_passidcbActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

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
            java.util.logging.Logger.getLogger(TICKETS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TICKETS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TICKETS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TICKETS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TICKETS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JTable bookingtable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JComboBox<String> passidcb;
    private javax.swing.JLabel pgen;
    private javax.swing.JLabel pstatus;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JComboBox<String> tcodecb;
    // End of variables declaration//GEN-END:variables
}

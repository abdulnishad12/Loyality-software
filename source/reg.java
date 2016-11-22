import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getInt;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdul_uhmo9y
 */

public class reg extends javax.swing.JFrame {
 ImageIcon img = new ImageIcon(this.getClass().getResource("logo.jpg"));

    String s = "customer name";
    void ok_ph()
    {
            String dbURL;
    String c=null;

        dbURL = "jdbc:mysql://localhost:3306/jamal?zeroDateTimeBehavior=convertToNull";
           String username ="root";
           String password = "";
           Connection dbCon;
                    
                   s= ph.getText();
                 

           try {
               Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
        try{
            dbCon= DriverManager.getConnection(dbURL, username, password);
            Statement stmt = dbCon.createStatement();
ResultSet rslt=null;
               int cod = db("select code from customer where mobile = '"+s+"'");  

    rslt = stmt.executeQuery("Select name from customer where code = "+cod);
    stmt.closeOnCompletion();
   while(rslt.next())
       c =rslt.getString("name");
               Statement stmt1 = dbCon.createStatement();
               ResultSet rs = null;
               rs = stmt1.executeQuery("Select point from customer where code= "+cod);
               stmt1.closeOnCompletion();
               
               int p=0;
               while(rs.next())
                   p=rs.getInt("point");
               String q =Integer.toString(p);
             name.setText(c);
point.setText(q);  
rslt = stmt.executeQuery("select mobile from customer where code ="+cod);
stmt.closeOnCompletion();
while(rslt.next())
       c =rslt.getString("mobile");
mobile.setText(c);




} catch (SQLException  ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
void ok_code()
{
        String dbURL;
    String c=null;

        dbURL = "jdbc:mysql://localhost:3306/jamal?zeroDateTimeBehavior=convertToNull";
           String username ="root";
           String password = "";
           Connection dbCon;
                    
                   s= code.getText();
                   

           try {
               Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
        try{
            dbCon= DriverManager.getConnection(dbURL, username, password);
            Statement stmt = dbCon.createStatement();
ResultSet rslt=null;
    rslt = stmt.executeQuery("Select name from customer where code = "+s);
    stmt.closeOnCompletion();
   while(rslt.next())
       c =rslt.getString("name");
               Statement stmt1 = dbCon.createStatement();
               ResultSet rs = null;
               rs = stmt1.executeQuery("Select point from customer where code= "+s);
               stmt1.closeOnCompletion();
               
               int p=0;
               while(rs.next())
                   p=rs.getInt("point");
               String q =Integer.toString(p);
             name.setText(c);
point.setText(q);  
rslt = stmt.executeQuery("select mobile from customer where code ="+s);
stmt.closeOnCompletion();
while(rslt.next())
       c =rslt.getString("mobile");
mobile.setText(c);




} catch (SQLException  ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

            
    
}
    /**
     * Creates new form reg
     * @throws java.lang.Exception
     */
    public reg() throws Exception{
        initComponents();
    }
 
public int db(String s) throws SQLException{
    String dbURL;       
            dbURL = "jdbc:mysql://localhost:3306/jamal?zeroDateTimeBehavior=convertToNull";
           String username ="root";
           String password = "";
           Connection dbCon;
           try {
               Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
      
            dbCon= DriverManager.getConnection(dbURL, username, password);
            Statement stmt = dbCon.createStatement();
            ResultSet rslt=null;
    rslt = stmt.executeQuery(s);
        stmt.closeOnCompletion();
        int i = 0;
while(rslt.next())
{
    i=(rslt.getInt(1));
}

return(i);
            
        }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        point = new javax.swing.JTextField();
        redeem = new javax.swing.JButton();
        bill = new javax.swing.JTextField();
        code = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        mobile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        date = new javax.swing.JFormattedTextField();
        amount = new javax.swing.JFormattedTextField();
        ph = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ok1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Blue Rabbit Tech (Freelance)");
        setForeground(new java.awt.Color(0, 102, 204));
        setIconImage(img.getImage());
        setPreferredSize(new java.awt.Dimension(800, 600));

        name.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        name.setText("customer");

        point.setEditable(false);
        point.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        point.setForeground(new java.awt.Color(0, 0, 153));
        point.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        point.setText("**");
        point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointActionPerformed(evt);
            }
        });

        redeem.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        redeem.setText("Redeem");
        redeem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redeemActionPerformed(evt);
            }
        });

        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });

        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });
        code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codeKeyPressed(evt);
            }
        });

        ok.setText("ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        ok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                okKeyPressed(evt);
            }
        });

        mobile.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        mobile.setText("mobile");

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel1.setText("JAMAL'S LOYALITY Software");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Mobile:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Amount:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setText("Bill Number:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Vision points");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setText("Jamal's code");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel8.setText("Date:");

        jButton1.setText("Add Vision Point");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        date.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        amount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        ph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phActionPerformed(evt);
            }
        });
        ph.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel9.setText("Mobile");

        ok1.setText("ok");
        ok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 282, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mobile, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jButton1)
                                            .addGap(11, 11, 11))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bill))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(date))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ok1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ok)))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(redeem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(point)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(mobile))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(ok))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(ok1))
                        .addGap(73, 73, 73)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(redeem)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointActionPerformed
       
                    

        
    }//GEN-LAST:event_pointActionPerformed

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
ok_code();        // TODO add your handling code here:
        
    }//GEN-LAST:event_okActionPerformed

    private void redeemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redeemActionPerformed
    String dbURL;
            dbURL = "jdbc:mysql://localhost:3306/jamal?zeroDateTimeBehavior=convertToNull";
           String username ="root";
           String password = "";
           Connection dbCon ;
           
           try {
               
               Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
      
        try {
            dbCon= DriverManager.getConnection(dbURL, username, password);
                  int i = db("Select point from customer where code = "+s);
                  if(i<300)
                          {
                      JFrame parent = new JFrame();
            JOptionPane.showMessageDialog(parent,"minimum 300 points need for redemption");
                          }
                  if(i>300)
                  {
            Statement stmt = dbCon.createStatement();
            stmt.executeUpdate("update customer set point =  0 where code ="+s);
            stmt.closeOnCompletion();
            JFrame parent = new JFrame();
            JOptionPane.showMessageDialog(parent,"vision point: "+i+"Redeemed Sucessfully");
        }
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_redeemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String dbURL;
            dbURL = "jdbc:mysql://localhost:3306/jamal?zeroDateTimeBehavior=convertToNull";
           String username ="root";
           String password = "";
           Connection dbCon;
           try {
               Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
           if("".equals(code.getText()))
           {
               int p= db("Select code from customer where mobile ='"+ph.getText()+"'");
               s = Integer.toString(p);
           }
            dbCon= DriverManager.getConnection(dbURL, username, password);
            String camount= amount.getText();
            int amnt=Integer.parseInt(camount);
           int tamnt = (5*amnt)/100;
                       //remove following 2 lines
             JFrame parent2 = new JFrame();
            JOptionPane.showMessageDialog(parent2,"Earned "+tamnt+ " points");
            String cbill = bill.getText();
            String cdate = date.getText();
            Statement stmt = dbCon.createStatement();
            Statement stmt1 = dbCon.createStatement();
            ResultSet rst= stmt1.executeQuery("Select point from customer where code ="+s);
           stmt1.closeOnCompletion();
            rst.next();
                tamnt= tamnt+rst.getInt("point");
                
                
            int rslt=0;
            
    rslt = stmt.executeUpdate("update customer set point ="+tamnt+",date='"+cdate+"',bill= '"+cbill+"' where code ="+s);
        stmt.closeOnCompletion();
                           
            point.setText(Integer.toString(tamnt));
// TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
    }//GEN-LAST:event_codeActionPerformed

    private void phActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phActionPerformed

    private void ok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok1ActionPerformed
ok_ph();
            
            // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_ok1ActionPerformed
/*
    
    */
    private void okKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_okKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_okKeyPressed

    private void codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        ok_code();
    }//GEN-LAST:event_codeKeyPressed

    private void phKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        ok_ph();        // TODO add your handling code here:
    }//GEN-LAST:event_phKeyPressed

    /**
     */
    public static void reg() {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new reg().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField amount;
    private javax.swing.JTextField bill;
    private javax.swing.JTextField code;
    private javax.swing.JFormattedTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mobile;
    private javax.swing.JLabel name;
    private javax.swing.JButton ok;
    private javax.swing.JButton ok1;
    private javax.swing.JTextField ph;
    private javax.swing.JTextField point;
    private javax.swing.JButton redeem;
    // End of variables declaration//GEN-END:variables
}

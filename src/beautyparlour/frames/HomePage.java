/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.frames;

/**
 *
 * @author Dell
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage2
     */
    public HomePage() {
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
        jLabel2 = new javax.swing.JLabel();
        jButtonLogin6 = new javax.swing.JButton();
        jButtonProduct = new javax.swing.JButton();
        jButtonLogin9 = new javax.swing.JButton();
        jButtonLogin10 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 204, 0));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beautyparlour/util/signature_logodone.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jButtonLogin6.setBackground(new java.awt.Color(102, 204, 255));
        jButtonLogin6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonLogin6.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beautyparlour/util/sale.png"))); // NOI18N
        jButtonLogin6.setText("Sale");
        jButtonLogin6.setFocusPainted(false);
        jButtonLogin6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 310, 120));

        jButtonProduct.setBackground(new java.awt.Color(102, 204, 255));
        jButtonProduct.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonProduct.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beautyparlour/util/services.png"))); // NOI18N
        jButtonProduct.setText("Services");
        jButtonProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 310, 120));

        jButtonLogin9.setBackground(new java.awt.Color(102, 204, 255));
        jButtonLogin9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonLogin9.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beautyparlour/util/customer.png"))); // NOI18N
        jButtonLogin9.setText("Customer");
        jButtonLogin9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 310, 120));

        jButtonLogin10.setBackground(new java.awt.Color(102, 204, 255));
        jButtonLogin10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonLogin10.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beautyparlour/util/customer_records.png"))); // NOI18N
        jButtonLogin10.setText("Customer Records");
        jButtonLogin10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 310, 120));

        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 480, 60, 70));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, 130));

        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, 60, 70));

        jLabel1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Signature Beauty & Fitness Zone");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(564, 564, 564)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogin6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin6ActionPerformed
        // TODO add your handling code here:
        //        new CustomerRecords().setVisible(true);
        //        this.dispose();
        new SalePage().setVisible(true);
    }//GEN-LAST:event_jButtonLogin6ActionPerformed

    private void jButtonProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductActionPerformed
        // TODO add your handling code here:
        //        new CompanyProduct().setVisible(true);
        //        this.dispose();
        this.dispose();
        new ServiceForm().setVisible(true);
    }//GEN-LAST:event_jButtonProductActionPerformed

    private void jButtonLogin9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin9ActionPerformed
        // TODO add your handling code here:
                new CustomerForm().setVisible(true);
        //        this.dispose();
        
    }//GEN-LAST:event_jButtonLogin9ActionPerformed

    private void jButtonLogin10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin10ActionPerformed
        // TODO add your handling code here:
        //        new SalePage().setVisible(true);
        //        this.dispose();
    }//GEN-LAST:event_jButtonLogin10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //        new SetingJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        //        genReport();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonLogin10;
    private javax.swing.JButton jButtonLogin6;
    private javax.swing.JButton jButtonLogin9;
    private javax.swing.JButton jButtonProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

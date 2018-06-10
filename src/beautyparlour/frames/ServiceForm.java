/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.frames;

import beautyparlour.bean.ServiceBeans;
import beautyparlour.dao.ServiceDao;
import beautyparlour.daoImpl.ServiceDaoImpl;
import beautyparlour.util.CurrentDate;
import beautyparlour.util.playAudio;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;






/**
 *
 * @author Dell
 */
public class ServiceForm extends javax.swing.JFrame {

    /**
     * Creates new form CompanyForm
     */
    DefaultTableModel tableModelService;
    public ArrayList<ServiceBeans> service_list;
    TableRowSorter<DefaultTableModel> rowSorter = null;

    ServiceDao serviceDao;

    public ServiceForm() {
        initComponents();

        serviceDao = new ServiceDaoImpl();
        tableModelService = (DefaultTableModel) this.jTableService.getModel();
        rowSorter = new TableRowSorter<DefaultTableModel>(tableModelService);
        JTableHeader header = this.jTableService.getTableHeader();
        header.setBackground(new Color(102,204,255));
        header.setForeground(new Color(255, 255, 255));
        header.setFont(new Font("SansSerif", Font.BOLD, 14));
        this.jButtonUpdate.setEnabled(false);
        this.jButtonDelete.setEnabled(false);
          this.jTableService.setRowSorter(rowSorter);
        showInTable();
    }

    public void showInTable() {
        tableModelService.setRowCount(0);

        int serial = 0;
        service_list = serviceDao.getAllService();
        for (ServiceBeans service : service_list) {
            Vector V = new Vector();
            serial++;

            V.add(serial);
            V.add(service.getService_id());
            V.add(service.getService_name());
            V.add(service.getService_cost());
            V.add(service.getService_date());
            
//            V.add(customer.getCreation_date());

            tableModelService.addRow(V);
        }
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
        jButtonBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldServiceName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCost = new javax.swing.JTextField();
        jButtoSave = new javax.swing.JButton();
        jButtonClear1 = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableService = new javax.swing.JTable();
        jTextFieldSerach = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBack.setBackground(new java.awt.Color(102, 204, 255));
        jButtonBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack.setText("Back");
        jButtonBack.setFocusPainted(false);
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Our SERVICES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 350, 30));

        jTextFieldServiceName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldServiceName.setBorder(null);
        jTextFieldServiceName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextFieldServiceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Cost*");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 206, -1));

        jTextFieldCost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldCost.setBorder(null);
        jTextFieldCost.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextFieldCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 210, 40));

        jButtoSave.setBackground(new java.awt.Color(102, 204, 255));
        jButtoSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtoSave.setForeground(new java.awt.Color(255, 255, 255));
        jButtoSave.setText("Save");
        jButtoSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoSaveActionPerformed(evt);
            }
        });
        jPanel1.add(jButtoSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 220, 40));

        jButtonClear1.setBackground(new java.awt.Color(102, 204, 255));
        jButtonClear1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonClear1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear1.setText("Clear");
        jButtonClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClear1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 220, 40));

        jButtonUpdate.setBackground(new java.awt.Color(102, 204, 255));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 220, 40));

        jButtonDelete.setBackground(new java.awt.Color(102, 204, 255));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 220, 40));

        jTableService.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTableService.setForeground(new java.awt.Color(0, 0, 51));
        jTableService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr #", "Service Id", "Service Name", "Cost", "Creation Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableService.setToolTipText("Products");
        jTableService.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableService.setGridColor(new java.awt.Color(0, 0, 51));
        jTableService.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTableService.setSelectionForeground(new java.awt.Color(0, 240, 0));
        jTableService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableServiceMouseReleased(evt);
            }
        });
        jTableService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableServiceKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTableService);
        if (jTableService.getColumnModel().getColumnCount() > 0) {
            jTableService.getColumnModel().getColumn(0).setMinWidth(70);
            jTableService.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTableService.getColumnModel().getColumn(0).setMaxWidth(70);
            jTableService.getColumnModel().getColumn(1).setMinWidth(80);
            jTableService.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTableService.getColumnModel().getColumn(1).setMaxWidth(80);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 880, 510));

        jTextFieldSerach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldSerach.setBorder(null);
        jTextFieldSerach.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldSerach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSerachActionPerformed(evt);
            }
        });
        jTextFieldSerach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSerachKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldSerach, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 200, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Search");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 60, 30));

        jLabel1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Signature Beauty & Fitness Zone");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 1250, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 50, 200, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 210, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("SERVICE NAME*");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed

        //new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTextFieldCompanyNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCompanyNameMouseClicked

    }//GEN-LAST:event_jTextFieldCompanyNameMouseClicked

    private void jTextFieldCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCompanyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCompanyNameActionPerformed

    private void jTextFieldCompanyNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCompanyNameKeyPressed

    }//GEN-LAST:event_jTextFieldCompanyNameKeyPressed

    private void jTextFieldCompanyContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCompanyContactMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCompanyContactMouseClicked

    private void jTextFieldCompanyContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCompanyContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCompanyContactActionPerformed

    private void jTextFieldCompanyContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCompanyContactKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCompanyContactKeyPressed

    private void jTextFieldCompanyAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCompanyAddressMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCompanyAddressMouseClicked

    private void jTextFieldCompanyAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCompanyAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCompanyAddressActionPerformed

    private void jTextFieldCompanyAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCompanyAddressKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCompanyAddressKeyPressed

    private void jTextFieldCompanyDealerNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCompanyDealerNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCompanyDealerNameMouseClicked

    private void jTextFieldCompanyDealerNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCompanyDealerNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCompanyDealerNameKeyPressed

    private void jButtoSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoSaveActionPerformed
        String service_name = this.jTextFieldServiceName.getText();
        String cost = this.jTextFieldCost.getText();
    

        if (service_name.equals("") || cost.equals("")) {
             new playAudio().playErrorSound();
            JOptionPane.showMessageDialog(this, "Fill the fields");
        } else {
            double service_cost=Double.parseDouble(cost);
            serviceDao.addService(new ServiceBeans(0, service_name, service_cost, CurrentDate.getCurrentDate(),0));
           new playAudio().playSuccessSound();
            
            showInTable();
            ClearFields();
        }


    }//GEN-LAST:event_jButtoSaveActionPerformed

    private void jButtonClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClear1ActionPerformed
        // TODO add your handling code here:
      ClearFields();
    


    }//GEN-LAST:event_jButtonClear1ActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
      int service_id=service_list.get(this.jTableService.getSelectedRow()).getService_id();

        String service_name = this.jTextFieldServiceName.getText();
        String cost = this.jTextFieldCost.getText();
        
        String service_date=CurrentDate.getCurrentDate();
    

        if (service_name.equals("") || cost.equals("")) {
            
            new playAudio().playErrorSound();
            JOptionPane.showMessageDialog(this, "Fill the Fields");
            
        } else {
            double service_cost =Double.parseDouble(cost);
            serviceDao.updateService(new ServiceBeans(service_id, service_name, service_cost, service_date, 0));

         
            showInTable();
            new playAudio().playSuccessSound();
            jButtonUpdate.setEnabled(false);
            jButtoSave.setEnabled(true);
            jButtonClear1.setEnabled(true);

         ClearFields();
           
            jButtonDelete.setEnabled(false);
        }


    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:

       int service_id=service_list.get(this.jTableService.getSelectedRow()).getService_id();

      
       serviceDao.deleteService(new ServiceBeans(service_id, "", 0.0, "",0));

      
        showInTable();
        jButtonUpdate.setEnabled(false);
        jButtoSave.setEnabled(true);
        jButtonClear1.setEnabled(true);
        jButtonDelete.setEnabled(false);
      ClearFields();
        

    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCustomerMouseClicked


    }//GEN-LAST:event_jTableCustomerMouseClicked

    private void jTextFieldSerachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSerachMouseClicked

    }//GEN-LAST:event_jTextFieldSerachMouseClicked

    private void jTextFieldSerachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSerachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSerachActionPerformed

    private void jTextFieldSerachKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerachKeyPressed

    }//GEN-LAST:event_jTextFieldSerachKeyPressed

    private void jTextFieldSerachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerachKeyReleased
        // TODO add your handling code here:
        String searchData = this.jTextFieldSerach.getText();
        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchData));

    }//GEN-LAST:event_jTextFieldSerachKeyReleased

    private void jTableServiceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableServiceMouseReleased
        ServiceBeans serviceBeans = null;

        try {

            int service_id=service_list.get(this.jTableService.getSelectedRow()).getService_id();
            
            serviceBeans = serviceDao.getServiceById(service_id);
           
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        this.jTextFieldServiceName.setText("" + serviceBeans.getService_name());
        this.jTextFieldCost.setText("" + serviceBeans.getService_cost());

        this.jButtonUpdate.setEnabled(true);
        this.jButtonDelete.setEnabled(true);
        jButtoSave.setEnabled(false);
        jButtonClear1.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableServiceMouseReleased

    private void jTableServiceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableServiceKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTableServiceKeyReleased

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
            java.util.logging.Logger.getLogger(ServiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoSave;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonClear1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTableService;
    private javax.swing.JTextField jTextFieldCost;
    private javax.swing.JTextField jTextFieldSerach;
    private javax.swing.JTextField jTextFieldServiceName;
    // End of variables declaration//GEN-END:variables

void ClearFields(){
      jTextFieldServiceName.setText("");
        this.jTextFieldCost.setText("");
}

}

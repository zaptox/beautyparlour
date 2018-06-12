/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautyparlour.frames;

import beautyparlour.bean.CustomerBeans;
import beautyparlour.bean.ServiceBeans;
import beautyparlour.dao.SaleDao;
import beautyparlour.dao.SaleDetailsDao;
import beautyparlour.dao.ServiceDao;
import beautyparlour.daoImpl.SaleDaoImpl;
import beautyparlour.daoImpl.SaleDetailDapImpl;
import beautyparlour.daoImpl.ServiceDaoImpl;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Dell
 */
public class SalePage extends javax.swing.JFrame {

    /**
     * Creates new form SalePage
     */
    DefaultTableModel tableModelServices;
    public ArrayList<ServiceBeans> services_list;
    public ArrayList<ServiceBeans> selected_services_List;
    ServiceDao serviceDao;
    SaleDao saleDao;
    SaleDetailsDao saleDetailDao;
    public static boolean sale_customer = false;
    DefaultTableModel tableModel2;
    String reference = "";
    int customer_id = -1;
    public static int total_price = 0;
    public static int total_price_temp = 0;
    TableRowSorter<DefaultTableModel> rowSorter = null;

    public SalePage() {
        initComponents();
        serviceDao = new ServiceDaoImpl();
        saleDao = new SaleDaoImpl();
        saleDetailDao = new SaleDetailDapImpl();
//        companyDao = new CompanyDaoImpl();
        this.getContentPane().setBackground(Color.white);

        tableModelServices = (DefaultTableModel) this.jTable1.getModel();
        tableModel2 = (DefaultTableModel) this.jTable2.getModel();
        customer_id = -1;
        removeService.setEnabled(false);
        addField.setEnabled(false);
        nameField.setEnabled(false);
        numberField.setEnabled(false);
        addressfield.setEnabled(false);
        JTableHeader header = this.jTable1.getTableHeader();
        header.setBackground(new Color(102, 204, 255));
        header.setForeground(new Color(255, 255, 255));
        header.setFont(new Font("SansSerif", Font.BOLD, 18));
        JTableHeader header2 = this.jTable2.getTableHeader();
        header2.setBackground(new Color(102, 204, 255));
        header2.setForeground(new Color(255, 255, 255));
        header2.setFont(new Font("SansSerif", Font.BOLD, 18));
        rowSorter = new TableRowSorter<DefaultTableModel>(tableModelServices);
        this.jTable1.setRowSorter(rowSorter);
        selected_services_List = new ArrayList<>();
//        walkingRadio.setSelected(true);
        sale_customer = false;
        generateButton.setEnabled(false);
        showInTable();
//        referenceField.setEnabled(false);
//        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

    }

//
    public SalePage(CustomerBeans customer) {
        initComponents();
        sale_customer = true;
        nameField.setText(customer.getCustomer_name());
//        reference = customer.getCustomer_name();
        numberField.setText(customer.getCustomer_contact());
        addressfield.setText(customer.getCustomer_address());
        nameField.setEnabled(false);
        numberField.setEnabled(false);
        addressfield.setEnabled(false);

        tableModelServices = (DefaultTableModel) this.jTable1.getModel();
        tableModel2 = (DefaultTableModel) this.jTable2.getModel();
        serviceDao = new ServiceDaoImpl();
        saleDao = new SaleDaoImpl();
        saleDetailDao = new SaleDetailDapImpl();
        removeService.setEnabled(false);

        customer_id = customer.getCustomer_id();
        this.getContentPane().setBackground(Color.white);

        JTableHeader header = this.jTable1.getTableHeader();
        header.setBackground(new Color(102, 204, 255));
        header.setForeground(new Color(255, 255, 255));
        header.setFont(new Font("SansSerif", Font.BOLD, 18));
        JTableHeader header2 = this.jTable2.getTableHeader();
        header2.setBackground(new Color(102, 204, 255));
        header2.setForeground(new Color(255, 255, 255));
        header2.setFont(new Font("SansSerif", Font.BOLD, 18));
        showInTable();
        rowSorter = new TableRowSorter<DefaultTableModel>(tableModelServices);
        this.jTable1.setRowSorter(rowSorter);

        selected_services_List = new ArrayList<>();

        this.total_price = 0;
        this.total_price_temp = 0;
        generateButton.setEnabled(false);
//        referenceField.setEnabled(false);

    }

    public void showInTable() {
        tableModelServices.setRowCount(0);
        try {

            int serial = 0;
            services_list = serviceDao.getAllService();

            for (ServiceBeans s : services_list) {
                Vector V = new Vector();
                serial++;

                V.add(serial);
                V.add(s.getService_id());
                V.add(s.getService_name());
                V.add(s.getService_cost());

//            V.add(customer.getCreation_date());
                tableModelServices.addRow(V);
                jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
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

        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        discountField = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        numberField = new javax.swing.JTextField();
        addressfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        itemField = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addField = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        toRemoveField = new javax.swing.JLabel();
        removeService = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sale");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Discount Type");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amount", "Percentage" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Discsount:");

        discountField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        discountField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                discountFieldKeyReleased(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 204, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Customer:");

        nameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        numberField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFieldActionPerformed(evt);
            }
        });

        addressfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addressfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressfieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Contact:");

        itemField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        itemField.setText("Service: ---------");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Search:");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beautyparlour/util/sale.png"))); // NOI18N

        searchField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S#", "Service_id", "Service_Name", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        addField.setBackground(new java.awt.Color(102, 204, 255));
        addField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addField.setForeground(new java.awt.Color(255, 255, 255));
        addField.setText("Add");
        addField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFieldActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service_name", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Total bill:");

        totalField.setEditable(false);
        totalField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFieldActionPerformed(evt);
            }
        });

        generateButton.setBackground(new java.awt.Color(102, 204, 255));
        generateButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        generateButton.setForeground(new java.awt.Color(255, 255, 255));
        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Get or Insert Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        toRemoveField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toRemoveField.setText("Service: ---------");

        removeService.setBackground(new java.awt.Color(102, 204, 255));
        removeService.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeService.setForeground(new java.awt.Color(255, 255, 255));
        removeService.setText("Remove");
        removeService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(302, 302, 302)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameField)
                                .addComponent(numberField)
                                .addComponent(addressfield, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemField))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, 133, Short.MAX_VALUE)
                                    .addComponent(discountField))))
                        .addGap(368, 368, 368)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(removeService, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toRemoveField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                        .addGap(229, 229, 229)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(addressfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(itemField)
                        .addGap(18, 18, 18)
                        .addComponent(addField)
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(discountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(generateButton)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(3, 3, 3)
                        .addComponent(toRemoveField)
                        .addGap(18, 18, 18)
                        .addComponent(removeService)
                        .addGap(128, 128, 128))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void discountFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountFieldKeyReleased
        // TODO add your handling code here:
        if (discountField.equals("")) {
            totalField.setText(total_price + "");

        } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("amount")) {

            try {
                int discount = Integer.parseInt(discountField.getText().toString());
                int totalpriceget = total_price;
                totalpriceget -= discount;
                totalField.setText(totalpriceget + "");

            } catch (Exception e) {
                totalField.setText(total_price + "");

                //                JOptionPane.showMessageDialog(this, "Invalid amount");
            }

            System.out.println("amount");
        } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("percentage")) {

            try {
                float discount_percent = Integer.parseInt(discountField.getText().toString());
                float discount = (discount_percent * total_price) / 100;

                int totalpriceget = total_price;
                totalpriceget -= discount;
                totalField.setText(totalpriceget + "");

            } catch (Exception e) {
                totalField.setText(total_price + "");

                //                JOptionPane.showMessageDialog(this, "Invalid amount");
            }
            System.out.println("percentage");
        }
    }//GEN-LAST:event_discountFieldKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();

        new HomePage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void numberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberFieldActionPerformed

    private void addressfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressfieldActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO add your handling code here:
//        String search_product = searchField.getText();
//        showInTableSearched(search_product);
        String searchData = this.searchField.getText();
        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchData));
    }//GEN-LAST:event_searchFieldKeyReleased

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
        int id = jTable1.getSelectedRow();
//        int id1=(int) tableModelProduct.getValueAt(id, 5);
//        System.out.println("The id is"+id1);
        int service_id_table = Integer.parseInt("" + this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 1));

//        int product_id_table = product_list.get(id).getP_id();
//        DbManagerInterface ob = new DbManager();
        ServiceBeans s = null;
        try {
            s = serviceDao.getServiceById(service_id_table);
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        itemField.setText("Service: " + s.getService_name());

        if (sale_customer) {

            addField.setEnabled(true);

        }

    }//GEN-LAST:event_jTable1MouseReleased

    private void addFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFieldActionPerformed
        // TODO add your handling code here:
        //        if(jTable1.isRowSelected)

        int service_id_table = Integer.parseInt("" + this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 1));

//            int user_id_table = productList.get(id).getProduct_id();
//
//            DbManagerInterface ob = new DbManager();
        ServiceBeans s = serviceDao.getServiceById(service_id_table);
//            int quantity = (int) jSpinner1.getValue();
//            int product_quantity = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 5);

        showInBuy(s);
        generateButton.setEnabled(true);


    }//GEN-LAST:event_addFieldActionPerformed

    private void showInBuy(ServiceBeans s) {
//        DbManagerInterface ob = new DbManager();
//        tableModel2.setRowCount(0);

        Vector v = new Vector();
//        int id = p.getCategory_id();
//        String category = ob.getCategory(id).getName();
//        System.out.println("" + p.getName());
        v.add(s.getService_name());
        v.add(s.getService_cost());

        double t_price = s.getService_cost();

        total_price += t_price;
        totalField.setText("" + total_price);
        total_price_temp = total_price;
        try {
            tableModel2.addRow(v);
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        selected_services_List.add(s);
//        orderedProductList.add(new ProductBeans(p.getP_id(), ICONIFIED, p_name, ABORT, quantity, t_price));
//        System.out.println("" + orderedProductList + "\n");

    }

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // TODO add your handling code here:
        LocalDate date = LocalDate.now();
        float discount = 0;
//        int discount_id = discountList.get(jComboBox1.getSelectedIndex()).getDiscount_id();
        try {
//            reference = this.referenceField.getText();
            discount = Float.parseFloat(discountField.getText().toString());
        } catch (Exception e) {
            discount=0;
//            JOptionPane.showMessageDialog(this, "Invalid Discount");
        }
        float total_price = Float.parseFloat(totalField.getText().toString());

        String discount_type = jComboBox1.getSelectedItem().toString();
        Double total_priceGot = Double.parseDouble(totalField.getText().toString());
        try {
            discount = Integer.parseInt(discountField.getText().toString());
        } catch (Exception e) {
            discount = 0;

        }

//        new CashNowLaterDialog(this, true, new PaymentDoneBeans(date + "", discount,
//                discount_type,
//                total_priceGot, customer_id, orderedProductList,
//                sale_customer, 2), reference).setVisible(true);

    }//GEN-LAST:event_generateButtonActionPerformed

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
        // TODO add your handling code here:
        
        int i = jTable2.getSelectedRow();
        ServiceBeans s = selected_services_List.get(i);
        toRemoveField.setText("Service: " + s.getService_name());
        removeService.setEnabled(true);
    }//GEN-LAST:event_jTable2MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new CustomerForm("ref").setVisible(true);
//        new CustomerPage(1).setVisible(true);

//            new CashNowLaterDialog(this, true,1)
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void totalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFieldActionPerformed

    private void removeServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeServiceActionPerformed
        // TODO add your handling code here:
        int service_remove_id = jTable2.getSelectedRow();
        removeFromBuy(service_remove_id);
       
    }//GEN-LAST:event_removeServiceActionPerformed

    private void removeFromBuy(int service_remove_id) {
        tableModel2.setRowCount(0);
        ServiceBeans s = selected_services_List.get(service_remove_id);
        selected_services_List.remove(service_remove_id);
        total_price -= s.getService_cost();
        totalField.setText("" + total_price);

        for (ServiceBeans s1 : selected_services_List) {
            Vector v = new Vector();
//        int id = p.getCategory_id();
//        String category = ob.getCategory(id).getName();
//        System.out.println("" + p.getName());
            v.add(s1.getService_name());
            v.add(s1.getService_cost());
           
//        total_price_temp = total_price;
            try {
                tableModel2.addRow(v);
            } catch (Exception e) {
                System.out.println("" + e.getMessage());
            }

        }

        totalField.setText(total_price + "");
        removeService.setEnabled(false);
    }

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
            java.util.logging.Logger.getLogger(SalePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addField;
    private javax.swing.JTextField addressfield;
    private javax.swing.JTextField discountField;
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel itemField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField numberField;
    private javax.swing.JButton removeService;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel toRemoveField;
    private javax.swing.JTextField totalField;
    // End of variables declaration//GEN-END:variables
}

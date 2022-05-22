package Main;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class Order extends javax.swing.JFrame {
public Order() {
        initComponents();
        selectProd();
        selectCust();
        getToday();
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        XBtn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        OrderId = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        products = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();
        AddToBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Customers = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Bill = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        custname = new javax.swing.JLabel();
        AmoTot = new javax.swing.JLabel();
        Qty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AmoTot1 = new javax.swing.JLabel();
        AddToBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventory Management System");

        jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage Orders");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        XBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        XBtn.setForeground(new java.awt.Color(255, 255, 255));
        XBtn.setText("X");
        XBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(223, 223, 223)
                .addComponent(XBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(XBtn)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Date");

        jLabel4.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Price");

        jLabel5.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("CustomerName");

        jLabel6.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("OrderId");

        OrderId.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        OrderId.setForeground(new java.awt.Color(0, 51, 255));
        OrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderIdActionPerformed(evt);
            }
        });

        Price.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        Price.setForeground(new java.awt.Color(0, 51, 255));
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        products.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        products.setForeground(new java.awt.Color(0, 51, 255));
        products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProdId", "Name", "Quantity", "Description", "Category"
            }
        ));
        products.setIntercellSpacing(new java.awt.Dimension(0, 0));
        products.setRowHeight(30);
        products.setSelectionBackground(new java.awt.Color(0, 51, 255));
        products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(products);

        jLabel8.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("Customers List");

        UpdateBtn.setBackground(new java.awt.Color(0, 51, 255));
        UpdateBtn.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Home");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });

        AddToBtn.setBackground(new java.awt.Color(0, 51, 255));
        AddToBtn.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        AddToBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddToBtn.setText("AddToOrder");
        AddToBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToBtnMouseClicked(evt);
            }
        });
        AddToBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToBtnActionPerformed(evt);
            }
        });

        HomeBtn.setBackground(new java.awt.Color(0, 51, 255));
        HomeBtn.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn.setText("View Orders");
        HomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtnMouseClicked(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(0, 51, 255));
        AddBtn.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add Order");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddBtnMouseEntered(evt);
            }
        });

        Customers.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        Customers.setForeground(new java.awt.Color(0, 51, 255));
        Customers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustId", "Name", "Phone"
            }
        ));
        Customers.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Customers.setRowHeight(30);
        Customers.setSelectionBackground(new java.awt.Color(0, 51, 255));
        Customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Customers);

        Bill.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        Bill.setForeground(new java.awt.Color(0, 51, 255));
        Bill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Product", "Quantity", "UPrice", "Total"
            }
        ));
        Bill.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Bill.setRowHeight(30);
        Bill.setSelectionBackground(new java.awt.Color(0, 51, 255));
        Bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Bill);

        jLabel9.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("Products List");

        Date.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        Date.setForeground(new java.awt.Color(0, 51, 255));
        Date.setText("Date");

        custname.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        custname.setForeground(new java.awt.Color(0, 51, 255));
        custname.setText("CustName");

        AmoTot.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        AmoTot.setForeground(new java.awt.Color(0, 51, 255));
        AmoTot.setText("Amount");

        Qty.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        Qty.setForeground(new java.awt.Color(0, 51, 255));
        Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Quantity");

        AmoTot1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        AmoTot1.setForeground(new java.awt.Color(0, 51, 255));
        AmoTot1.setText("USD");

        AddToBtn1.setBackground(new java.awt.Color(0, 51, 255));
        AddToBtn1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        AddToBtn1.setForeground(new java.awt.Color(255, 255, 255));
        AddToBtn1.setText("Print");
        AddToBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToBtn1MouseClicked(evt);
            }
        });
        AddToBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(custname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(AddBtn)))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(HomeBtn)
                                        .addGap(0, 18, Short.MAX_VALUE)))))
                        .addGap(733, 733, 733))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(OrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddToBtn)
                        .addGap(34, 34, 34)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(237, 237, 237))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AmoTot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AmoTot1)
                .addGap(60, 60, 60)
                .addComponent(AddToBtn1)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddToBtn))
                    .addComponent(jLabel6)
                    .addComponent(OrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(custname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn)
                            .addComponent(HomeBtn))
                        .addGap(18, 18, 18)
                        .addComponent(UpdateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AmoTot, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AmoTot1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddToBtn1))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void XBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XBtnMouseClicked

    private void OrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderIdActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed
Connection con = null;
Statement stm = null;
ResultSet rs = null;
public void selectProd()
{
    try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb","root","0708832206mM");
        stm=con.createStatement();
        rs=stm.executeQuery("select * from products");
        products.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(Exception e)
    {
        e.printStackTrace();
    }
}
public void selectCust()
{
    try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb","root","0708832206mM");
        stm=con.createStatement();
        rs=stm.executeQuery("select * from customers");
        Customers.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(Exception e)
    {
        e.printStackTrace();
    }
}
public void getToday()
{
    DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now=LocalDateTime.now();
    Date.setText(df.format(now));
}
    String Prodname;
    int flag=0,oldqty,prodid;
    private void productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsMouseClicked
        DefaultTableModel dtm=(DefaultTableModel) products.getModel();
        int Myindex=products.getSelectedRow();
        prodid=Integer.valueOf(dtm.getValueAt(Myindex,0 ).toString());
        Prodname=dtm.getValueAt(Myindex,1 ).toString();
        oldqty=Integer.valueOf(dtm.getValueAt(Myindex,2 ).toString());
//        ProdDesc.setText(dtm.getValueAt(Myindex,3 ).toString());
flag=1;
    }//GEN-LAST:event_productsMouseClicked
private void Update()
{
    int newQty=oldqty-ordqty;
    try{
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb","root","0708832206mM");
                String UpdateQuery="update products set ProdQty="+newQty+" where ProdId="+prodid;
                Statement Add=con.createStatement();
                Add.executeUpdate(UpdateQuery);
                con.close();
                selectProd();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
}
    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
      /*  if(ProdId.getText().isEmpty()||ProdName.getText().isEmpty()||ProdQty.getText().isEmpty()||ProdDesc.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
            try{
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb","root","0708832206mM");
                String UpdateQuery=
                "update products set ProdName='"+ProdName.getText()+"'"+
                ",ProdQty='"+ProdQty.getText()+"'"+",ProdDesc='"+ProdDesc.getText()+
                "'"+",ProdCat='"+ProdCat.getSelectedItem().toString()+"'"+"where ProdId="+ProdId.getText();
                Statement Add=con.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Products Succesfully Updated");
                selectProd();
                con.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }*/
    }//GEN-LAST:event_UpdateBtnMouseClicked

int i=1,ordqty,tot,total=0,Uprice;
    private void AddToBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBtnMouseClicked
       if(flag == 0 ||Qty.getText().isEmpty()||Price.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(this,"Select Product Enter Quentity");
    }else{
          ordqty = Integer.valueOf(Qty.getText());
          Uprice=Integer.valueOf(Price.getText());
          Vector v=new Vector();
            tot=Uprice*ordqty;
        v.add(i);
        v.add(Prodname);
        v.add(ordqty);
        v.add(Uprice);
        v.add(tot);
        total=total + tot;
        AmoTot.setText(""+total);
        DefaultTableModel df=(DefaultTableModel)Bill.getModel();
        df.addRow(v);
        Update();
        i++;
    } 
    }//GEN-LAST:event_AddToBtnMouseClicked

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtnMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
      if(AmoTot.getText().equals("Amount"))
      {
          JOptionPane.showMessageDialog(this, "Enter Order");
      }else{
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb","root","0708832206mM");
            PreparedStatement add=con.prepareStatement("insert into orders values(?,?,?,?)");
            add.setInt(1, Integer.valueOf(OrderId.getText()));
            add.setString(2, custname.getText());
            add.setString(3, Date.getText());
            add.setInt(4, Integer.valueOf(AmoTot.getText()));
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Order succesfully added");
            con.close();
        }catch(Exception s)
        {
            s.printStackTrace();
        }}
    }//GEN-LAST:event_AddBtnMouseClicked

    private void CustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomersMouseClicked
        DefaultTableModel dtm=(DefaultTableModel) Customers.getModel();
        int Myindex=Customers.getSelectedRow();
       custname.setText(dtm.getValueAt(Myindex,1 ).toString());
    }//GEN-LAST:event_CustomersMouseClicked

    private void BillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BillMouseClicked

    private void AddToBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToBtnActionPerformed

    private void QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyActionPerformed

    private void AddToBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBtn1MouseClicked
    try {
        Bill.print();
    } catch (PrinterException ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_AddToBtn1MouseClicked

    private void AddToBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToBtn1ActionPerformed

    private void AddBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnMouseEntered

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton AddToBtn;
    private javax.swing.JButton AddToBtn1;
    private javax.swing.JLabel AmoTot;
    private javax.swing.JLabel AmoTot1;
    private javax.swing.JTable Bill;
    private javax.swing.JTable Customers;
    private javax.swing.JLabel Date;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JTextField OrderId;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Qty;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel XBtn;
    private javax.swing.JLabel custname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable products;
    // End of variables declaration//GEN-END:variables
}

package Main;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        products = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        HomeBtn = new javax.swing.JButton();
        AddToBtn = new javax.swing.JButton();
        ViewBtn = new javax.swing.JButton();
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
        jScrollPane5 = new javax.swing.JScrollPane();
        Orders = new javax.swing.JTable();
        OrderId = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(261, 261, 261)
                        .addComponent(XBtn)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(431, 431, 431))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(XBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 110));

        jLabel3.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 125, -1));

        jLabel4.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 73, 31));

        jLabel5.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("CustomerName");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 173, -1));

        jLabel6.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("OrderId");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 125, -1));

        Price.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        Price.setForeground(new java.awt.Color(0, 51, 255));
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });
        jPanel1.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 155, 29));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 690, 180));

        jLabel8.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("Customers List");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 168, -1));

        HomeBtn.setBackground(new java.awt.Color(0, 51, 255));
        HomeBtn.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn.setText("Home");
        HomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtnMouseClicked(evt);
            }
        });
        jPanel1.add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 90, -1));

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
        jPanel1.add(AddToBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 360, 150, -1));

        ViewBtn.setBackground(new java.awt.Color(0, 51, 255));
        ViewBtn.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        ViewBtn.setForeground(new java.awt.Color(255, 255, 255));
        ViewBtn.setText("View Orders");
        ViewBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewBtnMouseClicked(evt);
            }
        });
        jPanel1.add(ViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 140, -1));

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
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 130, -1));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 380, 180));

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

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 610, 334));

        jLabel9.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("Products List");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 149, -1));

        Date.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        Date.setForeground(new java.awt.Color(0, 51, 255));
        Date.setText("Date");
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 183, 31));

        custname.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        custname.setForeground(new java.awt.Color(0, 51, 255));
        custname.setText("CustName");
        jPanel1.add(custname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 183, 31));

        AmoTot.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        AmoTot.setForeground(new java.awt.Color(0, 51, 255));
        AmoTot.setText("Amount");
        jPanel1.add(AmoTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 740, 70, 30));

        Qty.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        Qty.setForeground(new java.awt.Color(0, 51, 255));
        Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyActionPerformed(evt);
            }
        });
        jPanel1.add(Qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 155, 29));

        jLabel7.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Quantity");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 100, 31));

        AmoTot1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        AmoTot1.setForeground(new java.awt.Color(0, 51, 255));
        AmoTot1.setText("USD");
        jPanel1.add(AmoTot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 740, 50, 31));

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
        jPanel1.add(AddToBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 740, 90, -1));

        Orders.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        Orders.setForeground(new java.awt.Color(0, 51, 255));
        Orders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderId", "Customer", "Product", "Quantity", "Date"
            }
        ));
        Orders.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Orders.setRowHeight(30);
        Orders.setSelectionBackground(new java.awt.Color(0, 51, 255));
        Orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrdersMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(Orders);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 480, 200));

        OrderId.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        OrderId.setForeground(new java.awt.Color(0, 51, 255));
        OrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderIdActionPerformed(evt);
            }
        });
        jPanel1.add(OrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 183, 29));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OrdersMouseClicked

    private void AddToBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToBtn1ActionPerformed

    private void AddToBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBtn1MouseClicked
        try {
            Bill.print();
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_AddToBtn1MouseClicked

    private void QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyActionPerformed

    private void BillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillMouseClicked
//        DefaultTableModel dtm=(DefaultTableModel) Bill.getModel();
//        int Myindex=Customers.getSelectedRow();
//        Orderid.setText(dtm.getValueAt(Myindex,0 ).toString());
    }//GEN-LAST:event_BillMouseClicked

    private void CustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomersMouseClicked
        DefaultTableModel dtm=(DefaultTableModel) Customers.getModel();        
        int Myindex=Customers.getSelectedRow();
        custname.setText(dtm.getValueAt(Myindex,1 ).toString());

    }//GEN-LAST:event_CustomersMouseClicked

    private void AddBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnMouseEntered

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(AmoTot.getText().equals("Amount")||OrderId.getText().isEmpty()||custname.getText().equals("CustName"))
        {
            JOptionPane.showMessageDialog(this, "You did not enter customer information and amount");
        }else{
            try {
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb","root","0708832206mM");
                PreparedStatement add=con.prepareStatement("insert into vieworder values(?,?,?,?,?)");
                for(int i=0;i<product.size();i++)
                {
                    add.setInt(1, Integer.valueOf(OrderId.getText()));
                    add.setString(2, custname.getText());
                    add.setString(3,product.get(i));
                    add.setInt(4,quantity.get(i));
                    add.setString(5,Date.getText());
                     int row=add.executeUpdate();
                }
                PreparedStatement Add=con.prepareStatement("insert into orders values(?,?,?,?)");
                Add.setInt(1, Integer.valueOf(OrderId.getText()));
                Add.setString(2, custname.getText());
                Add.setString(3, Date.getText());
                Add.setInt(4, Integer.valueOf(AmoTot.getText()));
                int Row=Add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Order succesfully added");
                con.close();
            }catch(Exception s)
            {
                s.printStackTrace();
            }}
    }//GEN-LAST:event_AddBtnMouseClicked

    private void ViewBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewBtnMouseClicked
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb","root","0708832206mM");
            stm=con.createStatement();
            rs=stm.executeQuery("select * from vieworder");
             Orders.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ViewBtnMouseClicked

    private void AddToBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToBtnActionPerformed
             LinkedList<String> product=new LinkedList<>();
             LinkedList<Integer>quantity=new LinkedList<>();
    private void AddToBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBtnMouseClicked
        if(flag == 0 ||Qty.getText().isEmpty()||Price.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Select Product Enter Quentity");
        }else{
            if(Integer.valueOf(Qty.getText())<=oldqty){
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
             product.add(Prodname);
             quantity.add(Integer.valueOf(Qty.getText()));
            Update();
            i++;}else{
                JOptionPane.showMessageDialog(this,"The amount of product you enter should not exceed the current amount of that product");
            }
        }
    }//GEN-LAST:event_AddToBtnMouseClicked

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtnMouseClicked

    private void productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsMouseClicked
        DefaultTableModel dtm=(DefaultTableModel) products.getModel();
        int Myindex=products.getSelectedRow();
        prodid=Integer.valueOf(dtm.getValueAt(Myindex,0 ).toString());
        Prodname=dtm.getValueAt(Myindex,1 ).toString();
        oldqty=Integer.valueOf(dtm.getValueAt(Myindex,2 ).toString());
        //        ProdDesc.setText(dtm.getValueAt(Myindex,3 ).toString());
        flag=1;
    }//GEN-LAST:event_productsMouseClicked

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void XBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XBtnMouseClicked

    private void OrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderIdActionPerformed
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
    DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now=LocalDateTime.now();
    Date.setText(df.format(now));
}
    String Prodname;
    int flag=0,oldqty,prodid;private void Update()
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
int i=1,ordqty,tot,total=0,Uprice;
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
    private javax.swing.JTable Orders;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Qty;
    private javax.swing.JButton ViewBtn;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable products;
    // End of variables declaration//GEN-END:variables
}

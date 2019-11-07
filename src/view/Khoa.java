package view;

import controller.DAOKhoa;
import controller.DAOLopHoc;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public final class Khoa extends javax.swing.JFrame {
    
    private String luaChon = "Thêm";
    DefaultTableModel model;
    private ArrayList<model.Khoa> list;
    
    public Khoa() {
        initComponents();
        TrangChu.kichHoatK = "opening";
        addClosingWindow();
        tfdID.setEditable(false);                                  //Không cho nhập ID vì đây là giá trị autoNumber trong CSLD
        tfdID.setForeground(java.awt.Color.GRAY);
        setLocationRelativeTo(null);                                            //set center screen
        list = new DAOKhoa().getListKSearched("SELECT * FROM Khoa");            //get list Khoa from DAOKhoa/CSDL
        model = (DefaultTableModel) tblKhoa.getModel();
        showTable();
    }
    
    private void addClosingWindow() {
        addWindowListener(new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent e)
                {
                    TrangChu.kichHoatK = "closing";
                    e.getWindow().dispose();
                }
            });
    }
    
    public void showTable() {
        tblKhoa.getColumnModel().getColumn(0).setPreferredWidth(40);            //
        tblKhoa.getColumnModel().getColumn(1).setPreferredWidth(70);            //Set size for Column  
        tblKhoa.getColumnModel().getColumn(2).setPreferredWidth(130);           //                   
        list.forEach((k) -> {                                                    
            model.addRow(new Object[] {                                         //Duyệt lần lượt dữ liệu trong Arraylist
                k.getID(), k.getMaKhoa(), k.getTenKhoa()                        //đồng thời add dữ liệu vào bảng
            });                                                                 //
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tfdMaKhoa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfdTenKhoa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbbLuaChon = new javax.swing.JComboBox<>();
        pnlDongY = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfdID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhoa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Khoa - Quản lý sinh viên");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Student_Center_50px_1.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Khoa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(414, 414, 414))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addGap(11, 11, 11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tfdMaKhoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdMaKhoa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdMaKhoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdMaKhoaKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("mã khoa");

        tfdTenKhoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdTenKhoa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdTenKhoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdTenKhoaKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("tên khoa");

        cbbLuaChon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbbLuaChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thêm", "Sửa", "Xóa", "Rỗng" }));
        cbbLuaChon.setBorder(null);
        cbbLuaChon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbbLuaChon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbLuaChonItemStateChanged(evt);
            }
        });

        pnlDongY.setBackground(new java.awt.Color(45, 118, 232));
        pnlDongY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDongYMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlDongYMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDongYMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ĐỒNG Ý");

        javax.swing.GroupLayout pnlDongYLayout = new javax.swing.GroupLayout(pnlDongY);
        pnlDongY.setLayout(pnlDongYLayout);
        pnlDongYLayout.setHorizontalGroup(
            pnlDongYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDongYLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pnlDongYLayout.setVerticalGroup(
            pnlDongYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDongYLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 153, 255));
        jLabel9.setText("NHẬP THÔNG TIN");

        tfdID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(cbbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDongY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tfdMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tfdTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addComponent(tfdID, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(87, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(85, 85, 85)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(tfdID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(tfdMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(tfdTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDongY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel9)
                    .addContainerGap(457, Short.MAX_VALUE)))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        tblKhoa.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        tblKhoa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblKhoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã khoa", "Tên khoa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhoa.setGridColor(new java.awt.Color(255, 255, 255));
        tblKhoa.setRowHeight(30);
        tblKhoa.setRowMargin(5);
        tblKhoa.setShowHorizontalLines(false);
        tblKhoa.setShowVerticalLines(false);
        tblKhoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhoa);
        if (tblKhoa.getColumnModel().getColumnCount() > 0) {
            tblKhoa.getColumnModel().getColumn(0).setResizable(false);
            tblKhoa.getColumnModel().getColumn(1).setResizable(false);
            tblKhoa.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(44, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlDongYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDongYMouseClicked
        if(null != luaChon) 
            switch (luaChon) {
                case "Thêm":
                    themKhoa();
                    break;
                case "Sửa":
                    suaKhoa();
                    break;
                case "Xóa":
                    xoaKhoa();
                    break;
                case "Rỗng":
                    tfdID.setText("");
                    tfdMaKhoa.setText("");
                    tfdTenKhoa.setText("");
                    break;
                default:
                    break;
            }
    }//GEN-LAST:event_pnlDongYMouseClicked

    private void cbbLuaChonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbLuaChonItemStateChanged
        if(evt.getItem() == "Thêm" && evt.getStateChange() == ItemEvent.SELECTED) {
            luaChon = "Thêm";
        }
        else if(evt.getItem() == "Sửa" && evt.getStateChange() == ItemEvent.SELECTED) {
            luaChon = "Sửa";
        }
        else if(evt.getItem() == "Xóa" && evt.getStateChange() == ItemEvent.SELECTED) {
            luaChon = "Xóa";
        }
        else if(evt.getItem() == "Rỗng" && evt.getStateChange() == ItemEvent.SELECTED) {
            luaChon = "Rỗng";
        }
    }//GEN-LAST:event_cbbLuaChonItemStateChanged

    private void pnlDongYMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDongYMouseEntered
        // TODO add your handling code here:
        setColor(pnlDongY);
    }//GEN-LAST:event_pnlDongYMouseEntered

    private void pnlDongYMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDongYMouseExited
        // TODO add your handling code here:
        resetColor(pnlDongY);
    }//GEN-LAST:event_pnlDongYMouseExited

    private void tblKhoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoaMouseClicked
        int r = tblKhoa.getSelectedRow();
        if(r != -1) {
            tfdID.setText(model.getValueAt(r, 0).toString());
            tfdMaKhoa.setText(model.getValueAt(r, 1).toString());
            tfdTenKhoa.setText(model.getValueAt(r, 2).toString());
        }
    }//GEN-LAST:event_tblKhoaMouseClicked

    private void tfdMaKhoaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdMaKhoaKeyPressed
        String sql;
        if("".equals(tfdMaKhoa.getText()) || " ".equals(tfdMaKhoa.getText())) {
            sql = "SELECT * FROM Khoa";
        }
        else {
            sql = "SELECT * FROM Khoa WHERE MaKhoa = '" + tfdMaKhoa.getText() + "' ";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdMaKhoaKeyPressed

    private void tfdTenKhoaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdTenKhoaKeyPressed
        String sql;
        if("".equals(tfdTenKhoa.getText()) || " ".equals(tfdTenKhoa.getText())) {
            sql = "SELECT * FROM Khoa";
        }
        else {
            sql = "SELECT * FROM Khoa WHERE TenKhoa LIKE '" + tfdTenKhoa.getText() + "' ";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdTenKhoaKeyPressed
    
    private void Search(String sql, KeyEvent evt) {
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            for (int i = model.getRowCount()-1; i >= 0; i--) {                  //load lại Row dữ liệu mới vào bảng
                        model.removeRow(i);                                     //nhằm làm mới lại cột ID
            }  
            list = new DAOKhoa().getListKSearched(sql);
            showTable();
            if(model.getRowCount() == 1) {
                tfdID.setText(model.getValueAt(0, 0).toString());
                tfdMaKhoa.setText(model.getValueAt(0, 1).toString());
                tfdTenKhoa.setText(model.getValueAt(0, 2).toString());
            }
            else if(model.getRowCount() > 1) {
                //Do nothing
            }
            else {
                JOptionPane.showMessageDialog(null, "KHÔNG TÌM THẤY");
                tfdID.setText("");
                tfdMaKhoa.setText("");
                tfdTenKhoa.setText("");
            }
        }
    }
    
    private void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(0, 51, 255));
    }
    
    private void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(45, 118, 232));
    }
    
    private void loadData() {
        list = new DAOKhoa().getListKSearched("SELECT * FROM Khoa");            //Load lại ArrayList lấy từ CSDL
        
        for (int i = model.getRowCount()-1; i >= 0; i--) {                      //load lại Row dữ liệu mới vào bảng
                model.removeRow(i);                                             //nhằm làm mới lại cột ID
        }
        tblKhoa.repaint();
        showTable();
    }
    
    private void themKhoa() {
        model.Khoa k = new model.Khoa();
        
        k.setMaKhoa(tfdMaKhoa.getText());                     //Không cần getID() vì BẢNG Khoa trong CSDL đã tự động thêm ID.
        k.setTenKhoa(tfdTenKhoa.getText());                   //Mặt khác cột ID luôn được refresh sau mỗi lần thêm
                                                              //nên luôn duy trì được tính chính xác trong cột ID và còn
        list.add(k);                                          //hỗ trợ hàm xoaKhoa() và suaKhoa() hoạt động chính xác 100%
        
        if(new DAOKhoa().addKhoa(k)) {                        //Thêm vào CSDL
            JOptionPane.showMessageDialog(null, "ĐÃ THÊM");
            loadData();
        }
        else {
            JOptionPane.showMessageDialog(null, "KHÔNG THỂ THÊM");
        }
    }
    
    private void suaKhoa() {
        int r = tblKhoa.getSelectedRow();
        model.Khoa k = new model.Khoa();
        
        k.setID(Integer.parseInt(tfdID.getText()));
        k.setMaKhoa(tfdMaKhoa.getText());
        k.setTenKhoa(tfdTenKhoa.getText());
                                                                                //Sửa ở trong ArrayList
        list.set(r, k);                                                         //  r: row was selected
                                                                                //  k: Khoa was got from the fields
        if(new DAOKhoa().updateKhoa(k)) {                                       //Sửa ở trong CSDL
            JOptionPane.showMessageDialog(null, "ĐÃ SỬA");
            model.setValueAt(k.getID(), r, 0);                                  //
            model.setValueAt(k.getMaKhoa(), r, 1);                              //Sửa ở Row vừa được chọn trong Table.
            model.setValueAt(k.getTenKhoa(), r, 2);                             //
        }
        else {
            JOptionPane.showMessageDialog(null, "KHÔNG THỂ SỬA");
        }
        
    }
    
    private void xoaKhoa() {
        int r = tblKhoa.getSelectedRow();  
        model.Khoa k = new model.Khoa();
          
        k.setID(Integer.parseInt(tfdID.getText()));                             //Chỉ cần setID là đủ để thỏa mãn điều kiện xóa              
                                                                                //trong hàm deleteKhoa() trong DAOKhoa.
        list.remove(r);                                                         //Xóa Row trong ArrayList
        
        if(new DAOKhoa().deleteKhoa(k)) {                                       //Xóa Row trong CSDL
            JOptionPane.showMessageDialog(null, "ĐÃ XÓA");      
            model.removeRow(r);                                                 //Xóa Row vừa chọn trong Bảng
        }                                                       
        else {
            JOptionPane.showMessageDialog(null, "KHÔNG THỂ XÓA");
        }
    }
    
    public void timKiem(String Truong, String Key, KeyEvent evt) {
        String sql;
        switch(Truong) {
            case "MaKhoa":
                tfdMaKhoa.setText(Key);
                sql = "SELECT * FROM Khoa WHERE MaKhoa = '" + tfdMaKhoa.getText() + "'";
                Search(sql, evt);
                break;
            case "TenKhoa":
                tfdTenKhoa.setText(Key);
                sql = "SELECT * FROM Khoa WHERE TenKhoa LIKE '" + tfdTenKhoa.getText() + "'";
                Search(sql, evt);
                break;
        }
    }
    
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
            java.util.logging.Logger.getLogger(Khoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Khoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Khoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Khoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Khoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbLuaChon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDongY;
    private javax.swing.JTable tblKhoa;
    private javax.swing.JTextField tfdID;
    private javax.swing.JTextField tfdMaKhoa;
    private javax.swing.JTextField tfdTenKhoa;
    // End of variables declaration//GEN-END:variables
}

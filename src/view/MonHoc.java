package view;

import controller.DAOMonHoc;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class MonHoc extends javax.swing.JFrame {

    private String luaChon = "Thêm";
    DefaultTableModel model;
    private ArrayList<model.MonHoc> list;
    
    public MonHoc() {
        initComponents();
        TrangChu.kichHoatMH = "opening";
        addClosingWindow();
        tfdID.setEditable(false);                                  //Không cho nhập ID vì đây là giá trị autoNumber trong CSLD
        tfdID.setForeground(java.awt.Color.GRAY);
        setLocationRelativeTo(null);                                        
        list = new DAOMonHoc().getListMHSearched("SELECT * FROM MonHoc");                          
        model = (DefaultTableModel) tblMonHoc.getModel();
        showTable();
    }
    
    private void addClosingWindow() {
        addWindowListener(new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent e)
                {
                    TrangChu.kichHoatMH = "closing";
                    e.getWindow().dispose();
                }
            });
    }
    
    public void showTable() {
        tblMonHoc.getColumnModel().getColumn(0).setPreferredWidth(40);            //
        tblMonHoc.getColumnModel().getColumn(1).setPreferredWidth(70);            //
        tblMonHoc.getColumnModel().getColumn(2).setPreferredWidth(150);           //Set size for Column               
        tblMonHoc.getColumnModel().getColumn(3).setPreferredWidth(100);           //                     
        
        list.forEach((k) -> {                                                    
            model.addRow(new Object[] {
                k.getID(), k.getMaMon(), k.getTenMonHoc(), k.getSoTinChi()
            });
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
        tfdMaMon = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfdTenMonHoc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbbLuaChon = new javax.swing.JComboBox<>();
        pnlDongY = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfdSoTinChi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfdID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMonHoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Môn học - Quản lý sinh viên");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Book_52px_1.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Môn học");

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

        tfdMaMon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdMaMon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdMaMon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdMaMonKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("mã môn học");

        tfdTenMonHoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdTenMonHoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdTenMonHoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdTenMonHocKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("tên môn học");

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("số tín chỉ");

        tfdSoTinChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdSoTinChi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdSoTinChi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdSoTinChiKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("ID");

        tfdID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));

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
                            .addComponent(tfdMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tfdTenMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addComponent(tfdSoTinChi, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
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
                .addGap(54, 54, 54)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(tfdID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(tfdMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(tfdTenMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(tfdSoTinChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        tblMonHoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        tblMonHoc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblMonHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã môn học", "Tên môn học", "Số tín chỉ"
            }
        ));
        tblMonHoc.setGridColor(new java.awt.Color(255, 255, 255));
        tblMonHoc.setRowHeight(30);
        tblMonHoc.setRowMargin(5);
        tblMonHoc.setShowHorizontalLines(false);
        tblMonHoc.setShowVerticalLines(false);
        tblMonHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMonHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMonHoc);

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
        if(null != luaChon) switch (luaChon) {
            case "Thêm":
                themMonHoc();
                break;
            case "Sửa":
                suaMonHoc();
                break;
            case "Xóa":
                xoaMonHoc();
                break;
            case "Rỗng":
                tfdID.setText("");
                tfdMaMon.setText("");
                tfdTenMonHoc.setText("");
                tfdSoTinChi.setText("");
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

    private void tblMonHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMonHocMouseClicked
        int r = tblMonHoc.getSelectedRow();
        if(r != -1) {
            tfdID.setText(model.getValueAt(r, 0).toString());
            tfdMaMon.setText(model.getValueAt(r, 1).toString());
            tfdTenMonHoc.setText(model.getValueAt(r, 2).toString());
            tfdSoTinChi.setText(model.getValueAt(r, 3).toString());
        }
    }//GEN-LAST:event_tblMonHocMouseClicked

    private void tfdMaMonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdMaMonKeyPressed
        String sql;
        if("".equals(tfdMaMon.getText()) || " ".equals(tfdMaMon.getText())) {
            sql = "SELECT * FROM MonHoc";
        }
        else {
            sql = "SELECT * FROM MonHoc WHERE MaMon = '" + tfdMaMon.getText() + "'";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdMaMonKeyPressed

    private void tfdSoTinChiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdSoTinChiKeyPressed
        String sql;
        if("".equals(tfdSoTinChi.getText()) || " ".equals(tfdSoTinChi.getText())) {
            sql = "SELECT * FROM MonHoc";
        }
        else {
            sql = "SELECT * FROM MonHoc WHERE SoTinChi = '" + tfdSoTinChi.getText() + "'";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdSoTinChiKeyPressed

    private void tfdTenMonHocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdTenMonHocKeyPressed
        String sql;
        if("".equals(tfdTenMonHoc.getText()) || " ".equals(tfdTenMonHoc.getText())) {
            sql = "SELECT * FROM MonHoc";
        }
        else {
            sql = "SELECT * FROM MonHoc WHERE TenMonHoc LIKE '" + tfdTenMonHoc.getText() + "'";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdTenMonHocKeyPressed

    private void Search(String sql, KeyEvent evt) {
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            for (int i = model.getRowCount()-1; i >= 0; i--) {                  //load lại Row dữ liệu mới vào bảng
                        model.removeRow(i);                                     //nhằm làm mới lại cột ID
            }  
            list = new DAOMonHoc().getListMHSearched(sql);
            showTable();
            if(model.getRowCount() == 1) {
                tfdID.setText(model.getValueAt(0, 0).toString());
                tfdMaMon.setText(model.getValueAt(0, 1).toString());
                tfdTenMonHoc.setText(model.getValueAt(0, 2).toString());
                tfdSoTinChi.setText(model.getValueAt(0, 3).toString());
            }
            else if(model.getRowCount() > 1) {
                //Do nothing
            }
            else {
                JOptionPane.showMessageDialog(null, "KHÔNG TÌM THẤY");
                tfdID.setText("");
                tfdMaMon.setText("");
                tfdTenMonHoc.setText("");
                tfdSoTinChi.setText("");
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
        list = new DAOMonHoc().getListMHSearched("SELECT * FROM MonHoc");       //Load lại ArrayList lấy từ CSDL
                                                               
        for (int i = model.getRowCount()-1; i >= 0; i--) {     //Xóa hết Row cũ trên bảng đồng thời
            model.removeRow(i);                                //load lại Row dữ liệu mới vào bảng
        }                                                      //nhằm làm mới lại cột ID để hỗ trợ cho việc getID()
        
        tblMonHoc.repaint();
        showTable();
    }
    
    private void themMonHoc() {
        model.MonHoc k = new model.MonHoc();
        
        k.setMaMon(tfdMaMon.getText());
        k.setTenMonHoc(tfdTenMonHoc.getText());
        k.setSoTinChi(tfdSoTinChi.getText());
        
        list.add(k);
        
        if(new DAOMonHoc().addMonHoc(k)) {
            JOptionPane.showMessageDialog(null, "ĐÃ THÊM");
            loadData();
        }
        else {
            JOptionPane.showMessageDialog(null, "KHÔNG THỂ THÊM");
        }
    }
    
    private void suaMonHoc() {
        int r = tblMonHoc.getSelectedRow();
        model.MonHoc k = new model.MonHoc();
        
        k.setID(Integer.parseInt(tfdID.getText()));
        k.setMaMon(tfdMaMon.getText());
        k.setTenMonHoc(tfdTenMonHoc.getText());
        k.setSoTinChi(tfdSoTinChi.getText());
                                                                    
        list.set(r, k);                                            
                                                                    
        if(new DAOMonHoc().updateMonHoc(k)) {
            JOptionPane.showMessageDialog(null, "ĐÃ SỬA");
            model.setValueAt(k.getID(), r, 0);  
            model.setValueAt(k.getMaMon(), r, 1);             
            model.setValueAt(k.getTenMonHoc(), r, 2);                  
            model.setValueAt(k.getSoTinChi(), r, 3);                  
        }
        else {
            JOptionPane.showMessageDialog(null, "KHÔNG THỂ SỬA");
        }
        
    }
    
    private void xoaMonHoc() {
        model.MonHoc k = new model.MonHoc();
        int r = tblMonHoc.getSelectedRow();    
        
        k.setID(Integer.parseInt(tfdID.getText()));                                          

        list.remove(r);                                                    
        
        if(new DAOMonHoc().deleteMonHoc(k)) {                
            JOptionPane.showMessageDialog(null, "ĐÃ XÓA");      
            model.removeRow(r);                                 
        }                                                       
        else {
            JOptionPane.showMessageDialog(null, "KHÔNG THỂ XÓA");
        }
    }
    
    public void timKiem(String Truong, String Key, KeyEvent evt) {
        String sql;
        switch(Truong) {
            case "MaMon":
                tfdMaMon.setText(Key);
                sql = "SELECT * FROM MonHoc WHERE MaMon = '" + tfdMaMon.getText() + "'";
                Search(sql, evt);
                break;
            case "TenMonHoc":
                tfdTenMonHoc.setText(Key);
                sql = "SELECT * FROM MonHoc WHERE TenMonHoc LIKE '" + tfdTenMonHoc.getText() + "'";
                Search(sql, evt);
                break;
            case "SoTinChi":
                tfdSoTinChi.setText(Key);
                sql = "SELECT * FROM MonHoc WHERE SoTinChi = '" + tfdSoTinChi.getText() + "'";
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
            java.util.logging.Logger.getLogger(MonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MonHoc().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDongY;
    private javax.swing.JTable tblMonHoc;
    private javax.swing.JTextField tfdID;
    private javax.swing.JTextField tfdMaMon;
    private javax.swing.JTextField tfdSoTinChi;
    private javax.swing.JTextField tfdTenMonHoc;
    // End of variables declaration//GEN-END:variables
}

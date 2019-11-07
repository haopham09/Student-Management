package view;

import controller.DAOSinhVien;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SinhVien extends javax.swing.JFrame {
    
    private String luaChon = "Thêm";
    DefaultTableModel model;
    private ArrayList<model.SinhVien> list;
    
    public SinhVien() {
        initComponents();
        TrangChu.kichHoatSV = "opening";
        addClosingWindow();
        setLocationRelativeTo(null);
        tfdID.setEditable(false);                                               //Không cho nhập ID vì 
        tfdID.setForeground(java.awt.Color.GRAY);                               //đây là giá trị autoNumber trong CSLD
        list = new DAOSinhVien().getListSVSearched("SELECT * FROM SinhVien");   //get list student from DAO/CSDL
        model = (DefaultTableModel) tblSinhVien.getModel();
        showTable();
    }
    
    private void addClosingWindow() {                                           //Bắt sự kiện nhấn nút Close trên Bar
        addWindowListener(new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent e)
                {
                    TrangChu.kichHoatSV = "closing";
                    e.getWindow().dispose();
                }
            });
    }
    
    public void showTable() {
        tblSinhVien.getColumnModel().getColumn(0).setPreferredWidth(40);            //
        tblSinhVien.getColumnModel().getColumn(1).setPreferredWidth(70);            //
        tblSinhVien.getColumnModel().getColumn(2).setPreferredWidth(130);           //      Set size for Column               
        tblSinhVien.getColumnModel().getColumn(3).setPreferredWidth(50);            //       
        tblSinhVien.getColumnModel().getColumn(4).setPreferredWidth(80);            //
        tblSinhVien.getColumnModel().getColumn(5).setPreferredWidth(140);           // 
        tblSinhVien.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        
        list.forEach((s) -> {                                                    
            model.addRow(new Object[] {
                s.getID(), s.getMaSinhVien(), s.getHoTenSinhVien(), s.getGioiTinh() ,s.getDiaChi(), s.getEmail(), s.getMaLop()
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
        tfdMaSinhVien = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfdHoTenSinhVien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfdGioiTinh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfdDiaChi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfdEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfdMaLop = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbbLuaChon = new javax.swing.JComboBox<>();
        pnlDongY = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfdID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sinh viên - Quản lý sinh viên");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Student_Male_52px.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sinh viên");

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

        tfdMaSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdMaSinhVien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdMaSinhVien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdMaSinhVienKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("mã sinh viên");

        tfdHoTenSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdHoTenSinhVien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdHoTenSinhVien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdHoTenSinhVienKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("họ tên sinh viên");

        tfdGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdGioiTinh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdGioiTinh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdGioiTinhKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("giới tính");

        tfdDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdDiaChi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdDiaChi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdDiaChiKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("địa chỉ");

        tfdEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdEmailKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setText("email");

        tfdMaLop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdMaLop.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdMaLop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdMaLopKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("mã lớp");

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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setText("ID");

        tfdID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(tfdMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(tfdHoTenSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(tfdGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(tfdDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(tfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(tfdMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7)
                            .addComponent(tfdID, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel9)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(tfdID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(tfdMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(tfdHoTenSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(tfdGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(tfdDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(tfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(tfdMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDongY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        tblSinhVien.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        tblSinhVien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MSV", "Họ và Tên", "Giới tính", "Địa chỉ", "Email", "Mã lớp"
            }
        ));
        tblSinhVien.setGridColor(new java.awt.Color(255, 255, 255));
        tblSinhVien.setRowHeight(30);
        tblSinhVien.setRowMargin(5);
        tblSinhVien.setShowHorizontalLines(false);
        tblSinhVien.setShowVerticalLines(false);
        tblSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSinhVien);

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
                .addContainerGap(40, Short.MAX_VALUE))
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
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                themSinhVien();
                break;
            case "Sửa":
                suaSinhVien();
                break;
            case "Xóa":
                xoaSinhVien();
                break;
            case "Rỗng":
                tfdID.setText("");
                tfdMaSinhVien.setText("");
                tfdHoTenSinhVien.setText("");
                tfdGioiTinh.setText("");
                tfdDiaChi.setText("");
                tfdEmail.setText("");
                tfdMaLop.setText("");
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

    private void tblSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhVienMouseClicked
        int r = tblSinhVien.getSelectedRow();
        if(r != -1) {
            tfdID.setText(model.getValueAt(r, 0).toString());
            tfdMaSinhVien.setText(model.getValueAt(r, 1).toString());
            tfdHoTenSinhVien.setText(model.getValueAt(r, 2).toString());
            tfdGioiTinh.setText(model.getValueAt(r, 3).toString());
            tfdDiaChi.setText(model.getValueAt(r, 4).toString());
            tfdEmail.setText(model.getValueAt(r, 5).toString());
            tfdMaLop.setText(model.getValueAt(r, 6).toString());
        }
    }//GEN-LAST:event_tblSinhVienMouseClicked

    private void tfdMaSinhVienKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdMaSinhVienKeyPressed
        String sql;
        if("".equals(tfdMaSinhVien.getText()) || " ".equals(tfdMaSinhVien.getText())) {
            sql = "SELECT * FROM SinhVien";
        }
        else {
            sql = "SELECT * FROM SinhVien WHERE MaSinhVien = '" + tfdMaSinhVien.getText() + "'";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdMaSinhVienKeyPressed

    private void tfdGioiTinhKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdGioiTinhKeyPressed
        String sql;
        if("".equals(tfdGioiTinh.getText()) || " ".equals(tfdGioiTinh.getText())) {
            sql = "SELECT * FROM SinhVien";
        }
        else {
            sql = "SELECT * FROM SinhVien WHERE GioiTinh = '" + tfdGioiTinh.getText() + "'";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdGioiTinhKeyPressed

    private void tfdMaLopKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdMaLopKeyPressed
        String sql;
        if("".equals(tfdMaLop.getText()) || " ".equals(tfdMaLop.getText())) {
            sql = "SELECT * FROM SinhVien";
        }
        else {
            sql = "SELECT * FROM SinhVien WHERE MaLop = '" + tfdMaLop.getText() + "'";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdMaLopKeyPressed

    private void tfdDiaChiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdDiaChiKeyPressed
        String sql;
        if("".equals(tfdDiaChi.getText()) || " ".equals(tfdDiaChi.getText())) {
            sql = "SELECT * FROM SinhVien";
        }
        else {
            sql = "SELECT * FROM SinhVien WHERE DiaChi LIKE '" + tfdDiaChi.getText() + "'";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdDiaChiKeyPressed

    private void tfdHoTenSinhVienKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdHoTenSinhVienKeyPressed
        String sql;
        if("".equals(tfdHoTenSinhVien.getText()) || " ".equals(tfdHoTenSinhVien.getText())) {
            sql = "SELECT * FROM SinhVien";
        }
        else {
            sql = "SELECT * FROM SinhVien WHERE HoTenSinhVien LIKE '" + tfdHoTenSinhVien.getText() + "'";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdHoTenSinhVienKeyPressed

    private void tfdEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdEmailKeyPressed
        String sql;
        if("".equals(tfdEmail.getText()) || " ".equals(tfdEmail.getText())) {
            sql = "SELECT * FROM SinhVien";
        }
        else {
            sql = "SELECT * FROM SinhVien WHERE Email = '" + tfdEmail.getText() + "'";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdEmailKeyPressed

/*    
    Hàm tìm kiếm bên trong bảng
*/    
    private void Search(String sql, KeyEvent evt) {
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            for (int i = model.getRowCount()-1; i >= 0; i--) {                  //load lại Row dữ liệu mới vào bảng
                        model.removeRow(i);                                     //nhằm làm mới lại cột ID
            }  
            list = new DAOSinhVien().getListSVSearched(sql);
            showTable();
            if(model.getRowCount() == 1) {
                tfdID.setText(model.getValueAt(0, 0).toString());               //
                tfdMaSinhVien.setText(model.getValueAt(0, 1).toString());       //Nếu chỉ tìm ra 1 dữ liệu khớp từ khóa thì gán
                tfdHoTenSinhVien.setText(model.getValueAt(0, 2).toString());    //row trên bảng vào các Text Field
                tfdGioiTinh.setText(model.getValueAt(0, 3).toString());         //
                tfdDiaChi.setText(model.getValueAt(0, 4).toString());
                tfdEmail.setText(model.getValueAt(0, 5).toString());
                tfdMaLop.setText(model.getValueAt(0, 6).toString());
            }
            else if(model.getRowCount() > 1) {
                //Không làm gì cả
            }
            else {
                JOptionPane.showMessageDialog(null, "KHÔNG TÌM THẤY");
                tfdID.setText("");
                tfdMaSinhVien.setText("");                                      //
                tfdHoTenSinhVien.setText("");                                   //Nếu không tìm được giá trị nào tương ứng trong
                tfdGioiTinh.setText("");                                        //CSDL với từ khóa thì set tất cả các Text Field
                tfdDiaChi.setText("");                                          //về rỗng (make it a little profession :))
                tfdEmail.setText("");
                tfdMaLop.setText("");
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
        list = new DAOSinhVien().getListSVSearched("SELECT * FROM SinhVien");     //Load lại ArrayList lấy từ CSDL
                                                               
        for (int i = model.getRowCount()-1; i >= 0; i--) {     //Xóa hết Row cũ trên bảng đồng thời
            model.removeRow(i);                                //load lại Row dữ liệu mới vào bảng
        }                                                      //nhằm làm mới lại cột ID để hỗ trợ cho việc getID()

        tblSinhVien.repaint();
        showTable();
    }
    
    private void themSinhVien() {
        model.SinhVien s = new model.SinhVien();
        
        s.setMaSinhVien(tfdMaSinhVien.getText());
        s.setHoTenSinhVien(tfdHoTenSinhVien.getText());
        s.setGioiTinh(tfdGioiTinh.getText());
        s.setDiaChi(tfdDiaChi.getText());
        s.setEmail(tfdEmail.getText());
        s.setMaLop(tfdMaLop.getText());
        
        list.add(s);
        
        if(new DAOSinhVien().addStudent(s)) {
            JOptionPane.showMessageDialog(null, "ĐÃ THÊM");
            loadData();
        }
        else {
            JOptionPane.showMessageDialog(null, "KHÔNG THỂ THÊM");
        }
    }
    
    private void suaSinhVien() {
        int r = tblSinhVien.getSelectedRow();
        model.SinhVien s = new model.SinhVien();
        
        s.setID(Integer.parseInt(tfdID.getText()));
        s.setMaSinhVien(tfdMaSinhVien.getText());
        s.setHoTenSinhVien(tfdHoTenSinhVien.getText());
        s.setGioiTinh(tfdGioiTinh.getText());
        s.setDiaChi(tfdDiaChi.getText());
        s.setEmail(tfdEmail.getText());
        s.setMaLop(tfdMaLop.getText());
                                                            
        list.set(r, s);                                     
                                                            
        if(new DAOSinhVien().updateStudent(s)) {
            JOptionPane.showMessageDialog(null, "ĐÃ SỬA");
            model.setValueAt(s.getID(), r, 0);  
            model.setValueAt(s.getMaSinhVien(), r, 1);          
            model.setValueAt(s.getHoTenSinhVien(), r, 2);       
            model.setValueAt(s.getGioiTinh(), r, 3);            
            model.setValueAt(s.getDiaChi(), r, 4);              
            model.setValueAt(s.getEmail(), r, 5);               
            model.setValueAt(s.getMaLop(), r, 6);      
        }
        else {
            JOptionPane.showMessageDialog(null, "KHÔNG THỂ SỬA");
        }
        
    }
    
    private void xoaSinhVien() {
        int r = tblSinhVien.getSelectedRow();                   //get selected row
        model.SinhVien s = new model.SinhVien();
        
        s.setID(Integer.parseInt(tfdID.getText()));              // only need MaSinhVien because of Delete statement in DAOSinhVien

        list.remove(r);                                         // delete selected row in List           
        
        if(new DAOSinhVien().deleteStudent(s)) {                // delete selected row in Database 
            JOptionPane.showMessageDialog(null, "ĐÃ XÓA");      // with which MaSinhVien is a Condition
            model.removeRow(r);                                 // delete selected row in table
        }                                                       
        else {
            JOptionPane.showMessageDialog(null, "KHÔNG THỂ XÓA");
        }
    }
    
/*    
    Hàm tìm kiếm từ trang chủ
*/    
    public void timKiem(String Truong, String Key, KeyEvent evt) {
        String sql;
        switch(Truong) {
            case "MaSinhVien":
                tfdMaSinhVien.setText(Key);
                sql = "SELECT * FROM SinhVien WHERE MaSinhVien = '" + tfdMaSinhVien.getText() + "'";
                Search(sql, evt);
                break;
            case "HoTenSinhVien":
                tfdHoTenSinhVien.setText(Key);
                sql = "SELECT * FROM SinhVien WHERE HoTenSinhVien LIKE '" + tfdHoTenSinhVien.getText() + "'";
                Search(sql, evt);
                break;
            case "GioiTinh":
                tfdGioiTinh.setText(Key);
                sql = "SELECT * FROM SinhVien WHERE GioiTinh LIKE '" + tfdGioiTinh.getText() + "'";
                Search(sql, evt);
                break;
            case "DiaChi":
                tfdDiaChi.setText(Key);
                sql = "SELECT * FROM SinhVien WHERE DiaChi LIKE '" + tfdDiaChi.getText() + "'";
                Search(sql, evt);
                break;
            case "Email":
                tfdEmail.setText(Key);
                sql = "SELECT * FROM SinhVien WHERE Email = '" + tfdEmail.getText() + "'";
                Search(sql, evt);
                break;
            case "MaLop":
                tfdMaLop.setText(Key);
                sql = "SELECT * FROM SinhVien WHERE MaLop LIKE '" + tfdMaLop.getText() + "'";
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
            java.util.logging.Logger.getLogger(SinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinhVien().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDongY;
    private javax.swing.JTable tblSinhVien;
    private javax.swing.JTextField tfdDiaChi;
    private javax.swing.JTextField tfdEmail;
    private javax.swing.JTextField tfdGioiTinh;
    private javax.swing.JTextField tfdHoTenSinhVien;
    private javax.swing.JTextField tfdID;
    private javax.swing.JTextField tfdMaLop;
    private javax.swing.JTextField tfdMaSinhVien;
    // End of variables declaration//GEN-END:variables
}

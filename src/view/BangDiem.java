package view;

import controller.DAOBangDiem;
import controller.DAOLopHoc;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BangDiem extends javax.swing.JFrame {

    private String luaChon = "Thêm";
    DefaultTableModel model;
    private ArrayList<model.BangDiem> list;
    
    public BangDiem() {
        initComponents();
        TrangChu.kichHoatBD = "opening";
        addClosingWindow();
        tfdID.setEditable(false);                                  //Không cho nhập ID vì đây là giá trị autoNumber trong CSLD
        tfdID.setForeground(java.awt.Color.GRAY);
        setLocationRelativeTo(null);                               //set center screen
        list = new DAOBangDiem().getListBDSearched("SELECT * FROM BangDiem");   //get list student from DAO/CSDL
        model = (DefaultTableModel) tblBangDiem.getModel();
        showTable();
    }
    
    private void addClosingWindow() {
        addWindowListener(new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent e)
                {
                    TrangChu.kichHoatBD = "closing";
                    e.getWindow().dispose();
                }
            });
    }
    
    public void showTable() {
        tblBangDiem.getColumnModel().getColumn(0).setPreferredWidth(20);           //
        tblBangDiem.getColumnModel().getColumn(1).setPreferredWidth(60);           //
        tblBangDiem.getColumnModel().getColumn(2).setPreferredWidth(50);           //Set size for Column               
        tblBangDiem.getColumnModel().getColumn(3).setPreferredWidth(70);           //       
        tblBangDiem.getColumnModel().getColumn(4).setPreferredWidth(70);           //
        tblBangDiem.getColumnModel().getColumn(5).setPreferredWidth(70);           // 
        tblBangDiem.getColumnModel().getColumn(6).setPreferredWidth(70);           // 
        tblBangDiem.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        
        for(model.BangDiem bd : list) {                                                    
            model.addRow(new Object[] {
                bd.getID(), bd.getMaSinhVien(), bd.getMaLop(), bd.getMaMon(), bd.getDiemThuongKy(), bd.getDiemGiuaKy(), 
                bd.getDiemCuoiKy(), bd.getDiemTongKet()
            });
        }
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
        tfdMaLop = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfdMaMon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfdDiemThuongKy = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfdDiemGiuaKy = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfdDiemCuoiKy = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbbLuaChon = new javax.swing.JComboBox<>();
        pnlDongY = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfdDiemTongKet = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfdID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangDiem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bảng điểm - Quản lý sinh viên");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Scorecard_64px.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Bảng Điểm");

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

        tfdMaLop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdMaLop.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdMaLop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdMaLopKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("mã lớp");

        tfdMaMon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdMaMon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdMaMon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdMaMonKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("mã môn học");

        tfdDiemThuongKy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdDiemThuongKy.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdDiemThuongKy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdDiemThuongKyKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("điểm thường kỳ");

        tfdDiemGiuaKy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdDiemGiuaKy.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdDiemGiuaKy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdDiemGiuaKyKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setText("điểm giữa kỳ");

        tfdDiemCuoiKy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdDiemCuoiKy.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdDiemCuoiKy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdDiemCuoiKyKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("điểm cuối kỳ");

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

        tfdDiemTongKet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdDiemTongKet.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        tfdDiemTongKet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdDiemTongKetKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setText("điểm tổng kết");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 153, 255));
        jLabel10.setText("ID");

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
                            .addComponent(tfdMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tfdMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(tfdMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(tfdDiemThuongKy, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(tfdDiemGiuaKy, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(tfdDiemCuoiKy, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7)
                    .addComponent(tfdDiemTongKet, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tfdID, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(83, 83, 83))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addComponent(tfdID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(tfdMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(tfdMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(tfdMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(tfdDiemThuongKy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(tfdDiemGiuaKy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(tfdDiemCuoiKy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(tfdDiemTongKet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDongY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        tblBangDiem.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        tblBangDiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MSV", "Mã lớp", "Mã môn học", "Điểm thường kỳ", "Điểm giữa kỳ", "Điểm cuối kỳ", "Điểm tổng kết"
            }
        ));
        tblBangDiem.setGridColor(new java.awt.Color(255, 255, 255));
        tblBangDiem.setRowHeight(30);
        tblBangDiem.setRowMargin(5);
        tblBangDiem.setShowHorizontalLines(false);
        tblBangDiem.setShowVerticalLines(false);
        tblBangDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangDiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBangDiem);

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
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                themBangDiem();
                break;
            case "Sửa":
                suaBangDiem();
                break;
            case "Xóa":
                xoaBangDiem();
                break;
            case "Rỗng":
                tfdID.setText("");
                tfdMaSinhVien.setText("");
                tfdMaLop.setText("");
                tfdMaMon.setText("");
                tfdDiemThuongKy.setText("");
                tfdDiemGiuaKy.setText("");
                tfdDiemCuoiKy.setText("");
                tfdDiemTongKet.setText("");
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

    private void tblBangDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangDiemMouseClicked
        int r = tblBangDiem.getSelectedRow();
        if(r != -1) {
            tfdID.setText(model.getValueAt(r, 0).toString());
            tfdMaSinhVien.setText(model.getValueAt(r, 1).toString());
            tfdMaLop.setText(model.getValueAt(r, 2).toString());
            tfdMaMon.setText(model.getValueAt(r, 3).toString());
            tfdDiemThuongKy.setText(model.getValueAt(r, 4).toString());
            tfdDiemGiuaKy.setText(model.getValueAt(r, 5).toString());
            tfdDiemCuoiKy.setText(model.getValueAt(r, 6).toString());
            tfdDiemTongKet.setText(model.getValueAt(r, 7).toString());
        }
    }//GEN-LAST:event_tblBangDiemMouseClicked

    private void tfdMaSinhVienKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdMaSinhVienKeyPressed
        String sql;
        if("".equals(tfdMaSinhVien.getText()) || " ".equals(tfdMaSinhVien.getText())) {
            sql = "SELECT * FROM BangDiem";
        }
        else {
            sql = "SELECT * FROM BangDiem WHERE MaSinhVien = '" + tfdMaSinhVien.getText() + "' ";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdMaSinhVienKeyPressed

    private void tfdMaLopKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdMaLopKeyPressed
        String sql;
        if("".equals(tfdMaLop.getText()) || " ".equals(tfdMaLop.getText())) {
            sql = "SELECT * FROM BangDiem";
        }
        else {
            sql = "SELECT * FROM BangDiem WHERE MaLop = '" + tfdMaLop.getText() + "' ";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdMaLopKeyPressed

    private void tfdMaMonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdMaMonKeyPressed
        String sql;
        if("".equals(tfdMaMon.getText()) || " ".equals(tfdMaMon.getText())) {
            sql = "SELECT * FROM BangDiem";
        }
        else {
            sql = "SELECT * FROM BangDiem WHERE MaMon = '" + tfdMaMon.getText() + "' ";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdMaMonKeyPressed

    private void tfdDiemThuongKyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdDiemThuongKyKeyPressed
        String sql;
        if("".equals(tfdDiemThuongKy.getText()) || " ".equals(tfdDiemThuongKy.getText())) {
            sql = "SELECT * FROM BangDiem";
        }
        else {
            sql = "SELECT * FROM BangDiem WHERE DiemThuongKy = '" + tfdDiemThuongKy.getText() + "' ";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdDiemThuongKyKeyPressed

    private void tfdDiemGiuaKyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdDiemGiuaKyKeyPressed
        String sql;
        if("".equals(tfdDiemGiuaKy.getText()) || " ".equals(tfdDiemGiuaKy.getText())) {
            sql = "SELECT * FROM BangDiem";
        }
        else {
            sql = "SELECT * FROM BangDiem WHERE DiemGiuaKy = '" + tfdDiemGiuaKy.getText() + "' ";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdDiemGiuaKyKeyPressed

    private void tfdDiemCuoiKyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdDiemCuoiKyKeyPressed
        String sql;
        if("".equals(tfdDiemCuoiKy.getText()) || " ".equals(tfdDiemCuoiKy.getText())) {
            sql = "SELECT * FROM BangDiem";
        }
        else {
            sql = "SELECT * FROM BangDiem WHERE DiemCuoiKy = '" + tfdDiemCuoiKy.getText() + "' ";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdDiemCuoiKyKeyPressed

    private void tfdDiemTongKetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdDiemTongKetKeyPressed
        String sql;
        if("".equals(tfdDiemTongKet.getText()) || " ".equals(tfdDiemTongKet.getText())) {
            sql = "SELECT * FROM BangDiem";
        }
        else {
            sql = "SELECT * FROM BangDiem WHERE DiemTongKet = '" + tfdDiemTongKet.getText() + "' ";
        }
        Search(sql, evt);
    }//GEN-LAST:event_tfdDiemTongKetKeyPressed

    private void Search(String sql, KeyEvent evt) {
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            for (int i = model.getRowCount()-1; i >= 0; i--) {                  //load lại Row dữ liệu mới vào bảng
                        model.removeRow(i);                                     //nhằm làm mới lại cột ID
            }  
            list = new DAOBangDiem().getListBDSearched(sql);
            showTable();
            if(model.getRowCount() == 1) {
                tfdID.setText(model.getValueAt(0, 0).toString());
                tfdMaSinhVien.setText(model.getValueAt(0, 1).toString());
                tfdMaLop.setText(model.getValueAt(0, 2).toString());
                tfdMaMon.setText(model.getValueAt(0, 3).toString());
                tfdDiemThuongKy.setText(model.getValueAt(0, 4).toString());
                tfdDiemGiuaKy.setText(model.getValueAt(0, 5).toString());
                tfdDiemCuoiKy.setText(model.getValueAt(0, 6).toString());
                tfdDiemTongKet.setText(model.getValueAt(0, 7).toString());
            }
            else if(model.getRowCount() > 1) {
                //Do nothing
            }
            else {
                JOptionPane.showMessageDialog(null, "KHÔNG TÌM THẤY");
                tfdID.setText("");
                tfdMaSinhVien.setText("");
                tfdMaLop.setText("");
                tfdMaMon.setText("");
                tfdDiemThuongKy.setText("");
                tfdDiemGiuaKy.setText("");
                tfdDiemCuoiKy.setText("");
                tfdDiemTongKet.setText("");
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
        list = new DAOBangDiem().getListBDSearched("SELECT * FROM BangDiem");   //Load lại ArrayList lấy từ CSDL
        
        for (int i = model.getRowCount()-1; i >= 0; i--) {                      //load lại Row dữ liệu mới vào bảng
            model.removeRow(i);                                                 //nhằm làm mới lại cột ID
        }                                                                        //để hỗ trợ cho việc getID()
        
        tblBangDiem.repaint();
        showTable();
    }
    
    private void themBangDiem() {
        model.BangDiem bd = new model.BangDiem();
        
        bd.setMaSinhVien(tfdMaSinhVien.getText());
        bd.setMaLop(tfdMaLop.getText());
        bd.setMaMon(tfdMaMon.getText());
        bd.setDiemThuongKy(tfdDiemThuongKy.getText());
        bd.setDiemGiuaKy(tfdDiemGiuaKy.getText());
        bd.setDiemCuoiKy(tfdDiemCuoiKy.getText());
        bd.setDiemTongKet(tfdDiemTongKet.getText());
        
        list.add(bd);
        
        if(new DAOBangDiem().addBangDiem(bd)) {
            JOptionPane.showMessageDialog(null, "ĐÃ THÊM");
            loadData();
        }
        else {
            JOptionPane.showMessageDialog(null, "KHÔNG THỂ THÊM");
        }
    }
    
    private void suaBangDiem() {
        int r = tblBangDiem.getSelectedRow();
        model.BangDiem bd = new model.BangDiem();
        
        bd.setID(Integer.parseInt(tfdID.getText()));
        bd.setMaSinhVien(tfdMaSinhVien.getText());
        bd.setMaLop(tfdMaLop.getText());
        bd.setMaMon(tfdMaMon.getText());
        bd.setDiemThuongKy(tfdDiemThuongKy.getText());
        bd.setDiemGiuaKy(tfdDiemGiuaKy.getText());
        bd.setDiemCuoiKy(tfdDiemCuoiKy.getText());
        bd.setDiemTongKet(tfdDiemTongKet.getText());
                                                                    //Update data S to R
        list.set(r, bd);                                            //  R: row was selected
                                                                    //  S: Student was got from the fields
        if(new DAOBangDiem().updateBangDiem(bd)) {
            JOptionPane.showMessageDialog(null, "ĐÃ SỬA");
            model.setValueAt(bd.getID(), r, 0);
            model.setValueAt(bd.getMaSinhVien(), r, 1);             //
            model.setValueAt(bd.getMaLop(), r, 2);                  //
            model.setValueAt(bd.getMaMon(), r, 3);                  //Add the student had just got into the table through Model
            model.setValueAt(bd.getDiemThuongKy(), r, 4);           //
            model.setValueAt(bd.getDiemGiuaKy(), r, 5);             //
            model.setValueAt(bd.getDiemCuoiKy(), r, 6);             //
            model.setValueAt(bd.getDiemTongKet(), r, 7);   
        }
        else {
            JOptionPane.showMessageDialog(null, "KHÔNG THỂ SỬA");
        }
        
    }
    
    private void xoaBangDiem() {
        int r = tblBangDiem.getSelectedRow();                   //get selected row
        model.BangDiem bd = new model.BangDiem();
        
        bd.setID(Integer.parseInt(tfdID.getText()));            // only need ID because of Delete statement in DAOBangDiem

        list.remove(r);                                         // delete selected row in List           
        
        if(new DAOBangDiem().deleteBangDiem(bd)) {              // delete selected row in Database 
            JOptionPane.showMessageDialog(null, "ĐÃ XÓA");      // with which ID is a Condition
            model.removeRow(r);                                 // delete selected row in table
        }                                                       
        else {
            JOptionPane.showMessageDialog(null, "KHÔNG THỂ XÓA");
        }
    }
    
    public void timKiem(String Truong, String Key, KeyEvent evt) {
        String sql;
        switch(Truong) {
            case "MaSinhVien":
                tfdMaSinhVien.setText(Key);
                sql = "SELECT * FROM BangDiem WHERE MaSinhVien = '" + tfdMaSinhVien.getText() + "'";
                Search(sql, evt);
                break;
            case "MaLop":
                tfdMaLop.setText(Key);
                sql = "SELECT * FROM BangDiem WHERE MaLop = '" + tfdMaLop.getText() + "'";
                Search(sql, evt);
                break;
            case "MaMon":
                tfdMaMon.setText(Key);
                sql = "SELECT * FROM BangDiem WHERE MaMon = '" + tfdMaMon.getText() + "'";
                Search(sql, evt);
                break;
            case "DiemThuongKy":
                tfdDiemThuongKy.setText(Key);
                sql = "SELECT * FROM BangDiem WHERE DiemThuongKy = '" + tfdDiemThuongKy.getText() + "'";
                Search(sql, evt);
                break;
            case "DiemGiuaKy":
                tfdDiemGiuaKy.setText(Key);
                sql = "SELECT * FROM BangDiem WHERE DiemGiuaKy = '" + tfdDiemGiuaKy.getText() + "'";
                Search(sql, evt);
                break;
            case "DiemCuoiKy":
                tfdDiemCuoiKy.setText(Key);
                sql = "SELECT * FROM BangDiem WHERE DiemCuoiKy = '" + tfdDiemCuoiKy.getText() + "'";
                Search(sql, evt);
                break;
            case "DiemTongKet":
                tfdDiemTongKet.setText(Key);
                sql = "SELECT * FROM BangDiem WHERE DiemTongKet = '" + tfdDiemTongKet.getText() + "'";
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
            java.util.logging.Logger.getLogger(BangDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BangDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BangDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BangDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new BangDiem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbLuaChon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTable tblBangDiem;
    private javax.swing.JTextField tfdDiemCuoiKy;
    private javax.swing.JTextField tfdDiemGiuaKy;
    private javax.swing.JTextField tfdDiemThuongKy;
    private javax.swing.JTextField tfdDiemTongKet;
    private javax.swing.JTextField tfdID;
    private javax.swing.JTextField tfdMaLop;
    private javax.swing.JTextField tfdMaMon;
    private javax.swing.JTextField tfdMaSinhVien;
    // End of variables declaration//GEN-END:variables
}

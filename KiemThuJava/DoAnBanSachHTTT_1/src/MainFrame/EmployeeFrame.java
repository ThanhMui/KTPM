/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFrame;


import AdminGUI.SachGUI;
import EmployeeGUI.BanHangGUI;
import EmployeeGUI.EmployeeHomeGUI;
import EmployeeGUI.KhachHangGUI;
import EmployeeGUI.NhapHangGUI;
import javax.swing.*;
import java.awt.*;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class EmployeeFrame extends JFrame {

    JPanel pn1, pntop, pnleft;
    JPanel pncontent = new JPanel();
    JLabel lbhome, lbbanhang, lbnhaphang, lbkhach, lbsach, lbsetting;
    JLabel hinhhome, ba_cham, hinhbanhang, hinhnhaphang, hinhkhach, hinhsach, hinhsetting;
    JPanel c1, c2, c3, c4, c5, c6;

    Color color_background =new Color(30,144,255);
    Color color_font_hover=new Color(179, 179, 179);
    //Color color_font_hover=new Color(100,149,237);
    Color color_font_no_hover=new Color(25,25,112);
    Color color_part=new Color(176,224,230); //maudo
    
    public EmployeeFrame() {
//        ImageIcon img = new ImageIcon("src/HinhAnh/employee.png");
//        this.setIconImage(img.getImage());
        this.setUndecorated(true);
        this.setSize(1200,700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
    }

    public void ShowBang(String id) {
        // Panel left
        pnleft = new JPanel();
        pnleft.setBounds(0, 0, 250, 945);
        pnleft.setBackground(color_background); //18,18,18( tím)
        pnleft.setLayout(null);

        ImageIcon hinh3dot = new ImageIcon(getClass().getResource("/HinhAnh/3dot.png"));
        ba_cham = new JLabel("  ");
        ba_cham.setBounds(30, 25, 200, 30);
        ba_cham.setFont(new Font("Segoe UI", Font.BOLD, 20));
        ba_cham.setForeground(new Color(0, 0, 0));
        ba_cham.setIcon(hinh3dot);
        this.add(ba_cham);
        c1 = new JPanel();
        c1.setBounds(0, 75, 10, 40);
        c1.setBackground(color_background);
        lbhome = new JLabel("Home");
        lbhome.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lbhome.setForeground(color_font_no_hover);
        lbhome.setBackground(color_background);
        hinhhome = new JLabel();
        hinhhome.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/hinhhome.png")));
        hinhhome.setBounds(20, 75, 40, 40);
        lbhome.setBounds(73, 75, 200, 40);
        lbhome.setCursor(new Cursor(HAND_CURSOR));
        lbhome.addMouseListener(new MouseListener() {
            // SẢN PHẨM GUI
            @Override
            public void mouseClicked(MouseEvent e) {
                pncontent.removeAll();
                pncontent.add(new EmployeeHomeGUI(id));
                pncontent.setBounds(250, 0, 1350, 945);
                pncontent.repaint();
                pncontent.setLayout(null);
                pncontent.setBorder(null);

                c1.setBackground(color_part);
                c2.setBackground(color_background);
                c3.setBackground(color_background);               

                hinhhome.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/hinhhomef.png")));
                hinhnhaphang.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/pnh.png")));
                hinhbanhang.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/sanpham.png")));
                hinhkhach.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/khachhang.png")));
                hinhsach.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/hoadon.png")));

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lbhome.setForeground(color_font_hover);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lbhome.setForeground(color_font_no_hover);
            }

        });
        lbhome.setOpaque(true);

        c2 = new JPanel();
        c2.setBounds(0, 125, 10, 40);
        c2.setBackground(color_background);
        hinhbanhang = new JLabel();
        hinhbanhang.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/sanpham.png")));
        hinhbanhang.setBounds(20, 125, 40, 40);
        lbbanhang = new JLabel("Bán hàng");
        lbbanhang.setForeground(color_font_no_hover);
        lbbanhang.setBackground(color_background);
        lbbanhang.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lbbanhang.setBounds(73, 125, 200, 40);
        lbbanhang.setCursor(new Cursor(HAND_CURSOR));
        lbbanhang.addMouseListener(new MouseListener() {
            // SẢN PHẨM GUI
            @Override
            public void mouseClicked(MouseEvent e) {
                pncontent.removeAll();
                pncontent.add(new BanHangGUI(id));
                pncontent.setBounds(250, 0, 1350, 945);
                pncontent.repaint();
                pncontent.setLayout(null);
                pncontent.setBorder(null);

                c1.setBackground(color_background);
                c2.setBackground(color_part);
                c3.setBackground(color_background);
                c4.setBackground(color_background);
                c5.setBackground(color_background);


                hinhhome.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/hinhhome.png")));
                hinhnhaphang.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/pnh.png")));
                hinhbanhang.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/sanphamf.png")));
                hinhkhach.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/khachhang.png")));
                hinhsach.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/hoadon.png")));

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lbbanhang.setForeground(color_font_hover);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lbbanhang.setForeground(color_font_no_hover);
            }

        });
        lbhome.setOpaque(true);

        c3 = new JPanel();
        c3.setBounds(0, 175, 10, 40);
        c3.setBackground(color_background);
        hinhnhaphang = new JLabel();
        hinhnhaphang.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/pnh.png")));
        hinhnhaphang.setBounds(20, 175, 40, 40);
        lbnhaphang = new JLabel("Nhập hàng");
        lbnhaphang.setForeground(color_font_no_hover);
        lbnhaphang.setBackground(color_background);
        lbnhaphang.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lbnhaphang.setBounds(73, 175, 200, 40);
        lbnhaphang.setCursor(new Cursor(HAND_CURSOR));
        lbnhaphang.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                pncontent.removeAll();
                pncontent.add(new NhapHangGUI(id));
                pncontent.setBounds(250, 0, 1350, 945);
                pncontent.repaint();
                pncontent.setLayout(null);
                pncontent.setBorder(null);

                c1.setBackground(color_background);
                c2.setBackground(color_background);
                c3.setBackground(color_part);
                c4.setBackground(color_background);

                hinhhome.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/hinhhome.png")));
                hinhnhaphang.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/pnhf.png")));
                hinhbanhang.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/sanpham.png")));
                hinhkhach.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/khachhang.png")));
                hinhsach.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/hoadon.png")));

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lbnhaphang.setForeground(color_font_hover);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lbnhaphang.setForeground(color_font_no_hover);
            }
        });
        
        c4 = new JPanel();
        c4.setBounds(0, 225, 10, 40);
        c4.setBackground(color_background);
        hinhkhach = new JLabel();
        hinhkhach.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/khachhang.png")));
        hinhkhach.setBounds(20, 225, 40, 40);
        lbkhach = new JLabel("Khách hàng");
        lbkhach.setForeground(color_font_no_hover);
        lbkhach.setBackground(color_background);
        lbkhach.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lbkhach.setBounds(73, 225, 200, 40);
        lbkhach.setCursor(new Cursor(HAND_CURSOR));
        lbkhach.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                pncontent.removeAll();
                //pncontent.add(new NhapHangGUI(id));
                pncontent.add(new KhachHangGUI());
                pncontent.setBounds(250, 0, 1350, 945);
                pncontent.repaint();
                pncontent.setLayout(null);
                pncontent.setBorder(null);

                c1.setBackground(color_background);
                c2.setBackground(color_background);
                c3.setBackground(color_background);
                c4.setBackground(color_part);
                c5.setBackground(color_background);

                hinhhome.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/hinhhome.png")));
                hinhnhaphang.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/pnh.png")));
                hinhbanhang.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/sanpham.png")));
                hinhkhach.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/khachhangf.png")));
                hinhsach.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/hoadon.png")));

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lbkhach.setForeground(color_font_hover);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lbkhach.setForeground(color_font_no_hover);
            }
        });

        
        c5 = new JPanel();
        c5.setBounds(0, 275, 10, 40);
        c5.setBackground(color_background);
        hinhsach = new JLabel();
        hinhsach.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/hoadon.png")));
        hinhsach.setBounds(20, 275, 40, 40);
        lbsach = new JLabel("Sách");
        lbsach.setForeground(color_font_no_hover);
        lbsach.setBackground(color_background);
        lbsach.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lbsach.setBounds(73, 275, 200, 40);
        lbsach.setCursor(new Cursor(HAND_CURSOR));
        lbsach.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                pncontent.removeAll();
                //pncontent.add(new NhapHangGUI(id));
                pncontent.add(new SachGUI());
                pncontent.setBounds(250, 0, 1350, 945);
                pncontent.repaint();
                pncontent.setLayout(null);
                pncontent.setBorder(null);

                c1.setBackground(color_background);
                c2.setBackground(color_background);
                c3.setBackground(color_background);
                c4.setBackground(color_background);
                c5.setBackground(color_part);

                hinhhome.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/hinhhome.png")));
                hinhnhaphang.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/pnh.png")));
                hinhbanhang.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/sanpham.png")));
                hinhkhach.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/khachhang.png")));
                hinhsach.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/hoadonf.png")));

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lbsach.setForeground(color_font_hover);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lbsach.setForeground(color_font_no_hover);
            }
        });
        
        
        hinhsetting = new JLabel();
        hinhsetting.setIcon(new ImageIcon(getClass().getResource("/HinhAnh/setting.png")));
        hinhsetting.setBounds(20, 650, 40, 40);
        lbsetting = new JLabel("Đăng Xuất");
        lbsetting.setForeground(color_font_no_hover);
        lbsetting.setBackground(color_background);
        lbsetting.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lbsetting.setBounds(73, 650, 200, 40);
        lbsetting.setCursor(new Cursor(HAND_CURSOR));
        lbsetting.setOpaque(true);
        lbsetting.setVisible(true);
        lbsetting.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                Dangxuat();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lbsetting.setForeground(color_font_hover);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lbsetting.setForeground(color_font_no_hover);
            }
        });

        pnleft.add(lbhome);
        pnleft.add(c1);
        pnleft.add(hinhhome);

        pnleft.add(lbbanhang);
        pnleft.add(c2);
        pnleft.add(hinhbanhang);

        pnleft.add(lbnhaphang);
        pnleft.add(c3);
        pnleft.add(hinhnhaphang);
        
        pnleft.add(lbkhach);
        pnleft.add(c4);
        pnleft.add(hinhkhach);
        
        pnleft.add(lbsach);
        pnleft.add(c5);
        pnleft.add(hinhsach);

        pnleft.add(lbsetting);
        pnleft.add(hinhsetting);
        this.add(pnleft);

        pncontent.setBounds(250, 0, 1350, 945);
        pncontent.setLayout(null);
        pncontent.setBorder(null);
        pncontent.add(new EmployeeHomeGUI(id));
        this.add(pncontent);

        this.repaint();
    }

    public void Dangxuat() {
        LoginFrame temp = new LoginFrame();
        temp.ShowBang();
        this.setVisible(false);
    }

    public static void main(String[] args) {
        EmployeeFrame test = new EmployeeFrame();
        //test.ShowBang("NV02");
        test.ShowBang("1");
    }
}

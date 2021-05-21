package com.dtt.lgsp.app;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.WindowConstants;
 
 
public class ToolbarEx extends JFrame {
 
    public ToolbarEx() {
         
        initUI();
    }
 
    private void initUI() {
         
        JMenuBar menubar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        setJMenuBar(menubar);
  
        JToolBar toolbar = new JToolBar();
        ImageIcon configIcon = new ImageIcon(
				new ImageIcon(Home.class.getResource("/images/configure.png")).getImage());
        ImageIcon monitorIcon = new ImageIcon(
				new ImageIcon(Home.class.getResource("/images/monitoring.png")).getImage());
        ImageIcon exitIcon = new ImageIcon(
				new ImageIcon(Home.class.getResource("/images/logout.png")).getImage());
        JButton configButton = new JButton(configIcon);
        configButton.setToolTipText("Cấu hình");
        JButton monitorButton = new JButton(monitorIcon);
        configButton.setToolTipText("Theo dõi đồng bộ");
        JButton exitButton = new JButton(exitIcon);
        configButton.setToolTipText("Thoát");
        toolbar.add(configButton);
        toolbar.add(monitorButton);
        toolbar.addSeparator(new Dimension(10,10));
        toolbar.add(exitButton);
  
        exitButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
  
        getContentPane().add(toolbar, BorderLayout.NORTH);
        
        JLabel lblBackgroundImg = new JLabel("");
        lblBackgroundImg.setBounds(0, 0, 794, 436);
        getContentPane().add(lblBackgroundImg, BorderLayout.CENTER);
        try {
			ImageIcon imageIcon = new ImageIcon(
					new ImageIcon(Home.class.getResource("/images/bg_login.jpg")).getImage().getScaledInstance(
							lblBackgroundImg.getWidth(), lblBackgroundImg.getHeight(), Image.SCALE_SMOOTH));
			lblBackgroundImg.setIcon(imageIcon);
		} catch (Exception e) {
			e.printStackTrace();
		}
        setTitle("Menu Example");
        setBounds(100, 100, 800, 471);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }
 
    public static void main(String[] args) {
         
        EventQueue.invokeLater(new Runnable() {
             
            @Override
            public void run() {
                ToolbarEx ex = new ToolbarEx();
                ex.setVisible(true);
                
                final Home frame = new Home();
				frame.createUI();
				frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
				frame.setResizable(false);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				if (!SystemTray.isSupported()) {
					frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
					return;
				}
            }
        });
    }
}
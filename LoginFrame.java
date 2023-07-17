/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author game
 */
public class LoginFrame extends JFrame{
    
    //panels
    private JPanel headingPnl;
    private JPanel usernamePnl;
    private JPanel passwordPnl;
    private JPanel btnPnl;
    private JPanel mainPnl;
    private JPanel loginPnl;
    
    //labels
    private JLabel headingLbl;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    
    //textfield
    private  JTextField usernameTxtFld;
    private JTextField passwordTxtFld;
    
    //button
    private JButton submitBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    public LoginFrame(){
    
        setTitle("Login page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setSize(600,650);
        
        //create panel
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        usernamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPnl  = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        mainPnl = new JPanel(new BorderLayout());
        loginPnl = new JPanel(new GridLayout(2,1,1,1));
        loginPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2), "Login details"));
        
        //create labels
        headingLbl = new JLabel("Login");
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        headingLbl.setFont(new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC, 30));
        headingLbl.setForeground(Color.RED);
        
        usernameLbl = new JLabel("Username: ");
        passwordLbl= new JLabel("Password: ");
        
        //create textfield
        usernameTxtFld = new JTextField(10);
        usernameTxtFld.setFocusable(true);
        
        passwordTxtFld = new JTextField(20);
        
        //create button
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        //add components to  respective panels
        headingPnl.add(headingLbl);
        
        usernamePnl.add(usernameLbl);
        usernamePnl.add(usernameTxtFld);
        
        passwordPnl.add(passwordLbl);
        passwordPnl.add(passwordTxtFld);
        
        loginPnl.add(usernamePnl);
        loginPnl.add(passwordPnl);
        
        btnPnl.add(submitBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        mainPnl.add(headingPnl, BorderLayout.NORTH);
        mainPnl.add(loginPnl, BorderLayout.CENTER);
        mainPnl.add(btnPnl, BorderLayout.SOUTH);
        
        //add the main panel to the panel of the frame
        add(mainPnl);
        
        //pack the frame
        pack();
        
        //make the frame visible
        setVisible(true);
        
    }
    
}

package Anis;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {
    public LoginForm(){
        setTitle("LOGIN");

        setSize(500,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        Font lableFont = (new Font("Arial",Font.BOLD,16));

        JPanel headerpanel = new JPanel();
        headerpanel.setBackground(new Color(93,161,217));
        headerpanel.setBounds(5,5,490,60);
        add(headerpanel);

        JLabel hederTxt = new JLabel("LoginForm");
        hederTxt.setFont(new Font("Arial", Font.BOLD,30));
        headerpanel.add(hederTxt);

        JPanel inputpanel = new JPanel();
        inputpanel.setBackground(new Color(190,227,240));
        inputpanel.setBounds(5,70,490,425);
        inputpanel.setLayout(null);
        add(inputpanel);

        JLabel namelabel = new JLabel("User Name  :");
        namelabel.setBounds(80,25,100,25);
        namelabel.setFont(lableFont);
        inputpanel.add(namelabel);

        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(200,25,200,25);
        nameTxt.setFont(lableFont);
        inputpanel.add(nameTxt);

        JLabel passlabel = new JLabel("Password    :");
        passlabel.setBounds(80,70,100,25);
        passlabel.setFont(lableFont);
        inputpanel.add(passlabel);

        JTextField passTxt = new JTextField();
        passTxt.setBounds(200,70,200,25);
        passTxt.setFont(lableFont);
        inputpanel.add(passTxt);

        JButton logBtn = new JButton("Login");
        logBtn.setBounds(300,120,100,30);
        logBtn.setBackground(new Color(93,161,217));
        logBtn.setFont(lableFont);
        logBtn.setForeground(Color.WHITE);
        logBtn.setBorder(new LineBorder(Color.BLUE));
        logBtn.setFocusable(false);
        inputpanel.add(logBtn);

        JButton regBtn = new JButton("Register");
        regBtn.setBounds(100,120,100,30);
        regBtn.setBackground(new Color(219,143,160));
        regBtn.setFont(lableFont);
        regBtn.setForeground(Color.WHITE);
        regBtn.setBorder(new LineBorder(Color.RED));
        regBtn.setFocusable(false);
        inputpanel.add(regBtn);

        setVisible(true);

        regBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new RegForm();

            }
        });

        logBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = nameTxt.getText();
                String password = passTxt.getText();

                DbConnect db = new DbConnect();
                String queryLogin = "SELECT * FROM `SecF`";
                db.Login(queryLogin,username,password);

            }
        });

        logBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();


            }
        });


    }

}
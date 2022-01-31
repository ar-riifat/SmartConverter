package Anis;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame1 extends JFrame {

    JButton b1,b2,b3;
    JPanel p1,p2;
    JLabel l1, l2;

    Frame1() {
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);

        Font font = (new Font("Times New Roman", Font.BOLD, 30));
        Font font2 = (new Font("Times New Roman", Font.ITALIC, 20));


        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,500,100);
        p1.setBackground(Color.CYAN);
        add(p1);

        p2 = new JPanel();
        p2.setBounds(0,100,500,400);
        p2.setBackground(new Color(150,199,254));
        p2.setLayout(null);
        add(p2);

        l1 = new JLabel("SMART CONVERTER");
        l1.setFont(font);
        l1.setBounds(85,10,400,60);
        p1.add(l1);

        l2 = new JLabel("WHAT CONVERTER WOULD YOU LIKE TO CHOOSE?");
        l2.setFont(font2);
        l2.setBounds(20,20,500,100);
        p2.add(l2);

        b1 = new JButton("Temperature");
        b1.setBounds(80,100,150,60);
        b1.setFont(font2);
        b1.setFocusable(false);
        b1.setBackground(new Color(15,221,150));
        p2.add(b1);


        b2 = new JButton("Measurement");
        b2.setBounds(280,100,150,60);
        b2.setFont(font2);
        b2.setFocusable(false);
        b2.setBackground(new Color(166,156,121));
        p2.add(b2);

        b3 = new JButton("Currency");
        b3.setFont(font2);
        b3.setFocusable(false);
        b3.setBackground(new Color(180,150,150));
        b3.setBounds(180,190,150,60);
        p2.add(b3);

        setVisible(true);

        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new temperatureConverter();
            }

        });

        b2.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new measurementConverter();
            }

        });

        b3.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new currencyConverter();
            }
        });

    }

}

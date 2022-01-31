package Anis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class currencyConverter extends JFrame
{
    JTextField t1, t2;
    JButton DT,PT,ET,RT1,RT2,RT3,MM;
    JLabel l1,l2,l3;
    String s1;
    JPanel p1,p2;
    double d1,d2;

    currencyConverter()
    {
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);

        Font font = (new Font("Times New Roman", Font.BOLD, 25));

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,500,80);
        p1.setBackground(Color.cyan);
        add(p1);

        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,80,500,420);
        p2.setBackground(Color.PINK);
        add(p2);

        t1 = new JTextField();
        t1.setBounds(200,40,200,50);
        p2.add(t1);

        t2 = new JTextField();
        t2.setBounds(200,120,200,50);
        t2.setEditable(false);
        p2.add(t2);

        l1 = new JLabel("Currency Converter");
        l1.setFont(font);
        l1.setBounds(230,5,500,40);
        p1.add(l1);

        l2 = new JLabel("Input :");
        l2.setFont(font);
        l2.setBounds(100,40,90,40);
        p2.add(l2);

        l3 = new JLabel("Output :");
        l3.setFont(font);
        l3.setBounds(90,120,100,40);
        p2.add(l3);

        DT = new JButton("Dollar > TAKA");
        DT.setFocusable(false);
        DT.setBounds(40,220,120,50);
        DT.setBackground(new Color(125,131,212));
        p2.add(DT);

        PT = new JButton("Pound > TAKA");
        PT.setFocusable(false);
        PT.setBounds(40,285,120,50);
        PT.setBackground(new Color(125,131,212));
        p2.add(PT);

        ET = new JButton("Euro > TAKA");
        ET.setFocusable(false);
        ET.setBounds(180,220,120,50);
        ET.setBackground(new Color(125,131,212));
        p2.add(ET);

        RT1 = new JButton("Riyal > TAKA");
        RT1.setFocusable(false);
        RT1.setBounds(180,285,120,50);
        RT1.setBackground(new Color(125,131,212));
        p2.add(RT1);

        RT2 = new JButton("Rupee > TAKA");
        RT2.setFocusable(false);
        RT2.setBounds(320,220,120,50);
        RT2.setBackground(new Color(125,131,212));
        p2.add(RT2);

        RT3 = new JButton("Ringgit > TAKA");
        RT3.setFocusable(false);
        RT3.setBounds(320,285,120,50);
        RT3.setBackground(new Color(125,131,212));
        p2.add(RT3);

        MM = new JButton("Main Menu");
        MM.setBounds(10,15,100,50);
        MM.setBackground(new Color(132,123,166));
        MM.setFocusable(false);
        p1.add(MM);

        DT.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 =  d1 * 85.75;
                t2.setText(Double.toString(d2));

            }
        });

        PT.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 = d1 * 115.30;
                t2.setText(Double.toString(d2));

            }
        });

        ET.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 = d1 * 95.87;
                t2.setText(Double.toString(d2));

            }
        });

        RT1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 = d1 * 22.86;
                t2.setText(Double.toString(d2));

            }
        });

        RT2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 = d1 * 1.15;
                t2.setText(Double.toString(d2));

            }
        });

        RT3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 = d1 * 20.49;
                t2.setText(Double.toString(d2));

            }
        });

        MM.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Anis.Frame1();
            }
        });

        setVisible(true);
    }
}

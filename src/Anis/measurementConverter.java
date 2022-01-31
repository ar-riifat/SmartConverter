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

public class measurementConverter extends JFrame
{
    JTextField t1, t2;
    JButton MF,FM,MI,IM,MY,YM,MM;
    JLabel l1,l2,l3;
    String s1;
    JPanel p1,p2;
    double d1,d2;


    measurementConverter()
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

        l1 = new JLabel("Measurement Converter");
        l1.setFont(font);
        l1.setBounds(210,5,500,40);
        p1.add(l1);

        l2 = new JLabel("Input :");
        l2.setFont(font);
        l2.setBounds(100,40,90,40);
        p2.add(l2);

        l3 = new JLabel("Output :");
        l3.setFont(font);
        l3.setBounds(90,120,100,40);
        p2.add(l3);

        MF = new JButton("Meter > Feet");
        MF.setBounds(40,210,120,50);
        MF.setBackground(new Color(132,123,166));
        MF.setFocusable(false);
        p2.add(MF);

        FM = new JButton("Feet > Meter");
        FM.setBounds(40,285,120,50);
        FM.setBackground(new Color(132,123,166));
        FM.setFocusable(false);
        p2.add(FM);

        MI = new JButton("Meter > Inches");
        MI.setBounds(180,210,120,50);
        MI.setBackground(new Color(132,123,166));
        MI.setFocusable(false);
        p2.add(MI);

        IM = new JButton("Inches > Meter");
        IM.setBounds(180,285,120,50);
        IM.setBackground(new Color(132,123,166));
        IM.setFocusable(false);
        p2.add(IM);

        MY = new JButton("Meter > Yard");
        MY.setBounds(320,210,120,50);
        MY.setBackground(new Color(132,123,166));
        MY.setFocusable(false);
        p2.add(MY);

        YM = new JButton("Yard > Meter");
        YM.setBounds(320,285,120,50);
        YM.setBackground(new Color(132,123,166));
        YM.setFocusable(false);
        p2.add(YM);

        MM = new JButton("Main Menu");
        MM.setBounds(10,15,100,50);
        MM.setBackground(new Color(132,123,166));
        MM.setFocusable(false);
        p1.add(MM);

        MF.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 =  d1 * 3.28084;
                t2.setText(Double.toString(d2));

            }
        });

        FM.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 = d1 * 0.3048;
                t2.setText(Double.toString(d2));

            }
        });

        MI.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 = d1 * 39.3701;
                t2.setText(Double.toString(d2));

            }
        });

        IM.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 = d1 * 0.0254;
                t2.setText(Double.toString(d2));

            }
        });

        MY.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 = d1 * 1.09361;
                t2.setText(Double.toString(d2));

            }
        });

        YM.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 = d1 * 0.9144;
                t2.setText(Double.toString(d2));

            }
        });

        MM.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Frame1();
            }
        });

        setVisible(true);
    }
}

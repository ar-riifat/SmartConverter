package Anis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class temperatureConverter extends JFrame
{
    JTextField t1, t2;
    JPanel p1,p2;
    JButton CF,FC,CK,KC,FK,KF,MM;
    JLabel l1,l2,l3;
    String s1;
    double d1,d2;

    temperatureConverter()
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

        l1 = new JLabel("Temperature Converter");
        l1.setFont(font);
        l1.setBounds(220,5,500,40);
        p1.add(l1);

        l2 = new JLabel("Input :");
        l2.setFont(font);
        l2.setBounds(100,40,90,40);
        p2.add(l2);

        l3 = new JLabel("Output :");
        l3.setFont(font);
        l3.setBounds(90,120,100,40);
        p2.add(l3);

        CF = new JButton("C > F");
        CF.setFocusable(false);
        CF.setBounds(50,210,70,50);
        CF.setBackground(new Color(125,131,212));
        p2.add(CF);

        FC = new JButton("F > C");
        FC.setFocusable(false);
        FC.setBounds(50,285,70,50);
        FC.setBackground(new Color(125,131,212));
        p2.add(FC);

        CK = new JButton("C > K");
        CK.setFocusable(false);
        CK.setBounds(200,210,70,50);
        CK.setBackground(new Color(125,131,212));
        p2.add(CK);

        KC = new JButton("K > C");
        KC.setFocusable(false);
        KC.setBounds(200,285,70,50);
        KC.setBackground(new Color(125,131,212));
        p2.add(KC);

        FK = new JButton("F > K");
        FK.setFocusable(false);
        FK.setBounds(350,210,70,50);
        FK.setBackground(new Color(125,131,212));
        p2.add(FK);

        KF = new JButton("K > F");
        KF.setFocusable(false);
        KF.setBounds(350,285,70,50);
        KF.setBackground(new Color(125,131,212));
        p2.add(KF);

        MM = new JButton("Main Menu");
        MM.setFocusable(false);
        MM.setBackground(new Color(125,131,212));
        MM.setBounds(10,15,100,50);
        p1.add(MM);


        CF.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 =  9.0 / 5.0 * d1 + 32;
                t2.setText(Double.toString(d2));

            }
        });

        FC.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 = (d1 - 32) * 5 / 9.0;
                t2.setText(Double.toString(d2));

            }
        });

        CK.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 = d1 + 273.15;
                t2.setText(Double.toString(d2));

            }
        });

        KC.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 = d1 - 273.15;
                t2.setText(Double.toString(d2));

            }
        });

        FK.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 = ((d1-32)/1.8) + 273.15;
                t2.setText(Double.toString(d2));

            }
        });

        KF.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = t1.getText();
                d1 = Double.parseDouble(s1);
                d2 = (d1 - 273.15) * 9/5 + 32;
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

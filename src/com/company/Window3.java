package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window3 extends JFrame {

    public Window3(){

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton button1 = new JButton("PageStart");
        JButton button2 = new JButton("PageEnd");
        JButton button3 = new JButton("LineStart");
        JButton button4 = new JButton("LineEnd");
        JButton button5 = new JButton("Center");

        button5.addActionListener(new FunnyAction(button5));

        JPanel panelPageStart = new JPanel();
        panelPageStart.setLayout(new FlowLayout());
        panelPageStart.add(button1);
        panelPageStart.add(new JButton("aaaa"));
        panelPageStart.add(new JButton("bbb"));
        panelPageStart.add(new JButton("333"));

        add(panelPageStart, BorderLayout.PAGE_START);
        add(button2, BorderLayout.PAGE_END);
        add(button3, BorderLayout.LINE_START);
        add(button4, BorderLayout.LINE_END);
        add(button5, BorderLayout.CENTER);

        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Okienko :D");

    }

}

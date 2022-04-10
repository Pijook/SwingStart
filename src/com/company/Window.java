package com.company;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window(){
        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                int width = getWidth() - 1;
                int height = getHeight() - 1;

                g.setColor(Color.RED);
                for(int i = 10; i < width / 2; i = i + 10){
                    g.drawRect(i, i, width - i * 2, height - i * 2);
                }
            }
        };

        panel.setBackground(Color.BLUE);

        add(panel);
        setSize(200, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}

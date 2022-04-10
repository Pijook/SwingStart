package com.company;

import javax.swing.*;
import java.awt.*;

public class Window2 extends JFrame {

    public Window2(){

        JTextArea jTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(jTextArea);

        String rodzajPisma = Font.DIALOG_INPUT;
        int rozmiarPisma = 24;
        int typPisma = Font.BOLD | Font.ITALIC;

        Font font = new Font(rodzajPisma, typPisma, rozmiarPisma);
        jTextArea.setFont(font);

        jTextArea.setForeground(Color.GREEN);
        jTextArea.setBackground(Color.BLACK);

        add(scrollPane);

        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Okienko :D");

    }

}

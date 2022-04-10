package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FunnyAction implements ActionListener {

    private JButton button;
    private int amount;

    public FunnyAction(JButton button){
        this.button = button;
        this.amount = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        amount++;
        button.setText("You clicked this button " + amount + " times!");
    }
}

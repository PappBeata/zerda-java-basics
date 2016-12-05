package com.greenfox.exams.java;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    JPanel BlackJack = new JPanel();
    JLabel userLabel = new JLabel("User played:");
    JLabel houseLabel = new JLabel("House played:");
    JButton drawButton = new JButton("Draw a drawCard");
    JButton resetButton = new JButton("New game");

    public GUI() {
        this.setTitle("BlackJack");
        this.setResizable(true);
        this.setPreferredSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        getContentPane().add(BlackJack);
        this.add(BlackJack);
        BlackJack.add(userLabel);
        BlackJack.add(houseLabel);
        userLabel.add(drawButton);
        userLabel.add(resetButton);
        drawButton.setHorizontalTextPosition(SwingConstants.LEFT);
    }

    public void setBlackJack(JPanel blackJack) {
        BlackJack = blackJack;
    }
    public void setVisible (JPanel blackJack){
        blackJack.setVisible(true);
    }
}
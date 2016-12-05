package com.greenfox.exams.java;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    public JPanel BlackJack = new JPanel();
    JLabel userLabel = new JLabel("User played:");
    JLabel houseLabel = new JLabel("House played:");

    public GUI() {
        this.setVisible(true);
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
  }

    public void setBlackJack() {
        JButton drawButton = new JButton("Draw a drawCard");
        JButton resetButton = new JButton("New game");
        userLabel.add(drawButton);
        userLabel.add(resetButton);
        drawButton.setPreferredSize(new Dimension(80, 50));
        resetButton.setPreferredSize(new Dimension(80, 50));

        drawButton.setHorizontalTextPosition(SwingConstants.LEFT);
        Deck myDeck = new Deck(52);
        drawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int randomValue1;
                randomValue1 = Integer.parseInt(String.valueOf(52*Math.random()));
                Cards lastCard = new Cards(randomValue1);
                Played myPlayed = new Played();
                int randomValue2;
                randomValue2 = Integer.parseInt(String.valueOf(52*Math.random()));
                Cards houseCard = new Cards(randomValue2);
                House myHouse = new House();
                userLabel.setText("User played: " + randomValue1);
                houseLabel.setText("House played: " + randomValue2);
                ;
            }
        });
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Deck myDeck = new Deck(52);
            }
        });
    }
    public void setVisible (){
        BlackJack.setVisible(true);
    }
}
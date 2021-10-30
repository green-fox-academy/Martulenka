package com.company;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void drawImage(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern

        int squareSize = WIDTH/8;
        int squareXPosition = 0;
        int squareYPosition = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(i==j || (i%2 == 0 && j%2 == 0) || (i%2 != 0 && j%2 != 0)){
                    graphics.setColor(Color.white);
                }else{
                    graphics.setColor(Color.black);
                }
                graphics.fillRect(squareXPosition,squareYPosition,squareSize,squareSize);
                squareXPosition+=squareSize;
            }
            squareXPosition=0;
            squareYPosition+=squareSize;
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}
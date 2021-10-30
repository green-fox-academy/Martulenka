package com.company;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void drawImage(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        graphics.fillRect(0,0,WIDTH,HEIGHT);

        for (int i = 0; i < GetRandomNumber(250,1000); i++) {
            DrawSquare(graphics);
        }
    }

    public static int GetRandomNumber(int min, int max) {
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    public static void DrawSquare(Graphics graphics) {
        int squareColor = GetRandomNumber(50,255);

        graphics.setColor(new Color(squareColor,squareColor,squareColor));

        graphics.fillRect(GetRandomNumber(0,WIDTH),GetRandomNumber(0,HEIGHT),1,1);
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
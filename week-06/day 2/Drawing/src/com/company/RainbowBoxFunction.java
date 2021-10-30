package com.company;
import javax.swing.*;

import java.awt.*;

import static java.awt.Color.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void drawImage(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters
        // (the square size, the fill color and the graphics)
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        Color[] rainbowColors = {red, orange, yellow, green, blue, new Color(75,0,130), new Color(238,130,238)};

        for (int i = 0; i < rainbowColors.length; i++) {
            DrawSquare(graphics,(rainbowColors.length*10)-i*10,rainbowColors[i]);
        }

    }

    public static void DrawSquare(Graphics graphics, int squareSize, Color squareColor) {
        graphics.setColor(squareColor);
        graphics.fillRect(HEIGHT/2-squareSize/2,WIDTH/2-squareSize/2,squareSize,squareSize);
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
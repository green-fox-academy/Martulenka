package com.company;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {
    public static void drawImage(Graphics graphics){
        // Create a function that takes 2 parameters and draws one square
        // Parameters: the square size and the graphics
        // The function shall draw a square of that size to the center of the canvas
        // Draw 3 squares with that function
        // (the squares should not be filled otherwise they will hide each other)
        // Avoid code duplication!
        DrawSquare(graphics,50);
        DrawSquare(graphics,300);
        DrawSquare(graphics,150);
    }

    public static void DrawSquare(Graphics graphics, int squareSize) {
        graphics.drawRect(HEIGHT/2-squareSize/2,WIDTH/2-squareSize/2,squareSize,squareSize);
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
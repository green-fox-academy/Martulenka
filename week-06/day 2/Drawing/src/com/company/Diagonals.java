package com.company;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void drawImage(Graphics graphics) {
        // Create a function that draws a single line
        // Use this function to draw the canvas' diagonals
        // If the line starts from the upper-left corner it should be green, otherwise it should be red
        // Make decision about the color in the function

        DrawingLine(graphics, 0,0,WIDTH,HEIGHT);
        DrawingLine(graphics, WIDTH,0,0,HEIGHT);

    }

    public static void DrawingLine(Graphics graphics, int start1, int start2, int end1, int end2) {
        if(start1 == start2){
            graphics.setColor(Color.green);
        }else{
            graphics.setColor(Color.red);
        }
        graphics.drawLine(start1, start2, end1, end2);
    }


    // Don't touch the code below

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
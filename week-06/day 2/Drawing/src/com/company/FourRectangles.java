package com.company;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void drawImage(Graphics graphics){
        // Draw four different size and color rectangles
        // Avoid code duplication!

        DrawRectangle(graphics, 20,20,50,20,Color.red);
        DrawRectangle(graphics, 100,60,30,10,Color.yellow);
        DrawRectangle(graphics, 80,10,100,80,Color.white);
        DrawRectangle(graphics, 200,150,110,100,Color.green);

    }

    public static void DrawRectangle(Graphics graphics, int start1,int start2,int recWidth,int recHeight,Color recColor) {
        graphics.setColor(recColor);
        graphics.drawRect(start1,start2,recWidth,recHeight);
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
package com.company;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void drawImage(Graphics graphics) {

        int quarterWidth = WIDTH/2;
        int quarterHeight = HEIGHT/2;

        graphics.setColor(Color.green);

        for (int i = 0; i < quarterHeight; i+=20) {
            DrawingLine(graphics,0,i,i,quarterHeight);
            DrawingLine(graphics,quarterWidth,i,i+quarterWidth,quarterHeight);
            DrawingLine(graphics,0,i+quarterHeight,i,HEIGHT);
            DrawingLine(graphics,quarterWidth,i+quarterHeight,i+quarterWidth,HEIGHT);
        }

        graphics.setColor(Color.magenta);

        for (int i = quarterHeight; i > 0; i-=20) {
            DrawingLine(graphics,quarterHeight,i,i,0);
            DrawingLine(graphics,WIDTH,i,i+quarterWidth,0);
            DrawingLine(graphics,quarterWidth,i+quarterHeight,i,quarterHeight);
            DrawingLine(graphics,WIDTH,i+quarterHeight,i+quarterWidth,quarterHeight);
        }
    }

    public static void DrawingLine(Graphics graphics, int x1, int y1, int x2,  int y2) {
        graphics.drawLine(x1, y1, x2, y2);
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
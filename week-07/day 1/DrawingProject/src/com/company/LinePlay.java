package com.company;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void drawImage(Graphics graphics) {

        graphics.setColor(Color.green);

        for (int i = 0; i < HEIGHT; i+=20) {
            DrawingLine(graphics,0,i,i,HEIGHT);
        }

        graphics.setColor(Color.magenta);

        for (int i = HEIGHT; i > 0; i-=20) {
            DrawingLine(graphics,HEIGHT,i,i,0);
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
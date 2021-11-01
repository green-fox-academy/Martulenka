package com.company;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void drawImage(Graphics graphics) {

        int halfWidth = WIDTH/2;
        int triangleSide = 15;
        int triangleHeight = (int) Math.sqrt(Math.pow(triangleSide,2)-Math.pow(triangleSide/2,2));
        int triangleCount = 21;

        for (int i = 0; i < triangleCount; i++) {
            DrawingLine(graphics,halfWidth-i*triangleSide/2,triangleHeight*i,halfWidth+triangleCount*triangleSide/2-i*triangleSide,triangleHeight * triangleCount);
            DrawingLine(graphics,halfWidth+i*triangleSide/2,triangleHeight*i,halfWidth-triangleCount*triangleSide/2+i*triangleSide,triangleHeight * triangleCount);
            DrawingLine(graphics,halfWidth+(i+1)*triangleSide/2,triangleHeight*(i+1),halfWidth-(i+1)*triangleSide/2,triangleHeight*(i+1));
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
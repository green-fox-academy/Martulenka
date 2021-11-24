package com.company;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Triangles {

    public static void drawImage(Graphics graphics) {

        drawTriangle(graphics, 0, 0, HEIGHT);

    }

    public static void drawTriangle(Graphics graphics, int x, int y, int side){
        int x2 = x + side;
        int y2 = y;
        int x3 = x + side/2;
        int y3 = y + side;

        graphics.drawPolygon(new int[]{x,x2, x3 },new int[]{y, y2, y3 }, 3 );
        side = side/2;

        if(side > 4){
            drawTriangle(graphics, x, y, side);
            drawTriangle(graphics, x + side, y, side);
            drawTriangle(graphics, x + (side/2), y + side, side);
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

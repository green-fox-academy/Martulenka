package com.company;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SuperHexagon {


    public static void drawImage(Graphics graphics) {
        int halfWidth = WIDTH/2;
        int hexagonSide = 20;
        int hexagonInsideRadius =  (int) Math.round(hexagonSide * Math.sqrt(3)/2);
        int[] hexagonXPoints = new int[6];
        int[] hexagonYPoints= new int[6];

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 7-j; i++) {
                hexagonXPoints=new int[]{halfWidth-hexagonSide/2-j*(hexagonSide+hexagonSide/2),halfWidth+hexagonSide/2-j*(hexagonSide+hexagonSide/2),halfWidth+hexagonSide-j*(hexagonSide+hexagonSide/2),halfWidth+hexagonSide/2-j*(hexagonSide+hexagonSide/2),halfWidth-hexagonSide/2-j*(hexagonSide+hexagonSide/2),halfWidth-hexagonSide-j*(hexagonSide+hexagonSide/2)};
                hexagonYPoints=new int[]{i*2*hexagonInsideRadius+j*hexagonInsideRadius,i*2*hexagonInsideRadius+j*hexagonInsideRadius,hexagonInsideRadius+i*2*hexagonInsideRadius+j*hexagonInsideRadius,2*hexagonInsideRadius+i*2*hexagonInsideRadius+j*hexagonInsideRadius,2*hexagonInsideRadius+i*2*hexagonInsideRadius+j*hexagonInsideRadius,hexagonInsideRadius+i*2*hexagonInsideRadius+j*hexagonInsideRadius};
                DrawingHexagon(graphics,hexagonXPoints,hexagonYPoints);
                hexagonXPoints=new int[]{halfWidth-hexagonSide/2+j*(hexagonSide+hexagonSide/2),halfWidth+hexagonSide/2+j*(hexagonSide+hexagonSide/2),halfWidth+hexagonSide+j*(hexagonSide+hexagonSide/2),halfWidth+hexagonSide/2+j*(hexagonSide+hexagonSide/2),halfWidth-hexagonSide/2+j*(hexagonSide+hexagonSide/2),halfWidth-hexagonSide+j*(hexagonSide+hexagonSide/2)};
                DrawingHexagon(graphics,hexagonXPoints,hexagonYPoints);
            }
        }
    }

    public static void DrawingHexagon(Graphics graphics, int xpoints[],int ypoints[]) {
        int npoints = 6;

        graphics.drawPolygon(xpoints, ypoints, npoints);
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

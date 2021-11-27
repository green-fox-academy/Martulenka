package com.company;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

public class Circles {
    public static void drawImage(Graphics graphics) {

        drawCircle(graphics, 0, 0, HEIGHT);

    }


    public static void drawCircle(Graphics graphics, int x, int y, int diameter){

        graphics.drawOval(x,y,diameter,diameter);

        diameter = diameter/2;

        if(diameter > 20){
            //drawCircle(graphics,  WIDTH/2 - diameter/2, 0, diameter);
            drawCircle(graphics, WIDTH/2 , HEIGHT/2, diameter);
            //drawCircle(graphics, x - diameter/2, y + diameter/2, diameter);
        }

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Circles.ImagePanel panel = new Circles.ImagePanel();
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

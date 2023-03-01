/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moire.patterns;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author dylan
 */
public class MoirePatterns extends Canvas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Moire Pattern");
        Canvas canvas = new MoirePatterns();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void paint(Graphics g) {
        int i = 90;
        while (i < getWidth()) {
            g.drawOval(0, 0, i, i);
            i = i + 3;
        }
    }
    
}

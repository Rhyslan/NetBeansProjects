/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package japan.flag;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author dylan
 */
public class JapanFlag extends Canvas{

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 800, 500);
        
        g.setColor(Color.RED);
        g.fillOval(300, 100, 200, 200);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Japanese Flag");
        Canvas canvas = new JapanFlag();
        canvas.setSize(500, 500);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    
}

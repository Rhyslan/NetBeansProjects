/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hidden.mickey;



/***********************************************************
 * It Was Unclear What I Was Meant To Do With This Example *
 ***********************************************************/


import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author dylan
 */
public class HiddenMickey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void boxOval(Graphics g, Rectangle bb) {
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }
    
    public void mickey(Graphics g, Rectangle bb) {
        boxOval(g, bb);
        
        int dx = bb.width / 2;
        int dy = bb.height /2;
        Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);
        
        half.translate(-dx /2, -dy /2);
        boxOval(g, half);
        
        half.translate(dx * 2, 0);
        boxOval(g, half);
    }
    
}

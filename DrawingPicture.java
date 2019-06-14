/**
 * Pink Floyd
 *
 * Isabella Moughal
 * version (1/22/19) */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.Color;

public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        
        g2.setColor(Color.black);
        
        Rectangle box = new Rectangle(0,0,900,500);
        g2.draw(box);
        g2.fill(box);
        
        g2.setColor(Color.red);
        g2.setStroke(new BasicStroke(10.0f));
        g.drawLine(485, 200, 900, 250);
        
        g2.setColor(Color.orange);
        g2.setStroke(new BasicStroke(10.0f));
        g.drawLine(490, 210, 898, 260);
        
        g2.setColor(Color.yellow);
        g2.setStroke(new BasicStroke(10.0f));
        g.drawLine(495, 220, 896, 270);
        
        g2.setColor(Color.green);
        g2.setStroke(new BasicStroke(10.0f));
        g.drawLine(500, 230, 894, 280);
        
        g2.setColor(Color.blue);
        g2.setStroke(new BasicStroke(10.0f));
        g.drawLine(505, 240, 892, 290);
        
        g2.setColor(Color.magenta);
        g2.setStroke(new BasicStroke(10.0f));
        g.drawLine(510, 250, 890, 300);
        
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(10.0f));
        g.drawLine(478, 200, 545, 320);
        
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(3.0f));
        g2.drawPolygon(new int[] {325, 450, 575}, new int[] {350, 150, 350}, 3);
        
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(1.0f));
        g2.drawPolygon(new int[] {474, 400, 515}, new int[] {192, 230, 260}, 3);
    
        Color startColor = Color.white;
        Color endColor = Color.black;
        
        int startX = 400, startY = 230, endX = 510, endY = 230;
        
        GradientPaint gradient = new GradientPaint(startX, startY, startColor, endX, endY, endColor);
        g2.setPaint(gradient);
        g2.fillPolygon(new int[] {474, 400, 515}, new int[] {192, 230, 260}, 3);
        
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(4.0f));
        g.drawLine(400, 230, 0, 350);
        
        g2.setStroke(new BasicStroke(1.0f));
        //drawGrid(g2);
    }
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        for(int x = 0; x < 1000; x += 50){
            g2.drawLine(x, 0, x, 1000);
            g2.drawString("" + x, x, 10);
        }
        
        // Draw horizontal lines
        for(int y = 50; y < 1000; y += 50){
            g2.drawLine(0, y, 1000, y);
            g2.drawString("" + y, 0, y);
        }
    }
}


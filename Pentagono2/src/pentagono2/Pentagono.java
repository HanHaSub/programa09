/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JFrame;

/**
 *
 * @author acer
 */
public class Pentagono extends JFrame {
    
    public Pentagono ()
    {
    
    super("figura de pentagono");
    setSize (500,500);
    setVisible (true);
    }
   
    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke (new BasicStroke (3.0f));
        
        int valoresX[] = {260, 210, 230, 290, 310 };
        int valoresY[] = { 30, 70, 120, 120, 70};
        Polygon poligono1 = new Polygon (valoresX, valoresY,5);
        
        g2d.setPaint(Color.MAGENTA);
        g2d.drawPolygon(poligono1);
    }
   
    public static void main (String args []){
        Pentagono aplicacion = new Pentagono();
        aplicacion.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    
    }
    
}

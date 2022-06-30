/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_06.View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;


public class DrawPanel extends JPanel implements MouseListener{
    
    private final int CIRCLE = 1;
    private final int STAR = 2;
    private final int SQUARE = 3;
    private final int RECTANGLE = 4;
    private final int TRIANGLE = 5;
    
    private int figura;
    private Color color;
    private int height;
    private int width;
    private Point point1 = new Point(10, 10);
    private Point point2 = new Point(-10, -10);

    public DrawPanel(int figura, Color color, int height, int width) {
        this.figura = figura;
        this.color = color;
        this.height = height;
        this.width = width;
        
        this.addMouseListener(this);
    }

    

    public void setFigure(int figura, Color color, int height, int width){
        setHeightFig(height);
        setWidthFig(width);
        setColor(color);
        setFigura(figura);
    }
    
   

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        System.out.println("entro al paint");
        g.setColor(color);
      
        g.fillRect(point1.x, point1.y, getWidthFig(),getHeightFig());
        
        
    }

    public int getFigura() {
        return figura;
    }

    public void setFigura(int figura) {
        this.figura = figura;
    }

    
    
    
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getHeightFig() {
        return height;
    }

    public void setHeightFig(int height) {
        this.height = height;
    }

    public int getWidthFig() {
        return width;
    }

    public void setWidthFig(int width) {
        this.width = width;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        setPoint1(e.getPoint());
        System.out.println("evento: "+e.getPoint());
        this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    
    
}

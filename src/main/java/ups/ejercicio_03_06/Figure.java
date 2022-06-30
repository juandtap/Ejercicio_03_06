package ups.ejercicio_03_06;

import java.awt.Color;

public class Figure {
    private int figura;
    private Color color;
    private int height;
    private int width;

    public Figure(int figura, Color color, int height, int width) {
        this.figura = figura;
        this.color = color;
        this.height = height;
        this.width = width;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    


}

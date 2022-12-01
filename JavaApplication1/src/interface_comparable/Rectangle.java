/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_comparable;

/**
 *
 * @author lam
 */
public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Chieu rong : " + width + "\nChieu cao : " + height + "\nDien tich : " + getArea() + "\nChu Vi : " + getPerimeter();
    }

    @Override
    public int compareTo(Rectangle r) {
        if(this.getPerimeter() < r.getPerimeter()) return -1;
        if(this.getPerimeter() == r.getPerimeter()) return 0;
        else return 1;
    }
    
    
    
    
}
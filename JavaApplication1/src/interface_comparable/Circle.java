/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_comparable;

/**
 *
 * @author lam
 */
public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI; 
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    
    @Override
    public int compareTo(Circle o) {
        if(this.getArea() < o.getArea()) return -1;
        if(this.getArea() == o.getArea()) return 0;
        else return 1;
    }
    
    @Override
    public String toString() {
        return "Ban kinh hinh tron : " + radius + "\nDien tich : " + getArea() + "\nChu Vi : " + getPerimeter();
    }

    
    
    
}
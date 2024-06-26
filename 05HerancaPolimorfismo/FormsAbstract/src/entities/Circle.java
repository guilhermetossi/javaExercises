package entities;

import entities.enums.Colors;

import java.awt.*;

public class Circle extends Shape{

    private Double radius;

    public Circle() {
        super();
    }

    public Circle(Colors color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

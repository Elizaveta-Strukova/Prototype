package com.example.fabrica.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class OvalPlus extends Shapep {

    private double xb;
    private double yb;

    public double getXb() {
        return 20;
    }

    public void setXb(double xb) {
        this.xb = xb;
    }

    public double getYb() {
        return 20;
    }

    public void setYb(double yb) {
        this.yb = yb;
    }

    public OvalPlus(double xb, double yb) {
        super();
        this.xb = xb;
        this.yb = yb;
    }

    @Override
    public String toString() {
        return "OvalPlus{" +
                "xb=" + xb +
                ", yb=" + yb +
                ", weight=" + weight +
                ", color=" + color +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
    public OvalPlus(double weight, Color color, double x, double y, double xb, double yb) {
        super(weight, color, x, y);
        this.xb = xb;
        this.yb = yb;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setLineWidth(weight);
        gc.setStroke(color);
        gc.strokeOval(x, y, xb, yb); //овал (координаты, ширина, высота)
    }
}

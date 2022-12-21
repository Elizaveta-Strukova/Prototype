package com.example.strukova1.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class LinePlus extends Shapep {

    private double xb;
    private double yb;

    public double getXb() {
        return 50;
    }

    public void setXb(double xb) {
        this.xb = xb;
    }

    public double getYb() {
        return 100;
    }

    public void setYb(double yb) {
        this.yb = yb;
    }

    public LinePlus(double xb, double yb) {
        super();
        this.xb = xb;
        this.yb = yb;
    }

    @Override
    public String toString() {
        return "LinePlus{" +
                "xb=" + xb +
                ", yb=" + yb +
                ", weight=" + weight +
                ", color=" + color +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public LinePlus(double weight, Color color, double x, double y, double xb, double yb) {
        super(weight, color, x, y);
        this.xb = xb;
        this.yb = yb;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setLineWidth(weight);
        gc.setStroke(color);
        gc.strokeLine(x, y, xb, yb); //хвост
    }
}

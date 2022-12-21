package com.example.factory;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public abstract class Shapep implements Cloneable {

    public abstract void getXY(double x, double y);
    public abstract void draw(GraphicsContext gc);
    public abstract void setColor(Color color);

    @Override
    public String toString() {
        return super.toString();
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();   }
        return clone; }
}


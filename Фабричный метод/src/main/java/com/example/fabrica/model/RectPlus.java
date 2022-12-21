package com.example.fabrica.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RectPlus extends  Shapep{
    private double xb;
    private double yb;

    @Override
    public void draw(GraphicsContext gr) {
        gr.setLineWidth(weight);
        gr.setStroke(color);
        gr.strokeRect(x, y, xb, yb);
    }

    public RectPlus(Double xb, double yb){
        this.xb = xb;
        this.yb = yb;
    }
    @Override
    public String toString() {
        return "RectPlus{" +
                "xb=" + xb +
                ", yb=" + yb +
                ", weight=" + weight +
                ", color=" + color +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

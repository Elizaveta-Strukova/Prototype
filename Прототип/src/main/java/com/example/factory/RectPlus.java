package com.example.factory;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RectPlus extends Shapep {

    private double x;
    private double y;
    private Color colorsh;
    @Override
    public void draw(GraphicsContext gc) {
        gc.setStroke(colorsh);
        gc.strokeRect(x,y,100.0, 50.0);
    }
    @Override
    public void getXY (double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setColor (Color color){
        colorsh = color;
    }
    @Override
    public String toString() {
        return "Прямоугольник";
    }
}
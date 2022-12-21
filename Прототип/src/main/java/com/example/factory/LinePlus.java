package com.example.factory;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class LinePlus extends Shapep {

    private double x;
    private double y;
    private Color colorsh;

    @Override
    public void setColor (Color color){
        colorsh = color;
    }


    @Override
    public void draw(GraphicsContext gc) {
        gc.setStroke(colorsh);
        gc.strokeLine(x,y,x + 100, y);
    }

    @Override
    public String toString() {
        return "Линия";
    }

    @Override
    public void getXY (double x, double y) {
        this.x = x;
        this.y = y;
    }
}
    

  
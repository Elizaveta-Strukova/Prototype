package com.example.factory;

public class ShapeFactory {

    public Shapep createShape(int numberOfSides) {
        if (numberOfSides == 0) {
            return new LinePlus();

        } else if (numberOfSides == 1) {
            return new RectPlus();

        } else if (numberOfSides == 2) {
            return new OvalPlus();
        }
        else return null;
    }
}

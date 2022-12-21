package com.example.fabrica.model;

public class Fabrica {
    public static Shapep getShape(int i){
        if (i == 1){
            return new RectPlus(100.0, 50.0);
        }else if (i == 2){
            return new OvalPlus(50.0,50.0);
        }
        return new LinePlus(100.0, 0.0);
    }
}


package com.example.strukova1;

import com.example.strukova1.model.LinePlus;
import com.example.strukova1.model.OvalPlus;
import com.example.strukova1.model.Shapep;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class HelloController {
    public Canvas canvas;
    public ColorPicker colorpicker;
    public TextField textweight;
    public TextField textx;
    public TextField texty;


    @FXML
    protected void onHelloButtonClick() {  //рисует линию с Shappep по кнопке

        GraphicsContext gc = canvas.getGraphicsContext2D();
        LinePlus rect = new LinePlus(50.0,100.0);
        rect.getXb();
        rect.getYb();
        rect.draw(gc);
        System.out.println(rect);

    }



    public void OnDrawClick(MouseEvent mouseEvent) {
       /* double x = mouseEvent.getX();                  //начальная координата задается с Shappep
        double y = mouseEvent.getY();
        Color u = colorpicker.getValue();
        double w = Double.parseDouble(textweight.getText());

        GraphicsContext gc = canvas.getGraphicsContext2D();
        LinePlus rect = new LinePlus(w, u, x,y,50.0,100.0);
        rect.getXb();
        rect.getYb();
        rect.draw(gc);
        System.out.println(rect);
        */

        double xb = Double.parseDouble(textx.getText());       //начальная координата с текста
        double yb = Double.parseDouble(texty.getText());
        double x = mouseEvent.getX();
        double y = mouseEvent.getY();
        Color u = colorpicker.getValue();
        double w = Double.parseDouble(textweight.getText());

        GraphicsContext gc = canvas.getGraphicsContext2D();
        LinePlus rect = new LinePlus(w, u, x,y,xb,yb);
        rect.getXb();
        rect.getYb();
        rect.draw(gc);
        System.out.println(rect);


    }

    public void onOvalButtonClick() {         //рисует овал по кнопке

        Color u = colorpicker.getValue();                     //начальная координата с текста
        double w = Double.parseDouble(textweight.getText());
        double x = Double.parseDouble(textx.getText());
        double y = Double.parseDouble(texty.getText());

        GraphicsContext gc = canvas.getGraphicsContext2D();
        OvalPlus rect = new OvalPlus(w,u,x,y,20,20);
        rect.getXb();
        rect.getYb();
        rect.draw(gc);
        System.out.println(rect);



        /* GraphicsContext gc = canvas.getGraphicsContext2D();      //начальная координата задается с Shappep
        OvalPlus rect = new OvalPlus(20.0,20.0);
        rect.getXb();
        rect.getYb();
        rect.draw(gc);
        System.out.println(rect); */

    }
}
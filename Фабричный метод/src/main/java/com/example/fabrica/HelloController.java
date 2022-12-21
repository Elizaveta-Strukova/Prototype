package com.example.fabrica;

import com.example.fabrica.model.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController  implements Initializable {
    public Canvas canvas;
    public ColorPicker colorpicker;
    public TextField textfield;

    @FXML
    public GraphicsContext gc;
    public TextField fabrica;
    @FXML
    private Label welcomeText;
    @FXML
    public Shapep sp;

    public void onDrawClick(MouseEvent mouseEvent) {

               double x = mouseEvent.getX();                  //начальная координата задается с Shappep
        double y = mouseEvent.getY();
        Color u = colorpicker.getValue();
        double w = Double.parseDouble(textfield.getText());
        GraphicsContext gc = canvas.getGraphicsContext2D();
        LinePlus rect = new LinePlus(w, u, x,y,50.0,100.0);
        rect.getXb();
        rect.getYb();
        rect.draw(gc);
        System.out.println(rect);


    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvas.getGraphicsContext2D();
    }

    public void drawShape(KeyEvent keyEvent) {

        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        if (!fabrica.getText().equals("")) {
            int shape_type = Integer.parseInt(fabrica.getText());
            Fabrica fabric = new Fabrica();
            Shapep sp = Fabrica.getShape(shape_type);

            sp.setColor(colorpicker.getValue());
            sp.draw(gc);

        }

    }





}





    /*@FXML
   /* protected void onHelloButtonClick() {  //рисует линию с Shappep по кнопке

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

       /* double xb = Double.parseDouble(textx.getText());       //начальная координата с текста
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


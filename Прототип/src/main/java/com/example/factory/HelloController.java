package com.example.factory;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.paint.Color;


public class HelloController implements Initializable {
    public ListView listView;
    public ColorPicker colorpicker;
    @FXML TextField fabrica;
    @FXML Canvas canvas;

    ObservableList<Shapep> items;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        LinePlus line = new LinePlus();
        RectPlus rect = new RectPlus();
        OvalPlus oval = new OvalPlus();



        items =  FXCollections.observableArrayList(line, rect, oval);
        listView.setItems(items);

        listView.setCellFactory(new Callback<ListView<Shapep>, ListCell<Shapep>>() {
            @Override
            public ListCell<Shapep> call(ListView<Shapep> list) { // здесь можно включить любую обработку
                return new ShapeCell();
            }
        }
        );
    }
    public boolean checkWithRegExp(String str){
        if(str != null) return true;
        else return false;
    }

    public void drawFactory(){
        GraphicsContext gc = canvas.getGraphicsContext2D();

        if(checkWithRegExp(fabrica.getText())==false || fabrica.getText().equals("")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Предупреждение: ");
            alert.setHeaderText(null);
            alert.setContentText("Введено нечисло или число не из диапазона от 0 до 2!");
            alert.showAndWait();
        }else {
            int numberOfSides = Integer.parseInt(fabrica.getText());
            ShapeFactory shapeFactory = new ShapeFactory();
            Shapep shape1 = shapeFactory.createShape(numberOfSides);
            shape1.setColor(colorpicker.getValue());
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            shape1.draw(gc);

        }
    }


    public void onDrawClick(MouseEvent mouseEvent) {
    GraphicsContext gc = canvas.getGraphicsContext2D();
    Shapep shape = items.get(listView.getSelectionModel().getSelectedIndex());
    //shape.draw(gc);

    listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);// установить множественный выбор
        int index = listView.getSelectionModel().getSelectedIndex(); //получение номера элемента списка

        Shapep sh = (Shapep) items.get(index).clone();// создание копии фигуры

        sh.setColor(colorpicker.getValue());// установка цвета заполнения фигуры по значению элемента управления colorPicker
        sh.getXY(mouseEvent.getX(), mouseEvent.getY());
        sh.draw(gc);


    }

}



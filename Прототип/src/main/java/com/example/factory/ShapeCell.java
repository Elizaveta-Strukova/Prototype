package com.example.factory;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ListCell;

public class ShapeCell extends ListCell<Shapep> {// класс Product

    @Override
    public void updateItem(Shapep item, boolean empty) {

        super.updateItem(item, empty);

        if (item != null) {
            Canvas cnv=new Canvas();
            cnv.setHeight(60);// задание размера элемента отображения
            cnv.setWidth(150);
            GraphicsContext gc=cnv.getGraphicsContext2D();
            Shapep item1=(Shapep)item.clone();//текущая фигура из списка ObservableList
            item1.draw(gc); // ее отрисовка на канве
            setGraphic(cnv); //установка канвы вместо cell

        }

    }

}
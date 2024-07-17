package com.example.smilingproject;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.shape.Arc;

public class Smile implements EventHandler {
    Arc mouth;

    Smile(Arc _mouth) {
        mouth = _mouth;
    }


    @Override
    public void handle(Event event) {
        mouth.setLength(-180);
        mouth.setRadiusY(35);
    }
}

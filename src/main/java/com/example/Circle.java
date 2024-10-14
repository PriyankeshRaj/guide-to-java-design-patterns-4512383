package com.example;

public class Circle implements Shape {

    private Color color;

    Circle(Color color) {
        this.color = color;
    }

    @Override
    public void getType() {
        System.out.println("Circle");
    }

    @Override
    public Color getColor(){
        return this.color;
    }
}

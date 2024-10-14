package com.example;

public class Square implements Shape {

    private Color color;

    Square(Color color) {
        this.color = color;
    }

    @Override
    public void getType() {
        System.out.println("Square");
    }

    @Override
    public Color getColor(){
        return this.color;
    }
}

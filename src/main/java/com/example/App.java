package com.example;

public class App {


    public static void main(String[] args) {
        UserInterface roadUserInterface = createUserInterface("RED");
        UserInterface mountainUserInterface = createUserInterface("BLUE");

        System.out.println(roadUserInterface);
        System.out.println(mountainUserInterface);

    }


    private static UserInterface createUserInterface(String color) {
        UserInterfaceFactory userInterface = FactoryMaker.createFactory(color);
        var button = userInterface.createButton();
        var scrollBar = userInterface.createScrollBar();
        return new UserInterface(button,scrollBar);
    }

}


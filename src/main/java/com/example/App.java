package com.example;

public class App {

    public static void main(String[] args) {
        var context = "hello world";
        var expression = new FirstLetterShouldBeCapital();
        var result = expression.interpret(context);
        System.out.println(result); // Output: Hello world.
    }

}

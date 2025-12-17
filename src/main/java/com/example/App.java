package com.example;

public class App {

    public static void main(String[] args) {
        var light = new Light();
        LightOperationExecutor executor = new LightOperationExecutor();
        executor.addOperation(new CheckIfLightOnOperation(light));
        executor.addOperation(new TurnLightOnOperation(light));
        executor.addOperation(new CheckIfLightOnOperation(light));
        executor.addOperation(new TurnLightOffOperation(light));
        executor.addOperation(new CheckIfLightOnOperation(light));
        executor.executeOperations();
    }

}

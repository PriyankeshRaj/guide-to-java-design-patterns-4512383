package com.example;

public class App {

    public static void main(String[] args) {

        var trafficLight = new TrafficLight();
        var pedestrianCrossingLight = new PedestrianCrossingLight();

        Mediator mediator = new Mediator(trafficLight, pedestrianCrossingLight);
        mediator.changeToAmber();
        mediator.changeToGreen();
        mediator.changeToAmber();
        mediator.changeToRed();

    }

}

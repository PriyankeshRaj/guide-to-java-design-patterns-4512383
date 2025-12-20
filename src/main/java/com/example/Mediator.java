package com.example;

public class Mediator {

  private TrafficLight trafficLight;
  private PedestrianCrossingLight pedestrianCrossingLight;

  public Mediator(TrafficLight trafficLight, PedestrianCrossingLight pedestrianCrossingLight) {
    this.trafficLight = trafficLight;
    this.pedestrianCrossingLight = pedestrianCrossingLight;
  }

  public void changeToAmber() {
    trafficLight.changeToAmber();
  }

  public void changeToGreen() {
    trafficLight.changeToGreen();
    pedestrianCrossingLight.changeToRed();
  }

  public void changeToRed() {
    trafficLight.changeToRed();
    pedestrianCrossingLight.changeToGreen();
  }
}

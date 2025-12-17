package com.example;

public class CheckIfLightOnOperation implements LightOperation {
  private Light light;

  public CheckIfLightOnOperation(Light light) {
    this.light = light;
  }

  public void execute() {
    light.isOn();
  }
}

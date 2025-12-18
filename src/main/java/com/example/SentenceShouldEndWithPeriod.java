package com.example;

public class SentenceShouldEndWithPeriod implements Expression {

  @Override
  public String interpret(String context) {
    if (context == null || context.isEmpty()) {
      return context;
    }
    if (!context.endsWith(".")) {
      context = context + ".";
    }
    return context;
  }

}

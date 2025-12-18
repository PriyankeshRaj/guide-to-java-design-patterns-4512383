package com.example;

public class FirstLetterShouldBeCapital implements Expression {

  private final SentenceShouldEndWithPeriod sentenceChecker = new SentenceShouldEndWithPeriod();

  @Override
  public String interpret(String context) {
    if (context == null || context.isEmpty()) {
      return context;
    }
    context = context.substring(0, 1).toUpperCase() + context.substring(1);
    return sentenceChecker.interpret(context);
  }

}
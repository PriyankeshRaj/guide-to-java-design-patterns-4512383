package com.example;

import java.util.Iterator;

public class CountryIterator implements Iterator<Country> {
  private Countries countries;
  private int currentIndex = 0;

  public CountryIterator(Countries countries) {
    this.countries = countries;
    this.currentIndex = 0;
  }

  @Override
  public boolean hasNext() {
    return currentIndex < countries.getCountries().length;
  }

  @Override
  public Country next() {
    if (hasNext()) {
      return countries.getCountries()[currentIndex++];
    } else {
      return null;
    }
  }

}

package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

/**
 * @param someone should be a name of the person
 * @return should be a type od string
 */
  public  final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}

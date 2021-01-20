package com.codurance.traineeship.katas;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class FibonacciShould {

  @Test
  void give_a_zero_value_for_the_first_position() {
    Fibonacci fibonacci = new Fibonacci();
    assertThat(fibonacci.at(0), is(0));
  }

  @Test
  void give_a_one_value_for_the_second_position() {
    Fibonacci fibonacci = new Fibonacci();
    assertThat(fibonacci.at(1), is(1));
  }

  @Test
  void give_a_one_value_for_the_third_position() {
    Fibonacci fibonacci = new Fibonacci();
    assertThat(fibonacci.at(2), is(1));
  }
}

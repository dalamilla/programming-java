package com.dalamilla.euler;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit test for third Euler problem.
 */
public class Euler003Test {

  /**
   * Test solution.
   */
  @ParameterizedTest
  @CsvSource({
      "2, 2",
      "3, 3",
      "5, 5",
      "7, 7",
      "8, 2",
      "13195, 29",
      "600851475143, 6857"
  })
  public void test(long input, long expected) {
    assertTrue(Euler003.solution(input) == expected);
  }
}

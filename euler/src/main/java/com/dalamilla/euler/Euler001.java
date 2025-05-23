/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

package com.dalamilla.euler;

/**
 * Class for the solution of first Euler problem.
 *
 * @author dalamilla
 * @version 1.0.0
 */
public class Euler001 {

  /**
   * Solution of first Euler problem.
   *
   * @param n Value that limit the sum of natural numbers.
   * @return Sum of natural numbers that are multiples of 3 or 5 below n.
   */
  public static int solution(int n) {
    int sum = 0;

    for (int i = 0; i < n; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum = sum + i;
      }
    }

    return sum;
  }
}

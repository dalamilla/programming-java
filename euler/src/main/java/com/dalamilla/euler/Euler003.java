/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

package com.dalamilla.euler;

/**
 * Class for the solution of third Euler problem.
 *
 * @author dalamilla
 * @version 1.0.0
 */
public class Euler003 {

  /**
   * Solution of third Euler problem.
   *
   * @param n Value that find max prime factor.
   * @return The largest prime factor.
   */
  public static long solution(long n) {
    long pm = 2;

    while (n != 1) {
      if (n % pm == 0) {
        n = n / pm;
      } else {
        pm += 1;
      }
    }

    return pm;
  }
}

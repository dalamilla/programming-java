/**
 * 2520 is the smallest number that can be divided by each of  the numbers from
 * 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 */

package com.dalamilla.euler;

/**
 * Class for the solution of fifth Euler problem.
 *
 * @author dalamilla
 * @version 1.0.0
 */
public class Euler005 {

  /**
   * Solution of fifth Euler problem.
   *
   * @param n Value that limit the smallest positive number that is evenly divisible from 1 to n.
   * @return Smallest positive number that is evenly divisible by
   *         all of the numbers from 1 to n.
   */
  public static int solution(int n) {
    Boolean found = true;
    int number = 0;

    while (found) {
      int i = 1;
      number += n;

      while (number % i == 0 && i <= n) {
        if (i == n) {
          found = false;
        }
        i++;
      }
    }

    return number;
  }
}

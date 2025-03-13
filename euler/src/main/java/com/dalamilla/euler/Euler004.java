/**
 * A palindromic number reads the same both ways. The largest palindrome made from
 * the product of two 2-startDigit numbers is 9009 = 91 × 99.
 *
 * <p>Find the largest palindrome made from the product of two 3-startDigit numbers.
 */

package com.dalamilla.euler;

/**
 * Class for the solution of fourth Euler problem.
 *
 * @author dalamilla
 * @version 1.0.0
 */
public class Euler004 {

  /**
   * Solution of fourth Euler problem.
   *
   * @param n Value of n-startDigit numbers.
   * @return The largest palindrome made from the product of two n-startDigit numbers.
   */
  public static int solution(int n) {
    int startDigit = (int) Math.pow(10, n - 1);
    int endDigit = (int) Math.pow(10, n);
    int max = 0;

    for (int i = startDigit; i < endDigit; i++) {
      for (int j = startDigit; j < endDigit; j++) {
        if (isPalindrome(i * j) && i * j > max) {
          max = i * j;
        }
      }
    }

    return max;
  }

  /**
   * Helper function for fourth Euler problem.
   */
  private static Boolean isPalindrome(int n) {
    return n == reverse(n);
  }

  /**
   * Helper function for fourth Euler problem.
   */
  private static int reverse(int n) {
    int rn = 0;

    while (n > 0) {
      rn = rn * 10 + n % 10;
      n /= 10;
    }

    return rn;
  }
}

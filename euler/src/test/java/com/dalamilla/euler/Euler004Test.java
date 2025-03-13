package com.dalamilla.euler;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit test for fourth Euler problem.
 */
public class Euler004Test {

    /**
     * Test solution.
     */
    @ParameterizedTest
    @CsvSource({
        "2, 9009",
        "3, 906609"
    })
    public void test(int input, int expected) {
        assertTrue(Euler004.solution(input) == expected);
    }
}

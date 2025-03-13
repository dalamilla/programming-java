package com.dalamilla.euler;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit test for second Euler problem.
 */
public class Euler002Test {

    /**
     * Test solution.
     */
    @ParameterizedTest
    @CsvSource({
        "8, 10",
        "10, 10",
        "34, 44",
        "60, 44",
        "1000, 798",
        "100000, 60696",
        "4000000, 4613732"
    })
    public void test(int input, int expected) {
        assertTrue(Euler002.solution(input) == expected);
    }
}

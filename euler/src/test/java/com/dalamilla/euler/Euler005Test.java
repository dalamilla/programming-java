package com.dalamilla.euler;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit test for fifth Euler problem.
 */
public class Euler005Test {

    /**
     * Test solution.
     */
    @ParameterizedTest
    @CsvSource({
        "5, 60",
        "7, 420",
        "10, 2520",
        "13, 360360",
        "20, 232792560"
    })
    public void test(int input, int expected) {
        assertTrue(Euler005.solution(input) == expected);
    }
}

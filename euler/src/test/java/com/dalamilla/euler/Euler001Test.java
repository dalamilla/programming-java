package com.dalamilla.euler;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit test for first Euler problem.
 */
public class Euler001Test {

    /**
     * Test solution.
     */
    @ParameterizedTest
    @CsvSource({
        "1000, 233168",
        "49, 543",
        "8456, 16687353",
        "19564, 89301183"
    })
    public void test(int input, int expected) {
        assertTrue(Euler001.solution(input) == expected);
    }
}

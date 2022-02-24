//Colin Brennan
package test.java;

import org.junit.jupiter.api.Test;

import main.java.ImprovedRandom;

public class ImprovedRandomTesting {
    //Integer Fixtures
    private final static int lowerBound;
    private final static int upperBound;

    //Initialize Fixtures
    static {
        lowerBound = 42;
        upperBound = 90;
    }

    @Test
    void testOutputIsWithinBounds() {
        ImprovedRandom improvedRandom = new ImprovedRandom();
        int randomInt = improvedRandom.randomIntInsideBounds(lowerBound, upperBound);
        assert(randomInt >= lowerBound && randomInt <= upperBound);
    }
}
//Colin Brennan
package testing.java;
//Import unit testing
import org.junit.jupiter.api.Test;
//Import ImprovedRandom
import main.java.ImprovedRandom;

public class ImprovedRandomTesting {
    //Lower bound and upper bound integers 
    private final static int lowerBound;
    private final static int upperBound;

    //Initialize test case fixtures
    static {
        lowerBound = 23;
        upperBound = 43;
    }

    @Test
    void testIfOutputInsideWithinBounds() {
        ImprovedRandom improvedRandom = new ImprovedRandom();
        int randomIntTest = improvedRandom.randomIntInsideBounds(lowerBound, upperBound);
        assert(randomIntTest >= lowerBound && randomIntTest <= upperBound);
    }
}
